package SeleniumPractice.Maven1;



import org.testng.annotations.Test;

import SeleniumPractice.Maven1.BasePage;
import SeleniumPractice.Maven1.HomePage;
import SeleniumPractice.Maven1.SearchPage;

public class HomePageTest extends BasePage {

	HomePage homePage; 
	SearchPage resultPage;
	
	
	public HomePageTest() {
		super();
		homePage = new HomePage();
		resultPage = new SearchPage();		
	}
	
	
	
	@Test
	public void firstResultTest1() throws InterruptedException {
		
		Thread.sleep(10000);
		homePage.oneTripTo();
		Thread.sleep(2000);		
		homePage.fromLocation("Coimbatore (CJB)");
		Thread.sleep(2000);
		homePage.toLocation("Chennai (MAA)");
		Thread.sleep(2000);
		homePage.departureDate();
		Thread.sleep(2000);
		homePage.search11();
		Thread.sleep(3000);
		
		String Final = resultPage.firstFlight();
		System.out.println(Final);
		
	}
	
	
	
	
}
