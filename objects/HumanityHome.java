package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HumanityHome {
	
	public static final String URL = "https://www.humanity.com/"; //first
	public static final String NAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String WORKMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String START_XPATH = "//*[@id=\"free-trial-link-01\"]";
	
	public static final String OK_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button"; //popups
	public static final String CLOSE_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	
	public static final String STARTFREETRIAL_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]"; //second
	public static final String NAME2_XPATH= "//*[@id=\"popup-form\"]/div[1]/input";
	public static final String WORKMAIL2_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String START2_XPATH = "//*[@id=\"popup-free-trial-link\"]";
 
	public static final String URL2 = "https://www.humanity.com/wizard-setup2/"; //company
	public static final String COMPANY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	public static final String INDUSTRY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/select";
	public static final String ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/select";
	public static final String PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	public static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	public static final String REPEAT_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	public static final String START_SCH_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String PASSWORDLOG_XPATH = "//*[@id=\"password\"]";
	public static final String BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String MENU_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	
	public static void maximize (WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void inputName (WebDriver driver, String fullname) {
			driver.findElement(By.xpath(NAME_XPATH)).sendKeys(fullname);
	}
	
	public static void inputMail (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(WORKMAIL_XPATH)).sendKeys(workmail);
	}

	public static void clickButton (WebDriver driver) {
		driver.findElement(By.xpath(START_XPATH)).click();
	}
	public static void ok (WebDriver driver) {
		driver.findElement(By.xpath(OK_XPATH)).click();
	}
	public static void close (WebDriver driver) {
		driver.findElement(By.xpath(CLOSE_XPATH)).click();
	}
	public static void clickStart (WebDriver driver) {
		driver.findElement(By.xpath(START2_XPATH)).click();
	}
	
	public static void logIn (WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
	}
	public static void eMail (WebDriver driver, String mail) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(mail);
	}
	public static void passwordLogIn (WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORDLOG_XPATH)).sendKeys(password);
	}
	
	public static void logInBtn (WebDriver driver) {
		driver.findElement(By.xpath(BUTTON_XPATH)).click();
	}
	
	public static void aboutUs (WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}
	
	public static void menu (WebDriver driver) {
		driver.findElement(By.xpath(MENU_XPATH)).click();
	}
}
