package tag;

import static java.util.Arrays.asList;

import java.util.Collection;

public class GroupTag implements Tag {

	private final Collection<Tag> _tags;

	public GroupTag(Tag...tag) {
		this(asList(tag));
	}
	
	public GroupTag(Collection<Tag> tags) {
		_tags = tags;
	}
	
	@Override
	public String render() {
		String result = "";
		for (Tag tag : _tags) {
			result += tag.render();
		}
		return result;
	}

}
