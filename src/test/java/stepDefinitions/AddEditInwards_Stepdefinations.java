package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.AddEditInwards;
import POM.Iframe_Search_Bussiness_Source_Information;
import POM.Iframe_Search_Client_Name;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class AddEditInwards_Stepdefinations {

	TestContextSetup testContextSetup;

	WebDriver driver;
	AddEditInwards addEditInwards;
	Iframe_Search_Client_Name iframe_Search_Client_Name;
	Iframe_Search_Bussiness_Source_Information iframe_Search_Bussiness_Source_Information;
	SoftAssert softAssert;
	
	
	public AddEditInwards_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
	//	homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
//		hR_Upolad_Member=new HR_Upolad_Member(driver);
		addEditInwards=new AddEditInwards(driver);
		iframe_Search_Client_Name=new Iframe_Search_Client_Name(driver);
		iframe_Search_Bussiness_Source_Information=new Iframe_Search_Bussiness_Source_Information(driver);
		softAssert=new SoftAssert();
	}
	
	@And("IN_SCN_{int}_TC_2Verify that the Add New button navigates to new page where to add inward when it is clicked")
	public void in_scn__tc_2verify_that_the_add_new_button_navigates_to_new_page_where_to_add_inward_when_it_is_clicked(Integer int1) throws Exception {
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("AddEditInwards");
	softAssert.assertEquals(b, true);
	softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_1To verify that the Business Type is a mandatory dropdown field")
	public void in_scn__tc_1to_verify_that_the_business_type_is_a_mandatory_dropdown_field(Integer int1) {
		addEditInwards.check_BussinessType_MandatoryMark();
	}
	@And("IN_SCN_{int}_TC_3Confirm that the Business Type dropdown field has a default value as New Business{string}")
	public void in_scn__tc_3confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(Integer int1,String str) {
		String actualvalue=addEditInwards.check_BussinessType_dropdown_value();
		softAssert.assertEquals(actualvalue, str);
		softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_4Ensure that users can select a business type from the dropdown{string}")
	public void in_scn__tc_4ensure_that_users_can_select_a_business_type_from_the_dropdown(Integer int1,String str) {
		addEditInwards.select_Bussiness_type_dropdown(str);
	}
	@And("IN_SCN_{int}_TC_5Confirm that the Business Type dropdown contains the expected list of business types")
	public void in_scn__tc_5confirm_that_the_business_type_dropdown_contains_the_expected_list_of_business_types(Integer int1) {
	 
	}
	@And("IN_SCN_{int}_TC_7Confirm that the selected business type is displayed in the dropdown field after selection{string}")
	public void in_scn__tc_7confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(Integer int1,String str) {
		String actualvalue=addEditInwards.check_BussinessType_dropdown_textvalue();
		softAssert.assertEquals(actualvalue, str);
		softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_1Confirm that the Transaction Type is a mandatory dropdown field{string}")
	public void in_scn__tc_1ensure_that_users_can_select_a_business_type_from_the_dropdown(Integer int1,String str) {
		addEditInwards.select_Transaction_Type_dropdown(str);
	}
	@When("IN_SCN_09TC_18Verify the functionality of searching by with a valid name {string}")
	public void in_scn__tc_18confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(String str) throws Exception {
	
		addEditInwards.click_client_code_search_Icon();
		iframe_Search_Client_Name.move_to_iframe();
       iframe_Search_Client_Name.enter_data_SearchBox(str);
       iframe_Search_Client_Name.clicK_HB_Search_Radio_Button();
       Thread.sleep(3000);
       iframe_Search_Client_Name.Click_result_go_button();
       iframe_Search_Client_Name.move_to_parentframe();
		
	}
	@When("IN_SCN_14TC_3Cofirm, if clicked on search option")
	public void in_scn_14tc_3cofirm_if_clicked_on_search_option() {
		addEditInwards.click_bussiness_Relation_search_Icon();  
	}
	@When("IN_SCN_14TC_5Enter a valid search query and verify results are displayed correctly {string}")
	public void in_scn_14tc_5enter_a_valid_search_query_and_verify_results_are_displayed_correctly_rajeev(String str) throws Exception {
		iframe_Search_Client_Name.move_to_iframe();
		  Thread.sleep(3000);
		  iframe_Search_Bussiness_Source_Information.enter_data_SearchBox(str);
		  iframe_Search_Bussiness_Source_Information.click_Go_Button();
		   Thread.sleep(3000);
		  iframe_Search_Bussiness_Source_Information.Click_result_go_button();
         iframe_Search_Client_Name.move_to_parentframe();
	}
	@When("select policy startdate")
	public void in__3cofirm_if_clicked_on_search_option() {
		addEditInwards.click_calendar_policy_startdateicon();
	}

	
	

}
