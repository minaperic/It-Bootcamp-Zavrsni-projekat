package tests;

import java.util.concurrent.TimeUnit;

import org.apache.batik.css.engine.value.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Elements;
import objects.HumanityHome;
import objects.Settings;

public class SettingsTest {

	static WebDriver driver;
	
	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public static void testDash() {
		 driver.get(HumanityHome.URL);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(HumanityHome.OK_XPATH)).click();
		 driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH)).click();
		 driver.findElement(By.xpath(HumanityHome.LOGIN_XPATH)).click();;
		 driver.findElement(By.xpath(HumanityHome.EMAIL_XPATH)).sendKeys("ninaspan11@gmail.com");
		 driver.findElement(By.xpath(HumanityHome.PASSWORDLOG_XPATH)).sendKeys("QA2020test");
		 driver.findElement(By.xpath(HumanityHome.BUTTON_XPATH)).click();
		 
		 try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 
	}
	@Test (priority = 2)
	public static void testChangeLang() {
		Settings.unChecking(driver);
		boolean actual = Settings.langChange(driver);
		boolean expected = false;
		Assert.assertEquals(actual, expected);
		
	}
	@Test (priority = 3)
	public static void addressInput() {
		Settings.address(driver);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void close() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	}
	
}
