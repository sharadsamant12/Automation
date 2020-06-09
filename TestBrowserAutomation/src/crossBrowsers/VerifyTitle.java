package crossBrowsers;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class VerifyTitle {
	
	WebDriver driver;
	
	
	@Test
	
	@Parameters("browser")
	public void verifypageTitle(String browserName) throws Exception {
		
		
		
		if(browserName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.Firefox.drive ", "D:\\eclipse\\New folder\\geckodriver.exe");
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
		  
		  
		 
		//Thread.sleep(50000);
		  //driver.get("https://webuser:w3bus3r@stage2.dayre.me/auth/login");
		driver.get("http://webuser:w3bus3r@webapp-stage.dayre.me/auth/login");
				
		driver.get("http://webapp-stage.dayre.me/auth/login");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
				
		
		
		  //Font size  
		  //String expected1 = "51px";
		  String fsize = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-size"); 
		  System.out.println("Font size: " +fsize);
		  
		  //Font Type
		  String fontfamily = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-family");
		  System.out.println("Font size: " +fontfamily);
		
		
	
		 
		 // Font Colour compare for "Welcome home"  
		  
		 String expected = "#333c42";
		 String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("color");
		 //String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("Background-Color");
		 //System.out.println("Background Color: " +bColor);
		 String hexColor = Color.fromString(bColor).asHex();
		 System.out.println("Welcome Home text colour is: " + hexColor);
		 String actual = hexColor;
		 Assert.assertEquals(actual, expected);
		 
		
		
		//Login and Password
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
									
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("43214321");
		
		WebDriverWait wait = new WebDriverWait(driver,30);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")));
		element.sendKeys("43214321");	
		
		
		//driver.findElement(By.xpath("//input[@name='login_p']")).sendKeys("43214321");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		//Add Test Post
		/*
		 * driver.findElement(By.xpath(
		 * "//body/div[@id='__next']/section/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"
		 * )).click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		 * driver.findElement(By.
		 * xpath("//textarea[@placeholder=\"What's on your mind, sharad?\"]")).
		 * sendKeys("The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary.\r\n"
		 * + "\r\n" +
		 * "The languages only differ in their grammar, their pronunciation and their most common words. Everyone realizes why a new common language would be desirable: one could refuse to pay expensive translators.\r\n"
		 * + "\r\n" +
		 * "To achieve this, it would be necessary to have uniform grammar, pronunciation and more common words. If several languages coalesce, the grammar of the resulting language is more simple and regular than that of the individual languages.\r\n"
		 * + "\r\n" +
		 * "The new common language will be more simple and regular than the existing European languages. It will be as simple as Occidental; in fact, it will be Occidental.\r\n"
		 * + "\r\n" +
		 * "To an English person, it will seem like simplified English, as a skeptical Cambridge friend of mine told me what Occidental is. The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ in their grammar, their pronunciation and their most common words. Everyone realizes why a new common language would be desirable: one could refuse to pay expensive translators. :) ;)"
		 * ); driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();
		 * driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//button[contains(text(),'Refresh')]")).click();
		 * driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		 */
		
		
		//Add comment on Feed page
				
		WebElement Textarea =driver.findElement(By.tagName("textarea"));
		
		// Use Helper.java for HighLight Element
		Helper.highLightElement(driver, Textarea);
		
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@placeholder='Add a comment']")).sendKeys("Hi this is may first Comment Added");
		Helper.highLightElement(driver, Textarea);
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='input-group active']//span[contains(text(),'Send')]")).click();
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		
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
	
		
		
		
		// Window handle
		String parent = driver.getWindowHandle();
		
		//select the first post
				driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//h5[1]")).click();
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);  
				
			// Open Different Windows tab and comeback on Parent window.	
				Set<String> allWindows=driver.getWindowHandles();
				int count=allWindows.size();
				System.out.println("Total No. of Windows" + count);
				for(String child:allWindows)
					{
						if(!parent.equalsIgnoreCase(child))
						{
							driver.switchTo().window(child);
							String TestData= driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[2]//p[1]//span[2]")).getText();
							Thread.sleep(3000);
							System.out.println("Added data is Text is :" + TestData);
							//driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]")).sendKeys(Keys.CONTROL + "a");
							//Thread.sleep(3000);
							driver.close();
						}
					}
				
				driver.switchTo().window(parent);
				

		
		
		
		

		//Page Scrolling
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				
			//Scroll page in between
				//jse.executeScript("window.scrollTo(0, 1500)");
				//Thread.sleep(3000);
				
				
			//Page scroll till the specific Post				
				
				WebElement Scrolldown = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//h5[1]"));
				jse.executeScript("arguments[0].scrollIntoView(true);", Scrolldown);
				Thread.sleep(5000);
				
				
				WebElement NewPost = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/h5[1]"));
				jse.executeScript("arguments[0].scrollIntoView(true);", NewPost);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[8]//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//textarea[1]")).sendKeys("Hi, New Comment Added on another post");
				////Helper.highLightElement(driver, Textarea);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[8]//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]")).click();
				
			
		//Open Specific Post
				driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]//img[1]")).click();
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				Thread.sleep(3000);
				
				
				
				Set<String> allWindows1=driver.getWindowHandles();
		
				for(String child:allWindows1)
					{
						if(!parent.equalsIgnoreCase(child))
						{
							driver.switchTo().window(child);
														
							Actions act = new Actions(driver);
							
							act.moveToElement(driver.findElement(By.xpath("//div[@id='__next']//section//div//div//div//div//div//div//div//div//section//div//div//div//div//div//div//div//p"))).perform();
							
							Thread.sleep(1500);
							new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("section.page-section.clearfix div.block-section.welcome-section.clearfix div.container div.row div.col-12 div.mid_content div.postdetail div.row.no-gutters div.col-md-4 section.post-container-commentbox div.day-right-content div:nth-child(2) div.profile-comment-list div.commentlist-wrapper:nth-child(1) > div.icon-delete"))).click();
							Thread.sleep(1000);							
							driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
							Thread.sleep(3000);
							
							
							driver.close();
						}
					}
				
				driver.switchTo().window(parent);
				
				
		//Left Menu Item click and open post like or unlike the post
				
				driver.findElement(By.xpath("//section//li[6]//a[1]")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
				Thread.sleep(1500);
				
				Set<String> allWindows2=driver.getWindowHandles();
				for(String child:allWindows2)
				{
					if(!parent.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
													
						//Actions act = new Actions(driver);
						
						//act.moveToElement(driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[1]/div[1]/div[1]/div[1]/div[1]"))).click();
						driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
						Thread.sleep(2500);
												
						driver.close();
					}
				}
			
			driver.switchTo().window(parent);
			driver.navigate().refresh();
			Thread.sleep(3500);
				
				
				
				
		
		//Top Menu Item
				driver.findElement(By.xpath("//a[@id='navbardrop']")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
				Thread.sleep(3500);
				driver.findElement(By.xpath("//a[@id='navbardrop']")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	
				
		
		
		
		//System.out.println(driver.getTitle());
		driver.quit();
	}

}
