package org.javaee.test.arquillian.code.coverage;

import java.io.File;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class FacadeTest {

	 @Inject
	private Facade facade;
	
	@Deployment
	public static WebArchive deploy() {
		
		return ShrinkWrap.create(WebArchive.class)
				.addClass(Book.class)
				.addClass(Facade.class)
				.addClass(Service.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@Test
	public void shouldGetAllBooks() {
		Assert.assertNotEquals(0,facade.getLibrary().length);
	}
	
	
}
