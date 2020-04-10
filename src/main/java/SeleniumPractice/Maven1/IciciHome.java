package SeleniumPractice.Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IciciHome extends IciciBasic {
	
	//Elements
	public WebElement firstRadio()
	{
		return d.findElement(By.xpath("//input[@name='radioCust' and @value='3']"));
	}
	
	public WebElement selection()
	{
	    return d.findElement(By.xpath("//select[@id='ddlTypeOfFixedDeposit']"));
	}
	
	public WebElement amount()
	{
		return d.findElement(By.xpath("//input[@id='loanAmount']"));
	}
	
	public WebElement secondRadio()
	{
		return d.findElement(By.xpath("//input[@id='idDays']"));
	}
	
	public WebElement days()
	{
		return d.findElement(By.xpath("//input[@id='tenureDay']"));
	}
	
	//Test case 2
	public WebElement text1()
	{
		return d.findElement(By.xpath("//*[@id='spnRateOfInterest']"));
	}
	
	public WebElement text2()
	{
		return d.findElement(By.xpath("//*[@id='spnMaturityDate']"));
	}
	
	
	
	
	//actions
	public void firstRadioTo()
	{
		
		firstRadio().click();
	}
	
	public void selectionTo()
	{
		Select s=new Select(selection());
		s.selectByIndex(2);
	}
	
	public void clear1()
	{
		amount().clear();
	}
	
	public void amountTo(String str)
	{
		amount().sendKeys(str);
		robot();
	}
	
	public void secondRadioTo()
	{
		secondRadio().click();
	}
	
	public void clear2()
	{
		days().clear();
	}
	
	public void daysTo(String day)
	{
		days().sendKeys(day);
	}
	
	//Test case 2
	public void text1To()
	{
		System.out.println("Rate of Interest (%) : "+ (text1().getText())    );
	}
	
	public void text2To()
	{
		System.out.println("Maturity Date : "+ (text2().getText())    );
	}
	
	
	
	
}
