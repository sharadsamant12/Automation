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
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		Thread.sleep(50000);
		driver.get("http://webapp-stage.dayre.me/auth/login");
		//driver.wait(50000);
		Thread.sleep(50000);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		// Font size
		String fsize = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("font-size");
		//String fsize = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]")).getText();
		System.out.println("Font size: " +fsize);
		
		
		
		// Font Colour
		//String color = driver.findElement(By.xpath("Welcome home")).getCssValue("color");
		String color = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("color");
		System.out.println("Color: " +color);
						
		
		// Font Background Color
		
		String bColor = driver.findElement(By.xpath("//h1[contains(text(),'Welcome home')]")).getCssValue("Background-Color");
		System.out.println("Background Color: " +bColor);
						//h1[contains(text(),'Welcome home')]
		
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
