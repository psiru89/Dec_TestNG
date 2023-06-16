package util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/102/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	
	public static void tearDown() {
	 driver.close();
 	 driver.quit();
 }

}
