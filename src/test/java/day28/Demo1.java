package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}
