package com.zinghr.tna.index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
	@Test
	public void check_Reguleriztion_cancel_button()
	{
		int numOfFailure = 0;
		loginwithvalidcredential();
		log("Step 5: Click on Regulerization button on dashbord page");
		log("Step 6: Select 'Outdoor' option from your selected date");
		log("Step 7: Click on Apply Now button");
		log("Step 8: Click on 'Username' dropdown menu.");
		log("Step 9: Click on my trasection history tab.");
		log("Step 10: Click on Pending button which located below the search textbox");
		log("Step 11: Click on cancel button of first notification");
		WebElement Reguleriztion_btn=driver.findElement(By.xpath(".//div[@id='btnTnaPanel']/a[contains(text(),'Regularize')]"));
		Common.clickOn(driver, Reguleriztion_btn);
		Common.pause(2);
		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("Outdoor");
		dbTnaCalIndexPage.enterInInTime("12:00");
		dbTnaCalIndexPage.enterInOutTime("18:00");
		dbTnaCalIndexPage.clickApplyNowButton();
		myTransectionVerification=myTransectionIndexpage.check_Reguleriztion_cancel_button();
		log("To check User is able to view Time and Attendance notification");
		if(myTransectionVerification.check_Reguleriztion_cancel_button_verification())
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
	public void check_Reguleriztion_view_button()
	{
		int numOfFailure = 0;
		loginwithvalidcredential();
		log("Step 5: Click on Regulerization button on dashbord page");
		log("Step 6: Select 'Outdoor' option from your selected date");
		log("Step 7: Click on Apply Now button");
		log("Step 8: Click on 'Username' dropdown menu.");
		log("Step 9: Click on my trasection history tab.");
		log("Step 10: Click on Pending button which located below the search textbox");
		log("Step 11: Click on view button of first notification");
		WebElement Reguleriztion_btn=driver.findElement(By.xpath(".//div[@id='btnTnaPanel']/a[contains(text(),'Regularize')]"));
		Common.clickOn(driver, Reguleriztion_btn);
		Common.pause(2);
		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("Outdoor");
		dbTnaCalIndexPage.enterInInTime("12:00");
		dbTnaCalIndexPage.enterInOutTime("18:00");
		dbTnaCalIndexPage.clickApplyNowButton();
		myTransectionVerification=myTransectionIndexpage.check_Reguleriztion_view_button();
		log("To check User is able to view Time and Attendance notification");
		if(myTransectionVerification.check_Reguleriztion_view_button_verification())
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
