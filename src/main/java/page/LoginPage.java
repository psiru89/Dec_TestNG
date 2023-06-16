package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;

}
	@FindBy(how = How.CSS, using= "input[name='categorydata']") WebElement Category_Element;
	@FindBy(how = How.CSS, using= "input[value='Add category']") WebElement AddCategory_Element;
	@FindBy(how = How.XPATH, using= "/html/body/text()[1]") WebElement Add_dublicate_Category_Element;
    @FindBy(how = How.CSS, using= "select[name='due_month']") WebElement Month_Element;
	
	public void insertCategoryData(String categoryName) {
		Category_Element.sendKeys(categoryName);
	}
	
	public void clickOnAddCategory() {
		AddCategory_Element.click();
	}
	
	public void clickOnAddDublicateCategory() {
		Add_dublicate_Category_Element.click();;

	}
	
	public void clickOnMonthButton() {
		Month_Element.click();
	}
	
	
	
	
	
	
	
	
}