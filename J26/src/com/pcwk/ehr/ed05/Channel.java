package com.pcwk.ehr.ed05;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Channel {

	private List<Item> item=new ArrayList<Item>();
	
	public Channel() {}

	public List<Item> getItem() {
		return item;
	}

	@XmlElement
	public void setItem(List<Item> item) {
		this.item = item;
	}


	
	
}
