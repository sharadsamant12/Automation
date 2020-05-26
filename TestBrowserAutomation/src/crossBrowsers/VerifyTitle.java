package crossBrowsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class VerifyTitle {
	
	WebDriver driver;
	
	
	@Test
	
	@Parameters("browser")
	public void verifypageTitle(String browserName) throws Exception {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			driver =new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\eclipse\\New folder\\msedgedriver.exe");
			driver=new InternetExplorerDriver();
			//driver=new edge();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.get("http://webapp-stage.dayre.me/auth/login");
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		// Font size
		String fsize = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-size");
		System.out.println("Font size: " +fsize);
		
				
		// Font Colour
		String color = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("color");
		System.out.println("Color: " +color);
						
		
		// Font Background Color
		String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("Background-Color");
		System.out.println("Background Color: " +bColor);
		
		
		
		//Login and Password
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("43214321");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		
				
		//Add comment on Feed page
				
		WebElement Textarea =driver.findElement(By.tagName("textarea"));
		
		// Use Helper.java for HighLight Element
		Helper.highLightElement(driver, Textarea);
		
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@placeholder='Add a comment']")).sendKeys("Hi this is may first Comment Added");
		Helper.highLightElement(driver, Textarea);
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='input-group active']//span[contains(text(),'Send')]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		//Refresh the page
				driver.findElement(By.xpath("//body/div[@id='__next']/header/div/nav/div/img[1]")).click();
				driver.manage().timeouts().implicitlyWait(3500, TimeUnit.SECONDS);	
		
		//Compare the added content
		
		if(driver.getPageSource().contains("Hi this is may first Comment Added"))
		{
			System.out.println("Text Presnet");
			Helper.highLightElement(driver, Textarea);
			
		}
		
		else
		{
			System.out.println("Text not Presnet");
		}
		
		
		
		
		//String achualData = driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[2]//p[1]//span[2]")).getText();
		
		/*
		 * String achualData = driver.findElement(By.
		 * cssSelector("section.page-section.clearfix div.block-section.welcome-section.clearfix div.container div.row div.col-sm-12.col-md-6:nth-child(2) div.mid_content div.mid_container div.post-content div.infinite-scroll-component__outerdiv div.infinite-scroll-component div.comment-list:nth-child(3) div.profile-comment-list div.commentlist-wrapper:nth-child(1) div.comment-lt div.commentlist-container div.post-text p:nth-child(1) > span.text-dec"
		 * )).getText(); Helper.highLightElement(driver, achualData);
		 * System.out.println("Data: " + achualData); Helper.highLightElement(driver,
		 * achualData); driver.manage().timeouts().implicitlyWait(2500,
		 * TimeUnit.SECONDS);
		 */
	   
		

		
		//System.out.println("Result for added data : " + achualData);
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		/*
		 * String expectedData = " Hi this is may first Comment Added";
		 * driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 * 
		 * if(expectedData.equalsIgnoreCase(achualData)){
		 * System.out.println("Result is Matched"); } else {
		 * System.out.println("Rsult is Not matched"); }
		 */
		
		// Window handle
		String parent = driver.getWindowHandle();
		
		//select the first post
				driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//h5[1]")).click();
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);  
				
				Set<String> allWindows=driver.getWindowHandles();
				int count=allWindows.size();
				System.out.println("Total No. of Windows" + count);
				for(String child:allWindows)
					{
						if(!parent.equalsIgnoreCase(child))
						{
							driver.switchTo().window(child);
							driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]")).getText().compareTo("Hi this is may first Comment Added");
							Thread.sleep(3000);
							driver.close();
						}
					}
				
				driver.switchTo().window(parent);
				                            		 
				//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
				//driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
				
				//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
				//Thread.sleep(5000);
				
				//driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]")).getText().compareTo("Hi this is may first Comment Added");
				
				
				//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]
		/*
		 * String TestData = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]/span[2]"
		 * )).getText(); Helper.highLightElement(driver, TestData);
		 * driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS); String
		 * expectedData = " Hi this is may first Comment Added";
		 * driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 * 
		 * if(expectedData.equals(TestData)){ System.out.println("Result is Matched");
		 * Helper.highLightElement(driver, TestData); } else {
		 * System.out.println("Result is Not matched"); }
		 */
		
		//check this
		
		 //Action act = new Action(myachualData);
		 //act.equals(driver.findElement(By.xpath("//*[content(text(),'Hi this is may first Comment Added')]")).isDisplayed();
		 

		
		
		/*
		 * try { WebElement eElement = driver.findElement(By.xpath(
		 * "//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[2]//p[1]//span[2]"
		 * )); eElement.sendKeys(""); }catch(Exception e) {
		 * System.out.println("No Element found"); }
		 */
		
		
		//driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//div[2]//p[1]//span[2]"));
		
		
		
		
		
		////body//section//section//div//div//div//div//span[2]
		
		
		
		
		//System.out.println(driver.getTitle());
		//driver.quit();
	}

}
