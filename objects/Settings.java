package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Settings {
	
	public static final String SETT_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[3]/ul/li/a/span/i";
	public static final String LANG_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_XPATH = "/html/body/table/tbody/tr/td/div[5]/button[3]";
	public static final String LANGTWO_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String REFRESH_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[1]/table/tbody/tr[3]/td[1]/label/a";
	
	public static final String VMAIL_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[1]/td[2]/input";
	public static final String VSMS_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[2]/td[2]/input";
	public static final String VMOBILE_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[3]/td[2]/input";

	public static final String BTNPROFILE_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[3]/div/i";
	public static final String SETTINGSBTN_XPATH = "/html/body/table/tbody/tr/td/div[4]/div/a[2]";
	public static final String ADDRESS_XPATH = "//*[@id=\"address\"]";
	public static final String CITY_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[21]/td[2]/input";
	public static final String SAVENEW_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[42]/td/input";

	public static void logIn (WebDriver driver) {
		driver.findElement(By.xpath(HumanityHome.LOGIN_XPATH)).click();
	}
	public static void eMail (WebDriver driver, String mail) {
		driver.findElement(By.xpath(HumanityHome.EMAIL_XPATH)).sendKeys(mail);
	}
	public static void passwordLogIn (WebDriver driver, String password) {
		driver.findElement(By.xpath(HumanityHome.PASSWORDLOG_XPATH)).sendKeys(password);
	}
	
	public static void logInBtn (WebDriver driver) {
		driver.findElement(By.xpath(HumanityHome.BUTTON_XPATH)).click();
	}
	public static void dashboard (WebDriver driver) {
		driver.findElement(By.xpath(Elements.DASHBOARD_XPATH)).click();
	}
	public static void addressNew (WebDriver driver) {
		driver.findElement(By.xpath(ADDRESS_XPATH)).click();
	}
	public static void cityNew (WebDriver driver) {
		driver.findElement(By.xpath(CITY_XPATH)).click();
	}
	public static void saveChanges (WebDriver driver) {
		driver.findElement(By.xpath(SAVENEW_XPATH)).click();
	}
	public static void chancelang (WebDriver driver) {
		driver.findElement(By.xpath(SETT_XPATH)).click();
	}
	public static void newlang (WebDriver driver) {
		driver.findElement(By.xpath(LANG_XPATH)).click();
	}
	public static void newlangtwo (WebDriver driver) {
		driver.findElement(By.xpath(LANGTWO_XPATH)).click();
	}
	public static void newlangtwosave (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_XPATH)).click();
	}
	public static void refreshnew (WebDriver driver) {
		driver.findElement(By.xpath(REFRESH_XPATH)).click();
	}
	public static boolean langChange(WebDriver driver) {
		
	driver.navigate().to(Settings.SETT_XPATH);
	WebElement wb = driver.findElement(By.linkText("Availability"));
	boolean changed = true;
	if (wb == null) {
		changed = true;
	} else {
		changed = false;
	}
	return changed;
	}

	public static void unChecking(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.navigate().to(SETT_XPATH);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath(VMAIL_XPATH)).click();
		 driver.findElement(By.xpath(VMOBILE_XPATH)).click();
		 driver.findElement(By.xpath(VSMS_XPATH)).click();
		 try {
			 Thread.sleep(6000);
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
		 
		 driver.findElement(By.xpath(LANG_XPATH)).click();
		 driver.findElement(By.xpath(LANGTWO_XPATH));
		 driver.findElement(By.xpath(REFRESH_XPATH)).click();
		 driver.findElement(By.xpath(SAVE_XPATH)).click();
		
	}

	public static void address(WebDriver driver) {
		
		driver.findElement(By.xpath(BTNPROFILE_XPATH)).click();
		driver.findElement(By.xpath(SETTINGSBTN_XPATH)).click();
		driver.findElement(By.xpath(ADDRESS_XPATH)).sendKeys("Arcibalda Rajsa");
		driver.findElement(By.xpath(CITY_XPATH)).sendKeys("Belgrade");
		driver.findElement(By.xpath(SAVENEW_XPATH)).click();
	}
}
 