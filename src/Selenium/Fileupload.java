package Selenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=EAIaIQobChMImerjwJ7K9AIV2ZlmAh0fqAm6EAAYASAAEgJlw_D_BwE&gclsrc=aw.ds");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,250)", "");
		
		//WebElement ele=driver.findElement(By.xpath("(//button[@type='button'])[1]")); 
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]"));
				ele1.click();
		Thread.sleep(5000);
				ele1.sendKeys("E:\\Anil Kumar_ Bio-Data");
		Thread.sleep(5000); 
		driver.close();
		 
	}
}
