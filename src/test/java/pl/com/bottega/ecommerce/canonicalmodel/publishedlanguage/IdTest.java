package pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.CoreMatchers.*;

public class IdTest {

	Id id;
	
	@Test
	public void userTest() {
		id = new Id("Test");
		boolean isValid = true;
		
		assertThat(id.equals(new Id("Test")), equalTo(isValid));		
	}

	@Test
	public void userNotTest() {
		id = new Id("Test");
		boolean isValid = false;
		
		assertThat(id.equals(new Id("NotTest")), equalTo(isValid));		
	}

}
