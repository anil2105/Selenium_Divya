package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/downloads/");
	    driver.findElement(By.xpath("//body/div[1]/main/div[2]/div[2]/div/div/p[1]/a[1]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT); 
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_LEFT); 
	    r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000); 
		driver.close();
		 
	}
} 
