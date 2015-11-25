package com.zinghr.tna.indexPage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.DashboardTimeNAttendanceCaVerification;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class DashboardTimeNAttendanceCaIndexPage extends AbstractPage {

	public DashboardTimeNAttendanceCaIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String onlydate="";
	public static String date="";
	@FindBy(xpath = "//span[contains(@class,'fc-button-next')]")
	WebElement nextMonthArrow_button;

	@FindBy(xpath = "//span[contains(@class,'fc-button-prev')]")
	WebElement previousMonthArrow_button;

	public DashboardTimeNAttendanceCaVerification clickOnForwardArrow() {
		Common.pause(1);
		Common.clickOn(driver, nextMonthArrow_button);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification clickOnbackwordArrow() {
		Common.pause(1);
		Common.clickOn(driver, previousMonthArrow_button);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	@FindBy(xpath = "//a[contains(.,'Holiday List')]")
	WebElement holidayList_button;

	public DashboardTimeNAttendanceCaVerification clickOnHolyDayListTab()

	{

		Common.pause(1);
		Common.clickOn(driver, holidayList_button);

		return new DashboardTimeNAttendanceCaVerification(driver);

	}

	@FindBy(xpath = "//a[contains(.,'Regularize')]")
	WebElement regularize_button;

	public DashboardTimeNAttendanceCaVerification clickRegularizeButton() {
		Common.pause(1);
		Common.clickOn(driver, regularize_button);
		Common.pause(2);

		Common.waitForElement(driver,
				By.xpath("//div[contains(@id,'RegularizationPopup')]"));

		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	
	@FindBy(xpath = "//a[contains(.,'WOFF Swap')]")
	WebElement Woff_swap_button;
	
	public DashboardTimeNAttendanceCaVerification clickWoffSwapButton() {
		Common.pause(1);
		Common.clickOn(driver, Woff_swap_button);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	

	@FindBy(xpath = "//button[@id='BtnApplyReg'][contains(.,'Apply Now')]")
	WebElement applyNow_button;

	public DashboardTimeNAttendanceCaVerification clickApplyNowButton() {
		Common.pause(3);
		Common.clickOn(driver, applyNow_button);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'DataVal')]//select[contains(@class,'typereg')]")
	List<WebElement> selectAction_dropdown;

	public static int counter = 0;

	public static int timeCounter = 0;

	public DashboardTimeNAttendanceCaVerification selectValueOfSelectionActionDropdown(
			String value) {

		for (WebElement e : selectAction_dropdown) {

			List<WebElement> getAllOption = e.findElements(By.xpath("option"));

			System.out.println("Select Element " + e + " option elemt size "
					+ getAllOption.size());

			Common.scrollToVertical(driver, e);
			Common.highlightElement(driver, e);
			for (WebElement optionElement : getAllOption) {

				System.out.println("optionElement.getText() : "
						+ optionElement.getText());

				if (optionElement.getText().equals(value)) {

					Common.selectFromComboByVisibleElement(e, value);

					counter++;
				}

				if (counter > 0) {
					break;
				}

			}

			timeCounter++;

			if (counter > 0) {
				break;
			}

		}

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInInTime(String value) {

		System.out.println("Time counter " + timeCounter);

		WebElement intime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')][" + timeCounter
						+ "]//input[@id='defaultEntryIn']"));

		Common.type(intime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInOutTime(String value) {

		WebElement outtime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')][" + timeCounter
						+ "]//input[@id='defaultEntryOut']"));

		Common.type(outtime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification clickOnTotalworkingHourLable() {

		driver.findElement(
				By.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//div[4]")).click();

		return new DashboardTimeNAttendanceCaVerification(driver);

	}

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok_button;

	@FindBy(xpath = "//i[@id='popupclose']/..")
	WebElement pop_close_btn;

	@FindBy(xpath = ".//li[@id='header-user']//span[1]")
	WebElement Username_drop_down;

	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'View')]")
	WebElement view_btn;

	@FindBy(xpath = ".//li[@id='header-user']//a[contains(text(),'My Transaction History')]")
	WebElement My_trasection_history_menu;

	@FindBy(xpath = ".//a[@id='btnPending']")
	WebElement panding_btn;

	public DashboardTimeNAttendanceCaVerification Outdoor_request_Cancel_View_option() {
		Common.pause(1);

		Common.clickOn(driver, ok_button);
		Common.pause(2);
		Common.clickOn(driver, pop_close_btn);
		Common.pause(2);
		Common.clickOn(driver, Username_drop_down);
		Common.pause(2);
		Common.clickOn(driver, My_trasection_history_menu);
		Common.pause(2);
		Common.clickOn(driver, panding_btn);
		Common.pause(2);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	
	@FindBy(xpath = ".//td[@class='fc-header-left']/span[1]")
	WebElement left_month_toogle_btn;
	
	@FindBy(xpath=".//td[contains(@class,'bgWeeklyOff')]")
	private List<WebElement> Weeklyoffday;
	
	public DashboardTimeNAttendanceCaVerification ApplyWeeklyOffPageOpen() {
		
		
		int Weeklyoff_size=Weeklyoffday.size();
		Random rnd = new Random();
		int i = rnd.nextInt(Weeklyoff_size);
		Common.pause(1);

		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Weeklyoffday.get(i).click();
		date=Weeklyoffday.get(i).getAttribute("data-date");
		onlydate= date.substring(8,10);
		System.out.println(onlydate);
		System.out.println(date);
		Common.pause(2);
		clickWoffSwapButton();
		Common.pause(2);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	
	public DashboardTimeNAttendanceCaVerification Selectdatedisplay() {
		
		
		int Weeklyoff_size=Weeklyoffday.size();
		Random rnd = new Random();
		int i = rnd.nextInt(Weeklyoff_size);
		Common.pause(1);

		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Weeklyoffday.get(i).click();
		String date=Weeklyoffday.get(i).getAttribute("data-date");
		String onlydate= date.substring(8,10);
		System.out.println(onlydate);
		System.out.println(date);
		Common.pause(2);
		clickWoffSwapButton();
		Common.pause(2);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	
	public DashboardTimeNAttendanceCaVerification SwapOffRemarkTextBox() {
		
		
		int Weeklyoff_size=Weeklyoffday.size();
		Random rnd = new Random();
		int i = rnd.nextInt(Weeklyoff_size);
		Common.pause(1);

		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Common.clickOn(driver, left_month_toogle_btn);
		Common.pause(2);
		Weeklyoffday.get(i).click();
		String date=Weeklyoffday.get(i).getAttribute("data-date");
		String onlydate= date.substring(8,10);
		System.out.println(onlydate);
		System.out.println(date);
		Common.pause(2);
		clickWoffSwapButton();
		Common.pause(2);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}
	
}
