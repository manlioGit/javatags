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
}
