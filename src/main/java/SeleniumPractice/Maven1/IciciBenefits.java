package SeleniumPractice.Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IciciBenefits extends IciciBasic {
	public WebElement text3()
	{
		return d.findElement(By.xpath("//*[@id='spnMaturityValue']"));
	}
	
	public WebElement text4()
	{
		return d.findElement(By.xpath("//*[@id='spnAIAmount']"));
	}
	
	public WebElement date() {
		return d.findElement(By.xpath("//div[@class='wrapper']/h3/span[@id='dateOfFD']"));
	}
	
	public void text3To()
	{
		System.out.println("Maturity Value : "+ (text3().getText())    );
	}
	
	public void text4To()
	{
		System.out.println("Aggregate Interest Amount : "+ (text4().getText()) );
	}
	
	public void dateTo()
	{
		System.out.println("The date of fixed deposit is : " + (date().getText())  );
	}
}
