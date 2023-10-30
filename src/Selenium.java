import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Selenium {
	
	
	
	
	String login(WebDriver driver, String username, String password)
	{
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();
		String url = driver.getCurrentUrl();
		return url;
	}
	
	
	void buyElement(WebDriver driver, String element)
	{
		String buttonName = "";
		
		
		driver.findElement(By.cssSelector(element)).click();
		//System.out.println(buttonName);
		//return buttonName;
		
		
	}
	
	void go_to_shoppingCart(WebDriver driver)
	{
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	}
	
	String checkout_from_shoppingCart(WebDriver driver, String first, String last, String zip)
	{
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.cssSelector("#first-name")).sendKeys(first);
		driver.findElement(By.cssSelector("#last-name")).sendKeys(last);
		driver.findElement(By.cssSelector("#postal-code")).sendKeys(zip);
		driver.findElement(By.cssSelector("#continue")).click();
		return driver.getCurrentUrl();
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("test");
	}
}
