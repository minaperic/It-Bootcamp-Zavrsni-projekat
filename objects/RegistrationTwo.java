package objects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTwo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		
		WebElement ok = driver.findElement(By.xpath(HumanityHome.OK_XPATH));
		ok.click();
		
		WebElement close = driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH));
		close.click();
		
		Dimension size = driver.manage().window().getSize();
		driver.manage().window().maximize();
		
		WebElement start = driver.findElement(By.xpath(HumanityHome.STARTFREETRIAL_XPATH));
		start.click();
		
		WebElement fullname2 = driver.findElement(By.xpath(HumanityHome.NAME2_XPATH));
		fullname2.click();
		fullname2.sendKeys("Kasijaaa Spanovic");
		
		WebElement email2 = driver.findElement(By.xpath(HumanityHome.WORKMAIL2_XPATH));
		email2.click();
		email2.sendKeys("kasijaa11@gmail.com");
		
		WebElement start2 = driver.findElement(By.xpath(HumanityHome.START2_XPATH));
		start2.click();
		
		driver.get(HumanityHome.URL2);
		
		WebElement company = driver.findElement(By.xpath(HumanityHome.COMPANY_XPATH));
		company.click();
		company.sendKeys("Libra");
		company.sendKeys(Keys.ENTER);
		
		WebElement industry = driver.findElement(By.xpath(HumanityHome.INDUSTRY_XPATH));
		industry.click();
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ARROW_DOWN);
		industry.sendKeys(Keys.ENTER);
		
		WebElement role = driver.findElement(By.xpath(HumanityHome.ROLE_XPATH));
		role.click();
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ENTER);
		
		
		WebElement phone = driver.findElement(By.xpath(HumanityHome.PHONE_XPATH));
		phone.click();
		phone.sendKeys("0635490766");
		phone.sendKeys(Keys.ENTER);
		
		WebElement password = driver.findElement(By.xpath(HumanityHome.PASSWORD_XPATH));
		password.click();
		password.sendKeys("libra2021");
		password.sendKeys(Keys.ENTER);
		
		WebElement password2 = driver.findElement(By.xpath(HumanityHome.REPEAT_XPATH));
		password2.click();
		password2.sendKeys("libra2021");
		password2.sendKeys(Keys.ENTER);
		
		WebElement startScheduling = driver.findElement(By.xpath(HumanityHome.START_SCH_XPATH));
		startScheduling.click();
	}

}
