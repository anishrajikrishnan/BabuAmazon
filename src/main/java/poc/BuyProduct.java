package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("twotabsearchtextbox").sendKeys("samsung Galaxy M30",Keys.ENTER);
		WebElement Price = driver.findElementByXPath("//span[@class='a-price-whole']");
		System.out.println("1st mobile price is:"+ Price.getText());
		driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]").click();

		// need to get clarity

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWin= new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWin.get(1));

		WebElement DeliveryDate = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]");
		System.out.println("Delivery Date:"+DeliveryDate.getText());


		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		WebElement status = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']");
		boolean displayed = status.isDisplayed();
		System.out.println("Product Added To Cart:"+ displayed);
		
		driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]");
		boolean FinalStatus = error.isDisplayed();
		System.out.println("Error Displayed Status:"+ FinalStatus);

		driver.quit();
	}
}