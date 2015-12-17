package com.zinghr.employeemaster.indexpage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.employeemaster.verification.EmployeeMasterVerificationPage;
import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;

public class EmployeeMasterIndexPage extends AbstractPage {

	public EmployeeMasterIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static int lastRowNoForEmployeeMaster = TestData.getlastRowcount(1)+1;
	
	@FindBy(xpath = ".//select[@id='ddlEmployeeGroup']")
	WebElement Employee_group;
	@FindBy(xpath = ".//*[@id='ddlEmployeeGroup']/option[2]")
	WebElement Employee_group_common;
	String emp_group = "";

	public EmployeeMasterVerificationPage selectEmployeeGroup(String option) {
		Common.selectFromComboByVisibleElement(Employee_group, option);
		log(option);
		Common.pause(1);
		emp_group = option;
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster ,0, emp_group);
		return new EmployeeMasterVerificationPage(driver);

	}

	@FindBy(xpath = ".//select[@id='ddlAttendanceGroup']")
	WebElement Attendance_group;
	@FindBy(xpath = ".//select[@id='ddlAttendanceGroup']/option[6]")
	WebElement Attendance_group_common;
	String attendance_group = "";

	public EmployeeMasterVerificationPage selectAttendanceGroup(String option) {
		Common.selectFromComboByVisibleElement(Attendance_group, option);
		log(option);
		Common.pause(1);
		attendance_group = option;
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 1, attendance_group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlLeaveGroup']")
	WebElement Leave_group;
	@FindBy(xpath = ".//select[@id='ddlLeaveGroup']/option[4]")
	WebElement Leave_group_common;
	String leave_group = "";

	public EmployeeMasterVerificationPage selectLeaveGroup(String option) {
		Common.selectFromComboByVisibleElement(Leave_group, option);
		log(option);
		Common.pause(1);
		leave_group = Leave_group_common.getText();
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 2, leave_group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlCalendarGroup']")
	WebElement Calendar_group;
	@FindBy(xpath = ".//select[@id='ddlCalendarGroup']/option[3]")
	WebElement Calendar_group_list;
	String cal_group = "";

	public EmployeeMasterVerificationPage selectCalendarGroup() {
		Common.clickOn(driver, Calendar_group);
		Common.clickOn(driver, Calendar_group_list);
		cal_group = Calendar_group_list.getText();
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 3, cal_group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlAttendanceModeGroup']")
	WebElement Attendance_mode_group;
	@FindBy(xpath = ".//select[@id='ddlAttendanceModeGroup']/option[5]")
	WebElement Attendance_mode_group_list;
	String att_mode_group = "";

	public EmployeeMasterVerificationPage selectAttendanceModeGroup() {
		Common.clickOn(driver, Attendance_mode_group);
		Common.clickOn(driver, Attendance_mode_group_list);
		att_mode_group = Attendance_mode_group_list.getText();
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 4, att_mode_group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlAttendanceRuleGroup']")
	WebElement Attendance_rule_group;
	@FindBy(xpath = ".//select[@id='ddlAttendanceRuleGroup']/option[2]")
	WebElement Attendance_rule_group_list;
	String att_rule_group = "";

	public EmployeeMasterVerificationPage selectAttendanceRuleGroup() {
		Common.clickOn(driver, Attendance_rule_group);
		Common.clickOn(driver, Attendance_rule_group_list);
		att_rule_group = Attendance_rule_group_list.getText();
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 5, att_rule_group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlGroup']")
	WebElement Group;
	@FindBy(xpath = ".//select[@id='ddlGroup']/option[3]")
	WebElement Group_list;
	String group = "";

	public EmployeeMasterVerificationPage selectGroup()
			throws InterruptedException {
		// Common.clickOn(driver, Group);
		Common.clickOn(driver, Group);
		Common.clickOn(driver, Group_list);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 6, group);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlDesignation']")
	WebElement Designation;
	String designation = "";

	public EmployeeMasterVerificationPage selectDesignation()
			throws InterruptedException {
		designation = Common.selectRandomOptionFromCombo(
				By.xpath(".//select[@id='ddlDesignation']"), driver);
		Common.selectFromComboByVisibleElement(Designation, designation);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 7, designation);
		log("designation =" + designation);

		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlGrade']")
	WebElement Grade;
	String grade = "";

	public EmployeeMasterVerificationPage selectGrade()
			throws InterruptedException {
		grade = Common.selectRandomOptionFromCombo(
				By.xpath(".//select[@id='ddlGrade']"), driver);
		Common.selectFromComboByVisibleElement(Grade, grade);
		log("grade = " + grade);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 8, grade);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlDivision']")
	WebElement Division;
	String division = "";

	public EmployeeMasterVerificationPage selectDivision()
			throws InterruptedException {
		division = Common.selectRandomOptionFromCombo(
				By.xpath(".//select[@id='ddlDivision']"), driver);
		Common.selectFromComboByVisibleElement(Division, division);
		log("Division = " + division);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 9, division);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlSalutation']")
	WebElement Salutation;
	@FindBy(xpath = ".//select[@id='ddlSalutation']/option[2]")
	WebElement Salutation_mr;
	String salutation = "";

	public EmployeeMasterVerificationPage selectSalutation() {
		Common.clickOn(driver, Salutation);
		Common.clickOn(driver, Salutation_mr);
		salutation = Salutation_mr.getText();
		log("Salutation = " + salutation);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 10, salutation);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtFirstName']")
	WebElement First_Name;
	String firstname = TestData.fname;

	public EmployeeMasterVerificationPage enterFirstName() {
		Common.clickOn(driver, First_Name);
		Common.type(First_Name, firstname);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 11, firstname);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtMiddleName']")
	WebElement Middle_Name;
	String middlename = TestData.mname;

	public EmployeeMasterVerificationPage enterMiddleName() {
		Common.clickOn(driver, Middle_Name);
		Common.type(Middle_Name, middlename);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 12, middlename);
		return new EmployeeMasterVerificationPage(driver);

	}

	@FindBy(xpath = ".//input[@id='txtLastName']")
	WebElement Last_Name;
	String lastname = TestData.lastname;

	public EmployeeMasterVerificationPage enterLastName() {
		Common.clickOn(driver, Last_Name);
		Common.type(Last_Name, lastname);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 13, lastname);
		Common.pause(2);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtFatherName']")
	WebElement Father_Name;
	String fathername = TestData.fathername;

	public EmployeeMasterVerificationPage enterFatherName() {
		Common.clickOn(driver, Father_Name);
		Common.type(Father_Name, fathername);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 14, fathername);
		Common.pause(2);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtActualDateofBirth']")
	WebElement Birth_date;
	String bday = TestData.bday;

	public EmployeeMasterVerificationPage enterBirthdate() {
		Common.clickOn(driver, Birth_date);
		Common.pause(1);
		Common.type(Birth_date, bday);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 15, bday);
		Common.pause(2);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtDateOfJoining']")
	WebElement date_of_joining;
	String joining_confirm = TestData.joining_confrm_Date;

	public EmployeeMasterVerificationPage enterDateJoining(String joining) {
		Common.clickOn(driver, date_of_joining);
		Common.type(date_of_joining, joining);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 16, joining_confirm);
		log("Enter date of joining::" + joining);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtDateOfConfirmation']")
	WebElement date_of_confirmation;

	public EmployeeMasterVerificationPage enterDateConfirmation(
			String confirmation) {
		Common.clickOn(driver, date_of_confirmation);
		Common.type(date_of_confirmation, confirmation);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 17, confirmation);
		log("Enter date of Confirmation::" + confirmation);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//textarea[@id='txtAddress']")
	WebElement Address;

	public EmployeeMasterVerificationPage enterAddress() {
		Common.type(Address, "B-15, Siddheshwari soci-2, Ankleshwar");
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 18, "B-15, Siddheshwari soci-2, Ankleshwar");
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlCountryList']")
	WebElement Country;
	@FindBy(xpath = ".//select[@id='ddlCountryList']/option[102]")
	WebElement Country_india;

	public EmployeeMasterVerificationPage selectCountry() {

		Common.clickOn(driver, Country);
		Common.clickOn(driver, Country_india);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 19, Country_india.getText());
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlStateList']")
	WebElement State;
	@FindBy(xpath = "")
	WebElement State_gujarat;

	public EmployeeMasterVerificationPage selectState() {
		/* TestData.writeExcelData(1, 20, value); */
		Common.clickOn(driver, State);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlCityList']")
	WebElement City;
	@FindBy(xpath = "")
	WebElement City_list;

	public EmployeeMasterVerificationPage selectCity() {/*
														 * TestData.writeExcelData
														 * (1, 21, value);
														 */
		Common.clickOn(driver, City);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtPAN']")
	WebElement Pan;
	String pan_no = TestData.rndmPAN();;

	public EmployeeMasterVerificationPage enterPan() {

		Common.clickOn(driver, Pan);
		Common.type(Pan, pan_no);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 23, pan_no);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtTelephone']")
	WebElement Mobile_no;

	public EmployeeMasterVerificationPage enterMobileNo() {

		Common.clickOn(driver, Mobile_no);
		Common.type(Mobile_no, "9429186891");
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 25, "9429186891");
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtEmailId1']")
	WebElement office_Email_id;
	String email_id = TestData.rndmemail(3);

	public EmployeeMasterVerificationPage enterOfficeEmailid() {
		Common.clickOn(driver, office_Email_id);
		Common.type(office_Email_id, email_id);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 26, email_id);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlEmployementType']")
	WebElement employee_type;
	@FindBy(xpath = ".//select[@id='ddlEmployementType']/option[3]")
	WebElement employee_type_list;

	public EmployeeMasterVerificationPage selectEmployeeType() {
		Common.clickOn(driver, employee_type);
		Common.clickOn(driver, employee_type_list);
		/* TestData.writeExcelData(1, 29, value); */
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlUserType']")
	WebElement user_type;
	@FindBy(xpath = ".//select[@id='ddlUserType']/option[5]")
	WebElement user_type_list;

	public EmployeeMasterVerificationPage selectUserType() {
		Common.clickOn(driver, user_type);
		Common.clickOn(driver, user_type_list);
		/* TestData.writeExcelData(1, 30, value); */
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']")
	WebElement attendance_mode_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']")
	WebElement attendance_mode_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']")
	WebElement attendance_mode_3;
	@FindBy(xpath = ".//select[@id='ddlDefaultShift']")
	WebElement default_shift;

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']/option[2]")
	WebElement biometric_attnd_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']/option[2]")
	WebElement biometric_attnd_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']/option[2]")
	WebElement biometric_attnd_3;

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']/option[3]")
	WebElement manager_marking_attnd_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']/option[3]")
	WebElement manager_marking_attnd_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']/option[3]")
	WebElement manager_marking_attnd_3;

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']/option[4]")
	WebElement punchin_attnd_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']/option[4]")
	WebElement punchin_attnd_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']/option[4]")
	WebElement punchin_attnd_3;

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']/option[5]")
	WebElement mobile_attnd_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']/option[5]")
	WebElement mobile_attnd_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']/option[5]")
	WebElement mobile_attnd_3;

	@FindBy(xpath = ".//select[@id='ddlAttendanceMode1']/option[6]")
	WebElement swipecards_attnd_1;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode2']/option[6]")
	WebElement swipecards_attnd_2;
	@FindBy(xpath = ".//select[@id='ddlAttendanceMode3']/option[6]")
	WebElement swipecards_attnd_3;

	@FindBy(xpath = ".//select[@id='ddlDefaultShift']/option[3]")
	WebElement regular_shift;
	@FindBy(xpath = ".//select[@id='ddlDefaultShift']/option[5]")
	WebElement general;
	@FindBy(xpath = ".//select[@id='ddlDefaultShift']/option[2]")
	WebElement weekly_off;
	@FindBy(xpath = ".//select[@id='ddlDefaultShift']/option[4]")
	WebElement saturday_shift;

	public EmployeeMasterVerificationPage selectAttendanceMode1(String option) {

		Common.selectFromComboByVisibleElement(attendance_mode_1, option);
		log(option);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 31, option);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage selectAttendanceMode2(String option) {
		Common.selectFromComboByVisibleElement(attendance_mode_2, option);
		log(option);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 32, option);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage selectAttendanceMode3(String option) {
		Common.selectFromComboByVisibleElement(attendance_mode_3, option);
		log(option);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 33, option);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage selectDefaultShift(String option) {
		Common.selectFromComboByVisibleElement(default_shift, option);
		log(option);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 34, option);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='getEmployeeSetting_ReportingManager1']")
	WebElement reporting_manager_1;
	@FindBy(xpath = ".//input[@id='getEmployeeSetting_ReportingManager2']")
	WebElement reporting_manager_2;
	@FindBy(xpath = ".//input[@id='getEmployeeSetting_ReportingManager3']")
	WebElement reporting_manager_3;

	String reporting_man_1 = "Arshad Ansari";
	String reporting_man_2 = "Ravi Bajaj";
	String reporting_man_3 = "Admin";

	public EmployeeMasterVerificationPage enterReportingManager1(String name) {
		Common.clickOn(driver, reporting_manager_1);
		Common.type(reporting_manager_1, name);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 35, name);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage enterReportingManager2(String name) {
		Common.clickOn(driver, reporting_manager_2);
		Common.type(reporting_manager_1, name);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 36, name);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage enterReportingManager3(String name) {
		Common.clickOn(driver, reporting_manager_3);
		TestData.writeExcelData(1,lastRowNoForEmployeeMaster , 37, name);
		Common.type(reporting_manager_1, name);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtCTC']")
	WebElement ctc;

	public EmployeeMasterVerificationPage enterCtc() {
		Common.clickOn(driver, ctc);
		Common.type(ctc, "500000");
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='txtVariable']")
	WebElement variable;

	public EmployeeMasterVerificationPage entervariable() {
		Common.clickOn(driver, variable);
		Common.type(variable, "100000");
		return new EmployeeMasterVerificationPage(driver);
	}

	@FindBy(xpath = ".//input[@id='getCompensationBenefits_IsSalaryBreakUp']//.[@value='false']")
	WebElement do_it_later_radio;

	public EmployeeMasterVerificationPage selectDoitLater() {
		Common.clickOn(driver, do_it_later_radio);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);
	}

	/*
	 * @FindBy(xpath = "") WebElement assets ;
	 * 
	 * @FindBy(xpath = "") WebElement assets_list ; public
	 * EmployeeMasterVerificationPage selectAssets() { Common.clickOn(driver,
	 * assets);
	 * 
	 * return new EmployeeMasterVerificationPage(driver); }
	 * 
	 * @FindBy(xpath = "") WebElement bank_name ;
	 * 
	 * @FindBy(xpath = "") WebElement bnk_name_list ; public
	 * EmployeeMasterVerificationPage selectBankName() { Common.clickOn(driver,
	 * bank_name);
	 * 
	 * return new EmployeeMasterVerificationPage(driver); }
	 * 
	 * @FindBy(xpath = "") WebElement account_no ; public
	 * EmployeeMasterVerificationPage enterAccountNumber() {
	 * Common.clickOn(driver, account_no);
	 * 
	 * return new EmployeeMasterVerificationPage(driver); }
	 */

	@FindBy(xpath = "")
	WebElement save;

	public EmployeeMasterVerificationPage clickSavebtn() {
		Common.clickOn(driver, save);

		return new EmployeeMasterVerificationPage(driver);
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
	@FindBy(xpath = ".//a[@id='NewEmp']")
	WebElement addSingle_employee;

	public EmployeeMasterVerificationPage clickEmployeeMaster() {
		Common.pause(2);
		Common.jsClick(driver, employee_master_menu);
		return new EmployeeMasterVerificationPage(driver);
	}

	public EmployeeMasterVerificationPage clickAddSingleEmployee() {
		Common.pause(1);
		Common.clickOn(driver, addSingle_employee);
		Common.pause(2);
		return new EmployeeMasterVerificationPage(driver);

	}

	public EmployeeMasterVerificationPage createNewEmployee(
			String employee_group, String attendance_group, String leave_group,
			String attendance_mode1, String attendance_mode2,
			String attendance_mode3, String shift_type)
			throws InterruptedException {
		selectEmployeeGroup(employee_group);
		// Common.scrollToVertical(driver,
		// driver.findElement(By.xpath(".//span[@class='font-16 paddingLeft10']")));
		selectAttendanceGroup(attendance_group);
		selectLeaveGroup(leave_group);
		selectCalendarGroup();
		selectAttendanceModeGroup();
		selectAttendanceRuleGroup();
		selectGroup();
		selectDesignation();
		selectGrade();
		selectDivision();
		selectSalutation();
		enterFirstName();
		enterMiddleName();
		enterLastName();
		enterFatherName();
		enterBirthdate();
		enterDateJoining(joining_confirm);
		enterDateConfirmation(joining_confirm);
		enterAddress();
		selectCountry();
		selectState();
		selectCity();
		enterPan();
		enterMobileNo();
		enterOfficeEmailid();
		selectEmployeeType();
		selectUserType();
		Common.pause(2);
		selectAttendanceMode1(attendance_mode1);
		selectAttendanceMode2(attendance_mode2);
		selectAttendanceMode3(attendance_mode3);
		selectDefaultShift(shift_type);
		Common.pause(2);
		enterReportingManager1(reporting_man_1);
		enterReportingManager2(reporting_man_2);
		enterReportingManager3(reporting_man_3);
		Common.scrollToVertical(
				driver,
				driver.findElement(By
						.xpath(".//div[@id='secCompensationAndBenefitsDetails']/div[1]/span[1]")));
		enterCtc();
		entervariable();
		selectDoitLater();

		return new EmployeeMasterVerificationPage(driver);

	}

}
