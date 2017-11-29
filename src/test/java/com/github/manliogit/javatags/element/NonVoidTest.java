package com.github.manliogit.javatags.element;

import static com.github.manliogit.javatags.lang.HtmlHelper.div;
import static com.github.manliogit.javatags.lang.HtmlHelper.span;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class NonVoidTest {

	@Test
	public void simpleTag() {
		assertThat(new NonVoid("html").render(), is("<html></html>"));
	}
	
	@Test
	public void simpleTagWithAttribute() {
		assertThat(new NonVoid("div", new Attribute("id -> 123")).render(), is("<div id='123'></div>"));
	}
	
	@Test
	public void simpleTagWithText() {
		assertThat(new NonVoid("div",new Text("text")).render(), is("<div>text</div>"));
	}
	
	@Test
	public void simpleTagWithAttributeAndText() throws Exception {
		assertThat(new NonVoid("div",new Attribute("id -> 123"),new Text("text")).render(), is("<div id='123'>text</div>"));
	}
	
	@Test
	public void nestedTag() {
		assertThat(new NonVoid("div", new NonVoid("span")).render(), is("<div><span></span></div>"));
	}
	
	@Test
	public void nestedTagWithText() {
		assertThat(new NonVoid("div", new NonVoid("span", new Text("text"))).render(), is("<div><span>text</span></div>"));
	}
	
	@Test
	public void tagWithTextAndNestedTag() {
		assertThat(new NonVoid("div",new Text("text"), new NonVoid("span")).render(), is("<div>text<span></span></div>"));
	}
	
	@Test
	public void tagWithNestedTagAndText() {
		assertThat(new NonVoid("div",new NonVoid("span"),new Text("text")).render(), is("<div><span></span>text</div>"));
	}
	
	@Test
	public void siblingTags() throws Exception {
		assertThat(new Group(new Text("<!DOCTYPE html>"), new NonVoid("html")).render(), is("<!DOCTYPE html><html></html>"));
	}
	
	@Test
	public void equalitytIgnoresAttributesOrder() {
		
		Element div = new NonVoid("div", new Attribute("a -> b", "c -> d"));
		Element otherDiv = new NonVoid("div", new Attribute("c -> d", "a -> b"));
		
		assertThat(div, is(otherDiv));
	}
	
	@Test
	public void addChildren() {
		
		Element nonVoid = new NonVoid("div").
							add(new NonVoid("span")).
							add(new NonVoid("span")).
							add(new NonVoid("span").add(new NonVoid("div")));
			
		Element expected = div(
				             span(),
				             span(),
				             span(
				               div()
				             )
				           );
		
		assertThat(nonVoid, is(expected));
	}
}
