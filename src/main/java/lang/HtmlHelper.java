package lang;

import java.util.List;

import tag.GroupTag;
import tag.NonVoid;
import tag.Tag;
import tag.TextTag;
import tag.Void;
import tag.attribute.Attribute;

public class HtmlHelper {
	
	public static Tag nonVoid(String name, Attribute attr, Tag ... tag){
		return new NonVoid(name, attr, tag);
	}
	
	public static Tag nonVoid(String name, Tag ... tag){
		return new NonVoid(name, tag);
	}
	
	public static Tag nonVoid(String name, Attribute attr, Iterable<Tag> tags){
		return new NonVoid(name, attr, tags);
	}
	
	public static Tag nonVoid(String name, Iterable<Tag> tags){
		return new NonVoid(name, tags);
	}
	
	public static Tag voidEl(String name, Attribute attr){
		return new Void(name, attr);
	}
	
	public static Tag voidEl(String name){
		return new Void(name);
	}
	
	public static Tag text(String content){
		return new TextTag(content);
	}
	
	public static Tag html(Attribute attr, Tag ... tag){
		return new GroupTag(new Void("!DOCTYPE html"), new NonVoid("html", attr, tag));
	}
	
	public static Tag html(Tag ... tag){
		return html(new Attribute(), tag);
	}
	
	public static Tag head(Tag ... tag){
		return nonVoid("head", tag);
	}
	
	public static Tag meta(Attribute attr){
		return voidEl("meta", attr);
	}
	
	public static Tag title(String text){
		return nonVoid("title", text(text));
	}
	
	public static Tag link(Attribute attr){
		return voidEl("link", attr);
	}
	
	public static Tag body(Attribute attr, Tag...tag){
		return nonVoid("body", attr, tag);
	}
	
	public static Tag body(Tag...tag){
		return nonVoid("body", tag);
	}
	
	public static Tag div(Tag...tag){
		return nonVoid("div", tag);
	}
	
	public static Tag div(List<Tag> tags){
		return nonVoid("div", tags);
	}
	
	public static Tag div(Attribute attr, Tag ... tag){
		return nonVoid("div", attr, tag);
	}
	
	public static Tag div(Attribute attr, String text){
		return nonVoid("div", attr, text(text));
	}
	
	public static Tag div(String text){
		return nonVoid("div", text(text));
	}
	
	public static Tag div(Tag tag, String text){
		return nonVoid("div", tag, text(text));
	}
	
	public static Tag a(Tag...tag){
		return nonVoid("a", tag);
	}
	
	public static Tag a(Attribute attr, Tag ... tag){
		return nonVoid("a", attr, tag);
	}
	
	public static Tag a(Attribute attr, String text){
		return nonVoid("a", attr, text(text));
	}
	
	public static Tag a(String text){
		return nonVoid("a", text(text));
	}
	
	public static Tag a(Tag tag, String text){
		return nonVoid("a", tag, text(text));
	}
	
	public static Tag span(Tag...tag){
		return nonVoid("span", tag);
	}
	
	public static Tag span(Attribute attr, Tag ... tag){
		return nonVoid("span", attr, tag);
	}
	
	public static Tag span(Attribute attr, String text){
		return nonVoid("span", attr, text(text));
	}
	
	public static Tag span(String text){
		return nonVoid("span", text(text));
	}
	
	public static Tag span(Tag tag, String text){
		return nonVoid("span", tag, text(text));
	}
	
	public static Tag img(Attribute attr){
		return voidEl("img", attr);
	}
	
	public static Tag br(Attribute attr){
		return voidEl("br", attr);
	}
	
	public static Tag br(){
		return voidEl("br");
	}
	
	public static Tag h1(String text){
		return nonVoid("h1", text(text));
	}
	
	public static Tag h2(String text){
		return nonVoid("h2", text(text));
	}
	
	public static Tag h3(String text){
		return nonVoid("h3", text(text));
	}
	
	public static Tag h4(String text){
		return nonVoid("h4", text(text));
	}
	
	public static Tag h5(String text){
		return nonVoid("h5", text(text));
	}

	public static Tag h6(String text){
		return nonVoid("h6", text(text));
	}
	
	public static Tag ul(Attribute attribute, Tag...tag){
		return nonVoid("ul", attribute, tag);
	}
	
	public static Tag li(Attribute attribute, Tag...tag){
		return nonVoid("li", attribute, tag);
	}
	
	public static Tag li(Tag...tag){
		return nonVoid("li", tag);
	}
	
	public static Tag i(Attribute attribute, Tag...tag){
		return nonVoid("i", attribute, tag);
	}
	
	public static Tag nav(Attribute attribute, Tag...tag){
		return nonVoid("nav", attribute, tag);
	}
	
	public static Tag nav(Tag...tag){
		return nonVoid("nav", tag);
	}
	
	public static Tag button(Attribute attribute, String text){
		return nonVoid("button", attribute, text(text));
	}
	
	public static Tag footer(Attribute attribute, Tag...tag){
		return nonVoid("footer", attribute, tag);
	}
	
	public static Tag footer(Tag...tag){
		return nonVoid("footer", tag);
	}
	
	public static Tag script(Attribute attribute, Tag...tag){
		return nonVoid("script", attribute, tag);
	}
	
	public static Tag input(Attribute attribute){
		return voidEl("input", attribute);
	}
	
	public static Attribute attr(String...comp){
		return new Attribute(comp);
	}
}
