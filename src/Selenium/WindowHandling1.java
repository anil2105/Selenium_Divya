package Selenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.amazon.com");
	    String str = driver.getWindowHandle(); //address of window
	    System.out.println(str);
	    Thread.sleep(5000); 
		driver.close();
		 
	}
}
