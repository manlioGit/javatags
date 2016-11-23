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
}
