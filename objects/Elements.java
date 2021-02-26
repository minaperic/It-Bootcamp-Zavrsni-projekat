package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
	
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
    public static final String DASHBOARD_TITLE = "Dashboard - Dashboard - Humanity";
    public static final String PLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span";
    public static final String PLANNING_TITLE = "ShiftPlanning - Humanity";
    public static final String CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
    public static final String CLOCK_TITLE = "Timeclock - Overview - Humanity";
    public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
    public static final String LEAVE_TITLE = "Leave - Vacation - Humanity";
    public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
    public static final String TRAINING_TITLE = "Training - Overview - Humanity";
    public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
    public static final String STAFF_TITLE = "Staff - Humanity";
    public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
    public static final String AVAILABILITY_TITLE = "Humanity";
    public static final String PAYROLL_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a";
    public static final String PAYROLL_TITLE = "Payroll - Scheduled-hours - Humanity";
    public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
    public static final String REPORTS_TITLE = "Reports - Reports Home - Humanity";
    
    public static final String ADDEMPLOYEE_XPATH = "/html/body/table/tbody/tr/td/div[5]/button[3]"; //novi
    public static final String FIRSTNAME_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[2]/input";
    public static final String LASTNAME_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[3]/input";
    public static final String MAIL_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[4]/input";
    public static final String SAVE_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button";
    
    public static final String ALL_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[1]/div/div/div[1]/ul[1]/li[1]/a"; //promena imena
    public static final String NAME_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/a";
    public static final String EDIT_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]";
    public static final String NAME2_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input";
    public static final String SAVEEMP_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
    
    public static void dash (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(DASHBOARD_XPATH)).sendKeys(workmail);
	}
    public static void plan (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(PLANNING_XPATH)).sendKeys(workmail);
	}
    public static void addNew (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(ADDEMPLOYEE_XPATH)).sendKeys(workmail);
	}
    public static void addName (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(FIRSTNAME_XPATH)).sendKeys(workmail);
	}
    public static void addNameLast (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(LASTNAME_XPATH)).sendKeys(workmail);
	}
    public static void addMail (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(MAIL_XPATH)).sendKeys(workmail);
	}
    public static void saveNew (WebDriver driver, String workmail) {
		driver.findElement(By.xpath(SAVE_XPATH)).sendKeys(workmail);
	}
    public static void allEmp(WebDriver driver, String workmail) {
		driver.findElement(By.xpath(ALL_XPATH)).sendKeys(workmail);
	}
    public static void allEmpName(WebDriver driver, String workmail) {
		driver.findElement(By.xpath(NAME_XPATH)).sendKeys(workmail);
	}
    public static void empnameEdit(WebDriver driver, String workmail) {
		driver.findElement(By.xpath(EDIT_XPATH)).sendKeys(workmail);
	}
    public static void empnamenew(WebDriver driver, String workmail) {
		driver.findElement(By.xpath(NAME2_XPATH)).sendKeys(workmail);
	}
    public static void empnamenewSave(WebDriver driver, String workmail) {
		driver.findElement(By.xpath(SAVEEMP_XPATH)).sendKeys(workmail);
	}

	
}
