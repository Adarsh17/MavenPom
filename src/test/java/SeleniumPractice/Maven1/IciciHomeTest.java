package SeleniumPractice.Maven1;

import org.testng.annotations.Test;
import SeleniumPractice.Maven1.IciciBasic;
import SeleniumPractice.Maven1.IciciHome;
import SeleniumPractice.Maven1.IciciBenefits;
public class IciciHomeTest extends IciciBasic {
	IciciHome home;
	public IciciHomeTest()
	{
		super();
		home=new IciciHome();
	}
	
	
	@Test(priority=1,groups= {"regression"})
	public void method()
	{
		home.firstRadioTo();
		home.selectionTo();
		home.clear1();
		home.amountTo("20,000");
		
		
	}
	
	@Test(priority=2,groups= {"regression"})
	public void method2()
	{
		home.secondRadioTo();
		home.clear2();
		home.daysTo("500");	
	}
	
	
	@Test(priority=3,groups= {"smoke"})
	public void method3()
	{
		home.text1To();
		home.text2To();
	}
}
