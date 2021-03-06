package com.zinghr.tna.verification;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.indexPage.DashboardTimeNAttendanceCaIndexPage;

public class DashboardTimeNAttendanceCaVerification extends AbstractPage {

	public DashboardTimeNAttendanceCaVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@id='myTNA']")
	WebElement timeAndAttendanceCalander_sec;

	public boolean verifyTimeAndAttendanceCalendarOnDashboardIsDisplayed() {

		return timeAndAttendanceCalander_sec.isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'My Time And Attendance')]")
	WebElement timeAndAttendanceOnDashBoard_header;

	public boolean verifyTimeAndAttendanceHeaderIsDisplayed() {

		return timeAndAttendanceOnDashBoard_header.isDisplayed();
	}

	@FindBy(xpath = "//span[@class='fc-header-title']/h2")
	WebElement monthName_header;

	public boolean verifyCurrentMonthOnTNAOnDashboard() {

		boolean bool = false;
		Calendar c = Calendar.getInstance();

		String currentMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		System.out.println(currentMonth);

		System.out.println(monthName_header.getText());

		if (monthName_header.getText().equalsIgnoreCase(currentMonth)) {

			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//div[@class='modal-body']//div[contains(.,'Regularization has been Applied Successfully.')]")
	WebElement regularazationAppliedSuceesfullyMessage_alert;

	public boolean verifyregularazationAppliedSuceesfullyMessageisDisplayed() {
		Common.pause(2);
		return regularazationAppliedSuceesfullyMessage_alert.isDisplayed();
	}

	public boolean verifyNextMonthIsDisplayed() {

		boolean bool = false;

		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1);

		String nextMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		if (monthName_header.getText().equalsIgnoreCase(nextMonth)) {

			bool = true;

		}

		return bool;
	}

	public boolean verifyPreviousMonthIsDisplayed() {

		boolean bool = false;

		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);

		String previousMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.ENGLISH) + " " + c.get(Calendar.YEAR);

		if (monthName_header.getText().equalsIgnoreCase(previousMonth)) {

			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//a[contains(.,'Holiday List')]")
	WebElement holidayList_button;

	public boolean verifyHolidayListButtonIsDisplayed() {

		return holidayList_button.isDisplayed();
	}

	@FindBy(xpath = "//div[@id='dialogParent']")
	WebElement holidayList_popup;

	public boolean verifyHolidayListPopupIsDisplayed() {
		return holidayList_popup.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@class,'holidayList')]")
	WebElement holidayDetails_popup;

	public boolean verifyHolidayDetailsisDisplayedOnPopup() {
		return holidayDetails_popup.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@id,'RegularizationPopup')]")
	WebElement regularize_popup;

	public boolean verifyRegularizationPopupIsDisplayed() {
		return regularize_popup.isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'Apply Regularization')]")
	WebElement applyRegularize_header;

	public boolean verifyRegularizationPopupHeaderIsDisplayed() {
		return applyRegularize_header.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='modal-body']//div[contains(.,'Please select an action')]")
	WebElement selectActionMessage_alert;

	public boolean verifyBlankActionValidationMessage() {
		Common.pause(2);
		return selectActionMessage_alert.isDisplayed();
	}

	@FindBy(xpath = "//div[@class='modal-body']//div[contains(.,'please select proper in time and proper out time')]")
	WebElement inTimeAndOutTimeMessage_alert;

	public boolean verifyInTimeAndOutTimeValidationMessage() {
		Common.pause(2);
		return inTimeAndOutTimeMessage_alert.isDisplayed();
	}

	@FindBy(xpath = "//select[contains(@class,'typereg')]")
	List<WebElement> selectActionDropDown_list;

	public boolean verifySelectOptionDropDownOptions() {
		boolean bool = false;
		int option1 = 0;
		int option2 = 0;
		int option3 = 0;

		System.out.println(selectActionDropDown_list.size());

		for (WebElement e : selectActionDropDown_list) {

			List<WebElement> getAllOption = e.findElements(By.xpath("option"));

			Common.mouseHover(driver, e);
			Common.highlightElement(driver, e);

			for (WebElement optionElement : getAllOption)

			{

				if (optionElement.getText().equals("ShiftWoChange")) {
					option1++;
				}
				if (optionElement.getText().equals("Outdoor")) {
					option2++;
				}
				if (optionElement.getText().equals("WFH")) {
					option3++;
				}

			}

			/*
			 * System.out.println(option1 + "  " + option2 + "  " + option3);
			 */

		}

		if (option1 > 0 && option2 > 0 && option3 > 0) {
			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//div[contains(@class,'DataVal')][1]//input[@id='defaultEntryIn']")
	WebElement inTimeOnRegularization_textField;

	@FindBy(xpath = "//div[contains(@class,'DataVal')][1]//input[@id='defaultEntryOut']")
	WebElement outTimeOnRegularization_textField;

	public boolean verifyInTimeAndOutTimeIsDisplayed() {

		return inTimeOnRegularization_textField.isDisplayed()
				&& outTimeOnRegularization_textField.isDisplayed();

	}

	@FindBy(xpath = "//select[contains(@class,'dvShiftSelect0')]")
	WebElement shiftname_dropdown;

	@FindBy(xpath = "//div[contains(@class,'DataVal')]//label[contains(@class,'dvShift')]")
	List<WebElement> defaultShiftName_header;

	public boolean byDefaultShiftNameIsdisplayed() {

		/*
		 * List<WebElement> getAllOption = shiftname_dropdown.findElements(By
		 * .xpath("option"));
		 * 
		 * System.out.println("get" + getAllOption.size());
		 * 
		 * if (getAllOption.size() > 0) { bool = true;
		 * 
		 * }
		 */
		return defaultShiftName_header.size() > 0;
	}

	public boolean verifyTotalWorkingHours() {

		WebElement workingHours = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//div[4]"));

		return workingHours.getText().equals("9:00 hrs");
	}

	public boolean verifyRegularazationReasonDropDownIsDisplayed() {

		return driver.findElement(
				By.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//select[@id='ReasonSelect']")).isDisplayed();
	}

	public boolean verifyRegularazationReasonDropDownoptionIsDisplayed() {

		System.out.println("Time counter "
				+ DashboardTimeNAttendanceCaIndexPage.timeCounter);

		boolean bool = false;

		try {

			if (driver
					.findElement(
							By.xpath("//div[contains(@class,'DataVal')]["
									+ DashboardTimeNAttendanceCaIndexPage.timeCounter
									+ "]//select[@id='ReasonSelect']/option[contains(.,'Late Arrival')]"))
					.isDisplayed()
					&& driver
							.findElement(
									By.xpath("//div[contains(@class,'DataVal')]["
											+ DashboardTimeNAttendanceCaIndexPage.timeCounter
											+ "]//select[@id='ReasonSelect']/option[contains(.,'Missed Swipe')]"))
							.isDisplayed()
					&& driver
							.findElement(
									By.xpath("//div[contains(@class,'DataVal')]["
											+ DashboardTimeNAttendanceCaIndexPage.timeCounter
											+ "]//select[@id='ReasonSelect']/option[contains(.,'Outdoor/Client Visit')]"))
							.isDisplayed()
					&& driver
							.findElement(
									By.xpath("//div[contains(@class,'DataVal')]["
											+ DashboardTimeNAttendanceCaIndexPage.timeCounter
											+ "]//select[@id='ReasonSelect']/option[contains(.,'PunchIn Approval')]"))
							.isDisplayed()
					&& driver
							.findElement(
									By.xpath("//div[contains(@class,'DataVal')]["
											+ DashboardTimeNAttendanceCaIndexPage.timeCounter
											+ "]//select[@id='ReasonSelect']/option[contains(.,'Others')]"))
							.isDisplayed()) {
				bool = true;
			}

		} catch (Exception e) {
			bool = false;
		}

		return bool;
	}

	public boolean verifyRegularazationReasonDropDownoptionIsDisplayedonce() {

		boolean bool = true;
		int numOfFailure = 0;
		int lateArrivalCounter = 0;
		int missedSwipeCounter = 0;
		int outdoorClientvisitCounter = 0;
		int punchInApproval = 0;

		List<WebElement> regularazationDropdown_list = driver.findElements(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//select[@id='ReasonSelect']/option"));

		for (WebElement e : regularazationDropdown_list) {

			if (e.getText().equals("Late Arrival")) {
				lateArrivalCounter++;
			}

			if (e.getText().equals("Missed Swipe")) {
				missedSwipeCounter++;
			}

			if (e.getText().equals("Outdoor/Client Visit")) {
				outdoorClientvisitCounter++;
			}

			if (e.getText().equals("PunchIn Approval")) {
				punchInApproval++;
			}

		}

		if (lateArrivalCounter > 1) {
			log("late Arrival Option is duplicated");

			numOfFailure++;
		}
		if (missedSwipeCounter > 1) {

			log("Missed Swipe Option is duplicated");
			numOfFailure++;
		}
		if (outdoorClientvisitCounter > 1) {

			log("Outdoor/Client Visit Option is duplicated");
			numOfFailure++;
		}
		if (punchInApproval > 1) {

			log("PunchIn Approval Option is duplicated");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			bool = false;
		}

		return bool;

	}

	public boolean verifyByDefaultInAndOutTimeValue() {
		boolean bool = false;

		WebElement intime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//input[@id='defaultEntryIn']"));

		System.out.println("Intime : " + intime.getText());

		if (!intime.getText().equals(null)) {
			bool = true;
		}

		return bool;
	}

	public boolean Regulerization_with_outdoor_intime_outtime_editable_verification() {

		WebElement intime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ dbTnaCalIndexPage.timeCounter
						+ "]//input[@id='defaultEntryIn']"));

		WebElement outtime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ dbTnaCalIndexPage.timeCounter
						+ "]//input[@id='defaultEntryOut']"));

		if (intime.toString().length() > 0 && outtime.toString().length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'View')]")
	WebElement view_btn;

	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'Cancel')]")
	WebElement cancel_btn;

	public boolean Outdoor_request_Cancel_View_option_verification() {

		if (view_btn.isDisplayed() && cancel_btn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = "//div[contains(text(),'Please select any cell with WO status.')]")
	WebElement woff_message;

	public boolean WeeklyOffMessage_verification() {

		if (woff_message.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//span[contains(text(),'Apply Weekly Off')]")
	WebElement Apply_week_off_lbl;

	public boolean ApplyWeeklyOffPageOpen_verification() {

		if (Apply_week_off_lbl.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//input[@id='AppDate']")
	WebElement Selected_date_tbox;

	public boolean Selectdatedisplay_verification() {

		if (Selected_date_tbox.toString().contains(dbTnaCalIndexPage.onlydate)) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//textarea[@id='txtRemarks']")
	WebElement swepp_off_remark_tbox;

	public boolean SwapOffRemarkTextBox_verification() {

		if (swepp_off_remark_tbox.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//a[@id='btnApplyWeeklyOff']")
	WebElement apply_now_button;

	public boolean SwapOffApplyNowButton_verification() {

		if (apply_now_button.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = ".//a[@id='thisyear']")
	WebElement This_year_button;

	@FindBy(xpath = ".//a[@id='lastyear']")
	WebElement Last_year_button;

	public boolean SwapOff_this_year_last_year_tabs_verification() {

		if (apply_now_button.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean shiftNameDropDownIsDisplayed() {

		return driver.findElement(
				By.xpath("//div[contains(@class,'DataVal')]["
						+ dbTnaCalIndexPage.timeCounter
						+ "]//select[contains(@class,'shifttype ')]"))
				.isDisplayed();

	}
}
