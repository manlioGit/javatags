package com.github.manliogit.javatags.element.attribute;

import static com.github.manliogit.javatags.lang.HtmlHelper.*;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

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
		Attribute attr = new Attribute("id         ->123", "class->     fa     fa-up");
		
		assertThat(attr.render(), is("id='123' class='fa     fa-up'"));
		assertThat(attr, is(attr("id -> 123", "class -> fa     fa-up")));
	}
	
	@Test
	public void dontRenderNullOrEmpty() throws Exception {
		Attribute attr = new Attribute("id -> 123", null, "  ", "class -> fa fa-up", "");
		
		assertThat(attr, is(attr("id -> 123", "class -> fa fa-up")));
	}

	@Test
	public void addAttributeUsingKeyValue() throws Exception {
		Attribute attr = new Attribute("class -> .some", "xxx -> fa fa-up").
			add("class", "fa fa-up").
			add("xxx", "hide").
			add("yyy", "show-some");
		
		assertThat(attr, is(attr("class -> .some fa fa-up","xxx -> fa fa-up hide", "yyy -> show-some")));
	}
	
	@Test
	public void addAttributeUsingAttribute() throws Exception {
		Attribute attr = new Attribute("class -> .some", "xxx -> fa fa-up").
			add(new Attribute("class -> fa fa-up")).
			add(new Attribute("xxx -> hide")).
			add(new Attribute("yyy -> show-some"));
		
		assertThat(attr, is(attr("class -> .some fa fa-up","xxx -> fa fa-up hide", "yyy -> show-some")));
	}
	
	@Test
	public void removeAttributeUsingKeyValue() throws Exception {
		Attribute attr = new Attribute("class -> .some fa fa-up", "xxx -> fa fa-up").
			remove("class", "fa-up").
			remove("class", "notExistent").
			remove("xxx", "fa").
			remove("xxx", "fa-up").
			remove("xxx", "fa-up").
			remove("notExistentKey", "show-some");
		
		assertThat(attr, is(attr("class -> .some fa", "xxx -> ")));
	}
	
	@Test
	public void removeAttributeUsingAttribute() throws Exception {
		Attribute attr = new Attribute("class -> .some fa fa-up", "xxx -> fa fa-up").
			remove(new Attribute("class -> fa-up")).
			remove(new Attribute("class -> notExistent")).
			remove(new Attribute("xxx -> fa")).
			remove(new Attribute("xxx -> fa-up")).
			remove(new Attribute("xxx -> fa-up")).
			remove(new Attribute("notExistentKey -> show-some"));
		
		assertThat(attr, is(attr("class -> .some fa", "xxx -> ")));
	}
	
	@Test 
	public void removeCompleteAttribute() throws Exception {
		Attribute attr = new Attribute("class -> .some fa fa-up", "xxx -> fa fa-up").
				remove("class").
				remove("class").
				remove("xxx");
		
		assertThat(attr, is(attr()));
	}
	
	@Test
	public void renderIncompleteElements() throws Exception {
		String attr = new Attribute("id -> ", " -> fa fa-up", "weird thing").render();
		
		assertThat(attr, is("id='' ='fa fa-up' weird thing=''"));
	}
	
	@Test
	public void unorderedAttributesAreEqual() throws Exception {
		assertThat(attr("id -> 123", "class -> fa fa-up"), is(attr("class -> fa fa-up", "id -> 123")));
		assertThat(attr("class -> fa fa-up"), is(attr("class -> fa-up fa")));
	}
	
	@Test
    public void apostrophValuesIsSanitized() throws Exception {
        assertThat(attr("id -> 1'000", "value -> 1'0'0").render(), is("id='1&#x27;000' value='1&#x27;0&#x27;0'"));
    }
}
