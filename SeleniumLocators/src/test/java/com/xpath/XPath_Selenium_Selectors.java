package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Selenium_Selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * We can find the location of any element on a web page using XML path expressions. The basic syntax for XPath is shown below:

         	Syntax = //tagname[@attribute=’Value‘]

			Example = //input[@id=’user-message‘]
			
			
		 */
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("mens shirts");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//You can also use class, name, link text, and the other attributes to locate an element with XPath as shown above.

	}

}
