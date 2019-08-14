package com.cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SUB_STRING_MATCHES 
{

	public static void main(String[] args) 
	{
		
		// Starts with (^):
		
		/*   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   // syntax for tag and class
		   // css=<HTML tag><[attribute^=prefix of the string]>
		   driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("deshan");
		   
		   */
		   
	    // Ends with ($):
		
		  /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   // syntax for tag and class
		   // css=<HTML tag><[attribute$=suffix of the string]>
		   driver.findElement(By.cssSelector("input[id$='ss']")).sendKeys("deshan");
		   */
		   
		// Contains (*): 
		   
		  /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   // syntax for tag and class
		   // css=<HTML tag><[attribute*=sub string]>
		   driver.findElement(By.cssSelector("input[id*='id']")).sendKeys("deshan");
		   
		   */
		 // contains()  
		   
		   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   // syntax for tag and class
		   // css=<HTML tag><[attribute*=sub string]>
		   driver.findElement(By.cssSelector("input[id*='id']")).sendKeys("deshan");

	}

}
