package tag;

import static java.util.Arrays.asList;

import tag.attribute.Attribute;

public class NonVoid implements Tag {
	
	private final String _name;
	private final Attribute _attribute;
	private final Iterable<Tag> _children;
	
	public NonVoid(String name, Attribute attribute, Iterable<Tag> tags) {
		_name = name;
		_attribute = attribute;
		_children = tags;
	}
	
	public NonVoid(String name, Iterable<Tag> tags) {
		this(name, new Attribute(), tags);
	}
	
	public NonVoid(String name, Attribute attribute, Tag...tag) {
		this(name, attribute, asList(tag));
	}

	public NonVoid(String name, Tag...tag) {
		this(name, new Attribute(), asList(tag));
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
