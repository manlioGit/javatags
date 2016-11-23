package com.github.manliogit.javatags.element;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class Void implements Element {

	private final String _name;
	private final Attribute _attribute;
	
	public Void(String name) {
		this(name, new Attribute());
	}
	
	public Void(String name, Attribute attribute) {
		_name = name;
		_attribute = attribute;
	}
	
	@Override
	public String render() {
		return "<" + tagContent() + ">";
	}
	
	private String tagContent(){
		return (_name + " " + _attribute.render()).trim();
	}
}
