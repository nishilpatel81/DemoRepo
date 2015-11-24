package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class DashboardTimeNAttendanceCalIndex extends SeleniumInit {

	@Test
	public void timeAndAttendanceCalanderFunctionalityOnDashBoard() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_1,TNA_2,TNA_3  ");
		log("Testcase Discription :  ");

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

		log("Verify Time And Attendance calendar is displayed on Dashboard");

		if (dbTnaCalVerificationPage
				.verifyTimeAndAttendanceCalendarOnDashboardIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Time and Attendance Header on Dashboard");

		if (dbTnaCalVerificationPage.verifyTimeAndAttendanceHeaderIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Current Month is displayed By default");

		if (dbTnaCalVerificationPage.verifyCurrentMonthOnTNAOnDashboard())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void forwardAndBackwardArrowFunctionalityOnMyTNA() {
		int numOfFailure = 0;
		log("Testcase Id : TNA_4,TNA_5 , ");
		log("Testcase Discription :  ");

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

		log("Step 6 : Click on Forward Arrow");

		dbTnaCalIndexPage.clickOnForwardArrow();

		log("Verify Next Month is displayed");

		if (dbTnaCalVerificationPage.verifyNextMonthIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 7 : Click on Backward Arrow");

		dbTnaCalIndexPage.clickOnbackwordArrow();

		dbTnaCalIndexPage.clickOnbackwordArrow();
		log("Verify Previous Month is displayed");

		if (dbTnaCalVerificationPage.verifyPreviousMonthIsDisplayed())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void holidaytabFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_6,TNA_7,TNA_8 ");
		log("Testcase Discription :  ");

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

		log("Verify that Holiday list button is displayed");

		if (dbTnaCalVerificationPage.verifyHolidayListButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 5: Click on HolidayList Button");

		dbTnaCalIndexPage.clickOnHolyDayListTab();

		log("Verify Holiday List pop is displayed");

		if (dbTnaCalVerificationPage.verifyHolidayListPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Holiday Details is displayed on pop up");

		if (dbTnaCalVerificationPage.verifyHolidayDetailsisDisplayedOnPopup()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void regularizeButtonFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_18, TNA_19");
		log("Testcase Discription :  ");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Verify Apply Regularization Pop up is displayed");

		if (dbTnaCalVerificationPage.verifyRegularizationPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Apply Regulatization header is displayed");

		if (dbTnaCalVerificationPage
				.verifyRegularizationPopupHeaderIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void applyNowButtonFunctionalityOnRegularizationPopup() {
		int numOfFailure = 0;
		log("Testcase Id : TNA_21");
		log("Testcase Discription :  ");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Step 7: Click on Apply Now Button");

		dbTnaCalIndexPage.clickApplyNowButton();

		log("Verify validation message is displayed");

		if (dbTnaCalVerificationPage.verifyBlankActionValidationMessage())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void selectActionDropdownOptionsAvalibility() {
		int numOfFailure = 0;
		log("Testcase Id :TNA_20 ");
		log("Testcase Discription :  ");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		if (dbTnaCalVerificationPage.verifySelectOptionDropDownOptions()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void mandatoryFieldvalidationOnRegularizationPopup() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_23,TNA_24");
		log("Testcase Discription :  ");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Step 7: Select Action : Outdoor");

		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("Outdoor");

		log("Verify In Time and Out Time Text Field is displayed");

		if (dbTnaCalVerificationPage.verifyInTimeAndOutTimeIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 8: Click on Apply Now Button");

		dbTnaCalIndexPage.clickApplyNowButton();

		log("Verify validation message is displayed");

		if (dbTnaCalVerificationPage.verifyInTimeAndOutTimeValidationMessage())

		{
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void byDefaultShiftNameAvailability() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_23,TNA_24");
		log("Testcase Discription :  ");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Step 7: Select Action : ShiftWoChange ");

		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("ShiftWoChange");

		log("By Default shift is displayed under Shift Name Header ");

		if (dbTnaCalVerificationPage.byDefaultShiftNameIsdisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void Regulerization_with_outdoor_intime_outtime_editable() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_56");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Step 7: Select Action : Outdoor ");

		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("Outdoor");
		
		dbTnaCalIndexPage.enterInInTime("12:00");
		
		dbTnaCalIndexPage.enterInOutTime("18:00");  

		log("To verify In time & Out Time should be blank by default and allow to enter time");

		if (dbTnaCalVerificationPage.Regulerization_with_outdoor_intime_outtime_editable_verification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}	

	@Test
	public void Outdoor_request_Cancel_View_option() {

		int numOfFailure = 0;
		log("Testcase Id : TNA_56");

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

		log("Step 6: Click on Regularize Button");

		dbTnaCalIndexPage.clickRegularizeButton();

		log("Step 7: Select Action : Outdoor ");

		dbTnaCalIndexPage.selectValueOfSelectionActionDropdown("Outdoor");
		
		log("Step 8: Enter In time value"+TestData.intime);
		
		log("Step 8: Enter Out time value"+TestData.outtime);
		
		dbTnaCalIndexPage.enterInInTime(TestData.intime);
		
		dbTnaCalIndexPage.enterInOutTime(TestData.outtime);  
		
		dbTnaCalIndexPage.clickApplyNowButton();
		
		dbTnaCalIndexPage.Outdoor_request_Cancel_View_option();

		log("To verify In time & Out Time should be blank by default and allow to enter time");

		if (dbTnaCalVerificationPage.Outdoor_request_Cancel_View_option_verification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}	
}
