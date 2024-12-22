
@New_Bussiness
Feature: Automation MAgma

 Background: Scenario_LoginPage 
   Given user on Login page
    When Enter userName "N"
    When  Enter password "India@123"
    When  click on Loginbutton
    Then user on Homepage
 
     @Inward
      Scenario Outline: Scenario_ID_01 New_Bussiness Inward
     When Click on grid Inward option
     When Click on sub inward option
     When Click on view_manage_Inward_Inward_generate
     When IN_SCN_01_TC_1Verify that the Add New button is clickable
     When IN_SCN_01_TC_2Verify that the Add New button navigates to new page where to add inward when it is clicked
     When IN_SCN_02_TC_1To verify that the Business Type is a mandatory dropdown field
     When IN_SCN_02_TC_3Confirm that the Business Type dropdown field has a default value as New Business"<BussinessType>"
     When IN_SCN_02_TC_4Ensure that users can select a business type from the dropdown"<BussinessTypeselect>"
  #  When IN_SCN_02_TC_7Confirm that the selected business type is displayed in the dropdown field after selection"<BussinessTypeselect>"
     When IN_SCN_02_TC_4Ensure that users can select a business type from the dropdown"<BussinessType>"
  #  When IN_SCN_02_TC_5Confirm that the Business Type dropdown contains the expected list of business types
     When IN_SCN_03_TC_1Confirm that the Transaction Type is a mandatory dropdown field"<Transaction_Type_dropdown>"
     When IN_SCN_09TC_18Verify the functionality of searching by with a valid name "<Searchclient_Name>"
     When IN_SCN_14TC_3Cofirm, if clicked on search option
     When IN_SCN_14TC_5Enter a valid search query and verify results are displayed correctly "<relationName>"
     When select policy startdate
     Examples:
     | BussinessType| BussinessTypeselect| Transaction_Type_dropdown |Searchclient_Name|relationName|
     | New Business | Renewal Business   |Policy                     |ambuja           |Rajeev|
     
     
     
   