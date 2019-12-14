package pages.amazon.in;

import org.openqa.selenium.WebElement;

import main_POM.MainRun;

public class ShoppingConfirmationPage extends MainRun{

	public NegativeLogIn confirm() {

		WebElement status = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']");
		boolean displayed = status.isDisplayed();
		System.out.println("Product Added To Cart:"+ displayed);

		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		
		return new NegativeLogIn();
	}
}
