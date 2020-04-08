package SeleniumPractice.Maven1;


import org.testng.annotations.Test;

import SeleniumPractice.Maven1.BasePage;
import SeleniumPractice.Maven1.ExcelPage;
import SeleniumPractice.Maven1.HomePage;
import SeleniumPractice.Maven1.SearchPage;

public class SecondHomePageTest extends BasePage {

	HomePage homePage; 
	SearchPage resultPage;
	//ExcelPage excelPage;
	
	public SecondHomePageTest() {
		homePage = new HomePage();
		resultPage = new SearchPage();
		//excelPage = new ExcelPage();
	}
	
	@Test
	public void firstResultTest2() throws InterruptedException {
		
		//System.out.println("Location Data from Excel : "+excelPage.ExcelData());
		
		
		
		Thread.sleep(10000);
		homePage.oneTripTo();
		Thread.sleep(2000);		
		homePage.fromLocation("Chennai (MAA)");
		Thread.sleep(2000);
		homePage.toLocation("Coimbatore (CJB)");
		Thread.sleep(2000);
		homePage.departureDate();
		Thread.sleep(2000);
		homePage.search22();
		Thread.sleep(3000);
		
		String Final = resultPage.firstFlight();
		System.out.println(Final);
		
	}
	
}
