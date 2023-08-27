import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windowsHandle = driver.getWindowHandles();
		Iterator<String> window = windowsHandle.iterator();
		
		String parent = window.next();
		String child = window.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
