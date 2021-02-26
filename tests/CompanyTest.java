package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Elements;
import objects.HumanityHome;

public class CompanyTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test (priority = 1)
	public void testDash() {
		driver.get(HumanityHome.URL);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(HumanityHome.OK_XPATH)).click();
		 driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH)).click();
		 driver.findElement(By.xpath(HumanityHome.LOGIN_XPATH)).click();;
		 driver.findElement(By.xpath(HumanityHome.EMAIL_XPATH)).sendKeys("ninaspan11@gmail.com");
		 driver.findElement(By.xpath(HumanityHome.PASSWORDLOG_XPATH)).sendKeys("QA2020test");
		 driver.findElement(By.xpath(HumanityHome.BUTTON_XPATH)).click();
		 
		 driver.findElement(By.xpath(Elements.DASHBOARD_XPATH)).click();
		 
		String expected = "https://atroverciamo.humanity.com/app/dashboard/";
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority = 2)
    public void testDashboard() {
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.DASHBOARD_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.DASHBOARD_TITLE;
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 3)
    public void testPlanning() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.PLANNING_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.PLANNING_TITLE;
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 4)
    public void testClock() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.CLOCK_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.CLOCK_TITLE;
        Assert.assertEquals(actual, expected);
    }
    @Test (priority = 5)
    public void testLeave() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.LEAVE_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.LEAVE_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 6)
    public void testTraining() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.TRAINING_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.TRAINING_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 7)
    public void testStaff() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.STAFF_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.STAFF_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 8)
    public void testAvailability() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.AVAILABILITY_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.AVAILABILITY_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 9)
    public void testPayroll() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.PAYROLL_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.PAYROLL_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test (priority = 10)
    public void testReports() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(Elements.REPORTS_XPATH)).click();
        String actual = driver.getTitle();
        String expected = Elements.REPORTS_TITLE;
        Assert.assertEquals(actual, expected);
        try {
            Thread.sleep(1000);
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
