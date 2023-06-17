package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUp_Alert
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("13528");
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    Alert a =  driver.switchTo().alert();
	    //a.accept();
	    //a.dismiss();
	    a.sendKeys("hello");
	    String str = a.getText();
	    System.out.println(str);
	    Thread.sleep(5000);
	    driver.close();
	}
}
