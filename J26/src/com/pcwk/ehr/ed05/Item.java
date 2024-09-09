package com.pcwk.ehr.ed05;

import javax.xml.bind.annotation.XmlElement;

public class Item {

	private String title;//제목
	private String link;//링크
	private String description;//상세 설명
	private String bloggername;//블러거 이름
	private String bloggerlink;//블러거 링크
	private String postdate;//글 등록일 
	
	
	public Item() {}


	public String getTitle() {
		return title;
	}


	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}


	public String getLink() {
		return link;
	}

	@XmlElement
	public void setLink(String link) {
		this.link = link;
	}


	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}


	public String getBloggername() {
		return bloggername;
	}

	@XmlElement
	public void setBloggername(String bloggername) {
		this.bloggername = bloggername;
	}


	public String getBloggerlink() {
		return bloggerlink;
	}

	@XmlElement
	public void setBloggerlink(String bloggerlink) {
		this.bloggerlink = bloggerlink;
	}


	public String getPostdate() {
		return postdate;
	}

	@XmlElement
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}


	@Override
	public String toString() {
		return "Item [title=" + title + ", link=" + link + ", description=" + description + ", bloggername="
				+ bloggername + ", bloggerlink=" + bloggerlink + ", postdate=" + postdate + "]";
	}
	
	
}
