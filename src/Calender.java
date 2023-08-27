import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@readonly='readonly']")).sendKeys(Keys.ENTER);

		// driver.findElement(By.cssSelector("span[class='cur-month']")).getText().contains("November");
		while (!driver.findElement(By.cssSelector("span[class='cur-month']")).getText().contains("November")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month']")).click();
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("span[class*='flatpickr-day']"));

		int count = driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).size();
		System.out.println(count);
		Thread.sleep(2000);

		for (int i = 0; i < count; i++) {

			String days = driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).getText();
			System.out.println(days);
			Thread.sleep(100);
			if (days.equalsIgnoreCase("28")) {
				driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).sendKeys(Keys.ENTER);
				break;
			}
		}

	}

}
