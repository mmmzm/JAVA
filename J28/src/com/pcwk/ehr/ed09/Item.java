package com.pcwk.ehr.ed09;

import javax.xml.bind.annotation.XmlElement;

public class Item {
/*
<title>명예훼손 없이 <b>리뷰</b>쓰기</title>
<link>http://openapi.naver.com/l?AAABWLyw6CMBREv+ayNJe2UrrogvJwg8aYKGvACiSUalNR/t6azGLO5Mzrrd0moVSQJZDl/6I4KIxGpx9y9P4JNANShXSzHXZLu2q3660Jw2bt0k1+aF1rgFYXfZ+c7j3QorYDkCT4JxuIEEyRUYGcxpGXMeMs3VPBOUEWGXntynUW03k7ohBYfG+mOdRqbPL6E84/apnqgaEAAAA=</link>
<description>명예훼손 없이 <b>리뷰</b>쓰기 우리 블로그하시는 분들께는 꽤 중요한 내용일 수도 있습니다 그것도 주로 <b>리뷰</b> 위주로 블로그를 진행하신 분이라면 더욱 더 말이죠
    오늘 포스팅은, 어떻게 하면 객관적이고 좋은 <b>리뷰</b>를... </description>
<bloggername>건짱의 Best Drawing World2</bloggername>
<bloggerlink>http://blog.naver.com/yoonbitgaram</bloggerlink>
<postdate>20161208</postdate>
 */
	private String title;
	private String link;
	private String description;
	private String bloggername;
	private String bloggerlink;
	private String postdate;
	
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
