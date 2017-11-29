package com.github.manliogit.javatags.element;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Group implements Element {

	private final List<Element> _tags;

	public Group(Element...tag) {
		this(asList(tag));
	}
	
	public Group(List<Element> tags) {
		_tags = new ArrayList<Element>(tags);
	}
	
	@Override
	public String render() {
		String result = "";
		for (Element tag : _tags) {
			result += tag.render();
		}
		return result;
	}

	@Override
	public Element add(Element element) {
		_tags.add(element);
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
		result = prime * result + ((_tags == null) ? 0 : _tags.hashCode());
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
		Group other = (Group) obj;
		if (_tags == null) {
			if (other._tags != null)
				return false;
		} else if (!_tags.equals(other._tags))
			return false;
		return true;
	}
}
