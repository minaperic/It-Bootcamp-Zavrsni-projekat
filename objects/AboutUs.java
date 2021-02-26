package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AboutUs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(HumanityHome.URL);
		
		WebElement ok = driver.findElement(By.xpath(HumanityHome.OK_XPATH));
		ok.click();
		
		WebElement close = driver.findElement(By.xpath(HumanityHome.CLOSE_XPATH));
		close.click();
		

		WebElement menu = driver.findElement(By.xpath(HumanityHome.MENU_XPATH));
		menu.click();
		
		WebElement ab = driver.findElement(By.xpath(HumanityHome.ABOUTUS_XPATH));
		ab.click();
		
	}
	
}
