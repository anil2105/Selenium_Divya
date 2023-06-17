package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_TagName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Anil\\Besant Tech RajajiNagar\\htmlscripts\\test.html"); // open the website
        driver.findElement(By.tagName("input")).sendKeys("ani");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='facebook']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
        driver.close();
	}
}
