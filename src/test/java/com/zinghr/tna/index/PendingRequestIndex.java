package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class PendingRequestIndex extends SeleniumInit {

	@Test
	public void pendingRequestPageIsDisplayed() {

		int numOfFailure = 0;

		
		
		log("Testcase Ids : TNA_44");

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

		log("Step 6 : Click on Bell Icon");

		pendingReqIndexPage.clickOnBellIconOnTitleBar();

		log("Step 7 : Click on Sell All notification Link");

		pendingReqIndexPage.clickOnSeeAllNotification();

		log("Verify Pending Request Page is displayed");
		if (pendingReqVerificationPage.verifyPendingRequestPageisdisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void approveRejectEditButIsDisplayedOnPendingReqPage() {
		int numOfFailure = 0;

		log("Testcase Ids : TNA_47");

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

		log("Step 6 : Click on Bell Icon");

		pendingReqIndexPage.clickOnBellIconOnTitleBar();

		log("Step 7 : Click on Sell All notification Link");

		pendingReqIndexPage.clickOnSeeAllNotification();

		log("Verify Pending Request Page is displayed");
		if (pendingReqVerificationPage.verifyPendingRequestPageisdisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Approve,Edit,Reject button is displayed for All Request");

		if (pendingReqVerificationPage
				.verifyEditApproveRejectButtonIsDisplayedForAllRequest()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void regularazationApprovalPopupIsDisplayed() {

		int numOfFailure = 0;

		log("Testcase Ids : TNA_48");

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

		log("Step 6 : Click on Bell Icon");

		pendingReqIndexPage.clickOnBellIconOnTitleBar();

		log("Step 7 : Click on Sell All notification Link");

		pendingReqIndexPage.clickOnSeeAllNotification();

		log("Verify Pending Request Page is displayed");
		if (pendingReqVerificationPage.verifyPendingRequestPageisdisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Step 8 : click on Edit Button ");
		pendingReqIndexPage.clickOnEditButtonOfFirstRequest();

		log("Verify Regularization Approval Pop up is displayed");
		if (pendingReqVerificationPage
				.verifyregularazationApprovalPopupIsDisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void intimeAndoutTimeIsEditable() {
		int numOfFailure = 0;

		log("Testcase Ids : TNA_49,TNA_50");

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

		log("Step 6 : Click on Bell Icon");

		pendingReqIndexPage.clickOnBellIconOnTitleBar();

		log("Step 7 : Click on Sell All notification Link");

		pendingReqIndexPage.clickOnSeeAllNotification();

		log("Verify Pending Request Page is displayed");
		if (pendingReqVerificationPage.verifyPendingRequestPageisdisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Step 8 : click on Edit Button ");
		pendingReqIndexPage.clickOnEditButtonOfFirstRequest();

		log("Verify Select Action And Reason field is in read only Mode");

		if (pendingReqVerificationPage.verifySelectActionAndReasonIsDisabled()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Step 9 : Enter In Time and Out Time");

		pendingReqIndexPage.enterInInTime("02:00");

		pendingReqIndexPage.enterInOutTime("05:00");

		pendingReqIndexPage.clickOnWorkedHoursLabel();

		log("Verify In Time and Out Time Text field is editable");

		if (pendingReqVerificationPage
				.verifyInTimeAndOutTimeTextBoxIsEditable()) {
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
