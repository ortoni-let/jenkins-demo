package commonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.devlabs.selenium.ServiceNowBase;

import utils.ReadData;

public class ServiceCommon extends ServiceNowBase{
	
	public String excelname;

//	@Parameters({"url"})
	
	@BeforeMethod
	public void launchBrowser() {
		startApp("https://dev87535.service-now.com/");
	}
	
	@AfterMethod
	public void closeApp() {
		quit();
	}
	
	
	@DataProvider(name = "login"/* indices = 0*/)
	public String[][] testData() {
		ReadData rd = new ReadData();
		return rd.getData(excelname);
	}
	
}
