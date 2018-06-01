package org.javaee.test.arquillian.code.coverage;

import javax.inject.Named;

@Named
public class Service {

	private Book[] books = new Book[]{
			new Book("Poèmes saturniens",5,"Verlaine"),
			new Book("Fêtes galantes",15,"Verlaine"),
			new Book("La Bonne Chanson",25,"Verlaine"),
			new Book("Romances sans paroles",5,"Verlaine"),
			new Book("Sagesse",10,"Verlaine"),
	};
	
	
	public Book[] getLibrary() {
		return books;
	}
	
}
