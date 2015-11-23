package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class MyTransectionIndex extends SeleniumInit{
	
	public void loginlandingpage() {

		int numOfFailure = 0;
		log("Step 1 : Open url:<a href="+testUrl+">"+testUrl+"</a>");
		
		
		loginVerificationPage=loginIndexpage.loginlandingpage();
		log("Verify that ZingHR login page is open or not.");
		if(loginVerificationPage.loginlandingpageverification())
		{
				Common.logStatus("pass");
		}
		else				
		{
				Common.logStatus("fail");
				numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	

	public void loginwithvalidcredential()
	{
		int numOfFailure = 0;

		loginlandingpage();
		log("Step 2: Enter Company Code:"+TestData.company_code);
		log("Step 3: Enter Employee Code: "+TestData.employe_code);
		log("Step 4: Enter Password: "+TestData.password);
		
		loginVerificationPage=loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");
		if(loginVerificationPage.loginpagewithvalidcredentialverification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void check_time_and_attendance_page()
	{
		int numOfFailure = 0;
		loginwithvalidcredential();
		
		log("Step 5: Click on 'Username' dropdown menu.");
		log("Step 6: Click on 'Username' my trasection history tab.");
		log("Step 7: Click on Time and attendance notification tab.");
		
		myTransectionVerification=myTransectionIndexpage.check_time_and_attendance_page();
		log("To check User is able to view My Transaction History page");
		if(myTransectionVerification.check_time_and_attendance_page_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void check_Reguleriztion_lbl_after_click_view_button_ontime_and_attendance_page()
	{
		int numOfFailure = 0;
		loginwithvalidcredential();
		
		log("Step 5: Click on 'Username' dropdown menu.");
		log("Step 6: Click on 'Username' my trasection history tab.");
		log("Step 7: Click on Time and attendance notification tab.");
		log("Step 8: Click on view button of first notification");
		myTransectionVerification=myTransectionIndexpage.check_Reguleriztion_lbl_after_click_view_button_ontime_and_attendance_page();
		log("To check User is able to view Time and Attendance notification");
		if(myTransectionVerification.check_Reguleriztion_lbl_after_click_view_button_ontime_and_attendance_page_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
}
