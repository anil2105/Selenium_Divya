package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_CssSelector 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Anil\\Besant Tech RajajiNagar\\htmlscripts\\test.html"); // open the website
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");        Thread.sleep(2000);
        driver.close();
	}
}
