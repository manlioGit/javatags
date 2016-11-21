package tag;

public class TextTag implements Tag {

	private String _text;

	public TextTag(String text) {
		_text = text;
	}
	
	@Override
	public String render() {
		return _text;
	}
}
