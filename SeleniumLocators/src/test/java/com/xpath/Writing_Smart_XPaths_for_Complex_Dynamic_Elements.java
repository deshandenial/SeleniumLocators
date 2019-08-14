package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writing_Smart_XPaths_for_Complex_Dynamic_Elements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
  // 1. Tag – Attribute – Value Trio
		// Syntax: //tag[@attribute=’value‘]
		// Example: //input[@id=‘user-message’]
		
		// CODE
		
	 /*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("mens shirts");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	*/
		
  // 2. Contains
		/*
		 * It is very handy XPath Selenium locator and sometimes it saves the life of a test automation engineer. 
		 * When an attribute of an element is dynamic, then you can use contains() for the constant part of the web element but also you can use contains() in any condition when you need.
		 */
		
		//Syntax: //tag[contains(@attribute, ‘value‘)]

        //Example: //input[contains(@id, ‘er-messa’)]


		
	    /*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("mens shirts");
			driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).click();
		*/	
		
  // 3. Starts-with
		
		/*
		 * This method checks the starting text of an attribute. 
		 * It is very handy to use when the attribute value changes dynamically but also you can use this method for non-changing attribute values.
		 */
		
		//Syntax: //tag[starts-with(@attribute, ‘value‘)]
		//Example: //input[starts-with(@id, ‘user’)]
             
		/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//input[starts-with(@id,'search_query_top')]")).sendKeys("mens shirts");
			driver.findElement(By.xpath("//button[starts-with(@name,'submit_search')]")).click();
		*/	
			
  //4. Chained Declarations
			
		//We can chain multiple relative XPath declarations with “//” double slash to find an element location as shown below.

		//Example: //div[@class=’form-group’]//input[@id=’user-message’]
			

		/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("mens shirts");
			driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		*/	
		 
   //5. Operator “or”
			
			//In this method, we use two interrogation conditions such as A and B and return a result-set as shown below:

			/*	 A		 B		Result
				False	False	No Element
				True	False	Returns A
				False	True	Returns B
				True	True	Returns Both
			*/	
			// Note: “or” is case-sensitive, you should not use capital “OR”.

			//	Syntax: //tag[XPath Statement-1 or XPath Statement-2]
			
		/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("mens shirts");
			//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("mens shirts");
			driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
		*/	
			
    //6. Operator “and”
			
			//In this method, we use two interrogation conditions such as A and B and return a result-set as shown below:

			/*	 A		 B		 Result
				False	False	No Element
				True	False	No Element
				False	True	No Element
				True	True	Returns Both
			*/	
			
			// Note: “and” is case-sensitive, you should not use capital “AND”.


			
			/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("mens shirts");
			driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
			*/
			
	// 7. Text
			
			//We can find an element with its exact text.

			//Syntax: //tag[text()=’text value‘]

			//Example: .//label[text()=’Enter message’]
			
			/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//a[text()='Women']")).click();
		   */	
		
	 // 8. Ancestor
			//We can achieve the same functionality with the help of a function 'ancestor' as well.
			//Now suppose we need to Search All elements in 'Popular course' section with the help of ancestor of the anchor whose text is 'SELENIUM'
			//It finds the element before the ancestor statement and set it as a top node and then starts to find the elements in that node.
			//In below example,
			
			//1- First, it finds the class which id is “container-fluid”

			//2- Then, starts to find div elements in that node.

			//Example: //*[@class=’container-fluid’]//ancestor::div
			
			/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/guru99home/");
			//List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
			List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']"));
			
	        //Print all the which are sibling of the element named as 'SELENIUM' in 'Popular course'

	        for (WebElement webElement : dateBox) {
	            System.out.println(webElement.getText());
	        }
		    */ 
	        
	  // 9. Following
	        
	        //Starts to locate elements after the given parent node. It finds the element before the following statement and set as the top node and then starts to find all elements after that node. In below example,

	        //1- First, it finds the form which id is “gettotal”

	        //2- Then, starts to find all input elements after that node.

	        //Example: .//form[@id=’gettotal’]//following::input 
	        
	       /* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//div[@class='header_user_info']//a[@class='login']")).click();
			
			WebElement element=	driver.findElement(By.xpath("//form[@id='login_form']//following::input[1]"));
			element.sendKeys("deshan");
			*/
			
	// 10. Child
			
			//Selects all children elements of the current node.
			//Example: //nav[@class=’fusion-main-menu’]//ul[@id=’menu-main’]/child::li
		
		/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.guru99.com/");
		    List<WebElement> element=driver.findElements(By.xpath("//*[@id='java_technologies']/child::li"));
		    for(WebElement webElement:element)
		   {
			System.out.println(webElement.getText());
		   }
	   */	
		
	// 11. Following-sibling
		
		// Select the following siblings of the context node.
		
		
			
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("guru");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("guru@123");
		driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input")).click();
			*/
		
    // 12. Preceding
		
		// Select all nodes that come before the current node.
		 
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@type='submit']//preceding::input[1]")).sendKeys("abcd");
		*/
	// 13. Descendant
		
		// Selects the descendants of the current node
		//it identifies all the element descendants to current element ( 'Main body surround' frame element) which means down under the node (child node , grandchild node, etc.).
		//
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		List<WebElement> element=driver.findElements(By.xpath("//*[@id='g-utility']//descendant::a"));
		
		for(WebElement webElement: element)
		{
			System.out.println(webElement.getText());
		}
		*/
		
	// 14. Parent
		
		//Selects the parent of the current node
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id='searchbox']/button//parent::form"));
	*/	
		
	// 15. Locate an Element inside Array of Elements
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//div[@class='shopping_cart']//b[contains(text(),'Cart')]")).click();
			
	}

}
