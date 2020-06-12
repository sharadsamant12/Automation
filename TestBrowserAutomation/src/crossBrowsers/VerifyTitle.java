package crossBrowsers;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


import org.testng.annotations.Test;




public class VerifyTitle extends BaseClass {
	

	
	
	@Test(description="THIS IS FOR CREATE POST")
	
	
	public void verifypageTitle1() throws InterruptedException  
	{	
	  //Font size  
		  String expected1 = "51px";
		  String fsize = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-size"); 
		  System.out.println("Welcome Home text Font size: " +fsize);
		  String actual1 = fsize;
		  Assert.assertEquals(actual1, expected1);
		  
		  //Font Type
		  String fontfamily = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-family");
		  System.out.println("Welcome Home text Font Type: " +fontfamily);
		
	// Font Colour compare for "Welcome home"  
		  
		 String expected = "#333c42";
		 String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("color");
		 //String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("Background-Color");
		 //System.out.println("Background Color: " +bColor);
		 String hexColor = Color.fromString(bColor).asHex();
		 System.out.println("Welcome Home text colour is: " + hexColor);
		 String actual = hexColor;
		 Assert.assertEquals(actual, expected);
		 
		
		
		//LOGIN AND PASSWORD
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
									
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30000);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")));
		element.sendKeys("43214321");	
		
				
		WebDriverWait wait1 = new WebDriverWait(driver,300);
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")));
		element1.click();
		
		Reporter.log("======= Check on Login button ======", true);
		
		
		
		//ADD TEXT POST ON FEED
		Reporter.log("======= Check Adding comment on the post ======", true);
		
		  driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		  
		  driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind, sharad?\"]")).sendKeys("The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ in their grammar, their pronunciation and their most common words. Everyone realizes why a new common language would be desirable: one could refuse to pay expensive translators.\r\n" + 
		  		"To achieve this, it would be necessary to have uniform grammar, pronunciation and more common words. If several languages coalesce, the grammar of the resulting language is more simple and regular than that of the individual languages. The new common language will be more simple and regular than the existing European languages. It will be as simple as Occidental; in fact, it will be Occidental.\r\n" + 
		  		"To an English person, it will seem like simplified English, as a skeptical Cambridge friend of mine told me what Occidental is. @vinayak, @Ashish The European languages are members of the same family. Their separate existence is a myth. For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ in their grammar, their pronunciation and their most common words.\r\n" + 
		  		"Everyone realizes why a new common language would be desirable: one could refuse to pay expensive translators. To achieve this, it would be necessary to have uniform grammar, pronunciation and more common words. If several languages coalesce, the grammar of the resulting language is more simple and regular than that of the individual languages. The new common language will be more simple and regular than the existing European languages. It will be as simple as Occidental; in fact, it will be Occidental. To an English person, it will seem like simplified English, as a skeptical Cambridge friend of mine told me what Occidental is. The European languages are members of the same family. :) P)"); 
		  driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//button[contains(text(),'Post')]")).click();
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//button[contains(text(),'Refresh')]")).click();
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		  
		  Reporter.log("======= Checked Added comment on the post ======", true);
		
	}
	
	
	@Test(description="Add Comment on the post form Feed page")
	//public void verifypageTitle1() throws InterruptedException  
	
	public void verifypageTitle2() throws InterruptedException
		  
	{
  
		//Add comment on Feed page
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30000);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")));
		element.sendKeys("43214321");	
				
		WebDriverWait wait1 = new WebDriverWait(driver,300);
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")));
		element1.click();
		
		

				
		WebElement Textarea =driver.findElement(By.tagName("textarea"));
		
		// Use Helper.java for HighLight Element
		Helper.highLightElement(driver, Textarea);
		
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@placeholder='Add a comment']")).sendKeys("Hi this is my first Comment Added");
		Helper.highLightElement(driver, Textarea);
		driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group active']//span[contains(text(),'Send')]")).click();
		driver.manage().timeouts().implicitlyWait(3500, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//Refresh the page
				driver.findElement(By.xpath("//body/div[@id='__next']/header/div/nav/div/img[1]")).click();
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);	
				Thread.sleep(500);
				
		//Compare the added content
				/*
				 * if(driver.getPageSource().contains("Hi this is may first Comment Added")) {
				 * System.out.println("Text is present on the page");
				 * Helper.highLightElement(driver, Textarea);
				 * 
				 * }else { System.out.println("Text is present on the page"); }
				 */
	
		// Window handle
		String parent = driver.getWindowHandle();
		
		//select the first post
				driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//h5[1]")).click();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);  
				Thread.sleep(50000);
				
			// Open Different Windows tab and come back on Parent window.	
				Set<String> allWindows=driver.getWindowHandles();
				int count=allWindows.size();
				System.out.println("Total No. of Windows" + count);
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				Thread.sleep(500);
				
				////WAIT
				
		 	for(String child:allWindows)
					{
						if(!parent.equalsIgnoreCase(child))
						{
							driver.switchTo().window(child);
							Thread.sleep(5000);
							String TestData= driver.findElement(By.xpath("//body//div[@id='__next']//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[2]//p[1]//span[2]")).getText();
							Thread.sleep(5000);
							//driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS); 
							System.out.println("Added data is Text is :" + TestData);
							//driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]")).sendKeys(Keys.CONTROL + "a");
							Thread.sleep(5000);
							driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); 
							driver.close();
						}
					}
				
				
				driver.switchTo().window(parent);
				Thread.sleep(700);

				Reporter.log("======= View added comment in second window ======", true);
		
		
	}
	
	
	
	@Test(description="PAGE SCROLLING DOWN AND ADD COMMENT ON THE PAGE")
	//public void verifypageTitle1() throws InterruptedException  
	
	public void verifypageTitle3() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30000);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")));
		element.sendKeys("43214321");	
				
		WebDriverWait wait1 = new WebDriverWait(driver,300);
		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")));
		element1.click();
		

		//Page Scrolling
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				
			//Scroll page in between
				//jse.executeScript("window.scrollTo(0, 1500)");
				Thread.sleep(3000);
				
				
			//Page scroll till the specific Post				
				
				//WebElement Scrolldown = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//h5[1]"));
				WebElement Scrolldown = driver.findElement(By.xpath("//div[7]//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//textarea[1]"));
				jse.executeScript("arguments[0].scrollIntoView(true);", Scrolldown);
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				Thread.sleep(1000);
				
				
				//WebElement NewPost = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/h5[1]"));
				WebElement NewPost = driver.findElement(By.xpath("html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]"));
		
				jse.executeScript("arguments[0].scrollIntoView(true);", NewPost);
				Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
				//driver.findElement(By.xpath("//div[8]//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//textarea[1]")).sendKeys("Hi, New Comment Added on another post");
				
				/////////////////////////////////////////////////////////////////////////
				
				WebDriverWait wait2 = new WebDriverWait(driver,20000);
				
				///////////driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]")).sendKeys("Hi, Add comment by system. @vinayak check this comment.:)ha ha ha");
				//Helper.highLightElement(driver, Textarea);
				WebElement Textarea =driver.findElement(By.tagName("textarea"));
				
				// Use Helper.java for HighLight Element
				Helper.highLightElement(driver, Textarea);
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]")));
				element2.sendKeys("Hi, Add comment by system. @vinayak check this comment.:)ha ha ha");
				Thread.sleep(9000);
				
				//WebDriverWait wait3 = new WebDriverWait(driver,300);
				//driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//div[8]//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]")).click();
				Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
				//Thread.sleep(5000);
				/*
				 * driver.findElement(By.xpath(
				 * "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"
				 * )).click(); Thread.sleep(5000);
				 * 
				 * WebElement element3 =
				 * wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				 * "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"
				 * ))); element3.click();
				 * 
				 * Thread.sleep(5000);
				 * 
				 * driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
				 */
								
				//////////////////////////////////////////////////////////////////////////////////
				
				Reporter.log("======= Check Add comment on Specific post ======", true);
			
		//Open Specific Post
				String parent = driver.getWindowHandle();
				//STAGE Implicitly wait
				Reporter.log("======= Check to open Specific post ======", true);
				
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
					
				Thread.sleep(8000);
				//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				
				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				
				//STAGE
				//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();
				//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
				
				
				
				//STAGE2
				//WebDriverWait wait2 = new WebDriverWait(driver,3000);
				//WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/img[1]")));
				//element2.click();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				Thread.sleep(10000);
				
				Set<String> allWindows1=driver.getWindowHandles();
				Reporter.log("======= Check to go on new tab for delete the window ======", true);
		
				for(String child:allWindows1)
					{
						if(!parent.equalsIgnoreCase(child))
						{
							driver.switchTo().window(child);
														
							Actions act = new Actions(driver);
							
							//act.moveToElement(driver.findElement(By.xpath("//div[@id='__next']//section//div//div//div//div//div//div//div//div//section//div//div//div//div//div//div//div//p"))).perform();
							act.moveToElement(driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[2]/div[1]/div[1]"))).perform();
						
							Thread.sleep(8000);
							new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(By.cssSelector("section.page-section.clearfix div.block-section.welcome-section.clearfix div.container div.row div.col-12 div.mid_content div.postdetail div.row.no-gutters div.col-md-4 section.post-container-commentbox div.day-right-content div:nth-child(2) div.profile-comment-list div.commentlist-wrapper:nth-child(1) > div.icon-delete"))).click();
							
							Thread.sleep(5000);
												
							driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
							Thread.sleep(10000);
											
							driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
							
							driver.close();
						}
						
						
					}
				
				driver.switchTo().window(parent);
				Thread.sleep(3000);
				Reporter.log("======= Check to Delete specific comment ======", true);
				
		//Left Menu Item click and open post like or unlike the post
				
				driver.findElement(By.xpath("//section//li[6]//a[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
				Thread.sleep(3500);
				
				Set<String> allWindows2=driver.getWindowHandles();
				for(String child:allWindows2)
				{
					if(!parent.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
													
						Actions act = new Actions(driver);
						
						act.moveToElement(driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[1]/div[1]/div[1]/div[1]/div[1]"))).click();
						driver.findElement(By.xpath("//body/div[@id='__next']/section/div/div/div/div/div/div/div/div/section/div/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
						Thread.sleep(4500);
												
						driver.close();
					}
				}
			
			driver.switchTo().window(parent);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			Thread.sleep(3500);
		
			Reporter.log("======= Check to LIKE AND UNLIKE ON THE POST ======", true);
				
	}


	
		
	
	  @Test(description="THIS IS FOR CLICKING ON TOP RIGHT SIDE MENU AND LOGOUT")
	  
	  public void verifypageTitle4() throws InterruptedException 
	  {
	  	  
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("sharad");
		  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver,30000);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")));
			element.sendKeys("43214321");	
					
			WebDriverWait wait1 = new WebDriverWait(driver,300);
			WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")));
			element1.click();
		  
	//Top Menu Item FOR LOGOUT
		  
			Thread.sleep(2500);  
	  driver.findElement(By.xpath("//a[@id='navbardrop']")).click();
	  driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
	  driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[@id='navbardrop']")).click();
	  driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  }
	 
	 
}
