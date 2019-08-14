package com.cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_and_Attribute 
{

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   // syntax for tag and class
		   // css=tag.class
		   WebElement signUpForm= driver.findElement(By.cssSelector("input[name=email]"));
		   signUpForm.sendKeys("abc");

	}

}
