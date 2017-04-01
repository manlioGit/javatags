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

	public static Element group(Iterable<Element> tags) {
		return new Group(tags);
	}

	public static Element group(Element... tags) {
		return new Group(tags);
	}

	public static Attribute attr(String... comp) {
		return new Attribute(comp);
	}

	public static Attribute attr(Iterable<String> comp) {
		return new Attribute(comp);
	}

	public static Element html5(Attribute attr, Element... tag) {
		return new Group(text("<!DOCTYPE html>"), new NonVoid("html", attr, tag));
	}

	public static Element html5(Element... tag) {
		return html5(new Attribute(), tag);
	}

	public static Element html5(Attribute attr, Iterable<Element> tags) {
		return new Group(text("<!DOCTYPE html>"), new NonVoid("html", attr, tags));
	}

	public static Element html5(Iterable<Element> tags) {
		return html5(new Attribute(), tags);
	}

	/* ********************
	 * void Elements
	 ********************** */
	
	public static Element area(Attribute attr) {
		return voidEl("area", attr);
	}

	public static Element area() {
		return voidEl("area");
	}

	public static Element base(Attribute attr) {
		return voidEl("base", attr);
	}

	public static Element base() {
		return voidEl("base");
	}

	public static Element br(Attribute attr) {
		return voidEl("br", attr);
	}

	public static Element br() {
		return voidEl("br");
	}

	public static Element col(Attribute attr) {
		return voidEl("col", attr);
	}

	public static Element col() {
		return voidEl("col");
	}

	public static Element command(Attribute attr) {
		return voidEl("command", attr);
	}

	public static Element command() {
		return voidEl("command");
	}

	public static Element embed(Attribute attr) {
		return voidEl("embed", attr);
	}

	public static Element embed() {
		return voidEl("embed");
	}

	public static Element hr(Attribute attr) {
		return voidEl("hr", attr);
	}

	public static Element hr() {
		return voidEl("hr");
	}

	public static Element img(Attribute attr) {
		return voidEl("img", attr);
	}

	public static Element img() {
		return voidEl("img");
	}

	public static Element input(Attribute attr) {
		return voidEl("input", attr);
	}

	public static Element input() {
		return voidEl("input");
	}

	public static Element keygen(Attribute attr) {
		return voidEl("keygen", attr);
	}

	public static Element keygen() {
		return voidEl("keygen");
	}

	public static Element link(Attribute attr) {
		return voidEl("link", attr);
	}

	public static Element link() {
		return voidEl("link");
	}

	public static Element meta(Attribute attr) {
		return voidEl("meta", attr);
	}

	public static Element meta() {
		return voidEl("meta");
	}

	public static Element param(Attribute attr) {
		return voidEl("param", attr);
	}

	public static Element param() {
		return voidEl("param");
	}

	public static Element source(Attribute attr) {
		return voidEl("source", attr);
	}

	public static Element source() {
		return voidEl("source");
	}

	public static Element track(Attribute attr) {
		return voidEl("track", attr);
	}

	public static Element track() {
		return voidEl("track");
	}

	public static Element wbr(Attribute attr) {
		return voidEl("wbr", attr);
	}

	public static Element wbr() {
		return voidEl("wbr");
	}

	/* ********************
	 * nonVoid Elements
	 ********************** */
	
	public static Element a(Element... tag) {
		return nonVoid("a", tag);
	}

	public static Element a(Iterable<Element> tags) {
		return nonVoid("a", tags);
	}

	public static Element a(Attribute attr, Iterable<Element> tags) {
		return nonVoid("a", attr, tags);
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

	public static Element abbr(Element... tag) {
		return nonVoid("abbr", tag);
	}

	public static Element abbr(Iterable<Element> tags) {
		return nonVoid("abbr", tags);
	}

	public static Element abbr(Attribute attr, Iterable<Element> tags) {
		return nonVoid("abbr", attr, tags);
	}

	public static Element abbr(Attribute attr, Element... tag) {
		return nonVoid("abbr", attr, tag);
	}

	public static Element abbr(Attribute attr, String text) {
		return nonVoid("abbr", attr, text(text));
	}

	public static Element abbr(String text) {
		return nonVoid("abbr", text(text));
	}

	public static Element abbr(Element tag, String text) {
		return nonVoid("abbr", tag, text(text));
	}

	public static Element address(Element... tag) {
		return nonVoid("address", tag);
	}

	public static Element address(Iterable<Element> tags) {
		return nonVoid("address", tags);
	}

	public static Element address(Attribute attr, Iterable<Element> tags) {
		return nonVoid("address", attr, tags);
	}

	public static Element address(Attribute attr, Element... tag) {
		return nonVoid("address", attr, tag);
	}

	public static Element address(Attribute attr, String text) {
		return nonVoid("address", attr, text(text));
	}

	public static Element address(String text) {
		return nonVoid("address", text(text));
	}

	public static Element address(Element tag, String text) {
		return nonVoid("address", tag, text(text));
	}

	public static Element article(Element... tag) {
		return nonVoid("article", tag);
	}

	public static Element article(Iterable<Element> tags) {
		return nonVoid("article", tags);
	}

	public static Element article(Attribute attr, Iterable<Element> tags) {
		return nonVoid("article", attr, tags);
	}

	public static Element article(Attribute attr, Element... tag) {
		return nonVoid("article", attr, tag);
	}

	public static Element article(Attribute attr, String text) {
		return nonVoid("article", attr, text(text));
	}

	public static Element article(String text) {
		return nonVoid("article", text(text));
	}

	public static Element article(Element tag, String text) {
		return nonVoid("article", tag, text(text));
	}

	public static Element aside(Element... tag) {
		return nonVoid("aside", tag);
	}

	public static Element aside(Iterable<Element> tags) {
		return nonVoid("aside", tags);
	}

	public static Element aside(Attribute attr, Iterable<Element> tags) {
		return nonVoid("aside", attr, tags);
	}

	public static Element aside(Attribute attr, Element... tag) {
		return nonVoid("aside", attr, tag);
	}

	public static Element aside(Attribute attr, String text) {
		return nonVoid("aside", attr, text(text));
	}

	public static Element aside(String text) {
		return nonVoid("aside", text(text));
	}

	public static Element aside(Element tag, String text) {
		return nonVoid("aside", tag, text(text));
	}

	public static Element audio(Element... tag) {
		return nonVoid("audio", tag);
	}

	public static Element audio(Iterable<Element> tags) {
		return nonVoid("audio", tags);
	}

	public static Element audio(Attribute attr, Iterable<Element> tags) {
		return nonVoid("audio", attr, tags);
	}

	public static Element audio(Attribute attr, Element... tag) {
		return nonVoid("audio", attr, tag);
	}

	public static Element audio(Attribute attr, String text) {
		return nonVoid("audio", attr, text(text));
	}

	public static Element audio(String text) {
		return nonVoid("audio", text(text));
	}

	public static Element audio(Element tag, String text) {
		return nonVoid("audio", tag, text(text));
	}

	public static Element b(Element... tag) {
		return nonVoid("b", tag);
	}

	public static Element b(Iterable<Element> tags) {
		return nonVoid("b", tags);
	}

	public static Element b(Attribute attr, Iterable<Element> tags) {
		return nonVoid("b", attr, tags);
	}

	public static Element b(Attribute attr, Element... tag) {
		return nonVoid("b", attr, tag);
	}

	public static Element b(Attribute attr, String text) {
		return nonVoid("b", attr, text(text));
	}

	public static Element b(String text) {
		return nonVoid("b", text(text));
	}

	public static Element b(Element tag, String text) {
		return nonVoid("b", tag, text(text));
	}

	public static Element bdi(Element... tag) {
		return nonVoid("bdi", tag);
	}

	public static Element bdi(Iterable<Element> tags) {
		return nonVoid("bdi", tags);
	}

	public static Element bdi(Attribute attr, Iterable<Element> tags) {
		return nonVoid("bdi", attr, tags);
	}

	public static Element bdi(Attribute attr, Element... tag) {
		return nonVoid("bdi", attr, tag);
	}

	public static Element bdi(Attribute attr, String text) {
		return nonVoid("bdi", attr, text(text));
	}

	public static Element bdi(String text) {
		return nonVoid("bdi", text(text));
	}

	public static Element bdi(Element tag, String text) {
		return nonVoid("bdi", tag, text(text));
	}

	public static Element bdo(Element... tag) {
		return nonVoid("bdo", tag);
	}

	public static Element bdo(Iterable<Element> tags) {
		return nonVoid("bdo", tags);
	}

	public static Element bdo(Attribute attr, Iterable<Element> tags) {
		return nonVoid("bdo", attr, tags);
	}

	public static Element bdo(Attribute attr, Element... tag) {
		return nonVoid("bdo", attr, tag);
	}

	public static Element bdo(Attribute attr, String text) {
		return nonVoid("bdo", attr, text(text));
	}

	public static Element bdo(String text) {
		return nonVoid("bdo", text(text));
	}

	public static Element bdo(Element tag, String text) {
		return nonVoid("bdo", tag, text(text));
	}

	public static Element blockquote(Element... tag) {
		return nonVoid("blockquote", tag);
	}

	public static Element blockquote(Iterable<Element> tags) {
		return nonVoid("blockquote", tags);
	}

	public static Element blockquote(Attribute attr, Iterable<Element> tags) {
		return nonVoid("blockquote", attr, tags);
	}

	public static Element blockquote(Attribute attr, Element... tag) {
		return nonVoid("blockquote", attr, tag);
	}

	public static Element blockquote(Attribute attr, String text) {
		return nonVoid("blockquote", attr, text(text));
	}

	public static Element blockquote(String text) {
		return nonVoid("blockquote", text(text));
	}

	public static Element blockquote(Element tag, String text) {
		return nonVoid("blockquote", tag, text(text));
	}

	public static Element body(Element... tag) {
		return nonVoid("body", tag);
	}

	public static Element body(Iterable<Element> tags) {
		return nonVoid("body", tags);
	}

	public static Element body(Attribute attr, Iterable<Element> tags) {
		return nonVoid("body", attr, tags);
	}

	public static Element body(Attribute attr, Element... tag) {
		return nonVoid("body", attr, tag);
	}

	public static Element body(Attribute attr, String text) {
		return nonVoid("body", attr, text(text));
	}

	public static Element body(String text) {
		return nonVoid("body", text(text));
	}

	public static Element body(Element tag, String text) {
		return nonVoid("body", tag, text(text));
	}

	public static Element button(Element... tag) {
		return nonVoid("button", tag);
	}

	public static Element button(Iterable<Element> tags) {
		return nonVoid("button", tags);
	}

	public static Element button(Attribute attr, Iterable<Element> tags) {
		return nonVoid("button", attr, tags);
	}

	public static Element button(Attribute attr, Element... tag) {
		return nonVoid("button", attr, tag);
	}

	public static Element button(Attribute attr, String text) {
		return nonVoid("button", attr, text(text));
	}

	public static Element button(String text) {
		return nonVoid("button", text(text));
	}

	public static Element button(Element tag, String text) {
		return nonVoid("button", tag, text(text));
	}

	public static Element canvas(Element... tag) {
		return nonVoid("canvas", tag);
	}

	public static Element canvas(Iterable<Element> tags) {
		return nonVoid("canvas", tags);
	}

	public static Element canvas(Attribute attr, Iterable<Element> tags) {
		return nonVoid("canvas", attr, tags);
	}

	public static Element canvas(Attribute attr, Element... tag) {
		return nonVoid("canvas", attr, tag);
	}

	public static Element canvas(Attribute attr, String text) {
		return nonVoid("canvas", attr, text(text));
	}

	public static Element canvas(String text) {
		return nonVoid("canvas", text(text));
	}

	public static Element canvas(Element tag, String text) {
		return nonVoid("canvas", tag, text(text));
	}

	public static Element caption(Element... tag) {
		return nonVoid("caption", tag);
	}

	public static Element caption(Iterable<Element> tags) {
		return nonVoid("caption", tags);
	}

	public static Element caption(Attribute attr, Iterable<Element> tags) {
		return nonVoid("caption", attr, tags);
	}

	public static Element caption(Attribute attr, Element... tag) {
		return nonVoid("caption", attr, tag);
	}

	public static Element caption(Attribute attr, String text) {
		return nonVoid("caption", attr, text(text));
	}

	public static Element caption(String text) {
		return nonVoid("caption", text(text));
	}

	public static Element caption(Element tag, String text) {
		return nonVoid("caption", tag, text(text));
	}

	public static Element cite(Element... tag) {
		return nonVoid("cite", tag);
	}

	public static Element cite(Iterable<Element> tags) {
		return nonVoid("cite", tags);
	}

	public static Element cite(Attribute attr, Iterable<Element> tags) {
		return nonVoid("cite", attr, tags);
	}

	public static Element cite(Attribute attr, Element... tag) {
		return nonVoid("cite", attr, tag);
	}

	public static Element cite(Attribute attr, String text) {
		return nonVoid("cite", attr, text(text));
	}

	public static Element cite(String text) {
		return nonVoid("cite", text(text));
	}

	public static Element cite(Element tag, String text) {
		return nonVoid("cite", tag, text(text));
	}

	public static Element code(Element... tag) {
		return nonVoid("code", tag);
	}

	public static Element code(Iterable<Element> tags) {
		return nonVoid("code", tags);
	}

	public static Element code(Attribute attr, Iterable<Element> tags) {
		return nonVoid("code", attr, tags);
	}

	public static Element code(Attribute attr, Element... tag) {
		return nonVoid("code", attr, tag);
	}

	public static Element code(Attribute attr, String text) {
		return nonVoid("code", attr, text(text));
	}

	public static Element code(String text) {
		return nonVoid("code", text(text));
	}

	public static Element code(Element tag, String text) {
		return nonVoid("code", tag, text(text));
	}

	public static Element colgroup(Element... tag) {
		return nonVoid("colgroup", tag);
	}

	public static Element colgroup(Iterable<Element> tags) {
		return nonVoid("colgroup", tags);
	}

	public static Element colgroup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("colgroup", attr, tags);
	}

	public static Element colgroup(Attribute attr, Element... tag) {
		return nonVoid("colgroup", attr, tag);
	}

	public static Element colgroup(Attribute attr, String text) {
		return nonVoid("colgroup", attr, text(text));
	}

	public static Element colgroup(String text) {
		return nonVoid("colgroup", text(text));
	}

	public static Element colgroup(Element tag, String text) {
		return nonVoid("colgroup", tag, text(text));
	}

	public static Element data(Element... tag) {
		return nonVoid("data", tag);
	}

	public static Element data(Iterable<Element> tags) {
		return nonVoid("data", tags);
	}

	public static Element data(Attribute attr, Iterable<Element> tags) {
		return nonVoid("data", attr, tags);
	}

	public static Element data(Attribute attr, Element... tag) {
		return nonVoid("data", attr, tag);
	}

	public static Element data(Attribute attr, String text) {
		return nonVoid("data", attr, text(text));
	}

	public static Element data(String text) {
		return nonVoid("data", text(text));
	}

	public static Element data(Element tag, String text) {
		return nonVoid("data", tag, text(text));
	}

	public static Element datalist(Element... tag) {
		return nonVoid("datalist", tag);
	}

	public static Element datalist(Iterable<Element> tags) {
		return nonVoid("datalist", tags);
	}

	public static Element datalist(Attribute attr, Iterable<Element> tags) {
		return nonVoid("datalist", attr, tags);
	}

	public static Element datalist(Attribute attr, Element... tag) {
		return nonVoid("datalist", attr, tag);
	}

	public static Element datalist(Attribute attr, String text) {
		return nonVoid("datalist", attr, text(text));
	}

	public static Element datalist(String text) {
		return nonVoid("datalist", text(text));
	}

	public static Element datalist(Element tag, String text) {
		return nonVoid("datalist", tag, text(text));
	}

	public static Element dd(Element... tag) {
		return nonVoid("dd", tag);
	}

	public static Element dd(Iterable<Element> tags) {
		return nonVoid("dd", tags);
	}

	public static Element dd(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dd", attr, tags);
	}

	public static Element dd(Attribute attr, Element... tag) {
		return nonVoid("dd", attr, tag);
	}

	public static Element dd(Attribute attr, String text) {
		return nonVoid("dd", attr, text(text));
	}

	public static Element dd(String text) {
		return nonVoid("dd", text(text));
	}

	public static Element dd(Element tag, String text) {
		return nonVoid("dd", tag, text(text));
	}

	public static Element del(Element... tag) {
		return nonVoid("del", tag);
	}

	public static Element del(Iterable<Element> tags) {
		return nonVoid("del", tags);
	}

	public static Element del(Attribute attr, Iterable<Element> tags) {
		return nonVoid("del", attr, tags);
	}

	public static Element del(Attribute attr, Element... tag) {
		return nonVoid("del", attr, tag);
	}

	public static Element del(Attribute attr, String text) {
		return nonVoid("del", attr, text(text));
	}

	public static Element del(String text) {
		return nonVoid("del", text(text));
	}

	public static Element del(Element tag, String text) {
		return nonVoid("del", tag, text(text));
	}

	public static Element dfn(Element... tag) {
		return nonVoid("dfn", tag);
	}

	public static Element dfn(Iterable<Element> tags) {
		return nonVoid("dfn", tags);
	}

	public static Element dfn(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dfn", attr, tags);
	}

	public static Element dfn(Attribute attr, Element... tag) {
		return nonVoid("dfn", attr, tag);
	}

	public static Element dfn(Attribute attr, String text) {
		return nonVoid("dfn", attr, text(text));
	}

	public static Element dfn(String text) {
		return nonVoid("dfn", text(text));
	}

	public static Element dfn(Element tag, String text) {
		return nonVoid("dfn", tag, text(text));
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

	public static Element dl(Element... tag) {
		return nonVoid("dl", tag);
	}

	public static Element dl(Iterable<Element> tags) {
		return nonVoid("dl", tags);
	}

	public static Element dl(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dl", attr, tags);
	}

	public static Element dl(Attribute attr, Element... tag) {
		return nonVoid("dl", attr, tag);
	}

	public static Element dl(Attribute attr, String text) {
		return nonVoid("dl", attr, text(text));
	}

	public static Element dl(String text) {
		return nonVoid("dl", text(text));
	}

	public static Element dl(Element tag, String text) {
		return nonVoid("dl", tag, text(text));
	}

	public static Element dt(Element... tag) {
		return nonVoid("dt", tag);
	}

	public static Element dt(Iterable<Element> tags) {
		return nonVoid("dt", tags);
	}

	public static Element dt(Attribute attr, Iterable<Element> tags) {
		return nonVoid("dt", attr, tags);
	}

	public static Element dt(Attribute attr, Element... tag) {
		return nonVoid("dt", attr, tag);
	}

	public static Element dt(Attribute attr, String text) {
		return nonVoid("dt", attr, text(text));
	}

	public static Element dt(String text) {
		return nonVoid("dt", text(text));
	}

	public static Element dt(Element tag, String text) {
		return nonVoid("dt", tag, text(text));
	}

	public static Element em(Element... tag) {
		return nonVoid("em", tag);
	}

	public static Element em(Iterable<Element> tags) {
		return nonVoid("em", tags);
	}

	public static Element em(Attribute attr, Iterable<Element> tags) {
		return nonVoid("em", attr, tags);
	}

	public static Element em(Attribute attr, Element... tag) {
		return nonVoid("em", attr, tag);
	}

	public static Element em(Attribute attr, String text) {
		return nonVoid("em", attr, text(text));
	}

	public static Element em(String text) {
		return nonVoid("em", text(text));
	}

	public static Element em(Element tag, String text) {
		return nonVoid("em", tag, text(text));
	}

	public static Element fieldset(Element... tag) {
		return nonVoid("fieldset", tag);
	}

	public static Element fieldset(Iterable<Element> tags) {
		return nonVoid("fieldset", tags);
	}

	public static Element fieldset(Attribute attr, Iterable<Element> tags) {
		return nonVoid("fieldset", attr, tags);
	}

	public static Element fieldset(Attribute attr, Element... tag) {
		return nonVoid("fieldset", attr, tag);
	}

	public static Element fieldset(Attribute attr, String text) {
		return nonVoid("fieldset", attr, text(text));
	}

	public static Element fieldset(String text) {
		return nonVoid("fieldset", text(text));
	}

	public static Element fieldset(Element tag, String text) {
		return nonVoid("fieldset", tag, text(text));
	}

	public static Element figcaption(Element... tag) {
		return nonVoid("figcaption", tag);
	}

	public static Element figcaption(Iterable<Element> tags) {
		return nonVoid("figcaption", tags);
	}

	public static Element figcaption(Attribute attr, Iterable<Element> tags) {
		return nonVoid("figcaption", attr, tags);
	}

	public static Element figcaption(Attribute attr, Element... tag) {
		return nonVoid("figcaption", attr, tag);
	}

	public static Element figcaption(Attribute attr, String text) {
		return nonVoid("figcaption", attr, text(text));
	}

	public static Element figcaption(String text) {
		return nonVoid("figcaption", text(text));
	}

	public static Element figcaption(Element tag, String text) {
		return nonVoid("figcaption", tag, text(text));
	}

	public static Element figure(Element... tag) {
		return nonVoid("figure", tag);
	}

	public static Element figure(Iterable<Element> tags) {
		return nonVoid("figure", tags);
	}

	public static Element figure(Attribute attr, Iterable<Element> tags) {
		return nonVoid("figure", attr, tags);
	}

	public static Element figure(Attribute attr, Element... tag) {
		return nonVoid("figure", attr, tag);
	}

	public static Element figure(Attribute attr, String text) {
		return nonVoid("figure", attr, text(text));
	}

	public static Element figure(String text) {
		return nonVoid("figure", text(text));
	}

	public static Element figure(Element tag, String text) {
		return nonVoid("figure", tag, text(text));
	}

	public static Element footer(Element... tag) {
		return nonVoid("footer", tag);
	}

	public static Element footer(Iterable<Element> tags) {
		return nonVoid("footer", tags);
	}

	public static Element footer(Attribute attr, Iterable<Element> tags) {
		return nonVoid("footer", attr, tags);
	}

	public static Element footer(Attribute attr, Element... tag) {
		return nonVoid("footer", attr, tag);
	}

	public static Element footer(Attribute attr, String text) {
		return nonVoid("footer", attr, text(text));
	}

	public static Element footer(String text) {
		return nonVoid("footer", text(text));
	}

	public static Element footer(Element tag, String text) {
		return nonVoid("footer", tag, text(text));
	}

	public static Element form(Element... tag) {
		return nonVoid("form", tag);
	}

	public static Element form(Iterable<Element> tags) {
		return nonVoid("form", tags);
	}

	public static Element form(Attribute attr, Iterable<Element> tags) {
		return nonVoid("form", attr, tags);
	}

	public static Element form(Attribute attr, Element... tag) {
		return nonVoid("form", attr, tag);
	}

	public static Element form(Attribute attr, String text) {
		return nonVoid("form", attr, text(text));
	}

	public static Element form(String text) {
		return nonVoid("form", text(text));
	}

	public static Element form(Element tag, String text) {
		return nonVoid("form", tag, text(text));
	}

	public static Element h1(Element... tag) {
		return nonVoid("h1", tag);
	}

	public static Element h1(Iterable<Element> tags) {
		return nonVoid("h1", tags);
	}

	public static Element h1(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h1", attr, tags);
	}

	public static Element h1(Attribute attr, Element... tag) {
		return nonVoid("h1", attr, tag);
	}

	public static Element h1(Attribute attr, String text) {
		return nonVoid("h1", attr, text(text));
	}

	public static Element h1(String text) {
		return nonVoid("h1", text(text));
	}

	public static Element h1(Element tag, String text) {
		return nonVoid("h1", tag, text(text));
	}

	public static Element h2(Element... tag) {
		return nonVoid("h2", tag);
	}

	public static Element h2(Iterable<Element> tags) {
		return nonVoid("h2", tags);
	}

	public static Element h2(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h2", attr, tags);
	}

	public static Element h2(Attribute attr, Element... tag) {
		return nonVoid("h2", attr, tag);
	}

	public static Element h2(Attribute attr, String text) {
		return nonVoid("h2", attr, text(text));
	}

	public static Element h2(String text) {
		return nonVoid("h2", text(text));
	}

	public static Element h2(Element tag, String text) {
		return nonVoid("h2", tag, text(text));
	}

	public static Element h3(Element... tag) {
		return nonVoid("h3", tag);
	}

	public static Element h3(Iterable<Element> tags) {
		return nonVoid("h3", tags);
	}

	public static Element h3(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h3", attr, tags);
	}

	public static Element h3(Attribute attr, Element... tag) {
		return nonVoid("h3", attr, tag);
	}

	public static Element h3(Attribute attr, String text) {
		return nonVoid("h3", attr, text(text));
	}

	public static Element h3(String text) {
		return nonVoid("h3", text(text));
	}

	public static Element h3(Element tag, String text) {
		return nonVoid("h3", tag, text(text));
	}

	public static Element h4(Element... tag) {
		return nonVoid("h4", tag);
	}

	public static Element h4(Iterable<Element> tags) {
		return nonVoid("h4", tags);
	}

	public static Element h4(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h4", attr, tags);
	}

	public static Element h4(Attribute attr, Element... tag) {
		return nonVoid("h4", attr, tag);
	}

	public static Element h4(Attribute attr, String text) {
		return nonVoid("h4", attr, text(text));
	}

	public static Element h4(String text) {
		return nonVoid("h4", text(text));
	}

	public static Element h4(Element tag, String text) {
		return nonVoid("h4", tag, text(text));
	}

	public static Element h5(Element... tag) {
		return nonVoid("h5", tag);
	}

	public static Element h5(Iterable<Element> tags) {
		return nonVoid("h5", tags);
	}

	public static Element h5(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h5", attr, tags);
	}

	public static Element h5(Attribute attr, Element... tag) {
		return nonVoid("h5", attr, tag);
	}

	public static Element h5(Attribute attr, String text) {
		return nonVoid("h5", attr, text(text));
	}

	public static Element h5(String text) {
		return nonVoid("h5", text(text));
	}

	public static Element h5(Element tag, String text) {
		return nonVoid("h5", tag, text(text));
	}

	public static Element h6(Element... tag) {
		return nonVoid("h6", tag);
	}

	public static Element h6(Iterable<Element> tags) {
		return nonVoid("h6", tags);
	}

	public static Element h6(Attribute attr, Iterable<Element> tags) {
		return nonVoid("h6", attr, tags);
	}

	public static Element h6(Attribute attr, Element... tag) {
		return nonVoid("h6", attr, tag);
	}

	public static Element h6(Attribute attr, String text) {
		return nonVoid("h6", attr, text(text));
	}

	public static Element h6(String text) {
		return nonVoid("h6", text(text));
	}

	public static Element h6(Element tag, String text) {
		return nonVoid("h6", tag, text(text));
	}

	public static Element head(Element... tag) {
		return nonVoid("head", tag);
	}

	public static Element head(Iterable<Element> tags) {
		return nonVoid("head", tags);
	}

	public static Element head(Attribute attr, Iterable<Element> tags) {
		return nonVoid("head", attr, tags);
	}

	public static Element head(Attribute attr, Element... tag) {
		return nonVoid("head", attr, tag);
	}

	public static Element head(Attribute attr, String text) {
		return nonVoid("head", attr, text(text));
	}

	public static Element head(String text) {
		return nonVoid("head", text(text));
	}

	public static Element head(Element tag, String text) {
		return nonVoid("head", tag, text(text));
	}

	public static Element header(Element... tag) {
		return nonVoid("header", tag);
	}

	public static Element header(Iterable<Element> tags) {
		return nonVoid("header", tags);
	}

	public static Element header(Attribute attr, Iterable<Element> tags) {
		return nonVoid("header", attr, tags);
	}

	public static Element header(Attribute attr, Element... tag) {
		return nonVoid("header", attr, tag);
	}

	public static Element header(Attribute attr, String text) {
		return nonVoid("header", attr, text(text));
	}

	public static Element header(String text) {
		return nonVoid("header", text(text));
	}

	public static Element header(Element tag, String text) {
		return nonVoid("header", tag, text(text));
	}

	public static Element i(Element... tag) {
		return nonVoid("i", tag);
	}

	public static Element i(Iterable<Element> tags) {
		return nonVoid("i", tags);
	}

	public static Element i(Attribute attr, Iterable<Element> tags) {
		return nonVoid("i", attr, tags);
	}

	public static Element i(Attribute attr, Element... tag) {
		return nonVoid("i", attr, tag);
	}

	public static Element i(Attribute attr, String text) {
		return nonVoid("i", attr, text(text));
	}

	public static Element i(String text) {
		return nonVoid("i", text(text));
	}

	public static Element i(Element tag, String text) {
		return nonVoid("i", tag, text(text));
	}

	public static Element iframe(Element... tag) {
		return nonVoid("iframe", tag);
	}

	public static Element iframe(Iterable<Element> tags) {
		return nonVoid("iframe", tags);
	}

	public static Element iframe(Attribute attr, Iterable<Element> tags) {
		return nonVoid("iframe", attr, tags);
	}

	public static Element iframe(Attribute attr, Element... tag) {
		return nonVoid("iframe", attr, tag);
	}

	public static Element iframe(Attribute attr, String text) {
		return nonVoid("iframe", attr, text(text));
	}

	public static Element iframe(String text) {
		return nonVoid("iframe", text(text));
	}

	public static Element iframe(Element tag, String text) {
		return nonVoid("iframe", tag, text(text));
	}

	public static Element input(Element... tag) {
		return nonVoid("input", tag);
	}

	public static Element input(Iterable<Element> tags) {
		return nonVoid("input", tags);
	}

	public static Element input(Attribute attr, Iterable<Element> tags) {
		return nonVoid("input", attr, tags);
	}

	public static Element input(Attribute attr, Element... tag) {
		return nonVoid("input", attr, tag);
	}

	public static Element input(Attribute attr, String text) {
		return nonVoid("input", attr, text(text));
	}

	public static Element input(String text) {
		return nonVoid("input", text(text));
	}

	public static Element input(Element tag, String text) {
		return nonVoid("input", tag, text(text));
	}

	public static Element ins(Element... tag) {
		return nonVoid("ins", tag);
	}

	public static Element ins(Iterable<Element> tags) {
		return nonVoid("ins", tags);
	}

	public static Element ins(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ins", attr, tags);
	}

	public static Element ins(Attribute attr, Element... tag) {
		return nonVoid("ins", attr, tag);
	}

	public static Element ins(Attribute attr, String text) {
		return nonVoid("ins", attr, text(text));
	}

	public static Element ins(String text) {
		return nonVoid("ins", text(text));
	}

	public static Element ins(Element tag, String text) {
		return nonVoid("ins", tag, text(text));
	}

	public static Element kbd(Element... tag) {
		return nonVoid("kbd", tag);
	}

	public static Element kbd(Iterable<Element> tags) {
		return nonVoid("kbd", tags);
	}

	public static Element kbd(Attribute attr, Iterable<Element> tags) {
		return nonVoid("kbd", attr, tags);
	}

	public static Element kbd(Attribute attr, Element... tag) {
		return nonVoid("kbd", attr, tag);
	}

	public static Element kbd(Attribute attr, String text) {
		return nonVoid("kbd", attr, text(text));
	}

	public static Element kbd(String text) {
		return nonVoid("kbd", text(text));
	}

	public static Element kbd(Element tag, String text) {
		return nonVoid("kbd", tag, text(text));
	}

	public static Element keygen(Element... tag) {
		return nonVoid("keygen", tag);
	}

	public static Element keygen(Iterable<Element> tags) {
		return nonVoid("keygen", tags);
	}

	public static Element keygen(Attribute attr, Iterable<Element> tags) {
		return nonVoid("keygen", attr, tags);
	}

	public static Element keygen(Attribute attr, Element... tag) {
		return nonVoid("keygen", attr, tag);
	}

	public static Element keygen(Attribute attr, String text) {
		return nonVoid("keygen", attr, text(text));
	}

	public static Element keygen(String text) {
		return nonVoid("keygen", text(text));
	}

	public static Element keygen(Element tag, String text) {
		return nonVoid("keygen", tag, text(text));
	}

	public static Element label(Element... tag) {
		return nonVoid("label", tag);
	}

	public static Element label(Iterable<Element> tags) {
		return nonVoid("label", tags);
	}

	public static Element label(Attribute attr, Iterable<Element> tags) {
		return nonVoid("label", attr, tags);
	}

	public static Element label(Attribute attr, Element... tag) {
		return nonVoid("label", attr, tag);
	}

	public static Element label(Attribute attr, String text) {
		return nonVoid("label", attr, text(text));
	}

	public static Element label(String text) {
		return nonVoid("label", text(text));
	}

	public static Element label(Element tag, String text) {
		return nonVoid("label", tag, text(text));
	}

	public static Element legend(Element... tag) {
		return nonVoid("legend", tag);
	}

	public static Element legend(Iterable<Element> tags) {
		return nonVoid("legend", tags);
	}

	public static Element legend(Attribute attr, Iterable<Element> tags) {
		return nonVoid("legend", attr, tags);
	}

	public static Element legend(Attribute attr, Element... tag) {
		return nonVoid("legend", attr, tag);
	}

	public static Element legend(Attribute attr, String text) {
		return nonVoid("legend", attr, text(text));
	}

	public static Element legend(String text) {
		return nonVoid("legend", text(text));
	}

	public static Element legend(Element tag, String text) {
		return nonVoid("legend", tag, text(text));
	}

	public static Element li(Element... tag) {
		return nonVoid("li", tag);
	}

	public static Element li(Iterable<Element> tags) {
		return nonVoid("li", tags);
	}

	public static Element li(Attribute attr, Iterable<Element> tags) {
		return nonVoid("li", attr, tags);
	}

	public static Element li(Attribute attr, Element... tag) {
		return nonVoid("li", attr, tag);
	}

	public static Element li(Attribute attr, String text) {
		return nonVoid("li", attr, text(text));
	}

	public static Element li(String text) {
		return nonVoid("li", text(text));
	}

	public static Element li(Element tag, String text) {
		return nonVoid("li", tag, text(text));
	}

	public static Element main(Element... tag) {
		return nonVoid("main", tag);
	}

	public static Element main(Iterable<Element> tags) {
		return nonVoid("main", tags);
	}

	public static Element main(Attribute attr, Iterable<Element> tags) {
		return nonVoid("main", attr, tags);
	}

	public static Element main(Attribute attr, Element... tag) {
		return nonVoid("main", attr, tag);
	}

	public static Element main(Attribute attr, String text) {
		return nonVoid("main", attr, text(text));
	}

	public static Element main(String text) {
		return nonVoid("main", text(text));
	}

	public static Element main(Element tag, String text) {
		return nonVoid("main", tag, text(text));
	}

	public static Element map(Element... tag) {
		return nonVoid("map", tag);
	}

	public static Element map(Iterable<Element> tags) {
		return nonVoid("map", tags);
	}

	public static Element map(Attribute attr, Iterable<Element> tags) {
		return nonVoid("map", attr, tags);
	}

	public static Element map(Attribute attr, Element... tag) {
		return nonVoid("map", attr, tag);
	}

	public static Element map(Attribute attr, String text) {
		return nonVoid("map", attr, text(text));
	}

	public static Element map(String text) {
		return nonVoid("map", text(text));
	}

	public static Element map(Element tag, String text) {
		return nonVoid("map", tag, text(text));
	}

	public static Element mark(Element... tag) {
		return nonVoid("mark", tag);
	}

	public static Element mark(Iterable<Element> tags) {
		return nonVoid("mark", tags);
	}

	public static Element mark(Attribute attr, Iterable<Element> tags) {
		return nonVoid("mark", attr, tags);
	}

	public static Element mark(Attribute attr, Element... tag) {
		return nonVoid("mark", attr, tag);
	}

	public static Element mark(Attribute attr, String text) {
		return nonVoid("mark", attr, text(text));
	}

	public static Element mark(String text) {
		return nonVoid("mark", text(text));
	}

	public static Element mark(Element tag, String text) {
		return nonVoid("mark", tag, text(text));
	}

	public static Element meter(Element... tag) {
		return nonVoid("meter", tag);
	}

	public static Element meter(Iterable<Element> tags) {
		return nonVoid("meter", tags);
	}

	public static Element meter(Attribute attr, Iterable<Element> tags) {
		return nonVoid("meter", attr, tags);
	}

	public static Element meter(Attribute attr, Element... tag) {
		return nonVoid("meter", attr, tag);
	}

	public static Element meter(Attribute attr, String text) {
		return nonVoid("meter", attr, text(text));
	}

	public static Element meter(String text) {
		return nonVoid("meter", text(text));
	}

	public static Element meter(Element tag, String text) {
		return nonVoid("meter", tag, text(text));
	}

	public static Element nav(Element... tag) {
		return nonVoid("nav", tag);
	}

	public static Element nav(Iterable<Element> tags) {
		return nonVoid("nav", tags);
	}

	public static Element nav(Attribute attr, Iterable<Element> tags) {
		return nonVoid("nav", attr, tags);
	}

	public static Element nav(Attribute attr, Element... tag) {
		return nonVoid("nav", attr, tag);
	}

	public static Element nav(Attribute attr, String text) {
		return nonVoid("nav", attr, text(text));
	}

	public static Element nav(String text) {
		return nonVoid("nav", text(text));
	}

	public static Element nav(Element tag, String text) {
		return nonVoid("nav", tag, text(text));
	}

	public static Element noscript(Element... tag) {
		return nonVoid("noscript", tag);
	}

	public static Element noscript(Iterable<Element> tags) {
		return nonVoid("noscript", tags);
	}

	public static Element noscript(Attribute attr, Iterable<Element> tags) {
		return nonVoid("noscript", attr, tags);
	}

	public static Element noscript(Attribute attr, Element... tag) {
		return nonVoid("noscript", attr, tag);
	}

	public static Element noscript(Attribute attr, String text) {
		return nonVoid("noscript", attr, text(text));
	}

	public static Element noscript(String text) {
		return nonVoid("noscript", text(text));
	}

	public static Element noscript(Element tag, String text) {
		return nonVoid("noscript", tag, text(text));
	}

	public static Element object(Element... tag) {
		return nonVoid("object", tag);
	}

	public static Element object(Iterable<Element> tags) {
		return nonVoid("object", tags);
	}

	public static Element object(Attribute attr, Iterable<Element> tags) {
		return nonVoid("object", attr, tags);
	}

	public static Element object(Attribute attr, Element... tag) {
		return nonVoid("object", attr, tag);
	}

	public static Element object(Attribute attr, String text) {
		return nonVoid("object", attr, text(text));
	}

	public static Element object(String text) {
		return nonVoid("object", text(text));
	}

	public static Element object(Element tag, String text) {
		return nonVoid("object", tag, text(text));
	}

	public static Element ol(Element... tag) {
		return nonVoid("ol", tag);
	}

	public static Element ol(Iterable<Element> tags) {
		return nonVoid("ol", tags);
	}

	public static Element ol(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ol", attr, tags);
	}

	public static Element ol(Attribute attr, Element... tag) {
		return nonVoid("ol", attr, tag);
	}

	public static Element ol(Attribute attr, String text) {
		return nonVoid("ol", attr, text(text));
	}

	public static Element ol(String text) {
		return nonVoid("ol", text(text));
	}

	public static Element ol(Element tag, String text) {
		return nonVoid("ol", tag, text(text));
	}

	public static Element optgroup(Element... tag) {
		return nonVoid("optgroup", tag);
	}

	public static Element optgroup(Iterable<Element> tags) {
		return nonVoid("optgroup", tags);
	}

	public static Element optgroup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("optgroup", attr, tags);
	}

	public static Element optgroup(Attribute attr, Element... tag) {
		return nonVoid("optgroup", attr, tag);
	}

	public static Element optgroup(Attribute attr, String text) {
		return nonVoid("optgroup", attr, text(text));
	}

	public static Element optgroup(String text) {
		return nonVoid("optgroup", text(text));
	}

	public static Element optgroup(Element tag, String text) {
		return nonVoid("optgroup", tag, text(text));
	}

	public static Element option(Element... tag) {
		return nonVoid("option", tag);
	}

	public static Element option(Iterable<Element> tags) {
		return nonVoid("option", tags);
	}

	public static Element option(Attribute attr, Iterable<Element> tags) {
		return nonVoid("option", attr, tags);
	}

	public static Element option(Attribute attr, Element... tag) {
		return nonVoid("option", attr, tag);
	}

	public static Element option(Attribute attr, String text) {
		return nonVoid("option", attr, text(text));
	}

	public static Element option(String text) {
		return nonVoid("option", text(text));
	}

	public static Element option(Element tag, String text) {
		return nonVoid("option", tag, text(text));
	}

	public static Element output(Element... tag) {
		return nonVoid("output", tag);
	}

	public static Element output(Iterable<Element> tags) {
		return nonVoid("output", tags);
	}

	public static Element output(Attribute attr, Iterable<Element> tags) {
		return nonVoid("output", attr, tags);
	}

	public static Element output(Attribute attr, Element... tag) {
		return nonVoid("output", attr, tag);
	}

	public static Element output(Attribute attr, String text) {
		return nonVoid("output", attr, text(text));
	}

	public static Element output(String text) {
		return nonVoid("output", text(text));
	}

	public static Element output(Element tag, String text) {
		return nonVoid("output", tag, text(text));
	}

	public static Element p(Element... tag) {
		return nonVoid("p", tag);
	}

	public static Element p(Iterable<Element> tags) {
		return nonVoid("p", tags);
	}

	public static Element p(Attribute attr, Iterable<Element> tags) {
		return nonVoid("p", attr, tags);
	}

	public static Element p(Attribute attr, Element... tag) {
		return nonVoid("p", attr, tag);
	}

	public static Element p(Attribute attr, String text) {
		return nonVoid("p", attr, text(text));
	}

	public static Element p(String text) {
		return nonVoid("p", text(text));
	}

	public static Element p(Element tag, String text) {
		return nonVoid("p", tag, text(text));
	}

	public static Element pre(Element... tag) {
		return nonVoid("pre", tag);
	}

	public static Element pre(Iterable<Element> tags) {
		return nonVoid("pre", tags);
	}

	public static Element pre(Attribute attr, Iterable<Element> tags) {
		return nonVoid("pre", attr, tags);
	}

	public static Element pre(Attribute attr, Element... tag) {
		return nonVoid("pre", attr, tag);
	}

	public static Element pre(Attribute attr, String text) {
		return nonVoid("pre", attr, text(text));
	}

	public static Element pre(String text) {
		return nonVoid("pre", text(text));
	}

	public static Element pre(Element tag, String text) {
		return nonVoid("pre", tag, text(text));
	}

	public static Element progress(Element... tag) {
		return nonVoid("progress", tag);
	}

	public static Element progress(Iterable<Element> tags) {
		return nonVoid("progress", tags);
	}

	public static Element progress(Attribute attr, Iterable<Element> tags) {
		return nonVoid("progress", attr, tags);
	}

	public static Element progress(Attribute attr, Element... tag) {
		return nonVoid("progress", attr, tag);
	}

	public static Element progress(Attribute attr, String text) {
		return nonVoid("progress", attr, text(text));
	}

	public static Element progress(String text) {
		return nonVoid("progress", text(text));
	}

	public static Element progress(Element tag, String text) {
		return nonVoid("progress", tag, text(text));
	}

	public static Element q(Element... tag) {
		return nonVoid("q", tag);
	}

	public static Element q(Iterable<Element> tags) {
		return nonVoid("q", tags);
	}

	public static Element q(Attribute attr, Iterable<Element> tags) {
		return nonVoid("q", attr, tags);
	}

	public static Element q(Attribute attr, Element... tag) {
		return nonVoid("q", attr, tag);
	}

	public static Element q(Attribute attr, String text) {
		return nonVoid("q", attr, text(text));
	}

	public static Element q(String text) {
		return nonVoid("q", text(text));
	}

	public static Element q(Element tag, String text) {
		return nonVoid("q", tag, text(text));
	}

	public static Element rb(Element... tag) {
		return nonVoid("rb", tag);
	}

	public static Element rb(Iterable<Element> tags) {
		return nonVoid("rb", tags);
	}

	public static Element rb(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rb", attr, tags);
	}

	public static Element rb(Attribute attr, Element... tag) {
		return nonVoid("rb", attr, tag);
	}

	public static Element rb(Attribute attr, String text) {
		return nonVoid("rb", attr, text(text));
	}

	public static Element rb(String text) {
		return nonVoid("rb", text(text));
	}

	public static Element rb(Element tag, String text) {
		return nonVoid("rb", tag, text(text));
	}

	public static Element rp(Element... tag) {
		return nonVoid("rp", tag);
	}

	public static Element rp(Iterable<Element> tags) {
		return nonVoid("rp", tags);
	}

	public static Element rp(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rp", attr, tags);
	}

	public static Element rp(Attribute attr, Element... tag) {
		return nonVoid("rp", attr, tag);
	}

	public static Element rp(Attribute attr, String text) {
		return nonVoid("rp", attr, text(text));
	}

	public static Element rp(String text) {
		return nonVoid("rp", text(text));
	}

	public static Element rp(Element tag, String text) {
		return nonVoid("rp", tag, text(text));
	}

	public static Element rt(Element... tag) {
		return nonVoid("rt", tag);
	}

	public static Element rt(Iterable<Element> tags) {
		return nonVoid("rt", tags);
	}

	public static Element rt(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rt", attr, tags);
	}

	public static Element rt(Attribute attr, Element... tag) {
		return nonVoid("rt", attr, tag);
	}

	public static Element rt(Attribute attr, String text) {
		return nonVoid("rt", attr, text(text));
	}

	public static Element rt(String text) {
		return nonVoid("rt", text(text));
	}

	public static Element rt(Element tag, String text) {
		return nonVoid("rt", tag, text(text));
	}

	public static Element rtc(Element... tag) {
		return nonVoid("rtc", tag);
	}

	public static Element rtc(Iterable<Element> tags) {
		return nonVoid("rtc", tags);
	}

	public static Element rtc(Attribute attr, Iterable<Element> tags) {
		return nonVoid("rtc", attr, tags);
	}

	public static Element rtc(Attribute attr, Element... tag) {
		return nonVoid("rtc", attr, tag);
	}

	public static Element rtc(Attribute attr, String text) {
		return nonVoid("rtc", attr, text(text));
	}

	public static Element rtc(String text) {
		return nonVoid("rtc", text(text));
	}

	public static Element rtc(Element tag, String text) {
		return nonVoid("rtc", tag, text(text));
	}

	public static Element ruby(Element... tag) {
		return nonVoid("ruby", tag);
	}

	public static Element ruby(Iterable<Element> tags) {
		return nonVoid("ruby", tags);
	}

	public static Element ruby(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ruby", attr, tags);
	}

	public static Element ruby(Attribute attr, Element... tag) {
		return nonVoid("ruby", attr, tag);
	}

	public static Element ruby(Attribute attr, String text) {
		return nonVoid("ruby", attr, text(text));
	}

	public static Element ruby(String text) {
		return nonVoid("ruby", text(text));
	}

	public static Element ruby(Element tag, String text) {
		return nonVoid("ruby", tag, text(text));
	}

	public static Element s(Element... tag) {
		return nonVoid("s", tag);
	}

	public static Element s(Iterable<Element> tags) {
		return nonVoid("s", tags);
	}

	public static Element s(Attribute attr, Iterable<Element> tags) {
		return nonVoid("s", attr, tags);
	}

	public static Element s(Attribute attr, Element... tag) {
		return nonVoid("s", attr, tag);
	}

	public static Element s(Attribute attr, String text) {
		return nonVoid("s", attr, text(text));
	}

	public static Element s(String text) {
		return nonVoid("s", text(text));
	}

	public static Element s(Element tag, String text) {
		return nonVoid("s", tag, text(text));
	}

	public static Element samp(Element... tag) {
		return nonVoid("samp", tag);
	}

	public static Element samp(Iterable<Element> tags) {
		return nonVoid("samp", tags);
	}

	public static Element samp(Attribute attr, Iterable<Element> tags) {
		return nonVoid("samp", attr, tags);
	}

	public static Element samp(Attribute attr, Element... tag) {
		return nonVoid("samp", attr, tag);
	}

	public static Element samp(Attribute attr, String text) {
		return nonVoid("samp", attr, text(text));
	}

	public static Element samp(String text) {
		return nonVoid("samp", text(text));
	}

	public static Element samp(Element tag, String text) {
		return nonVoid("samp", tag, text(text));
	}

	public static Element script(Element... tag) {
		return nonVoid("script", tag);
	}

	public static Element script(Iterable<Element> tags) {
		return nonVoid("script", tags);
	}

	public static Element script(Attribute attr, Iterable<Element> tags) {
		return nonVoid("script", attr, tags);
	}

	public static Element script(Attribute attr, Element... tag) {
		return nonVoid("script", attr, tag);
	}

	public static Element script(Attribute attr, String text) {
		return nonVoid("script", attr, text(text));
	}

	public static Element script(String text) {
		return nonVoid("script", text(text));
	}

	public static Element script(Element tag, String text) {
		return nonVoid("script", tag, text(text));
	}

	public static Element section(Element... tag) {
		return nonVoid("section", tag);
	}

	public static Element section(Iterable<Element> tags) {
		return nonVoid("section", tags);
	}

	public static Element section(Attribute attr, Iterable<Element> tags) {
		return nonVoid("section", attr, tags);
	}

	public static Element section(Attribute attr, Element... tag) {
		return nonVoid("section", attr, tag);
	}

	public static Element section(Attribute attr, String text) {
		return nonVoid("section", attr, text(text));
	}

	public static Element section(String text) {
		return nonVoid("section", text(text));
	}

	public static Element section(Element tag, String text) {
		return nonVoid("section", tag, text(text));
	}

	public static Element select(Element... tag) {
		return nonVoid("select", tag);
	}

	public static Element select(Iterable<Element> tags) {
		return nonVoid("select", tags);
	}

	public static Element select(Attribute attr, Iterable<Element> tags) {
		return nonVoid("select", attr, tags);
	}

	public static Element select(Attribute attr, Element... tag) {
		return nonVoid("select", attr, tag);
	}

	public static Element select(Attribute attr, String text) {
		return nonVoid("select", attr, text(text));
	}

	public static Element select(String text) {
		return nonVoid("select", text(text));
	}

	public static Element select(Element tag, String text) {
		return nonVoid("select", tag, text(text));
	}

	public static Element small(Element... tag) {
		return nonVoid("small", tag);
	}

	public static Element small(Iterable<Element> tags) {
		return nonVoid("small", tags);
	}

	public static Element small(Attribute attr, Iterable<Element> tags) {
		return nonVoid("small", attr, tags);
	}

	public static Element small(Attribute attr, Element... tag) {
		return nonVoid("small", attr, tag);
	}

	public static Element small(Attribute attr, String text) {
		return nonVoid("small", attr, text(text));
	}

	public static Element small(String text) {
		return nonVoid("small", text(text));
	}

	public static Element small(Element tag, String text) {
		return nonVoid("small", tag, text(text));
	}

	public static Element span(Element... tag) {
		return nonVoid("span", tag);
	}

	public static Element span(Iterable<Element> tags) {
		return nonVoid("span", tags);
	}

	public static Element span(Attribute attr, Iterable<Element> tags) {
		return nonVoid("span", attr, tags);
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

	public static Element strong(Element... tag) {
		return nonVoid("strong", tag);
	}

	public static Element strong(Iterable<Element> tags) {
		return nonVoid("strong", tags);
	}

	public static Element strong(Attribute attr, Iterable<Element> tags) {
		return nonVoid("strong", attr, tags);
	}

	public static Element strong(Attribute attr, Element... tag) {
		return nonVoid("strong", attr, tag);
	}

	public static Element strong(Attribute attr, String text) {
		return nonVoid("strong", attr, text(text));
	}

	public static Element strong(String text) {
		return nonVoid("strong", text(text));
	}

	public static Element strong(Element tag, String text) {
		return nonVoid("strong", tag, text(text));
	}

	public static Element style(Element... tag) {
		return nonVoid("style", tag);
	}

	public static Element style(Iterable<Element> tags) {
		return nonVoid("style", tags);
	}

	public static Element style(Attribute attr, Iterable<Element> tags) {
		return nonVoid("style", attr, tags);
	}

	public static Element style(Attribute attr, Element... tag) {
		return nonVoid("style", attr, tag);
	}

	public static Element style(Attribute attr, String text) {
		return nonVoid("style", attr, text(text));
	}

	public static Element style(String text) {
		return nonVoid("style", text(text));
	}

	public static Element style(Element tag, String text) {
		return nonVoid("style", tag, text(text));
	}

	public static Element sub(Element... tag) {
		return nonVoid("sub", tag);
	}

	public static Element sub(Iterable<Element> tags) {
		return nonVoid("sub", tags);
	}

	public static Element sub(Attribute attr, Iterable<Element> tags) {
		return nonVoid("sub", attr, tags);
	}

	public static Element sub(Attribute attr, Element... tag) {
		return nonVoid("sub", attr, tag);
	}

	public static Element sub(Attribute attr, String text) {
		return nonVoid("sub", attr, text(text));
	}

	public static Element sub(String text) {
		return nonVoid("sub", text(text));
	}

	public static Element sub(Element tag, String text) {
		return nonVoid("sub", tag, text(text));
	}

	public static Element sup(Element... tag) {
		return nonVoid("sup", tag);
	}

	public static Element sup(Iterable<Element> tags) {
		return nonVoid("sup", tags);
	}

	public static Element sup(Attribute attr, Iterable<Element> tags) {
		return nonVoid("sup", attr, tags);
	}

	public static Element sup(Attribute attr, Element... tag) {
		return nonVoid("sup", attr, tag);
	}

	public static Element sup(Attribute attr, String text) {
		return nonVoid("sup", attr, text(text));
	}

	public static Element sup(String text) {
		return nonVoid("sup", text(text));
	}

	public static Element sup(Element tag, String text) {
		return nonVoid("sup", tag, text(text));
	}

	public static Element table(Element... tag) {
		return nonVoid("table", tag);
	}

	public static Element table(Iterable<Element> tags) {
		return nonVoid("table", tags);
	}

	public static Element table(Attribute attr, Iterable<Element> tags) {
		return nonVoid("table", attr, tags);
	}

	public static Element table(Attribute attr, Element... tag) {
		return nonVoid("table", attr, tag);
	}

	public static Element table(Attribute attr, String text) {
		return nonVoid("table", attr, text(text));
	}

	public static Element table(String text) {
		return nonVoid("table", text(text));
	}

	public static Element table(Element tag, String text) {
		return nonVoid("table", tag, text(text));
	}

	public static Element tbody(Element... tag) {
		return nonVoid("tbody", tag);
	}

	public static Element tbody(Iterable<Element> tags) {
		return nonVoid("tbody", tags);
	}

	public static Element tbody(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tbody", attr, tags);
	}

	public static Element tbody(Attribute attr, Element... tag) {
		return nonVoid("tbody", attr, tag);
	}

	public static Element tbody(Attribute attr, String text) {
		return nonVoid("tbody", attr, text(text));
	}

	public static Element tbody(String text) {
		return nonVoid("tbody", text(text));
	}

	public static Element tbody(Element tag, String text) {
		return nonVoid("tbody", tag, text(text));
	}

	public static Element td(Element... tag) {
		return nonVoid("td", tag);
	}

	public static Element td(Iterable<Element> tags) {
		return nonVoid("td", tags);
	}

	public static Element td(Attribute attr, Iterable<Element> tags) {
		return nonVoid("td", attr, tags);
	}

	public static Element td(Attribute attr, Element... tag) {
		return nonVoid("td", attr, tag);
	}

	public static Element td(Attribute attr, String text) {
		return nonVoid("td", attr, text(text));
	}

	public static Element td(String text) {
		return nonVoid("td", text(text));
	}

	public static Element td(Element tag, String text) {
		return nonVoid("td", tag, text(text));
	}

	public static Element template(Element... tag) {
		return nonVoid("template", tag);
	}

	public static Element template(Iterable<Element> tags) {
		return nonVoid("template", tags);
	}

	public static Element template(Attribute attr, Iterable<Element> tags) {
		return nonVoid("template", attr, tags);
	}

	public static Element template(Attribute attr, Element... tag) {
		return nonVoid("template", attr, tag);
	}

	public static Element template(Attribute attr, String text) {
		return nonVoid("template", attr, text(text));
	}

	public static Element template(String text) {
		return nonVoid("template", text(text));
	}

	public static Element template(Element tag, String text) {
		return nonVoid("template", tag, text(text));
	}

	public static Element textarea(Element... tag) {
		return nonVoid("textarea", tag);
	}

	public static Element textarea(Iterable<Element> tags) {
		return nonVoid("textarea", tags);
	}

	public static Element textarea(Attribute attr, Iterable<Element> tags) {
		return nonVoid("textarea", attr, tags);
	}

	public static Element textarea(Attribute attr, Element... tag) {
		return nonVoid("textarea", attr, tag);
	}

	public static Element textarea(Attribute attr, String text) {
		return nonVoid("textarea", attr, text(text));
	}

	public static Element textarea(String text) {
		return nonVoid("textarea", text(text));
	}

	public static Element textarea(Element tag, String text) {
		return nonVoid("textarea", tag, text(text));
	}

	public static Element tfoot(Element... tag) {
		return nonVoid("tfoot", tag);
	}

	public static Element tfoot(Iterable<Element> tags) {
		return nonVoid("tfoot", tags);
	}

	public static Element tfoot(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tfoot", attr, tags);
	}

	public static Element tfoot(Attribute attr, Element... tag) {
		return nonVoid("tfoot", attr, tag);
	}

	public static Element tfoot(Attribute attr, String text) {
		return nonVoid("tfoot", attr, text(text));
	}

	public static Element tfoot(String text) {
		return nonVoid("tfoot", text(text));
	}

	public static Element tfoot(Element tag, String text) {
		return nonVoid("tfoot", tag, text(text));
	}

	public static Element th(Element... tag) {
		return nonVoid("th", tag);
	}

	public static Element th(Iterable<Element> tags) {
		return nonVoid("th", tags);
	}

	public static Element th(Attribute attr, Iterable<Element> tags) {
		return nonVoid("th", attr, tags);
	}

	public static Element th(Attribute attr, Element... tag) {
		return nonVoid("th", attr, tag);
	}

	public static Element th(Attribute attr, String text) {
		return nonVoid("th", attr, text(text));
	}

	public static Element th(String text) {
		return nonVoid("th", text(text));
	}

	public static Element th(Element tag, String text) {
		return nonVoid("th", tag, text(text));
	}

	public static Element thead(Element... tag) {
		return nonVoid("thead", tag);
	}

	public static Element thead(Iterable<Element> tags) {
		return nonVoid("thead", tags);
	}

	public static Element thead(Attribute attr, Iterable<Element> tags) {
		return nonVoid("thead", attr, tags);
	}

	public static Element thead(Attribute attr, Element... tag) {
		return nonVoid("thead", attr, tag);
	}

	public static Element thead(Attribute attr, String text) {
		return nonVoid("thead", attr, text(text));
	}

	public static Element thead(String text) {
		return nonVoid("thead", text(text));
	}

	public static Element thead(Element tag, String text) {
		return nonVoid("thead", tag, text(text));
	}

	public static Element time(Element... tag) {
		return nonVoid("time", tag);
	}

	public static Element time(Iterable<Element> tags) {
		return nonVoid("time", tags);
	}

	public static Element time(Attribute attr, Iterable<Element> tags) {
		return nonVoid("time", attr, tags);
	}

	public static Element time(Attribute attr, Element... tag) {
		return nonVoid("time", attr, tag);
	}

	public static Element time(Attribute attr, String text) {
		return nonVoid("time", attr, text(text));
	}

	public static Element time(String text) {
		return nonVoid("time", text(text));
	}

	public static Element time(Element tag, String text) {
		return nonVoid("time", tag, text(text));
	}

	public static Element title(Element... tag) {
		return nonVoid("title", tag);
	}

	public static Element title(Iterable<Element> tags) {
		return nonVoid("title", tags);
	}

	public static Element title(Attribute attr, Iterable<Element> tags) {
		return nonVoid("title", attr, tags);
	}

	public static Element title(Attribute attr, Element... tag) {
		return nonVoid("title", attr, tag);
	}

	public static Element title(Attribute attr, String text) {
		return nonVoid("title", attr, text(text));
	}

	public static Element title(String text) {
		return nonVoid("title", text(text));
	}

	public static Element title(Element tag, String text) {
		return nonVoid("title", tag, text(text));
	}

	public static Element tr(Element... tag) {
		return nonVoid("tr", tag);
	}

	public static Element tr(Iterable<Element> tags) {
		return nonVoid("tr", tags);
	}

	public static Element tr(Attribute attr, Iterable<Element> tags) {
		return nonVoid("tr", attr, tags);
	}

	public static Element tr(Attribute attr, Element... tag) {
		return nonVoid("tr", attr, tag);
	}

	public static Element tr(Attribute attr, String text) {
		return nonVoid("tr", attr, text(text));
	}

	public static Element tr(String text) {
		return nonVoid("tr", text(text));
	}

	public static Element tr(Element tag, String text) {
		return nonVoid("tr", tag, text(text));
	}

	public static Element u(Element... tag) {
		return nonVoid("u", tag);
	}

	public static Element u(Iterable<Element> tags) {
		return nonVoid("u", tags);
	}

	public static Element u(Attribute attr, Iterable<Element> tags) {
		return nonVoid("u", attr, tags);
	}

	public static Element u(Attribute attr, Element... tag) {
		return nonVoid("u", attr, tag);
	}

	public static Element u(Attribute attr, String text) {
		return nonVoid("u", attr, text(text));
	}

	public static Element u(String text) {
		return nonVoid("u", text(text));
	}

	public static Element u(Element tag, String text) {
		return nonVoid("u", tag, text(text));
	}

	public static Element ul(Element... tag) {
		return nonVoid("ul", tag);
	}

	public static Element ul(Iterable<Element> tags) {
		return nonVoid("ul", tags);
	}

	public static Element ul(Attribute attr, Iterable<Element> tags) {
		return nonVoid("ul", attr, tags);
	}

	public static Element ul(Attribute attr, Element... tag) {
		return nonVoid("ul", attr, tag);
	}

	public static Element ul(Attribute attr, String text) {
		return nonVoid("ul", attr, text(text));
	}

	public static Element ul(String text) {
		return nonVoid("ul", text(text));
	}

	public static Element ul(Element tag, String text) {
		return nonVoid("ul", tag, text(text));
	}

	public static Element var(Element... tag) {
		return nonVoid("var", tag);
	}

	public static Element var(Iterable<Element> tags) {
		return nonVoid("var", tags);
	}

	public static Element var(Attribute attr, Iterable<Element> tags) {
		return nonVoid("var", attr, tags);
	}

	public static Element var(Attribute attr, Element... tag) {
		return nonVoid("var", attr, tag);
	}

	public static Element var(Attribute attr, String text) {
		return nonVoid("var", attr, text(text));
	}

	public static Element var(String text) {
		return nonVoid("var", text(text));
	}

	public static Element var(Element tag, String text) {
		return nonVoid("var", tag, text(text));
	}

	public static Element video(Element... tag) {
		return nonVoid("video", tag);
	}

	public static Element video(Iterable<Element> tags) {
		return nonVoid("video", tags);
	}

	public static Element video(Attribute attr, Iterable<Element> tags) {
		return nonVoid("video", attr, tags);
	}

	public static Element video(Attribute attr, Element... tag) {
		return nonVoid("video", attr, tag);
	}

	public static Element video(Attribute attr, String text) {
		return nonVoid("video", attr, text(text));
	}

	public static Element video(String text) {
		return nonVoid("video", text(text));
	}

	public static Element video(Element tag, String text) {
		return nonVoid("video", tag, text(text));
	}
}
