package pl.com.bottega.ecommerce.sales.domain.productscatalog;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class ProductDataTest {
	ProductData product;
	
	@Before
	public void init(){
		 product = new ProductData(new Id("1"), new Money(1), "name", ProductType.DRUG, new Date());		
	}
	
	@Test
	public void productNullTest() {
		assertThat(product.equals(null), equalTo(false));		
	}

	@Test
	public void productTheSameTest() {
		assertThat(product.equals(product), equalTo(true));		
	}
	
	@Test
	public void productAnotherNameTest() {
		assertThat(product.equals(new ProductData(new Id("1"), new Money(1), "testName", ProductType.DRUG, new Date())), equalTo(false));		
	}

	@Test
	public void productAnotherIdTest() {
		assertThat(product.equals(new ProductData(new Id("111"), new Money(1), "Name", ProductType.DRUG, new Date())), equalTo(false));		
	}

	@Test
	public void productAnotherMoneyTest() {
		assertThat(product.equals(new ProductData(new Id("1"), new Money(111), "Name", ProductType.DRUG, new Date())), equalTo(false));		
	}

	@Test
	public void productAnotherTypeTest() {
		assertThat(product.equals(new ProductData(new Id("1"), new Money(1), "Name", ProductType.FOOD, new Date())), equalTo(false));		
	}


	

}
