package com.github.manliogit.javatags.lang;

import static com.github.manliogit.javatags.lang.HtmlHelper.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.github.manliogit.javatags.element.Element;

public class HtmlHelperTest {
 
	@Test
	public void htmlTagRenderDocTypeAlso() throws Exception {
		assertThat(html5().render(), is("<!DOCTYPE html><html></html>"));
	}
	
	@Test
	public void renderTextAsLastSibling() throws Exception {
		Element frag = div(
				   	  div(),
				   	  "text"
				   );
		
		Element frag2 = div(
				div(),
				div(),
				text("text")
			);
		
		assertThat(frag.render(), is("<div><div></div>text</div>"));
		assertThat(frag2.render(), is("<div><div></div><div></div>text</div>"));
	}
	
	@Test
	public void renderDivWithAttributeAndTest() throws Exception {
		assertThat(div(attr("id -> 123"), "some text").render(), is("<div id='123'>some text</div>"));
	}
	
	@Test
	public void nested() throws Exception {
		Element frag = html5(
						div(attr("class -> fa fa-up"),
							div(attr("id -> 123"), "some text")
						),
						div(
							br(),
							"otherText"
						)
					);

		String expected = "<!DOCTYPE html>"
						+ "<html>"
						+ 	"<div class='fa fa-up'>"
						+ 		"<div id='123'>some text</div>"
						+ 	"</div>"
						+ 	"<div>"
						+ 		"<br/>otherText"
						+ 	"</div>"
						+ "</html>";
		
		assertThat(frag.render(), is(expected));
	}
	
	@Test
	public void headBlock() throws Exception {
		Element frag = html5(attr("lang -> en"),
						head(
							meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
							title("title"),
							link(attr("href -> xxx.css", "rel -> stylesheet"))
						)
					);
		
		String expected = "<!DOCTYPE html>"+
							"<html lang='en'>" +
								"<head>"+
								    "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>" +
								    "<title>title</title>" +
								    "<link href='xxx.css' rel='stylesheet'/>"+
								"</head>" +
						    "</html>";
		
		assertThat(frag.render(), is(expected));
	}
}
