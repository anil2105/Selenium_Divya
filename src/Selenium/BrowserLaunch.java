package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://facebook.com"); // open the website
        String str = driver.getTitle(); //get title of the page
        System.out.println(str); //print title of the page on console
        driver.close(); //close the browser
	}
}
