package com.khanhldd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class NewEntity {
	@Column(name = "title")
	private String title;
	
	@Column(name = "thumbnail")
	private String thumbNail;
	
	@Column(name = "shortdescription")
	private String shortDescription;
	
	@Column(name = "content")
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbNail() {
		return thumbNail;
	}

	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
