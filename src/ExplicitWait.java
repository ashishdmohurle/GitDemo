import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			WebDriverWait w = new WebDriverWait(driver,5);
			String[] vegetableList = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

			
		
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			// addItems(driver,vegetableList);

			SeleniumMethodPractice b = new SeleniumMethodPractice();
			b.addItems(driver, vegetableList);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.className("promoBtn")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
			System.out.println(driver.findElement(By.className("promoInfo")).getText());

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
