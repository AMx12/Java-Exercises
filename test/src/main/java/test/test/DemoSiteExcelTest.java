package test.test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoSiteExcelTest {

	ExtentReports report;
	ExtentTest test;

	WebDriver driver;

//	File excelFile = new File("C:/dev/inputfiles/excelinput.xls");
//	FileInputStream inputStream = new FileInputStream(excelFile);
//	Workbook inputWorkbook = new XSSFWorkbook(inputStream);

	@Before
	public void before() {
	}

	@After
	public void after() {
	}

	@Test(priority = 1, enabled = false)
	public void createUserChrome() throws InterruptedException {
		report = new ExtentReports("C:/dev/reports/extentchrome.html", true);
		test = report.startTest("Create new user and verify login");

		System.setProperty("webdriver.chrome.driver", "C:/dev/webdriver/chromedriver.exe");
		driver = new ChromeDriver();

		test.log(LogStatus.INFO, "Browser started.");
		driver.get("http://www.thedemosite.co.uk/");
		Thread.sleep(500);

		// Create a user
		driver.findElement(By.cssSelector(
				"body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"))
				.click();
		Thread.sleep(500);
		WebElement createUser = driver.findElement(By.name("username"));
		createUser.sendKeys("Maverick");
		WebElement createPassword = driver.findElement(By.name("password"));
		createPassword.sendKeys("Secure");
		Thread.sleep(500);
		driver.findElement(By.name("FormsButton2")).click();
		Thread.sleep(500);
		test.log(LogStatus.INFO, "Created user.");

		// Log-in as user
		driver.findElement(By.cssSelector(
				"body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"))
				.click();
		Thread.sleep(500);
		WebElement inputUser = driver.findElement((By.name("username")));
		inputUser.sendKeys("Maverick");
		WebElement inputPassword = driver.findElement((By.name("password")));
		inputPassword.sendKeys("Secure");
		Thread.sleep(500);
		driver.findElement(By.name("FormsButton2")).click();
		test.log(LogStatus.INFO, "User login.");

		// Assert Successful
		WebElement loginSuccess = driver.findElement(By.cssSelector(
				"body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		Thread.sleep(500);
		test.log(LogStatus.INFO, "Verifying login success.");
		assertEquals(loginSuccess.getText(), "**Successful Login**");
		String loginState = loginSuccess.getText();
		// System.out.println(loginState);
		if (loginState.equals("**Successful Login**")) {
			test.log(LogStatus.PASS, "Login Success!");
			System.out.println("Login Success!");
		} else {
			test.log(LogStatus.FAIL, "Login failure.");
			System.out.println("Login failure.");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

	@Test(priority = 2, enabled = false)
	public void createUserFirefox() throws InterruptedException {
		report = new ExtentReports("C:/dev/reports/extentfirefox.html", true);
		test = report.startTest("Create new user and verify login");

		System.setProperty("webdriver.gecko.driver", "C:/dev/webdriver/geckodriver.exe");
		driver = new FirefoxDriver();

		test.log(LogStatus.INFO, "Browser started.");
		driver.get("http://www.thedemosite.co.uk/");
		Thread.sleep(500);

		// Create a user
		driver.findElement(By.cssSelector(
				"body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"))
				.click();
		Thread.sleep(500);
		WebElement createUser = driver.findElement(By.name("username"));
		createUser.sendKeys("Maverick");
		WebElement createPassword = driver.findElement(By.name("password"));
		createPassword.sendKeys("Secure");
		Thread.sleep(500);
		driver.findElement(By.name("FormsButton2")).click();
		Thread.sleep(500);
		test.log(LogStatus.INFO, "Created user.");

		// Log-in as user
		driver.findElement(By.cssSelector(
				"body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"))
				.click();
		Thread.sleep(500);
		WebElement inputUser = driver.findElement((By.name("username")));
		inputUser.sendKeys("Maverick");
		WebElement inputPassword = driver.findElement((By.name("password")));
		inputPassword.sendKeys("Secure");
		Thread.sleep(500);
		driver.findElement(By.name("FormsButton2")).click();
		test.log(LogStatus.INFO, "User login.");

		// Assert Successful
		WebElement loginSuccess = driver.findElement(By.cssSelector(
				"body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		Thread.sleep(500);
		test.log(LogStatus.INFO, "Verifying login success.");
		assertEquals(loginSuccess.getText(), "**Successful Login**");
		String loginState = loginSuccess.getText();
		// System.out.println(loginState);
		if (loginState.equals("**Successful Login**")) {
			test.log(LogStatus.PASS, "Login Success!");
			System.out.println("Login Success!");
		} else {
			test.log(LogStatus.FAIL, "Login failure.");
			System.out.println("Login failure.");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
