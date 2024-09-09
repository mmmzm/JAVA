package com.pcwk.ehr.ed10;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rss {

	private Channel channel = new Channel();

	public Rss() {}
	
	
	public Channel getChannel() {
		return channel;
	}

	@XmlElement
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
	
}
