package com.zinghr.tna.indexPage;

import java.util.List;

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

		Common.moveToObjectelement(driver, "//div[@id='seup-content']/object");

		try {

			if (driver
					.findElement(
							By.xpath("//p[contains(.,'Travel')]/../../div[contains(@class,'disable')][@id='dvTNA']"))
					.isDisplayed()) {

				if (counter < 5) {
					driver.navigate().refresh();
					Common.pause(2);
					counter++;

					System.out.println("counter " + counter);
					clickTimeAndAttendenseFromCircle();
				}

			}
		} catch (Exception e) {

			Common.clickOn(driver, timeAndAttendence_btn);

		}

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
	
	public SettingsTimeAttendanceSetupVerification checkMarkingManger()
	{
		clickSettingsIcon();
		clickTimeAndAttendenseFromCircle();
		
		if(marking_manager.isSelected())
		{
			log("Marnking Manger is selected.");
		}
		else
		{
			Common.clickOn(driver, marking_manager);
			Common.pause(2);
		}
		
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	@FindBy(xpath = "")
	WebElement yes_radio_btn;
	
	public SettingsTimeAttendanceSetupVerification selectYesFollowShiftRostering()
	{
		clickSettingsIcon();
		clickTimeAndAttendenseFromCircle();
		Common.clickOn(driver, yes_radio_btn);
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
	
	@FindBy(xpath = "")
	WebElement shiftIn_time;
	
	public SettingsTimeAttendanceSetupVerification enterInTime(String time) {
		
		Common.clickOn(driver, shiftIn_time);
		Common.type(shiftIn_time, time);
		
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	@FindBy(xpath = "")
	WebElement shiftOut_time;
	
	public SettingsTimeAttendanceSetupVerification enterOutTime(String time) {
		
		Common.clickOn(driver, shiftOut_time);
		Common.type(shiftOut_time, time);
		
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	public SettingsTimeAttendanceSetupVerification enterSwipeSeperator(String value) {
		
		Common.clickOn(driver, shiftOut_time);
		Common.type(shiftOut_time, value);
		
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	public SettingsTimeAttendanceSetupVerification empoloyeeApply()
	{
		clickSettingsIcon();
		clickTimeAndAttendenseFromCircle();
		return new SettingsTimeAttendanceSetupVerification(driver);
	}

	@FindBy(xpath = "")
	WebElement home_icon;
	public SettingsTimeAttendanceSetupVerification goToDashboard()
	{
		Common.clickOn(driver, home_icon);
		Common.pause(2);
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	@FindBy(xpath = "")
	WebElement outdoor_checkbox;
	@FindBy(xpath = "")
	WebElement save;
	public SettingsTimeAttendanceSetupVerification empoloyeeApplyOutdoorunchecked()
	{
		Common.clickOn(driver, outdoor_checkbox);
		Common.clickOn(driver, save);
		goToDashboard();
		return new SettingsTimeAttendanceSetupVerification(driver);
	}
	
	
}
