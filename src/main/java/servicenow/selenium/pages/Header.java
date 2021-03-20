package servicenow.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.ServiceCommon;

public class Header extends ServiceCommon{
	
	
	public Header() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user_info_dropdown") private WebElement userDD;
	public Header clickUserAccount(){
		click(userDD);
		
		return this;
	}
	@FindBy(linkText = "Profile")private WebElement profile;
	public ProfilePage clickProfile(){
		click(profile);
		return new ProfilePage();	
	}

}
