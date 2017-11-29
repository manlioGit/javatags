package com.github.manliogit.javatags.element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TextTest {

	@Test
	public void equality() throws Exception {
		Element text = new Text("aaa");
		Element otherText = new Text("aaa");
		
		assertThat(text, is(otherText));
	}
	
	@Test
	public void addDoesNothing() throws Exception {
		Element text = new Text("aaa").
				add(new Void("div")).
				add(new Text("cccc"));
		
		assertThat(text.render(), is("aaa"));
	}
}
