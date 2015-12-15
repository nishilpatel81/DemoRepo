package com.zinghr.employeemaster.indexpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.employeemaster.verification.EmployeeMasterVerificationPage;
import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;

public class EmployeeMasterIndexPage extends AbstractPage {

	public EmployeeMasterIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = ".//select[@id='ddlEmployeeGroup']")
	WebElement Employee_group;
	@FindBy(xpath = "")
	WebElement Employee_group_list;
	public EmployeeMasterVerificationPage selectEmployeeGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlAttendanceGroup']")
	WebElement Attendance_group;
	@FindBy(xpath = "")
	WebElement Attendance_group_list;
	public EmployeeMasterVerificationPage selectAttendanceGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlLeaveGroup']")
	WebElement Leave_group;
	@FindBy(xpath = "")
	WebElement Leave_group_list;
	public EmployeeMasterVerificationPage selectLeaveGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlCalendarGroup']")
	WebElement Calendar_group;
	@FindBy(xpath = "")
	WebElement Calendar_group_list;
	public EmployeeMasterVerificationPage selectCalendarGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlAttendanceModeGroup']")
	WebElement Attendance_mode_group;
	@FindBy(xpath = "")
	WebElement Attendance_mode_group_list;
	public EmployeeMasterVerificationPage selectAttendanceModeGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlAttendanceRuleGroup']")
	WebElement Attendance_rule_group;
	@FindBy(xpath = "")
	WebElement Attendance_rule_group_list;
	public EmployeeMasterVerificationPage selectAttendanceRuleGroup()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlDesignation']")
	WebElement Designation;
	@FindBy(xpath = "")
	WebElement Designation_list;
	public EmployeeMasterVerificationPage selectDesignation()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlGrade']")
	WebElement Grade;
	@FindBy(xpath = "")
	WebElement Grade_list;
	public EmployeeMasterVerificationPage selectGrade()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlDivision']")
	WebElement Division;
	@FindBy(xpath = "")
	WebElement Division_list;
	public EmployeeMasterVerificationPage selectDivision()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//select[@id='ddlDivision']")
	WebElement Salutation;
	@FindBy(xpath = "")
	WebElement Salutation_list;
	public EmployeeMasterVerificationPage selectSalutation()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//input[@id='txtFirstName']")
	WebElement First_Name;
	public EmployeeMasterVerificationPage enterFirstName()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//input[@id='txtMiddleName']")
	WebElement Middle_Name;
	public EmployeeMasterVerificationPage enterMiddleName()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = ".//input[@id='txtLastName']")
	WebElement Last_Name;
	public EmployeeMasterVerificationPage enterLastName()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	@FindBy(xpath = "")
	WebElement Father_Name ;
	public EmployeeMasterVerificationPage enterFatherName()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement Birth_date ;
	public EmployeeMasterVerificationPage enterBirthdate()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	
	@FindBy(xpath = "")
	WebElement date_of_joining ;
	public EmployeeMasterVerificationPage enterDateJoining()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement date_of_confirmation ;
	public EmployeeMasterVerificationPage enterDateConfirmation()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement Address ;
	public EmployeeMasterVerificationPage enterAddress()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement Country ;
	@FindBy(xpath = "")
	WebElement Country_india ;
	public EmployeeMasterVerificationPage selectCountry()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement State ;
	@FindBy(xpath = "")
	WebElement State_gujarat ;
	public EmployeeMasterVerificationPage selectState()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement City ;
	@FindBy(xpath = "")
	WebElement City_list ;
	public EmployeeMasterVerificationPage selectCity()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement Pan ;
	public EmployeeMasterVerificationPage enterPan()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement Mobile_no ;
	public EmployeeMasterVerificationPage enterMobileNo()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement office_Email_id ;
	public EmployeeMasterVerificationPage enterOfficeEmailid()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement employee_type ;
	@FindBy(xpath = "")
	WebElement employee_type_list ;
	public EmployeeMasterVerificationPage selectEmployeeType()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement user_type ;
	@FindBy(xpath = "")
	WebElement user_type_list ;
	public EmployeeMasterVerificationPage selectUserType()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement attemdance_mode_1 ;
	@FindBy(xpath = "")
	WebElement attendance_mode_2 ;
	@FindBy(xpath = "")
	WebElement attemdance_mode_3 ;
	@FindBy(xpath = "")
	WebElement attendance_mode_4 ;
	@FindBy(xpath = "")
	WebElement biometric;
	@FindBy(xpath = "")
	WebElement manager_marking ;
	@FindBy(xpath = "")
	WebElement punchin ;
	@FindBy(xpath = "")
	WebElement mobile ;
	@FindBy(xpath = "")
	WebElement swipecards ;
	public EmployeeMasterVerificationPage selectAttendanceMode1()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	public EmployeeMasterVerificationPage selectAttendanceMode2()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	public EmployeeMasterVerificationPage selectAttendanceMode3()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	public EmployeeMasterVerificationPage selectAttendanceMode4()
	{
		
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	@FindBy(xpath = "")
	WebElement reporting_manager_1 ;
	@FindBy(xpath = "")
	WebElement reporting_manager_2 ;
	@FindBy(xpath = "")
	WebElement reporting_manager_3 ;
	@FindBy(xpath = "")
	WebElement reporting_manager_4 ;
	public EmployeeMasterVerificationPage enterReportingManager1()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	public EmployeeMasterVerificationPage enterReportingManager2()
	{
		
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement ctc ;
	public EmployeeMasterVerificationPage enterCtc()
	{
		Common.clickOn(driver, ctc);
		Common.type(ctc, "500000");
		return new EmployeeMasterVerificationPage(driver);
	}
	
	@FindBy(xpath = "")
	WebElement variable ;
	public EmployeeMasterVerificationPage entervariable()
	{
		Common.clickOn(driver, variable);
		Common.type(ctc, "100000");
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	@FindBy(xpath = ".//input[@id='getCompensationBenefits_IsSalaryBreakUp']//.[@value='false']")
	WebElement do_it_later_radio ;
	public EmployeeMasterVerificationPage selectDoitLater()
	{
		Common.clickOn(driver, do_it_later_radio);
		Common.pause(1);
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	/*@FindBy(xpath = "")
	WebElement assets ;
	@FindBy(xpath = "")
	WebElement assets_list ;
	public EmployeeMasterVerificationPage selectAssets()
	{
		Common.clickOn(driver, assets);
		
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	@FindBy(xpath = "")
	WebElement bank_name ;
	@FindBy(xpath = "")
	WebElement bnk_name_list ;
	public EmployeeMasterVerificationPage selectBankName()
	{
		Common.clickOn(driver, bank_name);
		
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	@FindBy(xpath = "")
	WebElement account_no ;
	public EmployeeMasterVerificationPage enterAccountNumber()
	{
		Common.clickOn(driver, account_no);
		
		return new EmployeeMasterVerificationPage(driver);	
	}*/
	
	@FindBy(xpath = "")
	WebElement save ;
	public EmployeeMasterVerificationPage clickSavebtn()
	{
		Common.clickOn(driver, save);
		
		return new EmployeeMasterVerificationPage(driver);	
	}
	
	
	
	
	
	
	@FindBy(xpath = ".//*[@class='sidebar-collapse btn']")
	WebElement sideBar_menu_btn;
	/*@FindBy(xpath = "")
	WebElement download_link;*/
	@FindBy(xpath = ".//*[@class='fa fa-2x fa-plus-circle']")
	WebElement employee_master_menu;
	@FindBy(xpath = ".//*[@class='fa fa-download']")
	WebElement download_link;
	@FindBy(xpath = "Add single employee = .//a[@id='NewEmp']")
	WebElement addSingle_employee;
	public EmployeeMasterVerificationPage clickEmployeeMaster()
	{
		Common.pause(2);
		Common.jsClick(driver, employee_master_menu);
		return new EmployeeMasterVerificationPage(driver);
	}
	
	public EmployeeMasterVerificationPage clickAddSingleEmployee()
	{
		Common.pause(1);
		Common.clickOn(driver, addSingle_employee);
		Common.pause(2);
		return new EmployeeMasterVerificationPage(driver);

	}
	
	public EmployeeMasterVerificationPage createNewEmployee()
	{
		
		return new EmployeeMasterVerificationPage(driver);
		
	}
	
	
}
