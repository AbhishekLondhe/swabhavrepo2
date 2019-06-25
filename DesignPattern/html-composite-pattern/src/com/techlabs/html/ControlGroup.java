package com.techlabs.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlElements{

	private String tagName;
	private List<IHtmlElements> children;
	
	public ControlGroup(String tagName) {
		this.tagName=tagName;
		children=new ArrayList<IHtmlElements>();
	}
	
	public String getTagName() {
		return tagName;
	}
	public List<IHtmlElements> getChildren(){
		return children;
	}
	public void addChildren(IHtmlElements child) {
		children.add(child);
	}

	@Override
	public String buildHtml() {

		String str="<"+tagName+">";
		for(IHtmlElements item: children) {
			str=str+"\n"+item.buildHtml();
		}
		return str+"\n<"+"</"+tagName+">";
	}
	
	@Override
	public String toString() {
		return " "+tagName; 
	}
}
	