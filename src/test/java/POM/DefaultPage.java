package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultPage {
	
	WebDriver ldriver;
	WebDriverWait wait;
	
	public DefaultPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//a[text()='View / Manage Inward (Inward generated)']")
	@CacheLookup
	 WebElement inward_generate;
	
	
	@FindBy(xpath="//a[text()='Inward']")
	@CacheLookup
	WebElement inward_gride;
	
	
	@FindBy(xpath="//p[text()='Inward']")
	@CacheLookup
	WebElement subInward;
	public void click_Sub_inwardModule()
	{
		subInward.click();
	}
	
	
	public void click_inward_generate()
	{
		inward_generate.click();
	}
	
	public  void click_Inward_module() 
	{
		inward_gride.click();
	
	}
 
/*public void clickProfile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(profileLink)).click();
	}*/
	
	/*public void clickLogOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutlink)).click();
	}*/
	
}
