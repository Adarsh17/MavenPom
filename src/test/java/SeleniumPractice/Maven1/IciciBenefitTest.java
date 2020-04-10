package SeleniumPractice.Maven1;

import org.testng.annotations.Test;

import SeleniumPractice.Maven1.IciciBasic;
import SeleniumPractice.Maven1.IciciHome;
import SeleniumPractice.Maven1.IciciBenefits;
public class IciciBenefitTest extends IciciBasic {
	IciciBenefits ben;
	IciciHome home;
	public IciciBenefitTest()
	{
		super();
		home=new IciciHome();
		ben=new IciciBenefits();
	}
	
	
	@Test(priority=4,groups= {"smoke"})
	public void displayText()
	{
		ben.text3To();
		ben.text4To();
	}
	
	
	@Test(priority=5,groups= {"regression"})
	public void displaydofd()
	{
		ben.dateTo();
	}
}
