package SeleniumPractice.Maven1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

	public  static  Properties prop;
	public  static WebDriver driver;
	
	public BasePage() {
		
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Maven1\\src\\main\\java\\SeleniumPractice\\Maven1\\Config.properties");
				prop.load(ip);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();	
		
	}
	
	@AfterMethod
	public void Terminate() {
		
		driver.close();
	}
	
	public void robot() {
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
