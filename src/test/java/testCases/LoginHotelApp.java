package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import page.HotelAppLoginPage;
import page.HotelAppSearchPage;



public class LoginHotelApp {
	

	public static void main(String[] args) {

	
	WebDriver driver;
	
	System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("http://adactinhotelapp.com");
	
	driver.manage().window().maximize();
	
	HotelAppLoginPage halp = new HotelAppLoginPage(driver);
	
	halp.enterUserName("RajendraBabu07");
	halp.enterPassword("8J1O4L");
	
	halp.clickLoginButton();
	
	HotelAppSearchPage hasp = new HotelAppSearchPage(driver);
	
	hasp.fillValues("Sydney", "Hotel Sunshine", "Standard", "2", "11-01-2023", "12-01-2023", "2", "2");
	
	hasp.searchMethod();
	
	driver.quit();
	
	
}
}
