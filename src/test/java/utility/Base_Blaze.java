package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base_Blaze {
	
	public static Properties blazeprop;
	public static WebDriver driver;
	
	public Base_Blaze() {
	
	try {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\blaze\\config\\blaze.config.Properties");

		blazeprop = new Properties();
		blazeprop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void blazebrowserinit() {
		
		String blazebrowser = blazeprop.getProperty("Browser1");
		
		if (blazebrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BlazeTestData.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BlazeTestData.pageLoadwait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			}
		
		else if(blazebrowser.equalsIgnoreCase("FireFox")) {
			
			
		}
	}
		public void blazeLauchURL(String URL) {
			
			driver.get(blazeprop.getProperty("URL"));
			
		}
	}


