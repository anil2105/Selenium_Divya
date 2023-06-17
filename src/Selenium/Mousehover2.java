package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//body/div[1]/main/div[2]/div[2]/div/div/p[1]/a[1]"));
	    Actions act = new Actions(driver);
	    act.contextClick(ele).perform(); //right click
	    Thread.sleep(5000);
	    driver.close();
	}
}
