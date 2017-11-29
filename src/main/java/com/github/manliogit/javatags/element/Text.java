package com.github.manliogit.javatags.element;

public class Text implements Element {

	private String _text;

	public Text(String text) {
		_text = text;
	}
	
	@Override
	public String render() {
		return _text;
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
		result = prime * result + ((_text == null) ? 0 : _text.hashCode());
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
		Text other = (Text) obj;
		if (_text == null) {
			if (other._text != null)
				return false;
		} else if (!_text.equals(other._text))
			return false;
		return true;
	}
}
