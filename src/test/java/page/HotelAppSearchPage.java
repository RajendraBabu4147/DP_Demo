package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HotelAppSearchPage {
	
	WebDriver driver;

	public HotelAppSearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By location_dd = By.xpath("//select[@id='location']");
	
	By hotel_value = By.xpath("//select[@id='hotels']");

	By Roomtype_value = By.xpath("//select[@id='room_type']");

	By Number_of_rooms = By.id("room_nos");

	By Check_in_Date = By.id("datepick_in");

	By Check_out_date = By.id("datepick_out");

	By Adults_per_room = By.id("adult_room");

	By Child_per_room = By.id("child_room");

	By Search_button = By.id("Submit");

	By reset_button = By.xpath("//input[@id='Reset']");
	
	public void fillValues(String location, String hotel, String roomtype, String roomcount, String ckindate, String ckoutdate, String adults, String child )
	
	{
		
		new Select(driver.findElement(location_dd)).selectByValue(location);
		
		new Select(driver.findElement(hotel_value)).selectByValue(hotel);

		new Select(driver.findElement(Roomtype_value)).selectByValue(roomtype);
		
		new Select(driver.findElement(Number_of_rooms)).selectByValue(roomcount);
		 
		 driver.findElement(Check_in_Date).clear();
		 driver.findElement(Check_in_Date).sendKeys(ckindate);
		 
		 
		 driver.findElement(Check_out_date).clear();
		 driver.findElement(Check_out_date).sendKeys(ckoutdate);
        
		 new Select(driver.findElement(Adults_per_room)).selectByValue(adults);
			
		 new Select(driver.findElement(Child_per_room)).selectByValue(child);
		
		 
	}
	
	public void searchMethod()
	
	{
		
		driver.findElement(Search_button).click();
		
		
	}

	
}
	