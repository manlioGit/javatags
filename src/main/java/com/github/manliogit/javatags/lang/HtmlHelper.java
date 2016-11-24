package com.github.manliogit.javatags.lang;

import java.util.List;

import com.github.manliogit.javatags.element.Element;
import com.github.manliogit.javatags.element.Group;
import com.github.manliogit.javatags.element.NonVoid;
import com.github.manliogit.javatags.element.Text;
import com.github.manliogit.javatags.element.Void;
import com.github.manliogit.javatags.element.attribute.Attribute;

public class HtmlHelper {

	public static Element nonVoid(String name, Attribute attr, Element... tag) {
		return new NonVoid(name, attr, tag);
	}

	public static Element nonVoid(String name, Element... tag) {
		return new NonVoid(name, tag);
	}

	public static Element nonVoid(String name, Attribute attr,
			Iterable<Element> tags) {
		return new NonVoid(name, attr, tags);
	}

	public static Element nonVoid(String name, Iterable<Element> tags) {
		return new NonVoid(name, tags);
	}

	public static Element voidEl(String name, Attribute attr) {
		return new Void(name, attr);
	}

	public static Element voidEl(String name) {
		return new Void(name);
	}

	public static Element text(String content) {
		return new Text(content);
	}

	public static Element html5(Attribute attr, Element... tag) {
		return new Group(text("<!DOCTYPE html>"),new NonVoid("html", attr, tag));
	}

	public static Element html5(Element... tag) {
		return html5(new Attribute(), tag);
	}

	public static Element area(Attribute attr) {
		return voidEl("area", attr);
	}

	public static Element base(Attribute attr) {
		return voidEl("base", attr);
	}

	public static Element br(Attribute attr) {
		return voidEl("br", attr);
	}

	public static Element col(Attribute attr) {
		return voidEl("col", attr);
	}

	public static Element command(Attribute attr) {
		return voidEl("command", attr);
	}

	public static Element embed(Attribute attr) {
		return voidEl("embed", attr);
	}

	public static Element hr(Attribute attr) {
		return voidEl("hr", attr);
	}

	public static Element img(Attribute attr) {
		return voidEl("img", attr);
	}

	public static Element input(Attribute attr) {
		return voidEl("input", attr);
	}

	public static Element keygen(Attribute attr) {
		return voidEl("keygen", attr);
	}

	public static Element link(Attribute attr) {
		return voidEl("link", attr);
	}

	public static Element meta(Attribute attr) {
		return voidEl("meta", attr);
	}

	public static Element param(Attribute attr) {
		return voidEl("param", attr);
	}

	public static Element source(Attribute attr) {
		return voidEl("source", attr);
	}

	public static Element track(Attribute attr) {
		return voidEl("track", attr);
	}

	public static Element wbr(Attribute attr) {
		return voidEl("wbr", attr);
	}

	public static Element area() {
		return voidEl("area");
	}

	public static Element base() {
		return voidEl("base");
	}

	public static Element br() {
		return voidEl("br");
	}

	public static Element col() {
		return voidEl("col");
	}

	public static Element command() {
		return voidEl("command");
	}

	public static Element embed() {
		return voidEl("embed");
	}

	public static Element hr() {
		return voidEl("hr");
	}

	public static Element img() {
		return voidEl("img");
	}

	public static Element input() {
		return voidEl("input");
	}

	public static Element keygen() {
		return voidEl("keygen");
	}

	public static Element link() {
		return voidEl("link");
	}

	public static Element meta() {
		return voidEl("meta");
	}

	public static Element param() {
		return voidEl("param");
	}

	public static Element source() {
		return voidEl("source");
	}

	public static Element track() {
		return voidEl("track");
	}

	public static Element wbr() {
		return voidEl("wbr");
	}

	public static Element head(Element... tag) {
		return nonVoid("head", tag);
	}

	public static Element title(String text) {
		return nonVoid("title", text(text));
	}

	public static Element body(Attribute attr, Element... tag) {
		return nonVoid("body", attr, tag);
	}

	public static Element body(Element... tag) {
		return nonVoid("body", tag);
	}

	public static Element div(Element... tag) {
		return nonVoid("div", tag);
	}

	public static Element div(List<Element> tags) {
		return nonVoid("div", tags);
	}

	public static Element div(Attribute attr, Element... tag) {
		return nonVoid("div", attr, tag);
	}

	public static Element div(Attribute attr, String text) {
		return nonVoid("div", attr, text(text));
	}

	public static Element div(String text) {
		return nonVoid("div", text(text));
	}

	public static Element div(Element tag, String text) {
		return nonVoid("div", tag, text(text));
	}

	public static Element a(Element... tag) {
		return nonVoid("a", tag);
	}

	public static Element a(Attribute attr, Element... tag) {
		return nonVoid("a", attr, tag);
	}

	public static Element a(Attribute attr, String text) {
		return nonVoid("a", attr, text(text));
	}

	public static Element a(String text) {
		return nonVoid("a", text(text));
	}

	public static Element a(Element tag, String text) {
		return nonVoid("a", tag, text(text));
	}

	public static Element span(Element... tag) {
		return nonVoid("span", tag);
	}

	public static Element span(Attribute attr, Element... tag) {
		return nonVoid("span", attr, tag);
	}

	public static Element span(Attribute attr, String text) {
		return nonVoid("span", attr, text(text));
	}

	public static Element span(String text) {
		return nonVoid("span", text(text));
	}

	public static Element span(Element tag, String text) {
		return nonVoid("span", tag, text(text));
	}

	public static Element h1(String text) {
		return nonVoid("h1", text(text));
	}

	public static Element h2(String text) {
		return nonVoid("h2", text(text));
	}

	public static Element h3(String text) {
		return nonVoid("h3", text(text));
	}

	public static Element h4(String text) {
		return nonVoid("h4", text(text));
	}

	public static Element h5(String text) {
		return nonVoid("h5", text(text));
	}

	public static Element h6(String text) {
		return nonVoid("h6", text(text));
	}

	public static Element ul(Attribute attribute, Element... tag) {
		return nonVoid("ul", attribute, tag);
	}

	public static Element li(Attribute attribute, Element... tag) {
		return nonVoid("li", attribute, tag);
	}

	public static Element li(Element... tag) {
		return nonVoid("li", tag);
	}

	public static Element i(Attribute attribute, Element... tag) {
		return nonVoid("i", attribute, tag);
	}

	public static Element nav(Attribute attribute, Element... tag) {
		return nonVoid("nav", attribute, tag);
	}

	public static Element nav(Element... tag) {
		return nonVoid("nav", tag);
	}

	public static Element button(Attribute attribute, String text) {
		return nonVoid("button", attribute, text(text));
	}

	public static Element footer(Attribute attribute, Element... tag) {
		return nonVoid("footer", attribute, tag);
	}

	public static Element footer(Element... tag) {
		return nonVoid("footer", tag);
	}

	public static Element script(Attribute attribute, Element... tag) {
		return nonVoid("script", attribute, tag);
	}

	public static Attribute attr(String... comp) {
		return new Attribute(comp);
	}
}
