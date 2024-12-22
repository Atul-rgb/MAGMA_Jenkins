package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import POM.DefaultPage;
import POM.LoginPage;
import POM.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class Default_page_StepDefination  {
	WebElement changePassword_link;
	WebDriver driver;
	TestContextSetup testContextSetup;
	public LoginPage  loginPage;
	DefaultPage defaultPage;
	PageObjectManager pageObjectManager;
	SoftAssert softassert;
	 

	public Default_page_StepDefination(TestContextSetup testContextSetup) throws Exception {
		 this.testContextSetup=testContextSetup;
		 loginPage=testContextSetup.pageObjectManager.openLoginPage();
		 driver =testContextSetup.base.lounchBrowser();
		 defaultPage=new DefaultPage(driver);
		 softassert=new SoftAssert();
	}
	@When("Click on grid Inward option")
	public void Click__on_Inward_link() throws Exception {
	//Thread.sleep(20000);
		defaultPage.click_Inward_module();
	}
	
	@And("Click on sub inward option")
	public void Click__on_Sub_Inward_link() throws Exception {
	//Thread.sleep(20000);
		
		defaultPage.click_Sub_inwardModule();
		System.out.println("Main Submodule Inward Click");
	}
	@And("Click on view_manage_Inward_Inward_generate")
	public void Click_view_manage_Inward_Inward_generate() throws Exception {
	//Thread.sleep(20000);
		
		defaultPage.click_inward_generate();
		System.out.println("Main Submodule Inward Click");
	}
	
	/*@When("IN_SCN_{int}_TC_1Verify that the Add New button is clickable")
	public void in_scn__tc_1verify_that_the_add_new_button_is_clickable(Integer int1) {
		loginPage.click_inward_generate();
	}*/

}
