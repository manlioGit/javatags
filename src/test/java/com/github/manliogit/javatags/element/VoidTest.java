package com.github.manliogit.javatags.element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class VoidTest {

	@Test
	public void voidElementHasSelfClosingChar() {
		assertThat(new Void("br").render(), is("<br/>"));
	}
	
	@Test
	public void voidElementWithAttributeHasSelfClosingChar() {
		assertThat(new Void("hr", new Attribute("aaa -> xxx")).render(), is("<hr aaa='xxx'/>"));
	}
	
	@Test
	public void equalityIgnoresAttributesOrder() {
		
		Element br = new Void("br", new Attribute("a -> b", "c -> d"));
		Element otherBr = new Void("br", new Attribute("c -> d", "a -> b"));
		
		assertThat(br, is(otherBr));
	}
	
	@Test
	public void addDoesNothing() throws Exception {
		Element otherBr = new Void("br");
		Element br = new Void("br").add(otherBr);
		
		assertThat(br, is(otherBr));
	}
}
