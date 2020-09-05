package TEST;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MakeUtil.LaunchBrowser;
import PAGE.DuplicateCategoryPage;

public class VerifyPlz {
	WebDriver driver;
	LaunchBrowser browser;

	DuplicateCategoryPage data;
	@Test
	public void browser() {
		driver=LaunchBrowser.startwebsite();
		data= PageFactory.initElements(driver,DuplicateCategoryPage.class);
		
		data.duplicate();
		data.validation();
		
	}
}
