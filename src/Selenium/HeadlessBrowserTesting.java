package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowserTesting 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		WebDriver driver1=new ChromeDriver(options); 
		
		driver1.get("https://www.google.co.in/");
		
		System.out.println(driver1.getTitle());
		

		//.................................................................................................
		
/*		System.setProperty("webdriver.gecko.driver", "C://Users//Admin//Downloads//Program files//geckodriver-v0.30.0-win64//geckodriver.exe");
		
		FirefoxOptions options1=new FirefoxOptions();
		//options1.setHeadless(true);
		options1.addArguments("--headless");
		
		WebDriver driver2=new FirefoxDriver(options1);
		
		driver2.get("https://www.youtube.com/"); 
		System.out.println(driver2.getTitle()); 
*/	
	}
}
