package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        String str = ele.getTagName();
        if(str.equals("img"))
        {
       	 System.out.println("image");
        }
        else
        {
       	 System.out.println("not an image");
        }
        driver.close(); //close the browser
	}
}
