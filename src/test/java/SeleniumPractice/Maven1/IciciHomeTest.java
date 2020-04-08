package SeleniumPractice.Maven1;

import org.testng.annotations.Test;

import SeleniumPractice.Maven1.IciciBasic;
import SeleniumPractice.Maven1.IciciHome;
public class IciciHomeTest extends IciciBasic {
	IciciHome home;
	public IciciHomeTest()
	{
		super();
		home=new IciciHome();
	}
	
//	@Test(priority=0,groups= {"regression"})
//	public void first() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.firstRadioTo();
//	}
//	
//	@Test(priority=1,groups= {"regression","smoke"})
//	public void second() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.selectionTo();
//	}
//	@Test(priority=2)
//	public void third_one() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.clear1();
//	}
//	@Test(priority=2,groups= {"smoke"})
//	public void third() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.amountTo("20,000");
//	}
//	
//	@Test(priority=3,groups= {"regression"})
//	public void fourth() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.secondRadioTo();
//	}
//	@Test(priority=4)
//	public void fifth_one() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.clear2();
//	}
//	
//	@Test(priority=4,groups= {"regression","smoke"})
//	public void fifth() /*throws InterruptedException*/
//	{
//		//Thread.sleep(3000);
//		home.daysTo("500");
//	}
	
	@Test
	public void methods()
	{
		home.firstRadioTo();
		home.selectionTo();
		home.clear1();
		home.amountTo("20,000");
		home.secondRadioTo();
		home.clear2();
		home.daysTo("500");
	}
}
