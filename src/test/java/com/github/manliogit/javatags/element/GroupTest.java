package com.github.manliogit.javatags.element;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GroupTest {

	@Test
	public void equality() throws Exception {
		Element group = new Group(new Void("br"));
		Element group1 = new Group(new Void("br"));
		Element otherGroup = new Group(new NonVoid("div"));
		
		assertThat(group, is(group1));
		assertThat(group, is(not(otherGroup)));
	}
	
	@Test
	public void addSibling() throws Exception {
		Element group = new Group(new Void("br")).
				add(new Void("div")).
				add(new Void("span"));
		
		assertThat(group.render(), is("<br/><div/><span/>"));
	}
}
