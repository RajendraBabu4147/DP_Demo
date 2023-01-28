package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelAppLoginPage {
	
	WebDriver driver;

	public HotelAppLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locator for user name
	
	By userName = By.id("username");
	
	//locator for password
	
	By userPassword = By.id("password");
	
	//locator for login button
	
	By lgnButton = By.id("login");
	
	//method for Enter the user name
	
	public void enterUserName(String user_name)
	{
		driver.findElement(userName).sendKeys(user_name);
	}
	
	//method for Enter the user password
	
	public void enterPassword(String user_Password)
	{
		driver.findElement(userPassword).sendKeys(user_Password);
	}
	
	//method for click on login
	
	public void clickLoginButton()
	{
		driver.findElement(lgnButton).click();
	}

}
