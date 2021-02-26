package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HumanityHome;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public void testSignUp() {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(HumanityHome.OK_XPATH));
		driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH));
		driver.findElement(By.xpath(HumanityHome.NAME_XPATH)).sendKeys("Milos Radanovic");
		driver.findElement(By.xpath(HumanityHome.WORKMAIL_XPATH)).sendKeys("milos99@gmail.com");
		driver.findElement(By.xpath(HumanityHome.START_XPATH)).click();
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 2)
	public void testSignUpTwo() {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(HumanityHome.OK_XPATH));
		driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH));
		driver.findElement(By.xpath(HumanityHome.STARTFREETRIAL_XPATH )).click();
		driver.findElement(By.xpath(HumanityHome.NAME2_XPATH)).sendKeys("Marko Markovic");
		driver.findElement(By.xpath(HumanityHome.WORKMAIL2_XPATH)).sendKeys("marko@gmail.com");
		driver.findElement(By.xpath(HumanityHome.START2_XPATH)).click();
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
	}
	 @Test (priority = 3)
	 public void testLogIn () {
		 driver.get(HumanityHome.URL);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(HumanityHome.OK_XPATH));
		 driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH));
		 driver.findElement(By.xpath(HumanityHome.LOGIN_XPATH)).click();;
		 driver.findElement(By.xpath(HumanityHome.EMAIL_XPATH)).sendKeys("ninaspan11@gmail.com");
		 driver.findElement(By.xpath(HumanityHome.PASSWORDLOG_XPATH)).sendKeys("QA2020test");
		 driver.findElement(By.xpath(HumanityHome.BUTTON_XPATH)).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		 String expected = "https://atroverciamo.humanity.com/app/dashboard/";
		 String actual = driver.getCurrentUrl();
		 
		 Assert.assertEquals(actual, expected);
	 }
	 @AfterClass
		public void close() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.close();
		}
}
