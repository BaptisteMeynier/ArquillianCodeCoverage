package org.javaee.test.arquillian.code.coverage;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Facade {

	@Inject
	private Service service;
	
	public Book[] getLibrary() {
		return service.getLibrary();
	}
	
	
}
