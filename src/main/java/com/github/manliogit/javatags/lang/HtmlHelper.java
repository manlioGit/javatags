package com.github.manliogit.javatags.lang;

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

	public static Element nonVoid(String name, Attribute attr, Iterable<Element> tags) {
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
		return new Group(text("<!DOCTYPE html>"),
				new NonVoid("html", attr, tag));
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

	public static Element head(Iterable<Element> tags) {
		return nonVoid("head", tags);
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

	public static Element body(Attribute attr, Iterable<Element> tags) {
		return nonVoid("body", attr, tags);
	}

	public static Element body(Iterable<Element> tags) {
		return nonVoid("body", tags);
	}

	public static Element div(Element... tag) {
		return nonVoid("div", tag);
	}

	public static Element div(Iterable<Element> tags) {
		return nonVoid("div", tags);
	}

	public static Element div(Attribute attr, Iterable<Element> tags) {
		return nonVoid("div", attr, tags);
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

	public static Element a(Attribute attr, Iterable<Element> tags) {
		return nonVoid("a", attr, tags);
	}

	public static Element a(Iterable<Element> tags) {
		return nonVoid("a", tags);
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

	public static Element span(Attribute attr, Iterable<Element> tags) {
		return nonVoid("span", attr, tags);
	}

	public static Element span(Iterable<Element> tags) {
		return nonVoid("span", tags);
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

	public static Element ul(Attribute attr, Element... tag) {
		return nonVoid("ul", attr, tag);
	}

	public static Element ul(Element... tag) {
		return nonVoid("ul", tag);
	}

	public static Element ul(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ul", attr, tags);
	}

	public static Element ul(Iterable<Element> tags) {
		return nonVoid("ul", tags);
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

	public static Element nav(Attribute attr, Element... tag) {
		return nonVoid("nav", attr, tag);
	}

	public static Element nav(Element... tag) {
		return nonVoid("nav", tag);
	}

	public static Element nav(Attribute attr, Iterable<Element> tags) {
		return nonVoid("nav", attr, tags);
	}

	public static Element nav(Iterable<Element> tags) {
		return nonVoid("nav", tags);
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

	public static Element script(Attribute attribute, String text) {
		return nonVoid("script", attribute, text(text));
	}
	
	public static Element abbr(Attribute attr, Element... tag) {
		return nonVoid("abbr", attr, tag);
	}

	public static Element abbr(Element... tag) {
		return nonVoid("abbr", tag);
	}

	public static Element abbr(Attribute attr, Iterable<Element> tags) {
		return nonVoid("abbr", attr, tags);
	}

	public static Element abbr(Iterable<Element> tags) {
		return nonVoid("abbr", tags);
	}

	public static Element address(Attribute attr, Element... tag) {
		return nonVoid("address", attr, tag);
	}

	public static Element address(Element... tag) {
		return nonVoid("address", tag);
	}

	public static Element address(Attribute attr, Iterable<Element> tags) {
		return nonVoid("address", attr, tags);
	}

	public static Element address(Iterable<Element> tags) {
		return nonVoid("address", tags);
	}

	public static Element article(Attribute attr, Element... tag) {
		return nonVoid("article", attr, tag);
	}

	public static Element article(Element... tag) {
		return nonVoid("article", tag);
	}

	public static Element article(Attribute attr, Iterable<Element> tags) {
		return nonVoid("article", attr, tags);
	}

	public static Element article(Iterable<Element> tags) {
		return nonVoid("article", tags);
	}

	public static Element aside(Attribute attr, Element... tag) {
		return nonVoid("aside", attr, tag);
	}

	public static Element aside(Element... tag) {
		return nonVoid("aside", tag);
	}

	public static Element aside(Attribute attr, Iterable<Element> tags) {
		return nonVoid("aside", attr, tags);
	}

	public static Element aside(Iterable<Element> tags) {
		return nonVoid("aside", tags);
	}

	public static Element audio(Attribute attr, Element... tag) {
		return nonVoid("audio", attr, tag);
	}

	public static Element audio(Element... tag) {
		return nonVoid("audio", tag);
	}

	public static Element audio(Attribute attr, Iterable<Element> tags) {
		return nonVoid("audio", attr, tags);
	}

	public static Element audio(Iterable<Element> tags) {
		return nonVoid("audio", tags);
	}

	public static Element b(Attribute attr, Element... tag) {
		return nonVoid("b", attr, tag);
	}

	public static Element b(Element... tag) {
		return nonVoid("b", tag);
	}

	public static Element b(Attribute attr, Iterable<Element> tags) {
		return nonVoid("b", attr, tags);
	}

	public static Element b(Iterable<Element> tags) {
		return nonVoid("b", tags);
	}

	public static Element bdi(Attribute attr, Element... tag) {
		return nonVoid("bdi", attr, tag);
	}

	public static Element bdi(Element... tag) {
		return nonVoid("bdi", tag);
	}

	public static Element bdi(Attribute attr, Iterable<Element> tags) {
		return nonVoid("bdi", attr, tags);
	}

	public static Element bdi(Iterable<Element> tags) {
		return nonVoid("bdi", tags);
	}

	public static Element bdo(Attribute attr, Element... tag) {
		return nonVoid("bdo", attr, tag);
	}

	public static Element bdo(Element... tag) {
		return nonVoid("bdo", tag);
	}

	public static Element bdo(Attribute attr, Iterable<Element> tags) {
		return nonVoid("bdo", attr, tags);
	}

	public static Element bdo(Iterable<Element> tags) {
		return nonVoid("bdo", tags);
	}

	public static Element blockquote(Attribute attr, Element... tag) {
		return nonVoid("blockquote", attr, tag);
	}

	public static Element blockquote(Element... tag) {
		return nonVoid("blockquote", tag);
	}

	public static Element blockquote(Attribute attr, Iterable<Element> tags) {
		return nonVoid("blockquote", attr, tags);
	}

	public static Element blockquote(Iterable<Element> tags) {
		return nonVoid("blockquote", tags);
	}

	public static Element canvas(Attribute attr, Element... tag) {
		return nonVoid("canvas", attr, tag);
	}

	public static Element canvas(Element... tag) {
		return nonVoid("canvas", tag);
	}

	public static Element canvas(Attribute attr, Iterable<Element> tags) {
		return nonVoid("canvas", attr, tags);
	}

	public static Element canvas(Iterable<Element> tags) {
		return nonVoid("canvas", tags);
	}

	public static Element caption(Attribute attr, Element... tag) {
		return nonVoid("caption", attr, tag);
	}

	public static Element caption(Element... tag) {
		return nonVoid("caption", tag);
	}

	public static Element caption(Attribute attr, Iterable<Element> tags) {
		return nonVoid("caption", attr, tags);
	}

	public static Element caption(Iterable<Element> tags) {
		return nonVoid("caption", tags);
	}

	public static Element cite(Attribute attr, Element... tag) {
		return nonVoid("cite", attr, tag);
	}

	public static Element cite(Element... tag) {
		return nonVoid("cite", tag);
	}

	public static Element cite(Attribute attr, Iterable<Element> tags) {
		return nonVoid("cite", attr, tags);
	}

	public static Element cite(Iterable<Element> tags) {
		return nonVoid("cite", tags);
	}

	public static Element code(Attribute attr, Element... tag) {
		return nonVoid("code", attr, tag);
	}

	public static Element code(Element... tag) {
		return nonVoid("code", tag);
	}

	public static Element code(Attribute attr, Iterable<Element> tags) {
		return nonVoid("code", attr, tags);
	}

	public static Element code(Iterable<Element> tags) {
		return nonVoid("code", tags);
	}

	public static Element colgroup(Attribute attr, Element... tag) {
		return nonVoid("colgroup", attr, tag);
	}

	public static Element colgroup(Element... tag) {
		return nonVoid("colgroup", tag);
	}

	public static Element colgroup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("colgroup", attr, tags);
	}

	public static Element colgroup(Iterable<Element> tags) {
		return nonVoid("colgroup", tags);
	}

	public static Element data(Attribute attr, Element... tag) {
		return nonVoid("data", attr, tag);
	}

	public static Element data(Element... tag) {
		return nonVoid("data", tag);
	}

	public static Element data(Attribute attr, Iterable<Element> tags) {
		return nonVoid("data", attr, tags);
	}

	public static Element data(Iterable<Element> tags) {
		return nonVoid("data", tags);
	}

	public static Element datalist(Attribute attr, Element... tag) {
		return nonVoid("datalist", attr, tag);
	}

	public static Element datalist(Element... tag) {
		return nonVoid("datalist", tag);
	}

	public static Element datalist(Attribute attr, Iterable<Element> tags) {
		return nonVoid("datalist", attr, tags);
	}

	public static Element datalist(Iterable<Element> tags) {
		return nonVoid("datalist", tags);
	}

	public static Element dd(Attribute attr, Element... tag) {
		return nonVoid("dd", attr, tag);
	}

	public static Element dd(Element... tag) {
		return nonVoid("dd", tag);
	}

	public static Element dd(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dd", attr, tags);
	}

	public static Element dd(Iterable<Element> tags) {
		return nonVoid("dd", tags);
	}

	public static Element del(Attribute attr, Element... tag) {
		return nonVoid("del", attr, tag);
	}

	public static Element del(Element... tag) {
		return nonVoid("del", tag);
	}

	public static Element del(Attribute attr, Iterable<Element> tags) {
		return nonVoid("del", attr, tags);
	}

	public static Element del(Iterable<Element> tags) {
		return nonVoid("del", tags);
	}

	public static Element dfn(Attribute attr, Element... tag) {
		return nonVoid("dfn", attr, tag);
	}

	public static Element dfn(Element... tag) {
		return nonVoid("dfn", tag);
	}

	public static Element dfn(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dfn", attr, tags);
	}

	public static Element dfn(Iterable<Element> tags) {
		return nonVoid("dfn", tags);
	}

	public static Element dl(Attribute attr, Element... tag) {
		return nonVoid("dl", attr, tag);
	}

	public static Element dl(Element... tag) {
		return nonVoid("dl", tag);
	}

	public static Element dl(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dl", attr, tags);
	}

	public static Element dl(Iterable<Element> tags) {
		return nonVoid("dl", tags);
	}

	public static Element dt(Attribute attr, Element... tag) {
		return nonVoid("dt", attr, tag);
	}

	public static Element dt(Element... tag) {
		return nonVoid("dt", tag);
	}

	public static Element dt(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dt", attr, tags);
	}

	public static Element dt(Iterable<Element> tags) {
		return nonVoid("dt", tags);
	}

	public static Element em(Attribute attr, Element... tag) {
		return nonVoid("em", attr, tag);
	}

	public static Element em(Element... tag) {
		return nonVoid("em", tag);
	}

	public static Element em(Attribute attr, Iterable<Element> tags) {
		return nonVoid("em", attr, tags);
	}

	public static Element em(Iterable<Element> tags) {
		return nonVoid("em", tags);
	}

	public static Element fieldset(Attribute attr, Element... tag) {
		return nonVoid("fieldset", attr, tag);
	}

	public static Element fieldset(Element... tag) {
		return nonVoid("fieldset", tag);
	}

	public static Element fieldset(Attribute attr, Iterable<Element> tags) {
		return nonVoid("fieldset", attr, tags);
	}

	public static Element fieldset(Iterable<Element> tags) {
		return nonVoid("fieldset", tags);
	}

	public static Element figcaption(Attribute attr, Element... tag) {
		return nonVoid("figcaption", attr, tag);
	}

	public static Element figcaption(Element... tag) {
		return nonVoid("figcaption", tag);
	}

	public static Element figcaption(Attribute attr, Iterable<Element> tags) {
		return nonVoid("figcaption", attr, tags);
	}

	public static Element figcaption(Iterable<Element> tags) {
		return nonVoid("figcaption", tags);
	}

	public static Element figure(Attribute attr, Element... tag) {
		return nonVoid("figure", attr, tag);
	}

	public static Element figure(Element... tag) {
		return nonVoid("figure", tag);
	}

	public static Element figure(Attribute attr, Iterable<Element> tags) {
		return nonVoid("figure", attr, tags);
	}

	public static Element figure(Iterable<Element> tags) {
		return nonVoid("figure", tags);
	}

	public static Element form(Attribute attr, Element... tag) {
		return nonVoid("form", attr, tag);
	}

	public static Element form(Element... tag) {
		return nonVoid("form", tag);
	}

	public static Element form(Attribute attr, Iterable<Element> tags) {
		return nonVoid("form", attr, tags);
	}

	public static Element form(Iterable<Element> tags) {
		return nonVoid("form", tags);
	}

	public static Element header(Attribute attr, Element... tag) {
		return nonVoid("header", attr, tag);
	}

	public static Element header(Element... tag) {
		return nonVoid("header", tag);
	}

	public static Element header(Attribute attr, Iterable<Element> tags) {
		return nonVoid("header", attr, tags);
	}

	public static Element header(Iterable<Element> tags) {
		return nonVoid("header", tags);
	}

	public static Element iframe(Attribute attr, Element... tag) {
		return nonVoid("iframe", attr, tag);
	}

	public static Element iframe(Element... tag) {
		return nonVoid("iframe", tag);
	}

	public static Element iframe(Attribute attr, Iterable<Element> tags) {
		return nonVoid("iframe", attr, tags);
	}

	public static Element iframe(Iterable<Element> tags) {
		return nonVoid("iframe", tags);
	}

	public static Element ins(Attribute attr, Element... tag) {
		return nonVoid("ins", attr, tag);
	}

	public static Element ins(Element... tag) {
		return nonVoid("ins", tag);
	}

	public static Element ins(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ins", attr, tags);
	}

	public static Element ins(Iterable<Element> tags) {
		return nonVoid("ins", tags);
	}

	public static Element kbd(Attribute attr, Element... tag) {
		return nonVoid("kbd", attr, tag);
	}

	public static Element kbd(Element... tag) {
		return nonVoid("kbd", tag);
	}

	public static Element kbd(Attribute attr, Iterable<Element> tags) {
		return nonVoid("kbd", attr, tags);
	}

	public static Element kbd(Iterable<Element> tags) {
		return nonVoid("kbd", tags);
	}

	public static Element label(Attribute attr, Element... tag) {
		return nonVoid("label", attr, tag);
	}

	public static Element label(Element... tag) {
		return nonVoid("label", tag);
	}

	public static Element label(Attribute attr, Iterable<Element> tags) {
		return nonVoid("label", attr, tags);
	}

	public static Element label(Iterable<Element> tags) {
		return nonVoid("label", tags);
	}

	public static Element legend(Attribute attr, Element... tag) {
		return nonVoid("legend", attr, tag);
	}

	public static Element legend(Element... tag) {
		return nonVoid("legend", tag);
	}

	public static Element legend(Attribute attr, Iterable<Element> tags) {
		return nonVoid("legend", attr, tags);
	}

	public static Element legend(Iterable<Element> tags) {
		return nonVoid("legend", tags);
	}

	public static Element main(Attribute attr, Element... tag) {
		return nonVoid("main", attr, tag);
	}

	public static Element main(Element... tag) {
		return nonVoid("main", tag);
	}

	public static Element main(Attribute attr, Iterable<Element> tags) {
		return nonVoid("main", attr, tags);
	}

	public static Element main(Iterable<Element> tags) {
		return nonVoid("main", tags);
	}

	public static Element map(Attribute attr, Element... tag) {
		return nonVoid("map", attr, tag);
	}

	public static Element map(Element... tag) {
		return nonVoid("map", tag);
	}

	public static Element map(Attribute attr, Iterable<Element> tags) {
		return nonVoid("map", attr, tags);
	}

	public static Element map(Iterable<Element> tags) {
		return nonVoid("map", tags);
	}

	public static Element mark(Attribute attr, Element... tag) {
		return nonVoid("mark", attr, tag);
	}

	public static Element mark(Element... tag) {
		return nonVoid("mark", tag);
	}

	public static Element mark(Attribute attr, Iterable<Element> tags) {
		return nonVoid("mark", attr, tags);
	}

	public static Element mark(Iterable<Element> tags) {
		return nonVoid("mark", tags);
	}

	public static Element meter(Attribute attr, Element... tag) {
		return nonVoid("meter", attr, tag);
	}

	public static Element meter(Element... tag) {
		return nonVoid("meter", tag);
	}

	public static Element meter(Attribute attr, Iterable<Element> tags) {
		return nonVoid("meter", attr, tags);
	}

	public static Element meter(Iterable<Element> tags) {
		return nonVoid("meter", tags);
	}

	public static Element noscript(Attribute attr, Element... tag) {
		return nonVoid("noscript", attr, tag);
	}

	public static Element noscript(Element... tag) {
		return nonVoid("noscript", tag);
	}

	public static Element noscript(Attribute attr, Iterable<Element> tags) {
		return nonVoid("noscript", attr, tags);
	}

	public static Element noscript(Iterable<Element> tags) {
		return nonVoid("noscript", tags);
	}

	public static Element object(Attribute attr, Element... tag) {
		return nonVoid("object", attr, tag);
	}

	public static Element object(Element... tag) {
		return nonVoid("object", tag);
	}

	public static Element object(Attribute attr, Iterable<Element> tags) {
		return nonVoid("object", attr, tags);
	}

	public static Element object(Iterable<Element> tags) {
		return nonVoid("object", tags);
	}

	public static Element ol(Attribute attr, Element... tag) {
		return nonVoid("ol", attr, tag);
	}

	public static Element ol(Element... tag) {
		return nonVoid("ol", tag);
	}

	public static Element ol(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ol", attr, tags);
	}

	public static Element ol(Iterable<Element> tags) {
		return nonVoid("ol", tags);
	}

	public static Element optgroup(Attribute attr, Element... tag) {
		return nonVoid("optgroup", attr, tag);
	}

	public static Element optgroup(Element... tag) {
		return nonVoid("optgroup", tag);
	}

	public static Element optgroup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("optgroup", attr, tags);
	}

	public static Element optgroup(Iterable<Element> tags) {
		return nonVoid("optgroup", tags);
	}

	public static Element option(Attribute attr, Element... tag) {
		return nonVoid("option", attr, tag);
	}

	public static Element option(Element... tag) {
		return nonVoid("option", tag);
	}

	public static Element option(Attribute attr, Iterable<Element> tags) {
		return nonVoid("option", attr, tags);
	}

	public static Element option(Iterable<Element> tags) {
		return nonVoid("option", tags);
	}

	public static Element output(Attribute attr, Element... tag) {
		return nonVoid("output", attr, tag);
	}

	public static Element output(Element... tag) {
		return nonVoid("output", tag);
	}

	public static Element output(Attribute attr, Iterable<Element> tags) {
		return nonVoid("output", attr, tags);
	}

	public static Element output(Iterable<Element> tags) {
		return nonVoid("output", tags);
	}

	public static Element p(Attribute attr, Element... tag) {
		return nonVoid("p", attr, tag);
	}

	public static Element p(Element... tag) {
		return nonVoid("p", tag);
	}

	public static Element p(Attribute attr, Iterable<Element> tags) {
		return nonVoid("p", attr, tags);
	}

	public static Element p(Iterable<Element> tags) {
		return nonVoid("p", tags);
	}

	public static Element pre(Attribute attr, Element... tag) {
		return nonVoid("pre", attr, tag);
	}

	public static Element pre(Element... tag) {
		return nonVoid("pre", tag);
	}

	public static Element pre(Attribute attr, Iterable<Element> tags) {
		return nonVoid("pre", attr, tags);
	}

	public static Element pre(Iterable<Element> tags) {
		return nonVoid("pre", tags);
	}

	public static Element progress(Attribute attr, Element... tag) {
		return nonVoid("progress", attr, tag);
	}

	public static Element progress(Element... tag) {
		return nonVoid("progress", tag);
	}

	public static Element progress(Attribute attr, Iterable<Element> tags) {
		return nonVoid("progress", attr, tags);
	}

	public static Element progress(Iterable<Element> tags) {
		return nonVoid("progress", tags);
	}

	public static Element q(Attribute attr, Element... tag) {
		return nonVoid("q", attr, tag);
	}

	public static Element q(Element... tag) {
		return nonVoid("q", tag);
	}

	public static Element q(Attribute attr, Iterable<Element> tags) {
		return nonVoid("q", attr, tags);
	}

	public static Element q(Iterable<Element> tags) {
		return nonVoid("q", tags);
	}

	public static Element rb(Attribute attr, Element... tag) {
		return nonVoid("rb", attr, tag);
	}

	public static Element rb(Element... tag) {
		return nonVoid("rb", tag);
	}

	public static Element rb(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rb", attr, tags);
	}

	public static Element rb(Iterable<Element> tags) {
		return nonVoid("rb", tags);
	}

	public static Element rp(Attribute attr, Element... tag) {
		return nonVoid("rp", attr, tag);
	}

	public static Element rp(Element... tag) {
		return nonVoid("rp", tag);
	}

	public static Element rp(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rp", attr, tags);
	}

	public static Element rp(Iterable<Element> tags) {
		return nonVoid("rp", tags);
	}

	public static Element rt(Attribute attr, Element... tag) {
		return nonVoid("rt", attr, tag);
	}

	public static Element rt(Element... tag) {
		return nonVoid("rt", tag);
	}

	public static Element rt(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rt", attr, tags);
	}

	public static Element rt(Iterable<Element> tags) {
		return nonVoid("rt", tags);
	}

	public static Element rtc(Attribute attr, Element... tag) {
		return nonVoid("rtc", attr, tag);
	}

	public static Element rtc(Element... tag) {
		return nonVoid("rtc", tag);
	}

	public static Element rtc(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rtc", attr, tags);
	}

	public static Element rtc(Iterable<Element> tags) {
		return nonVoid("rtc", tags);
	}

	public static Element ruby(Attribute attr, Element... tag) {
		return nonVoid("ruby", attr, tag);
	}

	public static Element ruby(Element... tag) {
		return nonVoid("ruby", tag);
	}

	public static Element ruby(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ruby", attr, tags);
	}

	public static Element ruby(Iterable<Element> tags) {
		return nonVoid("ruby", tags);
	}

	public static Element s(Attribute attr, Element... tag) {
		return nonVoid("s", attr, tag);
	}

	public static Element s(Element... tag) {
		return nonVoid("s", tag);
	}

	public static Element s(Attribute attr, Iterable<Element> tags) {
		return nonVoid("s", attr, tags);
	}

	public static Element s(Iterable<Element> tags) {
		return nonVoid("s", tags);
	}

	public static Element samp(Attribute attr, Element... tag) {
		return nonVoid("samp", attr, tag);
	}

	public static Element samp(Element... tag) {
		return nonVoid("samp", tag);
	}

	public static Element samp(Attribute attr, Iterable<Element> tags) {
		return nonVoid("samp", attr, tags);
	}

	public static Element samp(Iterable<Element> tags) {
		return nonVoid("samp", tags);
	}

	public static Element section(Attribute attr, Element... tag) {
		return nonVoid("section", attr, tag);
	}

	public static Element section(Element... tag) {
		return nonVoid("section", tag);
	}

	public static Element section(Attribute attr, Iterable<Element> tags) {
		return nonVoid("section", attr, tags);
	}

	public static Element section(Iterable<Element> tags) {
		return nonVoid("section", tags);
	}

	public static Element select(Attribute attr, Element... tag) {
		return nonVoid("select", attr, tag);
	}

	public static Element select(Element... tag) {
		return nonVoid("select", tag);
	}

	public static Element select(Attribute attr, Iterable<Element> tags) {
		return nonVoid("select", attr, tags);
	}

	public static Element select(Iterable<Element> tags) {
		return nonVoid("select", tags);
	}

	public static Element small(Attribute attr, Element... tag) {
		return nonVoid("small", attr, tag);
	}

	public static Element small(Element... tag) {
		return nonVoid("small", tag);
	}

	public static Element small(Attribute attr, Iterable<Element> tags) {
		return nonVoid("small", attr, tags);
	}

	public static Element small(Iterable<Element> tags) {
		return nonVoid("small", tags);
	}

	public static Element strong(Attribute attr, Element... tag) {
		return nonVoid("strong", attr, tag);
	}

	public static Element strong(Element... tag) {
		return nonVoid("strong", tag);
	}

	public static Element strong(Attribute attr, Iterable<Element> tags) {
		return nonVoid("strong", attr, tags);
	}

	public static Element strong(Iterable<Element> tags) {
		return nonVoid("strong", tags);
	}

	public static Element style(Attribute attr, Element... tag) {
		return nonVoid("style", attr, tag);
	}

	public static Element style(Element... tag) {
		return nonVoid("style", tag);
	}

	public static Element style(Attribute attr, Iterable<Element> tags) {
		return nonVoid("style", attr, tags);
	}

	public static Element style(Iterable<Element> tags) {
		return nonVoid("style", tags);
	}

	public static Element sub(Attribute attr, Element... tag) {
		return nonVoid("sub", attr, tag);
	}

	public static Element sub(Element... tag) {
		return nonVoid("sub", tag);
	}

	public static Element sub(Attribute attr, Iterable<Element> tags) {
		return nonVoid("sub", attr, tags);
	}

	public static Element sub(Iterable<Element> tags) {
		return nonVoid("sub", tags);
	}

	public static Element sup(Attribute attr, Element... tag) {
		return nonVoid("sup", attr, tag);
	}

	public static Element sup(Element... tag) {
		return nonVoid("sup", tag);
	}

	public static Element sup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("sup", attr, tags);
	}

	public static Element sup(Iterable<Element> tags) {
		return nonVoid("sup", tags);
	}

	public static Element table(Attribute attr, Element... tag) {
		return nonVoid("table", attr, tag);
	}

	public static Element table(Element... tag) {
		return nonVoid("table", tag);
	}

	public static Element table(Attribute attr, Iterable<Element> tags) {
		return nonVoid("table", attr, tags);
	}

	public static Element table(Iterable<Element> tags) {
		return nonVoid("table", tags);
	}

	public static Element tbody(Attribute attr, Element... tag) {
		return nonVoid("tbody", attr, tag);
	}

	public static Element tbody(Element... tag) {
		return nonVoid("tbody", tag);
	}

	public static Element tbody(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tbody", attr, tags);
	}

	public static Element tbody(Iterable<Element> tags) {
		return nonVoid("tbody", tags);
	}

	public static Element td(Attribute attr, Element... tag) {
		return nonVoid("td", attr, tag);
	}

	public static Element td(Element... tag) {
		return nonVoid("td", tag);
	}

	public static Element td(Attribute attr, Iterable<Element> tags) {
		return nonVoid("td", attr, tags);
	}

	public static Element td(Iterable<Element> tags) {
		return nonVoid("td", tags);
	}

	public static Element template(Attribute attr, Element... tag) {
		return nonVoid("template", attr, tag);
	}

	public static Element template(Element... tag) {
		return nonVoid("template", tag);
	}

	public static Element template(Attribute attr, Iterable<Element> tags) {
		return nonVoid("template", attr, tags);
	}

	public static Element template(Iterable<Element> tags) {
		return nonVoid("template", tags);
	}

	public static Element textarea(Attribute attr, Element... tag) {
		return nonVoid("textarea", attr, tag);
	}

	public static Element textarea(Element... tag) {
		return nonVoid("textarea", tag);
	}

	public static Element textarea(Attribute attr, Iterable<Element> tags) {
		return nonVoid("textarea", attr, tags);
	}

	public static Element textarea(Iterable<Element> tags) {
		return nonVoid("textarea", tags);
	}

	public static Element tfoot(Attribute attr, Element... tag) {
		return nonVoid("tfoot", attr, tag);
	}

	public static Element tfoot(Element... tag) {
		return nonVoid("tfoot", tag);
	}

	public static Element tfoot(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tfoot", attr, tags);
	}

	public static Element tfoot(Iterable<Element> tags) {
		return nonVoid("tfoot", tags);
	}

	public static Element th(Attribute attr, Element... tag) {
		return nonVoid("th", attr, tag);
	}

	public static Element th(Element... tag) {
		return nonVoid("th", tag);
	}

	public static Element th(Attribute attr, Iterable<Element> tags) {
		return nonVoid("th", attr, tags);
	}

	public static Element th(Iterable<Element> tags) {
		return nonVoid("th", tags);
	}

	public static Element thead(Attribute attr, Element... tag) {
		return nonVoid("thead", attr, tag);
	}

	public static Element thead(Element... tag) {
		return nonVoid("thead", tag);
	}

	public static Element thead(Attribute attr, Iterable<Element> tags) {
		return nonVoid("thead", attr, tags);
	}

	public static Element thead(Iterable<Element> tags) {
		return nonVoid("thead", tags);
	}

	public static Element time(Attribute attr, Element... tag) {
		return nonVoid("time", attr, tag);
	}

	public static Element time(Element... tag) {
		return nonVoid("time", tag);
	}

	public static Element time(Attribute attr, Iterable<Element> tags) {
		return nonVoid("time", attr, tags);
	}

	public static Element time(Iterable<Element> tags) {
		return nonVoid("time", tags);
	}

	public static Element tr(Attribute attr, Element... tag) {
		return nonVoid("tr", attr, tag);
	}

	public static Element tr(Element... tag) {
		return nonVoid("tr", tag);
	}

	public static Element tr(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tr", attr, tags);
	}

	public static Element tr(Iterable<Element> tags) {
		return nonVoid("tr", tags);
	}

	public static Element u(Attribute attr, Element... tag) {
		return nonVoid("u", attr, tag);
	}

	public static Element u(Element... tag) {
		return nonVoid("u", tag);
	}

	public static Element u(Attribute attr, Iterable<Element> tags) {
		return nonVoid("u", attr, tags);
	}

	public static Element u(Iterable<Element> tags) {
		return nonVoid("u", tags);
	}

	public static Element var(Attribute attr, Element... tag) {
		return nonVoid("var", attr, tag);
	}

	public static Element var(Element... tag) {
		return nonVoid("var", tag);
	}

	public static Element var(Attribute attr, Iterable<Element> tags) {
		return nonVoid("var", attr, tags);
	}

	public static Element var(Iterable<Element> tags) {
		return nonVoid("var", tags);
	}

	public static Element video(Attribute attr, Element... tag) {
		return nonVoid("video", attr, tag);
	}

	public static Element video(Element... tag) {
		return nonVoid("video", tag);
	}

	public static Element video(Attribute attr, Iterable<Element> tags) {
		return nonVoid("video", attr, tags);
	}

	public static Element video(Iterable<Element> tags) {
		return nonVoid("video", tags);
	}

	public static Attribute attr(String... comp) {
		return new Attribute(comp);
	}
}
