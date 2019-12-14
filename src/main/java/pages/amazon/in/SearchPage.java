package pages.amazon.in;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import main_POM.MainRun;

public class SearchPage extends MainRun {

	public SearchResultPage search() {

		driver.findElementById("twotabsearchtextbox").sendKeys("samsung Galaxy M30",Keys.ENTER);
		
		return new SearchResultPage();
		
	}
}
