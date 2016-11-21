package tag.attribute;

import static lang.HtmlHelper.attr;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AttributeTest {

	@Test
	public void render() throws Exception {
		String attr = new Attribute("id -> 123", "class -> fa fa-up").render();
		
		assertThat(attr, is("id='123' class='fa fa-up'"));
	}
	
	@Test
	public void renderWithStaticHelper() throws Exception {
		String attr = attr("id -> 123", "class -> fa fa-up").render();
		
		assertThat(attr, is("id='123' class='fa fa-up'"));
	}
	
	@Test
	public void renderWithAnySpaceFromSeparator() throws Exception {
		String attr = new Attribute("id         ->123", "class->     fa     fa-up").render();
		
		assertThat(attr, is("id='123' class='fa     fa-up'"));
	}
	
}
