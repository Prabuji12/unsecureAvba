package com.dxc.unsecureAvba.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dxc.unsecureAvba.webdriver.InitChromeDriver;

public class Accrual extends InitChromeDriver {

	WebDriver driver;

	public Accrual(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Accrual']")
	private WebElement accrualHeader;

	/*
	 * public void rowData() { String element = { "txtMin", "txtMax", "txtMonth1",
	 * "txtMonth2", "txtMonth3", "txtMonth4", "txtMonth5", "txtMonth6", "txtMonth7",
	 * "txtMonth8", "txtMonth9", "txtMonth10", "txtMonth11", "txtMonth12" }; for(int
	 * i=0;i<14;i++) {
	 * 
	 * @FindBy(id=element[i]) WebElement row; }
	 * 
	 * }
	 */

	public String getAccrualHeader() {
		return accrualHeader.getText();
	}

	public void clickAccrualHeader() {
		accrualHeader.click();
	}

	@FindBy(xpath = "//select[@id='selvacyearname']")
	WebElement selectVacationYear;

	public void selectVacationYear(String yearValue) {
		Select selectVacYear = new Select(selectVacationYear);
		selectVacYear.selectByValue(yearValue);
	}

	@FindBy(xpath = "//select[@id='ddlBidStatus']")
	WebElement selectWorkgroup;

	@FindBy(xpath = "//input[@class='chkworklist' and @value='21']")
	WebElement laaWkGroup;

	@FindBy(xpath = "//input[@class='chkworklist' and @value='22']")
	WebElement lusWkGroup;

	public void selectSingleWorkgroup(String inputWorkgroup) throws InterruptedException {
		selectWorkgroup.click();
		Thread.sleep(3000);
		if (inputWorkgroup == "LAA") {
			laaWkGroup.click();
		}
		if (inputWorkgroup == "LUS") {
			lusWkGroup.click();
		}
	}

	public void unSelectSingleWorkgroup(String inputWorkgroup) throws InterruptedException {
		selectWorkgroup.click();
		Thread.sleep(3000);
		if (inputWorkgroup == "LAA") {
			laaWkGroup.click();
		}
		if (inputWorkgroup == "LUS") {
			lusWkGroup.click();
		}
	}

	public void selectMultipleWorkgroup(String inputWorkgroup[]) throws InterruptedException {
		selectWorkgroup.click();
		Thread.sleep(3000);
		for (int i = 0; i < inputWorkgroup.length; i++) {
			if (inputWorkgroup[i] == "LAA") {
				laaWkGroup.click();
			}
			if (inputWorkgroup[i] == "LUS") {
				lusWkGroup.click();
			}
		}
	}

	public void unSelectMultipleWorkgroup(String inputWorkgroup[]) throws InterruptedException {
		selectWorkgroup.click();
		Thread.sleep(3000);
		for (int i = 0; i < inputWorkgroup.length; i++) {
			if (inputWorkgroup[i] == "LAA") {
				laaWkGroup.click();
			}
			if (inputWorkgroup[i] == "LUS") {
				lusWkGroup.click();
			}
		}
	}

	@FindBy(id = "btnAddRow")
	WebElement addRowButton;

	public void clickAddRowButton(int count) {
		for (int addRow = 1; addRow <= count; addRow++) {
			addRowButton.click();
		}
	}

	@FindBy(id = "btnCopyAccrual")
	WebElement copyAccrualButton;

	public void clickCopyAccrualButton() {
		copyAccrualButton.click();
	}

	@FindBy(id = "btnSaveAccrual")
	WebElement saveAccrualButton;

	public void clickSaveAccrualButton() {
		saveAccrualButton.click();
	}

	@FindBy(id = "chkdelall")
	WebElement deleteAllCheckBox;

	public void checkDeleteAllBox() {
		deleteAllCheckBox.click();
	}

	@FindBy(id = "btnDelete")
	WebElement deleteAllButton;

	public void clickDeleteAllButton() {
		deleteAllButton.click();
	}
	
	//@FindBy(className = "button_Primary ui-state-hover")
	@FindBy(xpath = "//span[@class='ui-button-text' and text()='OK']")
	WebElement confirmDeleteButton;
	
	public void confirmDelete() {
		confirmDeleteButton.click();
	}
	
	@FindBy(className = "button_Secondary")
	WebElement cancelDeleteButton;
	
	public void cancelDelete() {
		cancelDeleteButton.click();
	}
	
	@FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
	WebElement closeIconDeletePopUp;
	
	public void closeIconDeletePopUp() {
		closeIconDeletePopUp.click();
	}

	@FindBys(@FindBy(id = "txtMin"))
	private List<WebElement> minServiceInputBox;

	private static int row;

	public void configRow(String[] rowValue, int j) {
		row = j;
		setMinService(rowValue[0]);
		setMaxService(rowValue[1]);
		setMonth1Value(rowValue[2]);
		setMonth2Value(rowValue[3]);
		setMonth3Value(rowValue[4]);
		setMonth4Value(rowValue[5]);
		setMonth5Value(rowValue[6]);
		setMonth6Value(rowValue[7]);
		setMonth7Value(rowValue[8]);
		setMonth8Value(rowValue[9]);
		setMonth9Value(rowValue[10]);
		setMonth10Value(rowValue[11]);
		setMonth11Value(rowValue[12]);
		setMonth12Value(rowValue[13]);
	}

	public void setMinService(String min) {
		minServiceInputBox.get(row).sendKeys(min);
	}

	@FindBys(@FindBy(id = "txtMax"))
	private List<WebElement> maxServiceInputBox;

	public void setMaxService(String max) {
		maxServiceInputBox.get(row).sendKeys(max);
	}

	@FindBys(@FindBy(id = "txtMonth1"))
	private List<WebElement> month1InputBox;

	public void setMonth1Value(String month1Value) {
		month1InputBox.get(row).sendKeys(month1Value);
	}

	@FindBys(@FindBy(id = "txtMonth2"))
	private List<WebElement> month2InputBox;

	public void setMonth2Value(String month2Value) {
		month2InputBox.get(row).sendKeys(month2Value);
	}

	@FindBys(@FindBy(id = "txtMonth3"))
	private List<WebElement> month3InputBox;

	public void setMonth3Value(String month3Value) {
		month3InputBox.get(row).sendKeys(month3Value);
	}

	@FindBys(@FindBy(id = "txtMonth4"))
	private List<WebElement> month4InputBox;

	public void setMonth4Value(String month4Value) {
		month4InputBox.get(row).sendKeys(month4Value);
	}

	@FindBys(@FindBy(id = "txtMonth5"))
	private List<WebElement> month5InputBox;

	public void setMonth5Value(String month5Value) {
		month5InputBox.get(row).sendKeys(month5Value);
	}

	@FindBys(@FindBy(id = "txtMonth6"))
	private List<WebElement> month6InputBox;

	public void setMonth6Value(String month6Value) {
		month6InputBox.get(row).sendKeys(month6Value);
	}

	@FindBys(@FindBy(id = "txtMonth7"))
	private List<WebElement> month7InputBox;

	public void setMonth7Value(String month7Value) {
		month7InputBox.get(row).sendKeys(month7Value);
	}

	@FindBys(@FindBy(id = "txtMonth8"))
	private List<WebElement> month8InputBox;

	public void setMonth8Value(String month8Value) {
		month8InputBox.get(row).sendKeys(month8Value);
	}

	@FindBys(@FindBy(id = "txtMonth9"))
	private List<WebElement> month9InputBox;

	public void setMonth9Value(String month9Value) {
		month9InputBox.get(row).sendKeys(month9Value);
	}

	@FindBys(@FindBy(id = "txtMonth10"))
	private List<WebElement> month10InputBox;

	public void setMonth10Value(String month10Value) {
		month10InputBox.get(row).sendKeys(month10Value);
	}

	@FindBys(@FindBy(id = "txtMonth11"))
	private List<WebElement> month11InputBox;

	public void setMonth11Value(String month11Value) {
		month11InputBox.get(row).sendKeys(month11Value);
	}

	@FindBys(@FindBy(id = "txtMonth12"))
	private List<WebElement> month12InputBox;

	public void setMonth12Value(String month12Value) {
		month12InputBox.get(row).sendKeys(month12Value);
	}

}
