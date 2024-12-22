package POM;

import org.openqa.selenium.WebDriver;


import POM.LoginPage;

public class PageObjectManager {

	public WebDriver driver;
	public LoginPage loginPage;
	public View_Manage_Inward view_Manage_Inward;
	public DefaultPage defaultPage;
	public AddEditInwards addEditInwards;
	public Iframe_Search_Client_Name iframe_Search_Client_Name;
	public Iframe_Search_Bussiness_Source_Information iframe_Search_Bussiness_Source_Information;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public  LoginPage openLoginPage() {
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	public  View_Manage_Inward openView_Manage_Inward() {
		view_Manage_Inward=new View_Manage_Inward(driver);
		return view_Manage_Inward;
	}
	public  DefaultPage defaultPage() {
		defaultPage=new DefaultPage(driver);
		return defaultPage;
	}
	public  AddEditInwards addEditInwards() {
		addEditInwards=new AddEditInwards(driver);
		return addEditInwards;
	}
	public  Iframe_Search_Client_Name Open_iframe_Search_Client_Name() {
		iframe_Search_Client_Name=new Iframe_Search_Client_Name(driver);
		return iframe_Search_Client_Name;
	}
	public  Iframe_Search_Bussiness_Source_Information Open_iframe_Search_Bussiness_Source_Information() {
		iframe_Search_Bussiness_Source_Information=new Iframe_Search_Bussiness_Source_Information(driver);
		return iframe_Search_Bussiness_Source_Information;
	}
	
	
}
