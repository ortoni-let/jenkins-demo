package servicenow.selenium.pages;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ServiceCommon;

public class DashBoard extends ServiceCommon{
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}
	
	public String enterOnSearch() {
		String title = driver.getTitle();
		return title;
		
	}

}
