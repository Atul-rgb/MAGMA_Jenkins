package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.View_Manage_Inward;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class View_Manage_Inward_Stepdefinations {

	TestContextSetup testContextSetup;

	WebDriver driver;
	View_Manage_Inward view_Manage_Inward;
	SoftAssert softAssert;
	
	public View_Manage_Inward_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
	//	homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
//		hR_Upolad_Member=new HR_Upolad_Member(driver);
		view_Manage_Inward=new View_Manage_Inward(driver);
		softAssert=new SoftAssert();
	}
	@Then("IN_SCN_{int}_TC_1Verify that the Add New button is clickable")
	public void in_scn__tc_1verify_that_the_add_new_button_is_clickable(Integer int1) {
		view_Manage_Inward.click_inward_Add_buuton();
	}
	


	
	

}
