package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comman_Cod {
    WebDriver  ldriver;
	WebDriverWait wait;
	Select select;
	
	JavascriptExecutor executor;
	public Comman_Cod(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	public  void shitch_to_Iframe(WebElement element)
	{
		ldriver.switchTo().frame(element);
	}
	public  void shitch_to_Parent()
	{
		ldriver.switchTo().defaultContent();
	}
	public  void javascript_click_specific_element(WebElement element)
	{
		 executor = (JavascriptExecutor) ldriver;
	    executor.executeScript("arguments[0].click();", element);
	}
	public void accept_alert() {
		ldriver.switchTo().alert().accept();
	}
	
}
