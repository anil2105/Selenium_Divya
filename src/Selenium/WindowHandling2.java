package Selenium;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://localhost/login.do");
	    
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	    Set<String> allwindows = driver.getWindowHandles();
	   
	    System.out.println(allwindows);
	    	
	    for(String we : allwindows)	
	    {   
	    	driver.switchTo().window(we);
	    	   
	    	if(driver.getTitle().contains("TIME"))
	    	   {
	    		   driver.close();
	 
	    	   }
	    } 
	}
}
