package com.eyt.xml.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	/**
	 * Test if XML is parsed correctly
	 */
	@Test
	public void getBookstore_InvalidXml()
	{
		App app = new App(new File("src/test/resources/input.xml"));
		assertNull(app.getBookstore());
	}

	@Test
	public void getBookstore_ValidXml() {
		App app = new App(new File("src/test/resources/bookstore.xml"));
		assertEquals("Grassroots", app.getBookstore().getName());
		assertEquals(3, app.getBooks().size());
	}
}
