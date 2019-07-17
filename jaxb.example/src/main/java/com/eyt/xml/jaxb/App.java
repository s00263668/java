package com.eyt.xml.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App 
{
	private Bookstore bookstore;

	public App(File xml) {
		try {
			JAXBContext context = JAXBContext.newInstance(Bookstore.class);
			Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
			bookstore = (Bookstore) jaxbUnmarshaller.unmarshal(xml);
		} catch (JAXBException e) {
			bookstore = null;
		}
	}

	public Bookstore getBookstore() {
		return bookstore;
	}

	public ArrayList<Book> getBooks() {
		return bookstore.getBooks();
	}

	public static void main( String[] args )
	{
		File xml = new File("src/test/resources/bookstore.xml");
		if (xml.isFile()) {
			System.out.printf("XML file exist: %s%n", xml.getPath());
			App app = new App(xml);
			Bookstore store = app.getBookstore();
			if (store != null) {
				if (store.getBooks() != null) {
					System.out.printf("Search bookstore '%s' located at %s...%n", store.getName(), store.getLocation());
					for (Book book : store.getBooks()) {
						System.out.printf("Found: <%s> written by %s%n", book.getTitle(), book.getAuthor());
					}
				} else {
					System.out.println("Books is null!");
				}
			} else {
				System.out.println("Bookstore is null!");
			}
		} else {
			System.out.printf("XML file not exist: %s%n", xml.getPath());
		}
	}
}
