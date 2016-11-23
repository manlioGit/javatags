package com.github.manliogit.javatags.element;

import static java.util.Arrays.asList;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class NonVoid implements Element {
	
	private final String _name;
	private final Attribute _attribute;
	private final Iterable<Element> _children;
	
	public NonVoid(String name, Attribute attribute, Iterable<Element> tags) {
		_name = name;
		_attribute = attribute;
		_children = tags;
	}
	
	public NonVoid(String name, Iterable<Element> tags) {
		this(name, new Attribute(), tags);
	}
	
	public NonVoid(String name, Attribute attribute, Element...tag) {
		this(name, attribute, asList(tag));
	}

	public NonVoid(String name, Element...tag) {
		this(name, new Attribute(), asList(tag));
	}

	@Override
	public String render() {
		String result= "<" + tagContent() + ">";
		for (Element child : _children) {
			result += child.render();
		}
		return result += "</" + _name + ">" ;
	}
	
	private String tagContent(){
		return (_name + " " + _attribute.render()).trim();
	}
}
