import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vegetableList = { "Cucumber", "Brocolli", "Beetroot" };
		int j = 0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> vegetableName = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < vegetableName.size(); i++) {
			String[] vegetable = vegetableName.get(i).getText().split("-");
			String formattedName = vegetable[0].trim();

			List<String> itemList = Arrays.asList(vegetableList);

			if (itemList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == vegetableList.length) {
					break;
				}
			}
		}

	}

}
