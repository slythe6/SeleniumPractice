import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeleniumTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void test_standard_user() throws InterruptedException
	{
		WebDriver standard_user = new FirefoxDriver();
		Selenium test = new Selenium();
		
		test.login(standard_user,"standard_user", "secret_sauce");
		test.buyElement(standard_user, "#add-to-cart-sauce-labs-backpack");
		test.go_to_shoppingCart(standard_user);
		
		Thread.sleep(500);
		String expected = "https://www.saucedemo.com/checkout-step-two.html";
		String actual = test.checkout_from_shoppingCart(standard_user, "first", "last", "12345");
		assertEquals(expected, actual);
		//standard_user.quit();
	}
	
	
	
	@Test
	void test_add_element_to_cart_standard_user() throws InterruptedException
	{
		WebDriver standard_user = new FirefoxDriver();
		Selenium test = new Selenium();
		test.login(standard_user,"standard_user", "secret_sauce");
		Thread.sleep(10);
		test.buyElement(standard_user, "#add-to-cart-sauce-labs-backpack");
		//String expected = "#remove-sauce-labs-backpack";
		System.out.println(standard_user.findElement(By.cssSelector("#remove-sauce-labs-backpack")));
		String expected = "[[FirefoxDriver: firefox on WINDOWS (571646bf-769e-4f30-ac17-9a0b074ab157)] -> css selector: #remove-sauce-labs-backpack]";
		
	}
	
	

}
