package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonFunctions.ServiceCommon;
import servicenow.selenium.pages.LoginPage;

public class TC001_Login extends ServiceCommon{

	@BeforeTest
	public void setData() {
		author = "koushik";
		category = "smoke";
		testcaseDec = "Login into service now";
		testcaseName = "TC001_Login";
		excelname = "TC001";	
	}

	@Test(dataProvider = "login")
	public void login(String un, String pass) {
		
		new LoginPage()
		.enterUserName(un)
		.enterPassword(pass)
		.clickLogin();
		
	}

}
