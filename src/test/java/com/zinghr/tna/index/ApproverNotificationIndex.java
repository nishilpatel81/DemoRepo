package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class ApproverNotificationIndex extends SeleniumInit{
	
	
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
	
	
	public void ApproveNotificationsize()
	{
		int numOfFailure = 0;
		loginwithvalidcredential();
		
		log("To verify uesr gets notification");
		try{
		if(approverNotificationVerification.ApproveNotificationsize_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			log("<Strong><font color=#FF0000>No Notification Display</font></strong>");
			numOfFailure++;
		}
		}
		catch(Exception e)
		{
			System.out.println("no number");
			e.printStackTrace();
			
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	@Test
	public void ApproveAndRejectButtonDisplay()
	{
		int numOfFailure = 0;
		ApproveNotificationsize();
		
		log("Step 5: Click on Approve Notification(Bell Notification) icon.");
		approverNotificationIndexPage.ClickNotificationicon();
		
		log("To verify Reject & Approve tabs are displayed");
		if(approverNotificationVerification.ApproveAndRejectButtonDisplay_verification())
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
	public void AfterClickRejctRemarkPopupDisplay()
	{
		int numOfFailure = 0;
		ApproveNotificationsize();
		
		log("Step 5: Click on Approve Notification(Bell Notification) icon.");
		approverNotificationIndexPage.ClickNotificationicon();
		
		log("Step 6: Click on Reject button of any notification.");
		Common.pause(2);
		approverNotificationIndexPage.ClickRejectButton();
		
		log("To Verify click on Reject 'Remarks for Rejection' window opens");
		if(approverNotificationVerification.ApproveAndRejectButtonDisplay_verification())
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
	public void ClcikRejectButtonOfRejectRemarkWithoutFillRemarks()
	{
		int numOfFailure = 0;
		AfterClickRejctRemarkPopupDisplay();
		
		log("Step 6: Click on Reject button of Remarks for Rejection' window.");
		approverNotificationIndexPage.ClickRejectRemarkButton();
		
		log("To verify click on Reject without entering Remarks gives a message");
		if(approverNotificationVerification.ClcikRejectButtonOfRejectRemarkWithoutFillRemarks_verification())
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
	public void ClickOnCancelButtonOfRejectRemarkWindow()
	{
		int numOfFailure = 0;
		AfterClickRejctRemarkPopupDisplay();
		
		log("Step 6: Click on Cancel button of Remarks for Rejection' window.");
		approverNotificationIndexPage.ClickRejectRemarkButton();
		
		log("To verify click on Reject without entering Remarks gives a message");
		if(approverNotificationVerification.ClcikRejectButtonOfRejectRemarkWithoutFillRemarks_verification())
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
