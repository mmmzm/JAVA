package com.pcwk.ehr.ed10;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Channel {

	private  List<Item> items=new ArrayList<Item>();
	
	private  List<Item> item=new ArrayList<Item>();
	
	public Channel() {}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItem() {
		return item;
	}

	@XmlElement
	public void setItem(List<Item> item) {
		this.item = item;
	}


	
	
	
}
