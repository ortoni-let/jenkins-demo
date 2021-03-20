package servicenow.selenium.pages;

import org.openqa.selenium.support.PageFactory;

import commonFunctions.ServiceCommon;

public class ProfilePage extends ServiceCommon {
	ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public void printTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());
	}

}
