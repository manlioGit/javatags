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
		return "<" + tagContent() + "/>";
	}
	
	@Override
	public Element add(Element element) {
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
		Void other = (Void) obj;
		if (_attribute == null) {
			if (other._attribute != null)
				return false;
		} else if (!_attribute.equals(other._attribute))
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
