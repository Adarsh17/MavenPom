package SeleniumPractice.Maven1;


import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
public class MainPage {
		public static WebDriver d;
		public static Properties prop;
		
		
		public MainPage() {
			
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
		public void initialize()
		{
			String browserName = prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				d = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				d = new FirefoxDriver();
			}
			
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
		}
		
		@BeforeMethod
		public void setup() {
			
			initialize();	
			
		}
		
		@AfterMethod
		public void Terminate() {
			
			d.close();
		}
		
		public void robo()
		{
			try
			{
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
			}
			catch(AWTException e)
			{
				e.printStackTrace();
			}
		}
}
