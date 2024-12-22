package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class View_Manage_Inward {
	
	WebDriver ldriver;
	WebDriverWait wait;
	
	public View_Manage_Inward(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	
	@FindBy (xpath="//a[text()='Add New']")
	@CacheLookup
	  WebElement inward_Add_butoon;
	
	public void click_inward_Add_buuton()
	{
		inward_Add_butoon.click();
	}
	

	
}
