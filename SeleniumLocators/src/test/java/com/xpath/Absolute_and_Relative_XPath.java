package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_and_Relative_XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Generally, in some test automation engineer interviews, I asked the difference between absolute and relative XPath. 
		//Actually, it is the answer is very easy.
		
		/*Absolute XPath
		===============
		
		It is a direct way to locate an element.
		It is very brittle.
		Starts with single slash “/” that means starting to search from the root.
		
		Example: /html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input
		
      */
		
   // CODE:
   
   /*	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div/form/input[4]")).sendKeys("mens shirts");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div/form/button")).click();
	*/	
		
		/*Relative XPath
		 ===============
		Starts from the middle of the HTML DOM.
		Starts with a double slash “//” that means it can start to search anywhere in the DOM structure.
		Shorter than Absolute XPath.
		Less fragile.
		
		Example: //div[@class=’form-group’]//input[@id=’user-message’]
		Example: //*[@class=’panel-body’]//li[contains(text(),’entered in input field’)]
		*/
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@name='search_query']")).sendKeys("mens shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		
	}

}
