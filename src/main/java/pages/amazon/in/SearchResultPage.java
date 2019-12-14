package pages.amazon.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import main_POM.MainRun;

public class SearchResultPage extends MainRun {

	public ProductViewPage searchresult() {

		WebElement Price = driver.findElementByXPath("//span[@class='a-price-whole']");
		System.out.println("1st mobile price is:"+ Price.getText());
		driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]").click();


		//Handling the window here to enter in to next TAB

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWin= new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWin.get(1));

		return new ProductViewPage();
	}
}