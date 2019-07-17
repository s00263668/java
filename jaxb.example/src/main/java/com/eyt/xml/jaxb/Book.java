package com.eyt.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Book
 */
@XmlRootElement(name = "book")
@XmlType(propOrder = {"author", "title"})
public class Book {
	
	private String id;

	private String author;
	private String title;

	@XmlAttribute(name = "id")
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@XmlElement(name = "author")
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement(name = "title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}