package com.mm.javatags.element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mm.javatags.element.Group;
import com.mm.javatags.element.NonVoid;
import com.mm.javatags.element.Text;
import com.mm.javatags.element.Void;
import com.mm.javatags.element.attribute.Attribute;

public class ElementTest {

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
		assertThat(new Group(new Void("!DOCTYPE html"), new NonVoid("html")).render(), is("<!DOCTYPE html><html></html>"));
	}
}
