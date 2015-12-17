package com.zinghr.tna.index;




	
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class TnaScenarioIndex extends SeleniumInit{

	@Test
	public void PunchInFunctionality()
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
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		
	}
	
	
}
