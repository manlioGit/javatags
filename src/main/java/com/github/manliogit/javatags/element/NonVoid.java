package com.github.manliogit.javatags.element;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import com.github.manliogit.javatags.element.attribute.Attribute;

public class NonVoid implements Element {
	
	private final String _name;
	private final Attribute _attribute;
	private final List<Element> _children;
	
	public NonVoid(String name, Attribute attribute, List<Element> tags) {
		_name = name;
		_attribute = attribute;
		_children = new ArrayList<Element>(tags);
	}
	
	public NonVoid(String name, List<Element> tags) {
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
	
	@Override
	public Element add(Element element) {
		_children.add(element);
		return this;
	}
	
	@Override
	public String toString() {
		return render();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_attribute == null) ? 0 : _attribute.hashCode());
		result = prime * result + ((_children == null) ? 0 : _children.hashCode());
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NonVoid other = (NonVoid) obj;
		if (_attribute == null) {
			if (other._attribute != null)
				return false;
		} else if (!_attribute.equals(other._attribute))
			return false;
		if (_children == null) {
			if (other._children != null)
				return false;
		} else if (!_children.equals(other._children))
			return false;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		return true;
	}

	private String tagContent(){
		return (_name + " " + _attribute.render()).trim();
	}
}
