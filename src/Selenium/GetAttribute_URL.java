package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_URL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Click here to go')]"));
        String str = ele.getAttribute("href");
        System.out.println(str);
        driver.close(); //close the browser
	}
}
