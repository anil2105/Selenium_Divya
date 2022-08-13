package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_ClassName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Anil\\Besant Tech RajajiNagar\\htmlscripts\\test.html"); // open the website
        driver.findElement(By.className("c1")).click(); //chkBox
        Thread.sleep(3000);
        driver.close();
 
	}
}
