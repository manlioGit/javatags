package lang;

import static lang.HtmlHelper.attr;
import static lang.HtmlHelper.br;
import static lang.HtmlHelper.div;
import static lang.HtmlHelper.head;
import static lang.HtmlHelper.html;
import static lang.HtmlHelper.link;
import static lang.HtmlHelper.meta;
import static lang.HtmlHelper.text;
import static lang.HtmlHelper.title;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import tag.Tag;

public class HtmlHelperTest {
 
	@Test
	public void htmlTagRenderDocTypeAlso() throws Exception {
		assertThat(html().render(), is("<!DOCTYPE html><html></html>"));
	}
	
	@Test
	public void testName() throws Exception {
			
		Tag fragment = html(attr("class -> fa fa-up","id -> 123"),
				   		  div("xxx")
					   );
		
		assertThat(fragment.render(), is("<!DOCTYPE html><html class='fa fa-up' id='123'><div>xxx</div></html>"));
	}
	
	@Test
	public void renderTextAsLastSibling() throws Exception {
		Tag frag = div(
				   	  div(),
				   	  "text"
				   );
		
		Tag frag2 = div(
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
		Tag frag = html(
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
						+ 		"<br>otherText"
						+ 	"</div>"
						+ "</html>";
		
		assertThat(frag.render(), is(expected));
	}
	
	@Test
	public void headBlock() throws Exception {
		Tag frag = html(attr("lang -> en"),
						head(
							meta(attr("http-equiv -> Content-Type", "content -> text/html; charset=UTF-8")),
							title("title"),
							link(attr("href -> xxx.css", "rel -> stylesheet"))
						)
					);
		
		String expected = "<!DOCTYPE html>"+
							"<html lang='en'>" +
								"<head>"+
								    "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>" +
								    "<title>title</title>" +
								    "<link href='xxx.css' rel='stylesheet'>"+
								"</head>" +
						    "</html>";
		
		assertThat(frag.render(), is(expected));
	}
}
