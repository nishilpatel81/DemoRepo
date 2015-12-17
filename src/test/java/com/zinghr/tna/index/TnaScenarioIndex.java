package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class TnaScenarioIndex extends SeleniumInit{

	@Test
	public void PunchInFunctionality() throws InterruptedException
	{
		int numOfFailure = 0;
		
		log("Testcase Ids : TNA_SB_01");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");

		if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 5: Click on Proceed Button");

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		Common.pause(10);

		log("Verify Time and attendence Page is open or not");

		if (taSetupVerificationPage.verifyTimeAndAttendancePageisDisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}
		
		log("Step 8: Click on PunchIn Checkbox.");
		
		tnaScenarioIndexPage.clickpunchinckeckbox();
		
		log("Step 9: Select any shift.");
		
		log("Step 10: Clcik on working hours checkbox.");
		
		log("Step 11: Enter full day minutes");
		
		log("Step 12: Enter full day minutes");
		
		log("Step 13: Clcik on Save button.");
		
		tnaScenarioIndexPage.savebutton();
		
		log("Step 14: Click on Employee Master menu");
		
		employeemasterIndexPage.clickEmployeeMaster();
	//	String winHandleBefore= driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}

		log("Step 15: Click on 'Add Single Employee'.");

		employeemasterIndexPage.clickAddSingleEmployee();
		
		log("Step 16: Add all the valid details into 'Employee Creation' form.");
		
		
		employeemasterIndexPage.createNewEmployee("Common","Common","Common",TestData.attendance_mode1, TestData.attendance_mode2,TestData.attendance_mode3,TestData.shift_type);		
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		
	}
	
	
}
