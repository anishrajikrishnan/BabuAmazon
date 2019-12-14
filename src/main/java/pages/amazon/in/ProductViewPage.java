package pages.amazon.in;

import org.openqa.selenium.WebElement;

import main_POM.MainRun;

public class ProductViewPage extends MainRun {

	public ShoppingConfirmationPage product() {

		WebElement DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]");
		System.out.println("Delivery Date:"+DeliveryDate.getText());
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		
		return new ShoppingConfirmationPage();

	}
}
