package pl.com.bottega.ecommerce.sharedkernel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Currency;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

	Money money;
	
	@Before
	public void init(){
		money = new Money(1, Money.DEFAULT_CURRENCY);	
	}
	
	@Test
	public void nullMoneyTest() {
		assertThat(money.equals(null), equalTo(false));		
	}

	@Test
	public void sameMoneyTest() {
		assertThat(money.equals(money), equalTo(true));		
	}

	@Test(expected =IllegalArgumentException.class)
	public void addOtherCurrenctTest() {
		Currency curr = Currency.getInstance("PLN");
		money.add(new Money(2, curr));
	}

	@Test(expected =IllegalArgumentException.class)
	public void substractOtherCurrenctTest() {
		Currency curr = Currency.getInstance("PLN");
		money.subtract(new Money(2, curr));
	}

	
}
