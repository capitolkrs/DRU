import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.HDpages.PageBase;

public class Runner {
	WebDriver driver;
	
	@BeforeTest
	
	
	
	public void setUp() throws IOException{
		
		//driver=new FirefoxDriver();
		
		
		System.out.println();
		String relativePath=new File(System.getProperty("user.dir")).getAbsolutePath(); 
		System.setProperty("webdriver.chrome.driver",relativePath + "/src/test/resources/chromedriver.exe");
		
		if(PageBase.loadProperties().getProperty("Browser").equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
			System.out.println(PageBase.loadProperties().getProperty("Browser"));
		}else{
			
			System.out.println(PageBase.loadProperties().getProperty("Browser").equalsIgnoreCase("Chrome"));
		}
		
		
		
		
		
		
	}
	
	@Test
	public void launchBrowser() throws IOException{
		
		
		
		PageBase pageBase=new PageBase(driver);
		pageBase.NavigateToHomePage();
		
	}

	@AfterTest
	public void tearDown(){
		
		driver.close();
		driver.quit();
		
	}
	
}
