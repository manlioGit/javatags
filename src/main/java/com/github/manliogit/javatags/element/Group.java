package com.github.manliogit.javatags.element;

import static java.util.Arrays.asList;

public class Group implements Element {

	private final Iterable<Element> _tags;

	public Group(Element...tag) {
		this(asList(tag));
	}
	
	public Group(Iterable<Element> tags) {
		_tags = tags;
	}
	
	@Override
	public String render() {
		String result = "";
		for (Element tag : _tags) {
			result += tag.render();
		}
		return result;
	}
}
