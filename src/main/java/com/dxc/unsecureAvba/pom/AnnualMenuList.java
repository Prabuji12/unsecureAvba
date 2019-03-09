package com.dxc.unsecureAvba.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxc.unsecureAvba.webdriver.InitChromeDriver;

public class AnnualMenuList extends InitChromeDriver{
	
	WebDriver driver;
	
	public AnnualMenuList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Annual']")
	private WebElement annual;

	public void clickAnnualMenu() {
		annual.click();
	}
	
	public void hoverAnnualMenu() {
		locatable = (Locatable) annual;
		coordinate = locatable.getCoordinates();
		mouse_driver.mouseMove(coordinate);
	}

	@FindBy(xpath = "//span[text()='Annual Reports']")
	private WebElement annualReports;

	public void clickAnnualReportsMenu() {
		annualReports.click();
	}

	@FindBy(xpath = "//span[text()='Monthly']")
	private WebElement monthly;

	public void clickMonthlyMenu() {
		monthly.click();
	}

	@FindBy(xpath = "//span[text()='Monthly Reports']")
	private WebElement monthlyReports;

	public void clickMonthlyReportsMenu() {
		monthlyReports.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='F/A Info']")
	private WebElement annualFaInfoSubMenu;

	public void clickFAInfoSubMenu() {
		annualFaInfoSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Configuration']")
	private WebElement annualConfigurationSubMenu;

	public void clickConfigurationSubMenu() {
		annualConfigurationSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Vacation Matrix']")
	private WebElement annualVacationMatrixSubMenu;

	public void clickVacatioMatrixSubMenu() {
		annualVacationMatrixSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Upload']")
	private WebElement annualUploadSubMenu;

	public void clickUploadSubMenu() {
		annualUploadSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Accrual']")
	private WebElement annualAccrualSubMenu;

	public void clickAccrualSubMenu() {
		annualAccrualSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Manage Accrual']")
	private WebElement annualManageAccrualSubMenu;

	public void clickManageAccrualSubMenu() {
		annualManageAccrualSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuRound']/div/ul//li/a[text()='Failed Messages']")
	private WebElement annualFailedMessagesSubMenu;

	public void clickFailedMessagesSubMenu() {
		annualFailedMessagesSubMenu.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Zero accrual/Carry forward report ']")
	private WebElement annualReportZeroAccCF;

	public void clickAnnualReportZeroAccCF() {
		annualReportZeroAccCF.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Days not assigned report ']")
	private WebElement annualReportDaysNotAssign;

	public void clickAnnualReportDaysNotAssign() {
		annualReportDaysNotAssign.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Denied reason report']")
	private WebElement annualReportDeniedReason;

	public void clickAnnualReportDeniedReason() {
		annualReportDeniedReason.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Junior award report']")
	private WebElement annualReportJuniorAward;

	public void clickAnnualReportJuniorAward() {
		annualReportJuniorAward.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Annual buyback bid report  ']")
	private WebElement annualReportAnnualBid;

	public void clickAnnualReportAnnualBid() {
		annualReportAnnualBid.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Bid summary report ']")
	private WebElement annualReportBidSummary;

	public void clickAnnualReportBidSummary() {
		annualReportBidSummary.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Adjust balance report ']")
	private WebElement annualReportAdjustBalance;

	public void clickAnnualReportAdjustBalance() {
		annualReportAdjustBalance.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Bid and ballots transaction report  ']']")
	private WebElement annualReportBidBallotTrans;

	public void clickAnnualReportBidBallotTrans() {
		annualReportBidBallotTrans.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Vacation days report ']]")
	private WebElement annualReportVAcationDays;

	public void clickAnnualReportVAcationDays() {
		annualReportVAcationDays.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='FA Accrual Indicators ']")
	private WebElement annualReportFAAccIndicator;

	public void clickAnnualReportFAAccIndicator() {
		annualReportFAAccIndicator.click();
	}

	@FindBy(xpath = "//li[@id='menuVacationManagementReports']/div/ul//li/a[text()='Bidding statistics report']]")
	private WebElement annualReportBiddingStat;

	public void clickAnnualReportBiddingStat() {
		annualReportBiddingStat.click();
	}

}
