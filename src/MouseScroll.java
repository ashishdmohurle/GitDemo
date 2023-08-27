import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a = new Actions(driver);
		
		a.scrollToElement(driver.findElement(By.xpath("//div[@class='totalAmount']"))).build().perform();
		
		List<WebElement> amount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int expectedSum=0;
		for (int i=0; i<amount.size(); i++) {
			
			//System.out.println(amount.get(i).getText());
			
			 expectedSum = expectedSum + Integer.parseInt(amount.get(i).getText());
			 	
		}
		 System.out.println(expectedSum);
		 
		 String total = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1];
		 int actualSum = Integer.parseInt(total.trim());
		 
		 System.out.println(actualSum);
		 Assert.assertEquals(actualSum, expectedSum);
	}
	

}
