package SeleniumPractice.Maven1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.BeforeMethod;

public class IciciBasic {
	public static WebDriver d;
	public static Properties p;
	
	public IciciBasic()
	{
		try
		{
			p=new Properties();
			FileInputStream input=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Maven1\\src\\main\\java\\SeleniumPractice\\Maven1\\Config.properties");
			p.load(input);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialize()
	{
		String br=p.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			d=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			d=new FirefoxDriver();
		}
		
		d.manage().window().maximize();
		
		d.manage().deleteAllCookies();
		d.get(p.getProperty("url"));
	}
	
	
	
	@BeforeMethod
	public void open()
	{
		initialize();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.switchTo().frame("paymframe");
	}
	
	
//	@AfterMethod/*(alwaysRun=true)*/
//	public void close()
//	{
//		d.close();
//	}
	
	
	public void robot()
	{
		try
		{
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_ENTER);
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
	}
}
