package crossBrowsers;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {
	
public static WebDriver driver;
	
	@BeforeMethod
	
	@Parameters("browser")
	public void setupApplication(String browserName) throws Exception
	{
		Reporter.log("======= Browser Session Started ======", true);
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.drive", "D://eclipse//New folder//geckodriver.exe");
			driver =new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D://eclipse//New folder//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\eclipse\\New folder\\msedgedriver.exe");
			driver=new InternetExplorerDriver();
			//driver=new edge();
		}
		
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		  
		  
		 
		//Thread.sleep(50000);
		  driver.get("https://webuser:w3bus3r@stage2.dayre.me/auth/login");
		  
		  driver.get("http://stage2.dayre.me/auth/login");
		  //driver.get("http://webuser:w3bus3r@webapp-stage.dayre.me/auth/login");
		  //driver.get("http://webapp-stage.dayre.me/auth/login");
		//Thread.sleep(50000);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
				
	}
	
	

	
	

	@AfterMethod
	public void closeApplication() 
	{
		driver.quit();
		Reporter.log("======= Browser Session End ======", true);
	}
}
