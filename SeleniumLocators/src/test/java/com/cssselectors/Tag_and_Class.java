package com.cssselectors;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_and_Class 
{

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   // syntax for tag and class
		   // css=tag.class
		   WebElement signUpForm= driver.findElement(By.cssSelector("input.inputtext"));
		   signUpForm.sendKeys("abc");
		  

	}

}
