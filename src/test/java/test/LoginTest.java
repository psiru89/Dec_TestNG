package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	String categoryName= "SirjanaPokharel";

	@Test
	public void validUserShouldBeAbleToLoginIn() {
		
		 driver = BrowserFactory.init(); 
		 LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
         loginPage.insertCategoryData(categoryName);
         loginPage.clickOnAddCategory();
         loginPage.clickOnAddDublicateCategory();
         loginPage.clickOnMonthButton();
         
}

}