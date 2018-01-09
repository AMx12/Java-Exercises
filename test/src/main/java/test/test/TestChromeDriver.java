package test.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:/dev/webdriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		Thread.sleep(1000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Kizuna Ai");
		searchBox.submit();
		Thread.sleep(1000); // Let the user actually see something!
		driver.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("#rg_s > div:nth-child(11) > a > img")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}