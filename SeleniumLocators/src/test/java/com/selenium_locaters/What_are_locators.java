package com.selenium_locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class What_are_locators 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Locators provide a way to access the HTML elements from a web page.
		 *  In Selenium, we can use locators to perform actions on the text boxes, links, checkboxes and other web elements.
		 */
		
		/*
		 * They are the basic building blocks of a web page. 
		 * A web developer must use a proper and consistent locator scheme for a website. 
		 * Also, a test engineer must choose the correct locator strategy to automate the online workflows.
		 */
		
// Locator 1 - ID To Select The Element
		
		/*
		 * It is a unique reference for a web object that the developer sets while writing the code.
		 *  Ideally, the ID should not repeat on a page, but the browsers do allow exceptions to this rule. 
		 *  The ID is no doubt the best locator to use in Selenium.
		 */
		
	    /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("email")).sendKeys("deshan");
		   driver.close();
	   */
// Locator 2 - Name To Select The Matching Element
		
		/*
		 * Every form has input fields with unique names. 
		 * Names are unique most of the times, but it’s not a restriction. 
		 * However, a field name locator is the best choice for testing a login form.
		 * But when you have multiple login types on the same page, then you should use locators with a different scheme.
		 */
		
		/*  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("pass")).sendKeys("......");
		  driver.close();
		*/
		
// Locator 3 - Link Text To Select The Link Element
		
		
		//It is a perfect way to find the links on a page
		
		 /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Forgotten account?")).click();
		  driver.close();
		*/
		
//Locator 4 - Partial Link Text To Select Link Element
		
		//It is almost similar to the previous locator. It differs in the way you use it to find the element.
		
		 /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText("Cookie")).click();
		  driver.close();
		  */
		  
//Locators 5 - Tag Name To Find The Element
		  
/*		  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Opening browser
          WebDriver driver= new ChromeDriver() ;
           
          //Opening window tab in maximize mode
          driver.manage().window().maximize();
           
          //Opening application
          driver.get("http://www.qappstech.com/");
           
          //Locating the email field element via Name tag and storing it in the webelement
          //WebElement email_field=driver.findElement(By.name("email"));
           
          //Entering text into the email field
         // email_field.sendKeys("sadhvisingh24@gmail.com");
           
          //Locating the password field element via Name tag and storing it in the webelement
         // WebElement password_field=driver.findElement(By.name("password"));
                   
          //Entering text into the password field
         // password_field.sendKeys("New1life");
           
          //Clicking on the login button to login to the application
         // WebElement login_button=driver.findElement(By.xpath("//button[text()='LOGIN']"));
           
          //Clicking on the 'login' button
         // login_button.click();
           
         //Clicking on the Settings option
         // driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[8]/a")).click();
           
          //Waiting for the profile option to appear
          //  Thread.sleep(3500);
           
          //*[@id="app"]/header/aside/ul/li[8]/ul/li[1]/a
          //Clicking on the profile link
         // driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[8]/ul/li[1]/a")).click();
           
          //Locating the element via img tag for the profile picture and storing it in the webelement
         // WebElement image= driver.findElement(By.tagName(""));
           
          //Printing text of Image alt attribute which is sadhvi
         // System.out.println(image.si);
          
          WebElement image=driver.findElement(By.tagName("img"));
          System.out.println(image.getAttribute("alt"));
   */
		  
          
        //Locators 6 - CSS selector To Find The Element
          
        /*   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.cssSelector("input[id=email]")).sendKeys("deshan");
		 */  
		   
		   
	   //Locators 7 - CSS Class Name To Access The Elements   
		   
		 /*    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");                  //Locating by firstname via class name         
		   List<WebElement> signUpForm=driver.findElements(By.className("inputtext"));     
		   int size=signUpForm.size();                  
		   System.out.print(signUpForm.size());                  //locating the first name locator         
		    signUpForm.get(0).sendKeys("deshan");                  //locating the last name locator         
		   signUpForm.get(1).sendKeys(".....");             //locating the email  locator     
		   
		  */     
		                                            
		                           
		 
		   
		   
	  
          
	  //Locators 8 - XPath To Locate Elements To Access The Elements = Absolute XPath
		
		/*   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");  
		  */ 
		   
		 //Locators 8 - XPath To Locate Elements To Access The Elements = Relative XPath
		   
			   System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
			   driver.get("https://www.facebook.com");
			   driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
			   
		   
	}

}
