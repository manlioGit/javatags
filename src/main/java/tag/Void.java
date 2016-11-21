package tag;

import tag.attribute.Attribute;

public class Void implements Tag {

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
