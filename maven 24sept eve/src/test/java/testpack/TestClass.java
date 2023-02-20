package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\salenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	}

}
