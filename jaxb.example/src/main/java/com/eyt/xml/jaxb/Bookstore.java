package com.eyt.xml.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Bookstore
 */
@XmlRootElement(name = "bookstore", namespace = "urn:books")
public class Bookstore {

	private ArrayList<Book> books;
	private Info info;

	@XmlElement(name = "info")
	public void setInfo(Info info) {
		this.info = info;
	}

	public String getName() {
		return info.getName();
	}

	public String getLocation() {
		return info.getLocation();
	}

	@XmlElement(name = "book")
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

}