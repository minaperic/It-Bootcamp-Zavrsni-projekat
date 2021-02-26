package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HumanityHome;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class AboutUsTest {

	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test (priority = 1)
	public void testAboutUs() {
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(HumanityHome.OK_XPATH)).click();
		driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH)).click();
		driver.findElement(By.xpath(HumanityHome.ABOUTUS_XPATH)).click();
		driver.findElement(By.xpath(HumanityHome.MENU_XPATH)).click();
		
		String expected = "https://www.humanity.com/about";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority =2)
	public void screenshotAboutUs() {
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("AboutUsScreenshot.jpg"));
		} catch (IOException e) {
			System.out.println("Error. Screenshot not taken");
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected = HumanityHome.ABOUTUS_XPATH;
		
		driver.quit();
	}
	@AfterClass
	public void close() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	}
}
