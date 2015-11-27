package com.zinghr.tna.verification;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;

public class SettingsTimeAttendanceSetupVerification extends AbstractPage {

	public SettingsTimeAttendanceSetupVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h3[contains(.,'Time and Attendance')]")
	WebElement timeandattendance_header;

	public boolean verifyTimeAndAttendancePageisDisplayed() {

		boolean bool = false;

		Common.waitForElement(driver, "//h3[contains(.,'Time and Attendance')]");

		if (timeandattendance_header.isDisplayed())

		{

			bool = true;

		}

		return bool;
	}

	public boolean verifyTimeAndAttendanceHeader() {
		boolean bool = false;

		if (timeandattendance_header.getText().equals("Time and Attendance"))

		{

			bool = true;

		}

		return bool;
	}

	@FindBy(xpath = "//a[@id='TabTNA']")
	WebElement setMyAttendance_header;

	@FindBy(xpath = "//a[@id='TabLMS']")
	WebElement setupLeavePolicy_header;

	@FindBy(xpath = "//a[@id='TabCal']")
	WebElement setupCalendar_header;

	public boolean verifysetMyAttendanceHeader() {

		boolean bool = false;

		if (setMyAttendance_header.isDisplayed()
				&& setMyAttendance_header.getText().equals("Set My Attendance")) {
			bool = true;
		}

		return bool;
	}

	public boolean verifySetupLeavePolicyHeader() {

		boolean bool = false;

		if (setupLeavePolicy_header.isDisplayed()
				&& setupLeavePolicy_header.getText().equals(
						"Setup Leave Policy")) {
			bool = true;
		}

		return bool;

	}

	public boolean verifySetupCalendarHeader() {

		boolean bool = false;

		if (setupCalendar_header.isDisplayed()
				&& setupCalendar_header.getText().equals("Setup Calendar")) {
			bool = true;
		}

		return bool;

	}

	@FindBy(xpath = "//button[contains(.,'Add New Attendance Group')]")
	WebElement addNewAttendanceGroup_btn;

	public boolean verifyAddNewAttendanceGroupButton() {
		boolean bool = false;

		if (addNewAttendanceGroup_btn.isDisplayed()) {
			bool = true;
		}

		return bool;

	}

	@FindBy(xpath = "//h4[contains(.,'Add New Group')]")
	WebElement addNewGroup_header;

	public boolean verifyNewGroupPopUp() {
		boolean bool = false;
		if (addNewGroup_header.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//input")
	WebElement addNewGroup_txtfld;

	public boolean verifyNewGroupTextFieldIsAvailability() {
		boolean bool = false;
		if (addNewGroup_txtfld.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//button[contains(.,'Add')]")
	WebElement addNewGroup_btn;

	public boolean verifyNewGroupButtonIsAvailability() {
		boolean bool = false;
		if (addNewGroup_btn.isDisplayed()) {

			bool = true;
		}

		return bool;
	}

	@FindBy(xpath = "//div[@class='tabbable tna_group']//li/a")
	List<WebElement> attendanceGroup_list;

	public boolean verifyCreatedAtteandsGroup(String groupName,
			int totalGroupCount) {
		boolean bool = false;

		for (WebElement e : attendanceGroup_list) {

			if (e.getText().equals(groupName)) {
				bool = true;
				break;
			}

		}

		if ((totalGroupCount + 1) == attendanceGroup_list.size()) {
			bool = true;
		}
		return bool;
	}

	@FindBy(xpath = "//div[@id='box-config']//div[@class='modal-content']")
	WebElement addNewgroup_tab;

	public boolean verifyCancleButton() {

		return !addNewgroup_tab.isDisplayed();
	}

	public boolean verifyCommonGroup() {

		return attendanceGroup_list.get(0).isDisplayed();
	}

	@FindBy(xpath = "//h4[contains(.,'Question')]")
	List<WebElement> questionHeader_list;

	public boolean verifyQuestionHeader() {

		return questionHeader_list.get(0).isDisplayed();
	}

	public boolean verifyQuestionChangeFromCommonGroupHeaderAvailibility() {

		return questionHeader_list.get(1).isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'Attendance Marking')]")
	WebElement attendanceMarketing_header;

	public boolean verifyOASPageisDisplayed() {

		return attendanceMarketing_header.isDisplayed();
	}

	@FindBy(xpath = "//input[@value='BIO']")
	WebElement biomatric_chechbox;

	@FindBy(xpath = "//input[@value='CARD']")
	WebElement swipecards_chechbox;

	@FindBy(xpath = "//input[@value='PI']")
	WebElement punchIN_chechbox;

	@FindBy(xpath = "//input[@value='OAS']")
	WebElement managerMarking_chechbox;

	@FindBy(xpath = "//input[@value='MT']")
	WebElement mobile_chechbox;

	public boolean verifyFirstblockCheckBoxIsDisplayed() {

		return biomatric_chechbox.isDisplayed()
				&& swipecards_chechbox.isDisplayed()
				&& punchIN_chechbox.isDisplayed()
				&& managerMarking_chechbox.isDisplayed()
				&& mobile_chechbox.isDisplayed();

	}

	public boolean verifyFirstBlockCheckboxSelectedByDefault() {

		return biomatric_chechbox.isSelected() && punchIN_chechbox.isSelected()
				&& managerMarking_chechbox.isSelected();
	}

	@FindBy(xpath = "//select[contains(@class,'CycleStart')]")
	WebElement attendanceCycleStart_dropdown;

	@FindBy(xpath = "//select[contains(@class,'CycleFrom')]")
	WebElement attendanceOpen_dropdown;

	@FindBy(xpath = "//select[contains(@class,'CycleTo')]")
	WebElement attendanceClose_dropdown;

	public boolean verifySecondBlockDropDownIsDisplayed() {

		System.out.println("attendance start "
				+ attendanceCycleStart_dropdown.getText());

		return attendanceCycleStart_dropdown.isDisplayed()
				&& attendanceOpen_dropdown.isDisplayed()
				&& attendanceClose_dropdown.isDisplayed();
	}

	@FindBy(xpath = "//strong[contains(.,'Shift Rostering')]/../label[contains(.,'Yes')]/input")
	WebElement shiftRosteringYes_radio;

	@FindBy(xpath = "//strong[contains(.,'Shift Rostering')]/../label[contains(.,'No')]/input")
	WebElement shiftRosteringNo_radio;

	public boolean verifyThirdBlockRadioButtonIsDisplayed() {

		return shiftRosteringYes_radio.isDisplayed()
				&& shiftRosteringNo_radio.isDisplayed();
	}

	@FindBy(xpath = "//a[contains(.,'Shift Master')]")
	WebElement shiftMaster_link;

	public boolean verifyShiftMasterLinkIsDisplayed() {

		return shiftMaster_link.isDisplayed();
	}

	@FindBy(xpath = "//div[@aria-describedby='dvShiftsetting']")
	WebElement shiftMaster_popup;

	public boolean verifyShiftMasterPopupIsDisplayed() {

		return shiftMaster_popup.isDisplayed();
	}

	@FindBy(xpath = "//span[contains(.,'Shift Master')][@class='ui-dialog-title']")
	WebElement shiftmasterPopup_header;

	public boolean verifyShiftMasterPopuptitleIsDisplayed() {

		return shiftmasterPopup_header.isDisplayed();
	}

	@FindBy(xpath = "//select[@id='ddlShiftList']")
	WebElement selectShift_dropdown;

	public boolean verifySelectShiftDropdownIsDisplayed() {

		return selectShift_dropdown.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='txtShiftName']")
	WebElement shiftName_textfield;

	public boolean verifyShiftNameTextFieldIsDisplayed() {

		return shiftName_textfield.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='txtNghtSftY']")
	WebElement nightShiftYes_radiobutton;

	@FindBy(xpath = "//input[@id='txtNghtSftN']")
	WebElement nightShiftNo_radiobutton;

	public boolean verifyNightShiftApplicableRadioButtonIsDisplayed() {
		return nightShiftYes_radiobutton.isDisplayed()
				&& nightShiftYes_radiobutton.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='txtDtOverY']")
	WebElement dateOverlappinginshiftYes_radiobutton;

	@FindBy(xpath = "//input[@id='txtDtOverN']")
	WebElement dateOverlappinginshiftNo_radiobutton;

	public boolean verifyDateOverlappingShiftRadioButtonIsDisplayed() {
		return dateOverlappinginshiftYes_radiobutton.isDisplayed()
				&& dateOverlappinginshiftNo_radiobutton.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='txtInTime']")
	WebElement inTime_textField;

	@FindBy(xpath = "//input[@id='txtOutTime']")
	WebElement outTime_textField;

	public boolean verifyInTimeAndOutTimeTextfieldIsDisplayed() {
		return inTime_textField.isDisplayed()
				&& outTime_textField.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='txtSwSePar']")
	WebElement swipeSeparatorParameter_textField;

	public boolean verifyswipeSeparatorParameteTextfieldIsDisplayed() {
		return swipeSeparatorParameter_textField.isDisplayed();
	}

	@FindBy(xpath = "//button[@id='submitNewShift']")
	WebElement submitButtonOnShiftMasterDialog_button;

	@FindBy(xpath = "//i[@id='popupclose']")
	WebElement cancleButtonOnShiftMasterDialog_button;

	public boolean verifySubmitAndCancleButtonIsDisplayed() {

		return submitButtonOnShiftMasterDialog_button.isDisplayed()
				&& cancleButtonOnShiftMasterDialog_button.isDisplayed();
	}

	@FindBy(xpath = "//input[contains(@class,'pop-hover invalid')]")
	List<WebElement> mandatoryfieldsOfShiftMasterPopup_list;

	public boolean verifyManadatoryFieldOfShiftMasterPage() {
		int counter = 0;
		boolean bool = false;

		for (WebElement e : mandatoryfieldsOfShiftMasterPopup_list) {

			if (e.isDisplayed()) {
				bool = true;

			} else {
				counter++;

			}

		}
		System.out.println("counter " + counter);
		if (counter > 0) {
			bool = false;
		}

		return bool;
	}

	@FindBy(xpath = "//input[contains(@class,'ShiftIn')]")
	WebElement shiftTimeFrom_textfield;

	@FindBy(xpath = "//input[contains(@class,'ShiftOut')]")
	WebElement shiftTimeTo_textfield;

	public boolean verifyBydefaultfixedShiftfunctionality() {

		return shiftTimeFrom_textfield.getText().equals("08:30")
				&& shiftTimeTo_textfield.equals("17:00");
	}


	@FindBy(xpath = "")
	WebElement checked_marking_manager;

	public boolean verifyMarkingManagerChecked() {

		return checked_marking_manager.isDisplayed();
	}
	

	@FindBy(xpath = "")
	WebElement shift_master_link;

	public boolean verifyShiftMasterLink() {

		return shift_master_link.isDisplayed();
	}
	
	@FindBy(xpath = "")
	WebElement shift_name;

	public boolean verifyShiftName() {
		return shiftName_textfield.isDisplayed();
	}
	
	@FindBy(xpath = "")
	WebElement shiftIn_time;
	
	public boolean verifyShiftInTime() {
		return shiftIn_time.isDisplayed();
	}
	
	@FindBy(xpath = "")
	WebElement shiftOut_time;
	
	public boolean verifyShiftOutTime() {
		return shiftOut_time.isDisplayed();
	}
	
	@FindBy(xpath = "")
	WebElement shiftTotal_time;
	
	public boolean verifyShiftTotalTime() {
		return shiftTotal_time.isDisplayed();
	}
	
	@FindBy(xpath = "")
	WebElement shiftTotal_time1;
	
	public boolean verifyShiftTotalTimevalue() {
		
		String time = shiftTotal_time1.getAttribute("");
		if (TestData.total_time.equalsIgnoreCase(time))
		{
			return true;
		}
		else
		{
			System.out.println("======-_-_-_-_Wrong Time_-_-_-_-=======");
			return false;
		}
	}
	
	@FindBy(xpath = "")
	WebElement swipe_seperator;
	
	public boolean verifySwipeSeperator() {
		return swipe_seperator.isDisplayed() && swipe_seperator.toString().equalsIgnoreCase(TestData.swipe_value);
	}
	
	@FindBy(xpath = "")
	WebElement employee_value1_outdoor;
	@FindBy(xpath = "")
	WebElement employee_value2_regularize;
	@FindBy(xpath = "")
	WebElement employee_value3_shift;
	@FindBy(xpath = "")
	WebElement employee_value4_extra;
	@FindBy(xpath = "")
	WebElement employee_value5_coff;
	
	public boolean verifyEmployeeValueOutdoorChecked() {
		return employee_value1_outdoor.isSelected();
	}
	public boolean verifyEmployeeValueRegChecked() {
		return employee_value2_regularize.isSelected();
	}
	public boolean verifyEmployeeValueShiftChecked() {
		return employee_value3_shift.isSelected();
	}
	public boolean verifyEmployeeValueExtraChecked() {
		return employee_value4_extra.isSelected();
	}
	public boolean verifyEmployeeValueCoffChecked() {
		return employee_value5_coff.isSelected();
	}
	
	@FindBy(xpath = "")
	WebElement outdoor_btn_dashboard;
	public boolean verifyOutdoorBtnDashboard() {
		
		if(!outdoor_btn_dashboard.isDisplayed()){
			return true;
		}
		else{
			return false;
		}
	}
/*	@FindBy(xpath = .//div[@class='questions']/div[5]/label") 
 *  WebElement extraTime_options_list */	
	
	@FindBy(xpath = ".//input[@value='CompOff']/.[@name='check']/..")
	WebElement extraTime_coff;
	@FindBy(xpath = ".//input[@value='OverTime']/.[@name='check']/..")
	WebElement extraTime_OT;
	@FindBy(xpath = ".//input[@value='LeaveBalance']/.[@name='check']/..")
	WebElement extraTime_leave_balanc;
	@FindBy(xpath = ".//input[@value='OtherPayment']/.[@name='check']/..")
	WebElement extraTime_other_paymnt;
	
	@FindBy(xpath = ".//div[@class='questions']/div[5]/label/input")
	WebElement extraTime_option_checkbox;
	
	public boolean verifyExtraTimeOptions() {
		
		if(extraTime_coff.isDisplayed()&& extraTime_OT.isDisplayed() && extraTime_leave_balanc.isDisplayed() && extraTime_other_paymnt.isDisplayed()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean verifyExtraTimeOptionCheckbox() {
		return extraTime_option_checkbox.isDisplayed();
	}
	
	public boolean verifyExtraTimeOptionCheckboxNotselected() {
		return extraTime_option_checkbox.isSelected();
	}

	@FindBy(xpath = ".//div[6]/label[contains(text(),'Yes')]")
	WebElement we_allow_yes;
	@FindBy(xpath = ".//div[6]/label[contains(text(),'No')]")
	WebElement we_allow_no;
	
	public boolean verifyWeAllowYesNo() {
		
		return we_allow_yes.isDisplayed() && we_allow_no.isDisplayed();
	}
	
	@FindBy(xpath = ".//*[@id='WorkingHrs']/div/input[1]")
	WebElement work_hour_full;
	@FindBy(xpath = ".//*[@id='WorkingHrs']/div/input[2]")
	WebElement work_hour_half;
	public boolean verifyworkinghoursFieldLength() {
		
		int field1= work_hour_full.getAttribute("value").length();
		int field2= work_hour_half.getAttribute("value").length();
			

		if(field1==3 && field2==3)
		{
			return true;
		}
		else{
		return false;
		}
	}
}