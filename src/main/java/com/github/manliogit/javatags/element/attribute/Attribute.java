package com.github.manliogit.javatags.element.attribute;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
			if(!isBlank(string)){
				String[] split = string.split(REGEX);
				_data.put(valueAt(split, 0), valueAt(split, 1));
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
	
	public Attribute remove(String key, String value) {
		if(_data.containsKey(key)){
			List<String> values = new ArrayList<String>(asList(_data.get(key).split("\\s"))); 
			values.remove(value);
			_data.put(key, join(values));
		}
		return this;
	}
	
	public Attribute remove(Attribute other) {
		for (Entry<String, String> pair : other._data.entrySet()) {
			remove(pair.getKey(), pair.getValue());
		}
		return this;
	}
	
	private String join(List<String> values) {
		String result = "";
		for (String string : values) {
			result += string + " ";
		}
		return result.trim();
	}

	private String fill(String key, String value) {
		return _data.containsKey(key) 
				? _data.get(key) + " " + value 
				: value;
	}
	
	private String valueAt(String[] values, int index){
		try{
			return values[index];
		} catch(ArrayIndexOutOfBoundsException e){
			return "";
		}
	}
	
	private boolean isBlank(String string) {
		return string == null || string.trim().isEmpty();
	}
}
