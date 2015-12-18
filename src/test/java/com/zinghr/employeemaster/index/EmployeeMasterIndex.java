package com.zinghr.employeemaster.index;

import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class EmployeeMasterIndex extends SeleniumInit {

	public static String employee_group = "Common";
	public static String attendance_group = "Common";
	public static String leave_group = "Common";
	public static String calendar_group = "Common";
	public static String attendance_mode_group = "Common";				 
	public static String attendance_rule_group = "Common";
	public static String group = "Common";
	public static String designation = "";
	public static String grade = "";
	public static String division = "";
	public static String salutation = "Mr.";
	public static String attendance_mode1 = "PunchIN";             /* 1.PunchIN, 2.Biometric 3.Manager Marking 4.Mobile 5.Swipecards  */
	public static String attendance_mode2 =  "Biometric";
	public static String attendance_mode3 =  "Manager Marking";
	public static String shift_type = "General";            /*1.Weekly Off 2.General 3.Regular Shift 4.Saturday Shift     */

	@Test
	public void createNewEmployee() throws InterruptedException {
		int numOfFailure = 0;
		log("Testcase Id : ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code_emp);
		log("Step 3: Enter Employee Code: " + TestData.employe_code_emp);
		log("Step 4: Enter Password: " + TestData.password_emp);

		driver.navigate().to(
				"http://qa.zinghr.com/2015/pages/authentication/login.aspx");
		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Verify that Home page is open or not");
		if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Employee Master menu");

		employeemasterIndexPage.clickEmployeeMaster();
		// String winHandleBefore= driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		log("Step 7: Click on 'Add Single Employee'.");

		employeemasterIndexPage.clickAddSingleEmployee();

		log("Step 8: Add all the valid details into 'Employee Creation' form.");
		log("Step 9:");
		employeemasterIndexPage.createNewEmployee(employee_group,
				attendance_group, leave_group, calendar_group, attendance_mode_group, 
				attendance_rule_group,group, salutation, attendance_mode1,
				attendance_mode2, attendance_mode3,shift_type);

		/*
		 * if (taSetupVerificationPage) { Common.logStatus("pass"); } else {
		 * Common.logStatus("fail"); numOfFailure++; }
		 * 
		 * if (numOfFailure > 0) { Assert.assertTrue(false); }
		 */
	}

}
