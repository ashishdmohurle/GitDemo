import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizingScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.xpath("//table[@class='gf-t']"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement column = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());

		int count = column.findElements(By.tagName("a")).size();

		for (int i = 1; i < count; i++) {
			String clickAction = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickAction);
		}
		Set<String> windowsHandle = driver.getWindowHandles();
		Iterator<String> window = windowsHandle.iterator();

		while (window.hasNext()) {

			driver.switchTo().window(window.next());
			System.out.println(driver.getTitle());
		}

	}

}
