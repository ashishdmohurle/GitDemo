import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				String name = "Ashish";
				//System.setProperty("webdriver.chrome.driver","/Users/ashis/Documents/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				String passwordNew = getPassword(driver);
				driver.findElement(By.id("inputUsername")).sendKeys(name);
				driver.findElement(By.name("inputPassword")).sendKeys(passwordNew);
				driver.findElement(By.className("signInBtn")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.tagName("p")).getText());
				Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
				System.out.println(driver.findElement(By.xpath("//h2")).getText());
				Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello "+name+",");
				driver.findElement(By.xpath("//button[text()='Log Out']")).click();
				Thread.sleep(1000);
				driver.close();
				
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String password = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = password.split("'");
		String fetchedPassword = passwordArray[1].split("'")[0];
		//String fetchedPassword = passwordArray2[0];
		return fetchedPassword;
		
	}
}
