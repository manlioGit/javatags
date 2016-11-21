package tag;

import static java.util.Arrays.asList;

import java.util.List;

import tag.attribute.Attribute;

public class NonVoid implements Tag {
	
	private final String _name;
	private final Attribute _attribute;
	private final List<Tag> _children;
	
	public NonVoid(String name, Tag...tag) {
		this(name, new Attribute(), tag);
	}
	
	public NonVoid(String name, Attribute attribute, Tag...tag) {
		_name = name;
		_attribute = attribute;
		_children = asList(tag);
	}

	@Override
	public String render() {
		String result= "<" + tagContent() + ">";
		for (Tag child : _children) {
			result += child.render();
		}
		return result += "</" + _name + ">" ;
	}
	
	private String tagContent(){
		return (_name + " " + _attribute.render()).trim();
	}
}
