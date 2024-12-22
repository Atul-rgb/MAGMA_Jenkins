package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEditInwards {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Select select;
	public AddEditInwards(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	@FindBy (xpath="//td[text()='Business Type:']//span")
	@CacheLookup
	  WebElement BussinessType_MandatoryMark;
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddlBusinessType']//option[@selected='selected']")
	@CacheLookup
	  WebElement BussinessType_dropdown_value;
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddlBusinessType']")
	@CacheLookup
	  WebElement BussinessType_dropdown;
	@FindBy (id="ctl00_PageBodyControls_ddlTransactionType")
	@CacheLookup
	  WebElement Transaction_Type_dropdown;
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtClientName'] //following::img[@id='Img1']")
	@CacheLookup
	  WebElement client_code_search_Icon;
	@FindBy (xpath="//a[@id='ctl00_PageBodyControls_A2']//img")
	@CacheLookup
	  WebElement bussiness_Relation_search_Icon;
	
	@FindBy (id="ctl00_PageBodyControls_PopCalendar2_Control")
	@CacheLookup
	  WebElement calendar_policy_startdate;
	public void click_bussiness_Relation_search_Icon()
	{
		bussiness_Relation_search_Icon.click();
	}
	public void click_client_code_search_Icon()
	{
		client_code_search_Icon.click();
	}
	public void select_Bussiness_type_dropdown(String str) {
		select=new Select(BussinessType_dropdown);
		select.selectByVisibleText(str);
	}
	public boolean check_BussinessType_MandatoryMark()
	{
	 return 	BussinessType_MandatoryMark.isDisplayed();
	}
	public String check_BussinessType_dropdown_value()
	{
	 return 	BussinessType_dropdown_value.getText();
	}
	public String check_BussinessType_dropdown_textvalue()
	{
	 return 	BussinessType_dropdown.getText();
	}
	public void select_Transaction_Type_dropdown(String str) {
		select=new Select(Transaction_Type_dropdown);
		select.selectByVisibleText(str);
	}
	public void click_calendar_policy_startdateicon() {
		calendar_policy_startdate.click();
	}

	
}
