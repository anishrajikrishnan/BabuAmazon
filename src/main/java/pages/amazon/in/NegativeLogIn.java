package pages.amazon.in;

import org.openqa.selenium.WebElement;

import main_POM.MainRun;

public class NegativeLogIn extends MainRun{

	public void purchase() {

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]");
		boolean FinalStatus = error.isDisplayed();
		System.out.println("Error Displayed Status:"+ FinalStatus);
		
		return;

	}
}