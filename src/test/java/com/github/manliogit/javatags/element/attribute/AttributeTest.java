package com.github.manliogit.javatags.element.attribute;

import static com.github.manliogit.javatags.lang.HtmlHelper.attr;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AttributeTest {

	@Test
	public void render() throws Exception {
		String attr = new Attribute("id -> 123", "class -> fa fa-up").render();
		
		assertThat(attr, is("id='123' class='fa fa-up'"));
	}
	
	@Test
	public void renderWithStaticHelper() throws Exception {
		String attr = attr("id -> 123", "class -> fa fa-up").render();
		
		assertThat(attr, is("id='123' class='fa fa-up'"));
	}
	
	@Test
	public void renderWithAnySpaceFromSeparator() throws Exception {
		String attr = new Attribute("id         ->123", "class->     fa     fa-up").render();
		
		assertThat(attr, is("id='123' class='fa     fa-up'"));
	}
	
	@Test
	public void dontRenderNullOrEmpty() throws Exception {
		String attr = new Attribute("id -> 123", null, "  ", "class -> fa fa-up", "").render();
		
		assertThat(attr, is("id='123' class='fa fa-up'"));
	}

	@Test
	public void addAttributeUsingKeyValue() throws Exception {
		String attr = new Attribute("class -> .some", "xxx -> fa fa-up").
			add("class", "fa fa-up").
			add("xxx", "hide").
			add("yyy", "show-some").
		render();
		
		assertThat(attr, is("class='.some fa fa-up' xxx='fa fa-up hide' yyy='show-some'"));
	}
	
	@Test
	public void addAttributeUsingAttribute() throws Exception {
		String attr = new Attribute("class -> .some", "xxx -> fa fa-up").
			add(new Attribute("class -> fa fa-up")).
			add(new Attribute("xxx -> hide")).
			add(new Attribute("yyy -> show-some")).
		render();
		
		assertThat(attr, is("class='.some fa fa-up' xxx='fa fa-up hide' yyy='show-some'"));
	}
	
	@Test
	public void removeAttributeUsingKeyValue() throws Exception {
		String attr = new Attribute("class -> .some fa fa-up", "xxx -> fa fa-up").
			remove("class", "fa-up").
			remove("class", "notExistent").
			remove("xxx", "fa").
			remove("xxx", "fa-up").
			remove("xxx", "fa-up").
			remove("notExistentKey", "show-some").
		render();
		
		assertThat(attr, is("class='.some fa' xxx=''"));
	}
	
	@Test
	public void removeAttributeUsingAttribute() throws Exception {
		String attr = new Attribute("class -> .some fa fa-up", "xxx -> fa fa-up").
			remove(new Attribute("class -> fa-up")).
			remove(new Attribute("class -> notExistent")).
			remove(new Attribute("xxx -> fa")).
			remove(new Attribute("xxx -> fa-up")).
			remove(new Attribute("xxx -> fa-up")).
			remove(new Attribute("notExistentKey -> show-some")).
		render();
		
		assertThat(attr, is("class='.some fa' xxx=''"));
	}
	
	@Test
	public void renderIncompleteElements() throws Exception {
		String attr = new Attribute("id -> ", " -> fa fa-up", "weird thing").render();
		
		assertThat(attr, is("id='' ='fa fa-up' weird thing=''"));
	}
}
