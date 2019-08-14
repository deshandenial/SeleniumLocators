package com.cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_and_ID 
{

	public static void main(String[] args) 
	{
		 
	
	 
		   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   // syntax for tag and id 
		   // css=tag#id
		   driver.findElement(By.cssSelector("input#email")).sendKeys("deshan");
		   

	}

}
