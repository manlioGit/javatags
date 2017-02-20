package com.github.manliogit.javatags.element.attribute;

import static java.util.Arrays.asList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Attribute {

	private static final String REGEX = "\\s*->\\s*";
	private final Map<String, String> _data;
	
	public Attribute(String...comp) {
		this(asList(comp));
	}
	
	public Attribute(Iterable<String> comp) {
		_data = new LinkedHashMap<String, String>();
		for (String string : comp) {
			if(!(string == null || string.trim().isEmpty())){
				String[] split = string.split(REGEX);
				_data.put(split[0], split[1]);
			}
		}
	}
	
	public String render() {
		String result = "";
		for (Entry<String, String> pair : _data.entrySet()) {
			result += pair.getKey() + "=" + "'" + pair.getValue() + "'" + " ";
		}
		
		return result.trim();
	}

	public Attribute add(String key, String value) {
		_data.put(key, fill(key, value));
		return this;
	}
	
	public Attribute add(Attribute other) {
		for (Entry<String, String> pair : other._data.entrySet()) {
			add(pair.getKey(), pair.getValue());
		}
		return this;
	}
	
	private String fill(String key, String value) {
		return _data.containsKey(key) 
				? _data.get(key) + " " + value 
				: value;
	}
}
