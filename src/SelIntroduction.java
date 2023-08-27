import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {
	{

		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods


		//Firefox

		System.setProperty("webdriver.gecko.driver","D:\\Selenium Course\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		System.setProperty("webdriver.edge.driver","D:\\Selenium Course\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver2 = new EdgeDriver();

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Course\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
			

	}

}
