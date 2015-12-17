package com.zinghr.tna.indexPage;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class SettingsTimeAttendanceSetupIndexPage extends AbstractPage {

	public SettingsTimeAttendanceSetupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@id='btnDemoData']//a[@class='btn btn-primary']")
	WebElement ProceedCurrentPlanAndDemoData_btn;

	@FindBy(xpath = "//li[@id='HeaderSetting']")
	WebElement settingIcon_btn;

	@FindBy(xpath = "//p[contains(.,'Time')]")
	WebElement timeAndAttendence_btn;

	public SettingsTimeAttendanceSetupVerification clickProceedButtonofCurrentPlanAndDemoData() {

		/* Common.clickOn(driver, ProceedCurrentPlanAndDemoData_btn); */

		ProceedCurrentPlanAndDemoData_btn.click();

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification clickSettingsIcon() {

		Common.clickOn(driver, settingIcon_btn);

		
		/* settingIcon_btn.click(); */

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	int counter = 1;

	public SettingsTimeAttendanceSetupVerification clickTimeAndAttendenseFromCircle() {

		navigateToSetupCircle();

		/*
		 * try {
		 * 
		 * if (driver .findElement( By.xpath(
		 * "//p[contains(.,'Travel')]/../../div[contains(@class,'disable')][@id='dvTNA']"
		 * )) .isDisplayed()) {
		 * 
		 * if (counter < 5) { driver.navigate().refresh(); Common.pause(2);
		 * counter++;
		 * 
		 * System.out.println("counter " + counter);
		 * clickTimeAndAttendenseFromCircle(); }
		 * 
		 * } } catch (Exception e) {
		 */
		Common.clickOn(driver, timeAndAttendence_btn);

		/*
		 * }
		 */
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	public SettingsTimeAttendanceSetupVerification navigateToSetupCircle() {
		driver.navigate().to(
				"http://automation.zinghr.com/Setup/OneTimeSetUp/Organisation");
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	public SettingsTimeAttendanceSetupVerification TimeAndAttendancePageOpen() {

		Common.pause(1);

		Common.pause(2);
		clickSettingsIcon();

		Common.pause(4);
		clickTimeAndAttendenseFromCircle();
		Common.pause(2);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//button[contains(.,'Add New Attendance Group')]")
	WebElement addNewAttendanceGroup_btn;

	public SettingsTimeAttendanceSetupVerification clickAddNewAttendanceGroup() {

		Common.clickOn(driver, addNewAttendanceGroup_btn);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//div[@id='box-config']//input")
	WebElement addNewGroup_textbox;

	public SettingsTimeAttendanceSetupVerification enterNewGroupName(
			String groupName) {

		Common.type(addNewGroup_textbox, groupName);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//div[@id='box-config']//button[contains(.,'Add')]")
	WebElement addOnPopup_btn;

	public SettingsTimeAttendanceSetupIndexPage clickAddButtonOnPopup() {

		Common.clickOn(driver, addOnPopup_btn);

		return new SettingsTimeAttendanceSetupIndexPage(driver);
	}

	public SettingsTimeAttendanceSetupVerification addNewGroupFunctionality(
			String groupName) {

		Common.pause(2);
		enterNewGroupName(groupName);
		Common.pause(1);
		clickAddButtonOnPopup();

		Common.pause(2);

		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//div[@id='box-config']//button[@class='close']")
	WebElement popupClose_btn;

	public SettingsTimeAttendanceSetupVerification clickCloseButtonOnPopup() {

		Common.clickOn(driver, popupClose_btn);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//div[@class='tabbable tna_group']//li/a")
	List<WebElement> attendanceGroup_list;

	public int calculateAvailableAttendanceGroup() {

		return attendanceGroup_list.size();

	}

	@FindBy(xpath = "//a[contains(.,'OAS')]")
	WebElement oasMenu_button;

	public SettingsTimeAttendanceSetupVerification clickOASMenu() {
		Common.clickOn(driver, oasMenu_button);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//strong[contains(.,'Shift Rostering')]/../label[contains(.,'Yes')]/input")
	WebElement shiftRosteringYes_radio;

	public SettingsTimeAttendanceSetupVerification clickShiftRosterYesRadioButton() {
		Common.pause(1);
		Common.clickOn(driver, shiftRosteringYes_radio);
		Common.pause(1);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//a[contains(.,'Shift Master')]")
	WebElement shiftMaster_link;

	public SettingsTimeAttendanceSetupVerification clickShiftMasterLink() {

		Common.pause(1);
		Common.clickOn(driver, shiftMaster_link);
		Common.pause(1);

		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	@FindBy(xpath = "//button[@id='submitNewShift']")
	WebElement submitButtonOnShiftMasterDialog_button;

	public SettingsTimeAttendanceSetupVerification clickSubmitButtonOnShiftMasterDialog() {

		Common.pause(1);
		Common.clickOn(driver, submitButtonOnShiftMasterDialog_button);
		Common.pause(1);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement marking_manager;

	public SettingsTimeAttendanceSetupVerification checkMarkingManger() {
		clickSettingsIcon();
		clickTimeAndAttendenseFromCircle();

		if (marking_manager.isSelected()) {
			log("Marnking Manger is selected.");
		} else {
			Common.clickOn(driver, marking_manager);
			Common.pause(2);
		}

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//div[@class='questions']/div[3]/label[1]")
	WebElement yes_radio_btn;
	@FindBy(xpath = ".//*[@id='ddlShiftList']//option")
	List<WebElement> shift_list;
	@FindBy(xpath = ".//*[@id='ddlShiftList']")
	WebElement shift_field;

	public SettingsTimeAttendanceSetupVerification selectShift() {
		Common.clickOn(driver, shift_field);
		Random rnd = new Random();
		int i = rnd.nextInt(shift_list.size());
		if (i > 1) {
			shift_list.get(i).click();
		}

		else {
			i++;
			shift_list.get(i).click();
		}
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification selectYesFollowShiftRostering() {
		/*
		 * clickSettingsIcon(); clickTimeAndAttendenseFromCircle();
		 */
		Common.clickOn(driver, yes_radio_btn);
		// Common.clickOn(driver, shiftMaster_link);
		// selectShift();

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification selectShiftMaster() {
		Common.clickOn(driver, shiftMaster_link);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "//input[@id='txtShiftName']")
	WebElement shiftName_textfield;

	public SettingsTimeAttendanceSetupVerification enterShiftName(String name) {

		Common.clickOn(driver, shiftName_textfield);
		Common.type(shiftName_textfield, name);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='txtInTime']")
	WebElement shiftIn_time;

	public SettingsTimeAttendanceSetupVerification enterInTime(String time) {

		Common.clickOn(driver, shiftIn_time);
		Common.type(shiftIn_time, time);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='txtOutTime']")
	WebElement shiftOut_time;

	public SettingsTimeAttendanceSetupVerification enterOutTime(String time) {

		Common.clickOn(driver, shiftOut_time);
		Common.type(shiftOut_time, time);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='txtSwSePar']")
	WebElement swipe_sep;

	public SettingsTimeAttendanceSetupVerification enterSwipeSeperator(
			String value) {

		Common.clickOn(driver, swipe_sep);
		Common.type(swipe_sep, value);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification setMyAttendancefromCircle() {
		log("===================================================================");
		clickSettingsIcon();
		clickTimeAndAttendenseFromCircle();
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@class='fa fa-2x fa-home']")
	WebElement home_icon;

	public SettingsTimeAttendanceSetupVerification goToDashboard() {

		Common.clickOn(driver, home_icon);
		Common.pause(2);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//div[@class='questions']/div[4]/label[1]/input")
	WebElement outdoor_checkbox;

	public SettingsTimeAttendanceSetupVerification empoloyeeApplyOutdoorunchecked() {
		if (outdoor_checkbox.isSelected()) {
			Common.clickOn(driver, outdoor_checkbox);
			clickSavebtn();
			driver.switchTo().defaultContent();
			goToDashboard();
		} else {
			clickSavebtn();
			driver.switchTo().defaultContent();
			goToDashboard();
		}
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//div[6]/label[contains(text(),'Yes')]")
	WebElement proxy_radio_yes;
	@FindBy(xpath = ".//div[6]/label[2]")
	WebElement proxy_radio_no;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok;

	public SettingsTimeAttendanceSetupVerification proxyApplyYes() {
		if (proxy_radio_yes.isSelected()) {
			Common.pause(2);
			clickSavebtn();
			Common.pause(2);
			Common.clickOn(driver, ok);
		} else {
			Common.clickOn(driver, proxy_radio_yes);
			clickSavebtn();
			Common.pause(2);
			Common.clickOn(driver, ok);
		}
		driver.switchTo().defaultContent();
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification proxyApplyNo() {
		if (proxy_radio_no.isSelected()) {
			Common.pause(2);
			clickSavebtn();
			Common.pause(2);
			Common.clickOn(driver, ok);
		} else {
			Common.clickOn(driver, proxy_radio_no);
			Common.pause(2);
			clickSavebtn();
			Common.pause(2);
			Common.clickOn(driver, ok);
		}
		driver.switchTo().defaultContent();

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//a[@class='btn btn-primary TNAGroupSave']")
	WebElement save_btn;

	public SettingsTimeAttendanceSetupVerification clickSavebtn() {
		Common.clickOn(driver, save_btn);
		Common.clickOn(driver, ok);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='WorkingHrs']/div[1]/label/input")
	WebElement work_hour_radio_btn;
	@FindBy(xpath = ".//*[@id='WorkingHrs']/div/input[1]")
	WebElement work_hour_full;
	@FindBy(xpath = ".//*[@id='WorkingHrs']/div/input[2]")
	WebElement work_hour_half;

	public SettingsTimeAttendanceSetupVerification checkWorkingHours(
			String num1, String num2) {
		Common.clickOn(driver, work_hour_radio_btn);
		Common.pause(1);
		Common.clickOn(driver, work_hour_full);
		work_hour_full.clear();
		Common.type(work_hour_full, num1);
		Common.clickOn(driver, work_hour_half);
		work_hour_half.clear();
		Common.type(work_hour_half, num2);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='LateComming']/div[1]/label/input")
	WebElement late_work_checkbox;
	@FindBy(xpath = ".//*[@id='LateComming']/div/input[1]")
	WebElement late_mins;
	@FindBy(xpath = ".//*[@id='LateComming']/div/input[2]")
	WebElement late_times;

	public SettingsTimeAttendanceSetupVerification checklateWorking(
			String num1, String num2) {
		Common.clickOn(driver, late_work_checkbox);
		Common.pause(1);
		Common.clickOn(driver, late_mins);
		Common.type(late_mins, num1);
		Common.clickOn(driver, late_times);
		Common.type(late_times, num2);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='WorkingHrs']")
	WebElement side_click;
	@FindBy(xpath = ".//*[@id='EarlyGoing']/div[1]/label/input")
	WebElement early_go_checkbox;
	@FindBy(xpath = ".//*[@id='EarlyGoing']/div/input[1]")
	WebElement early_mins;
	@FindBy(xpath = ".//*[@id='EarlyGoing']/div/input[2]")
	WebElement early_times;

	public SettingsTimeAttendanceSetupVerification checkEarlyGoing(String num1,
			String num2) {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, early_go_checkbox);
		Common.clickOn(driver, early_go_checkbox);
		Common.pause(1);
		Common.clickOn(driver, early_mins);
		Common.type(early_mins, num1);
		Common.clickOn(driver, early_times);
		Common.type(early_times, num2);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement flexi_checkbox;
	@FindBy(xpath = "")
	WebElement flexi_mins;
	@FindBy(xpath = "")
	WebElement flexi_total_times;
	@FindBy(xpath = "")
	WebElement flexi_times;

	public SettingsTimeAttendanceSetupVerification checkFlexiTime(String num1,
			String num2, String num3) {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, flexi_checkbox);
		Common.clickOn(driver, flexi_checkbox);
		Common.pause(1);
		Common.clickOn(driver, flexi_mins);
		Common.type(late_mins, num1);
		Common.clickOn(driver, flexi_total_times);
		Common.type(late_times, num2);
		Common.clickOn(driver, flexi_times);
		Common.type(late_times, num3);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement extratime_checkbox;
	@FindBy(xpath = "")
	WebElement extratime_mins_prior;
	@FindBy(xpath = "")
	WebElement extratime_mins_post;
	@FindBy(xpath = "")
	WebElement extratime_mins_early;
	@FindBy(xpath = "")
	WebElement extratime_mins_late;
	@FindBy(xpath = "")
	WebElement extratime_mins_day;
	@FindBy(xpath = "")
	WebElement extratime_mins_week;
	@FindBy(xpath = "")
	WebElement extratime_mins_month;
	@FindBy(xpath = "")
	WebElement extratime_mins_year;

	public SettingsTimeAttendanceSetupVerification checkExtraTime(String num1,
			String num2, String num3, String num4, String num5, String num6,
			String num7, String num8) {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, extratime_checkbox);
		Common.clickOn(driver, extratime_checkbox);
		Common.pause(1);
		Common.clickOn(driver, extratime_mins_prior);
		Common.type(late_mins, num1);
		Common.clickOn(driver, extratime_mins_post);
		Common.type(late_times, num2);
		Common.clickOn(driver, extratime_mins_early);
		Common.type(late_times, num3);
		Common.clickOn(driver, extratime_mins_late);
		Common.type(late_times, num4);
		Common.clickOn(driver, extratime_mins_day);
		Common.type(late_times, num5);
		Common.clickOn(driver, extratime_mins_week);
		Common.type(late_times, num6);
		Common.clickOn(driver, extratime_mins_month);
		Common.type(late_times, num7);
		Common.clickOn(driver, extratime_mins_year);
		Common.type(late_times, num8);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement checkbox_singleSwipe;
	@FindBy(xpath = "")
	WebElement singleSwipe_present;
	@FindBy(xpath = "")
	WebElement singleSwipe_absent;

	public SettingsTimeAttendanceSetupVerification checkSingleSwipePresent() {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_singleSwipe);
		Common.clickOn(driver, checkbox_singleSwipe);
		Common.clickOn(driver, singleSwipe_present);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification checkSingleSwipeAbsent() {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_singleSwipe);
		Common.clickOn(driver, checkbox_singleSwipe);
		Common.clickOn(driver, singleSwipe_absent);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement checkbox_noSwipe;
	@FindBy(xpath = "")
	WebElement noSwipe_present;
	@FindBy(xpath = "")
	WebElement noSwipe_absent;

	public SettingsTimeAttendanceSetupVerification checkNoSwipePresent() {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_noSwipe);
		Common.clickOn(driver, checkbox_noSwipe);
		Common.clickOn(driver, noSwipe_present);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	public SettingsTimeAttendanceSetupVerification checkNoSwipeAbsent() {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_noSwipe);
		Common.clickOn(driver, checkbox_noSwipe);
		Common.clickOn(driver, noSwipe_absent);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@id='Comp Off Weekday']/div[1]/label/input")
	WebElement checkbox_compoff_weekday;
	@FindBy(xpath = ".//div[@id='Comp Off Weekday']//.[@class='form-control']")
	WebElement compoff_mins_weekday;
	@FindBy(xpath = "")
	WebElement compoff_radio_btn_overtime;

	public SettingsTimeAttendanceSetupVerification checkcompOffWeekday(
			String num1) {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_compoff_weekday);
		Common.clickOn(driver, checkbox_compoff_weekday);
		Common.clickOn(driver, compoff_mins_weekday);
		Common.type(compoff_mins_weekday, num1);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement checkbox_compoff_holiday;
	@FindBy(xpath = "")
	WebElement compoff_mins_holiday;
	@FindBy(xpath = "")
	WebElement compoff_radio_btn_overtime_working;

	public SettingsTimeAttendanceSetupVerification checkcompOffHoliday(
			String num1) {
		Common.clickOn(driver, side_click);
		Common.scrollToVertical(driver, checkbox_compoff_holiday);
		Common.clickOn(driver, checkbox_compoff_holiday);
		Common.clickOn(driver, compoff_mins_holiday);
		Common.type(compoff_mins_holiday, num1);

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//*[@class='sidebar-collapse btn']")
	WebElement sideBar_menu_btn;
	/*
	 * @FindBy(xpath = "") WebElement download_link;
	 */
	@FindBy(xpath = ".//*[@class='fa fa-2x fa-plus-circle']")
	WebElement employee_master_menu;
	@FindBy(xpath = ".//*[@class='fa fa-download']")
	WebElement download_link;
	@FindBy(xpath = "Add single employee = .//a[@id='NewEmp']")
	WebElement addSingle_employee;

	public SettingsTimeAttendanceSetupVerification clickEmployeeMaster() {
		Common.pause(2);
		Common.jsClick(driver, employee_master_menu);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	public SettingsTimeAttendanceSetupVerification clickAddSingleEmployee() {
		Common.pause(1);
		Common.jsClick(driver, addSingle_employee);
		Common.pause(2);
		return new SettingsTimeAttendanceSetupVerification(driver);

	}

	public SettingsTimeAttendanceSetupVerification employeeMasterDownload() {
		Common.pause(2);
		Common.clickOn(driver, sideBar_menu_btn);
		// Common.scrollToVertical(driver, employee_master_menu);
		Common.jsClick(driver, employee_master_menu);
		Common.pause(2);
		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		Common.clickOn(driver, download_link);
		Common.pause(5);
		try {
			Runtime.getRuntime().exec(
					"\"C:\\Users\\KSPL08\\Downloads\\EmployeeMaster.xls\"");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlEmployeeGroup']")
	WebElement Employee_group;
	@FindBy(xpath = "")
	WebElement Employee_group_list;
	@FindBy(xpath = ".//select[@id='ddlAttendanceGroup']")
	WebElement Attendance_group;
	@FindBy(xpath = "")
	WebElement Attendance_group_list;
	@FindBy(xpath = ".//select[@id='ddlLeaveGroup']")
	WebElement Leave_group;
	@FindBy(xpath = "")
	WebElement Leave_group_list;
	@FindBy(xpath = ".//select[@id='ddlCalendarGroup']")
	WebElement Calendar_group;
	@FindBy(xpath = "")
	WebElement Calendar_group_list;
	@FindBy(xpath = ".//select[@id='ddlAttendanceModeGroup']")
	WebElement Attendance_mode_group;
	@FindBy(xpath = "")
	WebElement Attendance_mode_group_list;
	@FindBy(xpath = ".//select[@id='ddlAttendanceRuleGroup']")
	WebElement Attendance_rule_group;
	@FindBy(xpath = "")
	WebElement Attendance_rule_group_list;
	@FindBy(xpath = ".//select[@id='ddlDesignation']")
	WebElement Designation;
	@FindBy(xpath = "")
	WebElement Designation_list;
	@FindBy(xpath = ".//select[@id='ddlGrade']")
	WebElement Grade;
	@FindBy(xpath = "")
	WebElement Grade_list;
	@FindBy(xpath = ".//select[@id='ddlDivision']")
	WebElement Division;
	@FindBy(xpath = "")
	WebElement Division_list;
	@FindBy(xpath = ".//select[@id='ddlDivision']")
	WebElement Salutation;
	@FindBy(xpath = "")
	WebElement Salutation_list;
	@FindBy(xpath = ".//input[@id='txtFirstName']")
	WebElement First_Name;
	@FindBy(xpath = ".//input[@id='txtMiddleName']")
	WebElement Middle_Name;
	@FindBy(xpath = ".//input[@id='txtLastName']")
	WebElement Last_Name;
	@FindBy(xpath = "")
	WebElement Father_Name;

	public SettingsTimeAttendanceSetupVerification createNewEmployee() {
		clickEmployeeMaster();
		clickAddSingleEmployee();

		return new SettingsTimeAttendanceSetupVerification(driver);
	}

}
