package Selenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp_HiddenDivision
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	    ele.click();
	    Thread.sleep(2000);
	    WebElement date = driver.findElement(By.xpath("(//div[@class='DayPicker-Body']/div[2]/div[7]/div/div)[1]"));
	    Thread.sleep(5000);
	    date.click();
	    Thread.sleep(5000);
	    driver.close();
	}
}
