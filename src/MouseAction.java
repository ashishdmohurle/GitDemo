import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
		.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

	}

}
