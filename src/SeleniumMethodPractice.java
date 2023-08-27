import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vegetableList = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// addItems(driver,vegetableList);

		SeleniumMethodPractice b = new SeleniumMethodPractice();
		b.addItems(driver, vegetableList);

	}

	public void addItems(WebDriver driver, String[] vegetableList) {
		
		int j = 0;
		List<WebElement> vegetableNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List vegetables = Arrays.asList(vegetableList);

		for (int i = 0; i < vegetableNames.size(); i++) {
			String[] product = vegetableNames.get(i).getText().split("-");
			String items = product[0].trim();

			if (vegetables.contains(items)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == vegetableList.length) {
					break;
				}
			}
		}
	}
}
