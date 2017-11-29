package com.github.manliogit.javatags.element.attribute;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	public Attribute remove(String key) {
		_data.remove(key);
		return this;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_data == null) ? 0 : _data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Attribute other = (Attribute) obj;
		if (_data == null) {
			if (other._data != null) {
				return false;
			}
		} else if (!_data.equals(other._data))  {
			for (String value : _data.values()) {
				for (String otherValue : other._data.values()) {
					String[] split = value.split("\\s");
					String[] otherSplit = otherValue.split("\\s");
					Arrays.sort(split);
					Arrays.sort(otherSplit);
					
					if(!Arrays.equals(split, otherSplit)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return _data.toString();
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
