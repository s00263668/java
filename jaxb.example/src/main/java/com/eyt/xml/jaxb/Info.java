package com.eyt.xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Info
 */
@XmlRootElement(name = "info")
public class Info {

	private String name;
	private String location;

	@XmlAttribute(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute(name = "location")
	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
}