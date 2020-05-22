package crossBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		Thread.sleep(50000);
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
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("43214321");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
				
				
		//Add comment
		driver.findElement(By.xpath("//textarea[@placeholder='Add a comment']")).sendKeys("Hi this is may firstComment Added");
		driver.findElement(By.xpath("//div[@class='input-group active']//span[contains(text(),'Send')]")).click();
		
		
		//select the first post
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();

		
		
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}
