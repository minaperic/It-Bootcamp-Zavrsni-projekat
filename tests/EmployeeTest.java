package tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import objects.Elements;
import objects.HumanityHome;

public class EmployeeTest {

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
		 

		 try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

	}
	
	@Test (priority = 2)
	public void addEmployee(WebDriver driver) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Elements.STAFF_XPATH)).click();
		driver.findElement(By.xpath(Elements.ADDEMPLOYEE_XPATH)).click();
		
		try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Elements.FIRSTNAME_XPATH)).sendKeys("Dragana");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Elements.LASTNAME_XPATH)).sendKeys("Nikolic");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Elements.MAIL_XPATH)).sendKeys("dn@gmail.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Elements.SAVE_XPATH)).click();
	}
	@Test (priority = 3) 
		public void testChangeName() {
		
		driver.findElement(By.xpath(Elements.ALL_XPATH)).click();
		driver.findElement(By.xpath(Elements.NAME_XPATH)).click();
		driver.findElement(By.xpath(Elements.EDIT_XPATH)).click();
		driver.findElement(By.xpath(Elements.NAME2_XPATH)).clear();
		driver.findElement(By.xpath(Elements.NAME2_XPATH)).sendKeys("Dragana");
		driver.findElement(By.xpath(Elements.SAVEEMP_XPATH)).click();
		
		WebElement alert1 = driver.findElement(By.id("_status"));
		
		AssertJUnit.assertTrue(alert1.isDisplayed());
		
	}

	@Test (priority = 4)
	public void fiveEmployeesInput(WebDriver driver) {
		
		File f = new File("zaposleni.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);
			Row row;
			for (int i = 0; i < 6; i++) {
				row = sheet.getRow(i);
				String name = row.getCell(0).toString();
				String surname = row.getCell(1).toString();
				String email = row.getCell(2).toString();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath(Elements.ADDEMPLOYEE_XPATH)).click();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath(Elements.FIRSTNAME_XPATH)).sendKeys(name);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.findElement(By.xpath(Elements.LASTNAME_XPATH)).sendKeys(surname);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath(Elements.MAIL_XPATH)).sendKeys(email);
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				driver.findElement(By.xpath(Elements.SAVE_XPATH)).click();
				wb.close();
			}
			
		} catch (IOException e) {
			System.out.println("Nije pronadjen fajl!");
			e.printStackTrace();
		}
	
	}@AfterClass
	public void close() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
	}
}
		