package com.techlabs.html;

public class Control implements IHtmlElements {

	private String type;
	private String value;
	private String tagName;

	public Control(String type, String tagName, String value) {
		this.type = type;
		this.value = value;
		this.tagName = tagName;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public String getTagName() {
		return tagName;
	}

	@Override
	public String buildHtml() {
		return " <"+tagName+" type="+type+" name="+value+">";
	}
	
	
}
