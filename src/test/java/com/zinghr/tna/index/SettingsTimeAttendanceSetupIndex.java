package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class SettingsTimeAttendanceSetupIndex extends SeleniumInit {

	@Test
	public void timeAndAttendancePage() {

		int numOfFailure = 0;

		log("Testcase Ids : Setup_02 , Setup_03 , Setup_04");

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

		Common.pause(100);

		log("Verify Time and attendence Page is open or not");

		if (taSetupVerificationPage.verifyTimeAndAttendancePageisDisplayed()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Time and attendence Page Header");

		if (taSetupVerificationPage.verifyTimeAndAttendanceHeader()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Following Field :"
				+ "1.Set My Attendance 2. Setup Leave Policy 3. Setup Calender");

		log("Verify Header : Set My Attendance");

		if (taSetupVerificationPage.verifysetMyAttendanceHeader()) {

			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Setup Leave Policy");

		if (taSetupVerificationPage.verifySetupLeavePolicyHeader()) {

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Setup Calender");

		if (taSetupVerificationPage.verifySetupCalendarHeader()) {

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void addNewAttendanceGroupTapFunctionality() {
		int numOfFailure = 0;

		log("Testcase Id : Setup_05,Setup_06,Setup_07,Setup_09  ");
		log("Testcase Discription :  ");

		log("Step 1 : Open url:<a>" + testUrl + "</a>");

		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);
		log("Step 5: Click on Proceed Button");

		loginVerificationPage = loginIndexpage.loginSuccessfully();
		log("Verify that Home page is open or not");

		if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Add New Attendance Group tab is available");

		if (taSetupVerificationPage.verifyAddNewAttendanceGroupButton()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");

		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Group text filed  displayed on Add New Group Pop up ");

		if (taSetupVerificationPage.verifyNewGroupTextFieldIsAvailability()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Add New Group button  displayed on Add New Group Pop up ");

		if (taSetupVerificationPage.verifyNewGroupButtonIsAvailability()) {
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
	public void addedGroupVerifiaction() {
		int numOfFailure = 0;
		log("Testcase Id : Setup_08,Setup_10,Setup_13,Setup_14 ");
		log("Testcase Discription : To test 'Add New Attendance Group' functionality ");

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

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");
		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		int avalilableGroupCount = taSetupIndexPage
				.calculateAvailableAttendanceGroup();
		String newGroupName = TestData.rndmString(5);

		log("Available Attendance group : " + avalilableGroupCount);

		log("Step 9 : Enter Group Name :  <b>" + newGroupName + "</b>");

		log("Step 10 : Click on Add button on pop up");
		taSetupIndexPage.enterNewGroupName(newGroupName);

		log("Step 11 : Click on Cancle button pop up");

		taSetupIndexPage.clickCloseButtonOnPopup();

		log("Verify Cancle button functionality");

		if (taSetupVerificationPage.verifyCancleButton()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify new created Attendance Group ");
		if (taSetupVerificationPage.verifyCreatedAtteandsGroup(newGroupName,
				avalilableGroupCount)) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Common Group is display");

		if (taSetupVerificationPage.verifyCommonGroup()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	public void questionsheaderAvailibility() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_16,Setup_17 ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8: Click on Add New Attendance Group Button");

		taSetupIndexPage.clickAddNewAttendanceGroup();
		log("Verify Add New Group pop up is displayed");
		if (taSetupVerificationPage.verifyNewGroupPopUp()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		int avalilableGroupCount = taSetupIndexPage
				.calculateAvailableAttendanceGroup();
		String newGroupName = TestData.rndmString(5);

		log("Available Attendance group : " + avalilableGroupCount);

		log("Step 9 : Enter Group Name :  <b>" + newGroupName + "</b>");

		log("Step 10 : Click on Add button on pop up");
		taSetupIndexPage.enterNewGroupName(newGroupName);

		log("Step 11 : Click on Cancle button pop up");

		taSetupIndexPage.clickCloseButtonOnPopup();

		log("Verify Questions header is displayed into common group.");

		if (taSetupVerificationPage.verifyQuestionHeader()) {

			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Verify Header : Questions (This section can only be changed from Common Group.) is not displyed from common group");

		if (taSetupVerificationPage
				.verifyQuestionChangeFromCommonGroupHeaderAvailibility()) {

			Common.logStatus("pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		/*
		 * if (taSetupVerificationPage.verifyCancleButton()) {
		 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
		 * numOfFailure++; }
		 */

		/*
		 * log("Verify new created Attendance Group "); if
		 * (taSetupVerificationPage.verifyCreatedAtteandsGroup(newGroupName,
		 * avalilableGroupCount)) { Common.logStatus("pass"); } else {
		 * Common.logStatus("Fail"); numOfFailure++; }
		 */

		/*
		 * log("Verify Common Group is display");
		 * 
		 * if (taSetupVerificationPage.verifyCommonGroup()) {
		 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
		 * numOfFailure++; }
		 */

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void firstBlockOFQuestionSecFunctionality()

	{

		int numOfFailure = 0;
		log("Testcase Id : Setup_18,Setup_19 ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in first block of question section"
				+ "<br> Biometric "
				+ "<br> Swipecards "
				+ "<br> PunchIN "
				+ "<br> Manager Marking " + "<br> Mobile");

		if (taSetupVerificationPage.verifyFirstblockCheckBoxIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Following options are selected by default"
				+ "<br> Biometric " + "<br> PunchIN " + "<br> Manager Marking ");

		if (taSetupVerificationPage.verifyFirstBlockCheckboxSelectedByDefault()) {
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
	public void secondBlockOfQuestionSecFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_24,Setup_25(pending) ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in third block of question section"
				+ "<br> Attendance Cycle starts "
				+ "<br> Attendance Open"
				+ "<br> Attendance Close");

		if (taSetupVerificationPage.verifySecondBlockDropDownIsDisplayed()) {
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
	public void thirdBlockOfQuestionSecFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_26 ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Following Options are displayed in third block of question section"
				+ "<br> Attendance Cycle starts "
				+ "<br> Attendance Open"
				+ "<br> Attendance Close");

		if (taSetupVerificationPage.verifyThirdBlockRadioButtonIsDisplayed()) {
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
	public void shiftRosteringYesButtonFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_27,Setup_28,Setup_29,Setup_30,Setup_31,Setup_34,Setup_35,Setup_36,Setup_35,Setup_37,Setup_45,Setup_49,Setup_50 ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8 : Click on Yes From third block of Question sec");

		taSetupIndexPage.clickShiftRosterYesRadioButton();

		log("Verify Shift Master Link is displayed");

		if (taSetupVerificationPage.verifyShiftMasterLinkIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 9 : Click on Shift Master link");

		taSetupIndexPage.clickShiftMasterLink();

		log("Verify Shift Master Dialog is displayed");

		if (taSetupVerificationPage.verifyShiftMasterPopupIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Shift Master Dialog title is displayed");

		if (taSetupVerificationPage.verifyShiftMasterPopuptitleIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Select Shift drop down is displayed on Shift Master Dialog");

		if (taSetupVerificationPage.verifySelectShiftDropdownIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Shift Name textfield is displayed");

		if (taSetupVerificationPage.verifyShiftNameTextFieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Night Shift Radio button is displayed");

		if (taSetupVerificationPage
				.verifyNightShiftApplicableRadioButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Is Date Overlapping in shift Radio button is displayed");

		if (taSetupVerificationPage
				.verifyDateOverlappingShiftRadioButtonIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify In Time textfield and Out Time textfield is displayed");

		if (taSetupVerificationPage
				.verifyInTimeAndOutTimeTextfieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Swipe Separator Parameter textfield is displayed");

		if (taSetupVerificationPage
				.verifyswipeSeparatorParameteTextfieldIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Verify Cancle Button and Submit Button is displayed on Shift Master Dialog ");

		if (taSetupVerificationPage.verifySubmitAndCancleButtonIsDisplayed()) {
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
	public void shiftRosteringManadatoryFieldFunctionality() {

		int numOfFailure = 0;
		log("Testcase Id : Setup_33,Setup_41,Setup_42_Setup_48  ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Step 8 : Click on Yes From third block of Question sec");

		taSetupIndexPage.clickShiftRosterYesRadioButton();

		log("Verify Shift Master Link is displayed");

		if (taSetupVerificationPage.verifyShiftMasterLinkIsDisplayed()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		log("Step 9 : Click on Shift Master link");

		taSetupIndexPage.clickShiftMasterLink();

		log("Step 10 : Click on Submit Button");

		taSetupIndexPage.clickSubmitButtonOnShiftMasterDialog();

		log("Verify Validation message is displayed for following mandatory field"
				+ "<br>Shift Name"
				+ "<br>In Time"
				+ "<br>Out Time"
				+ "<br>Swipe Separator Parameter" + "<br>Shift Total Minutes  ");

		if (taSetupVerificationPage.verifyManadatoryFieldOfShiftMasterPage()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	public void shiftRosteringNoButtonFunctionality() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_52  ");
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

		log("Step 6: Click on Setting Icon");

		log("Step 7: Click on Time and attendence option from Circle");

		taSetupIndexPage.TimeAndAttendancePageOpen();

		log("Verify Fixed Shift timing ");

		if (taSetupVerificationPage.verifyBydefaultfixedShiftfunctionality()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	/*
	 * @Test public void oasMenuFunctionality() {
	 * 
	 * int numOfFailure = 0; log("Testcase Id : , ");
	 * log("Testcase Discription :  ");
	 * 
	 * log("Step 1 : Open url:<a>" + testUrl + "</a>");
	 * 
	 * log("Step 2: Enter Company Code:" + TestData.company_code);
	 * log("Step 3: Enter Employee Code: " + TestData.employe_code);
	 * log("Step 4: Enter Password: " + TestData.password);
	 * 
	 * loginVerificationPage = loginIndexpage.loginSuccessfully();
	 * log("Verify that Home page is open or not");
	 * 
	 * if (loginVerificationPage.loginpagewithvalidcredentialverification()) {
	 * Common.logStatus("pass"); } else { Common.logStatus("fail");
	 * numOfFailure++; }
	 * 
	 * log("Step 5: Click on Proceed Button");
	 * 
	 * log("Step 6: Click on OAS Option from Left Menu");
	 * 
	 * taSetupIndexPage.clickOASMenu();
	 * 
	 * if (taSetupVerificationPage.verifyOASPageisDisplayed()) {
	 * 
	 * Common.logStatus("pass"); } else { Common.logStatus("Fail");
	 * numOfFailure++; }
	 * 
	 * if (numOfFailure > 0) { Assert.assertTrue(false); }
	 * 
	 * }
	 */

	@Test
		public void markingManagerChecked() {
			int numOfFailure = 0;
			log("Testcase Id :Setup_23  ");
			log("Testcase Discription :  ");
	
			log("Step 1 : Open url:<a>" + testUrl + "</a>");
	
			log("Step 2: Enter Company Code:" + TestData.company_code);
			log("Step 3: Enter Employee Code: " + TestData.employe_code);
			log("Step 4: Enter Password: " + TestData.password);
	
			loginVerificationPage = loginIndexpage.loginSuccessfully();
	
			log("Step 5: Click on Proceed Button");
			log("Step 6: Click on Setting Icon");
			log("Step 7: Click on Time and attendence option from Circle");
			log("Step 8: Select 'SET MY ATTENDANCE' option.");
			log("Step 9: Check 'Common' group.");
			log("Step 10: Check 'Marking Manager' option.");
			
			taSetupVerificationPage = taSetupIndexPage.checkMarkingManger();
			
			log("To verify if If the Manager Marking is selected then the system should allow to mark the attendance through OAS.");
	
			if (taSetupVerificationPage.verifyMarkingManagerChecked()) {
				Common.logStatus("pass");
			} else {
				Common.logStatus("fail");
				numOfFailure++;
			}
	
			if (numOfFailure > 0) {
				Assert.assertTrue(false);
			}
	
		}
		
/* Method by tarpan: 25-nov 		*/
	@Test
	public void selectfollowShiftRostering() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_32 Setup_38 Setup_39 Setup_43 Setup_44 Setup_45 Setup_46 ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10: Select 'Yes' for follow Shift Rostering in 3rd block.");
		log("Step 11: Click on 'Shift Master' link.");
		
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
		taSetupVerificationPage = taSetupIndexPage.selectYesFollowShiftRostering();
	
		log("Shift Master link is displayed or not.");

		if (taSetupVerificationPage.verifyShiftMasterLink()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
/* <<<<<<<<<Testcase Id: SetUp_32>>>>>>>>*/			
		log("Step 12: Enter alphanumeric value in 'Shift name' field. "+TestData.shift_name);
		
		taSetupVerificationPage = taSetupIndexPage.selectShiftMaster();
		taSetupVerificationPage = taSetupIndexPage.enterShiftName(TestData.shift_name);
		
		log("Shift Name text box should be displayed and it should accept alpha numeric values");
		
		if (taSetupVerificationPage.verifyShiftName()) {
			Common.logStatus("pass");
		} else {
			Common.logStatus("fail");
			numOfFailure++;
		}
	
/* <<<<<<<<<Testcase Id: SetUp_38>>>>>>>>*/		
		log("Step 13: Enter numeric value in 'Shift In_time' field. "+TestData.intime);

		taSetupVerificationPage = taSetupIndexPage.enterInTime(TestData.intime);
				
		log("In Time text box should be displayed with accepting only numeric values.");
				
		if (taSetupVerificationPage.verifyShiftInTime()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
/* <<<<<<<<<Testcase Id: SetUp_39>>>>>>>>*/
		log("Step 12: Enter numeric value in 'Shift Out_time' field. "+TestData.outtime);

		taSetupVerificationPage = taSetupIndexPage.enterOutTime(TestData.outtime);
		
		log("In Time text box should be displayed with accepting only numeric values.");
				
		if (taSetupVerificationPage.verifyShiftOutTime()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}

/* <<<<<<<<<Testcase Id: SetUp_43>>>>>>>>*/
		log("To verify that 'Shift Total Minutes' should be readonly mode.");
		
		if (taSetupVerificationPage.verifyShiftTotalTime()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}

/* <<<<<<<<<Testcase Id: 44>>>>>>>>*/
		log("Shift Total Minutes' should calculate the total mind from In Time & Out Time.");
		
		if (taSetupVerificationPage.verifyShiftTotalTimevalue()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
		
/* <<<<<<<<<Testcase Id: 46 & 45>>>>>>>>*/
		log("Step 13: Enter numeric value into 'Swpie Seperator Parameter' field. "+TestData.swipe_value);

		taSetupVerificationPage = taSetupIndexPage.enterSwipeSeperator(TestData.swipe_value);

		log("To verify 'Swipe Separator Parameter' text box should be present & should accept only numeric values.");
		
		if (taSetupVerificationPage.verifySwipeSeperator()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}		

/*--- Method by tarpan: 25-nov ______-----*/
	@Test
	public void fourthBlockSetMyAttendance() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_55 Setup_56");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10: For Fourth block..");
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();

		log("To verify that by default following values are selected in the check box:");
		log("Outdoor / Work from Home Requests");
		if (taSetupVerificationPage.verifyEmployeeValueOutdoorChecked()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("Regularization");
		if (taSetupVerificationPage.verifyEmployeeValueRegChecked()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("Shift / Weekly Off Change Requests");
		if (taSetupVerificationPage.verifyEmployeeValueShiftChecked()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("Extra Time");
		if (taSetupVerificationPage.verifyEmployeeValueExtraChecked()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("Compensatory Off");
		if (taSetupVerificationPage.verifyEmployeeValueCoffChecked()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("Step 10: Uncheck ");
		
		taSetupVerificationPage = taSetupIndexPage.empoloyeeApplyOutdoorunchecked();
		log("To verify if the check box for Outdoor/WFH is unchecked, it should not be displayed on the Dashboard calender.");
	
		if (taSetupVerificationPage.verifyOutdoorBtnDashboard()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	/*--- Method by tarpan: 26-nov ______-----*/	
	@Test
	public void fifthBlockSetMyAttendance() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_57 Setup_58");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10: For Fifth block..");
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();

		log("To verify that The Fifth block contains following option in Extra Time earned can be converted to: ");
		log("Compensatory Off"); 
		log("Over Time");
		log("Leave balance credit"); 
		log("Other Payment(L2)");

		if (taSetupVerificationPage.verifyExtraTimeOptions()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
/* Testcase is :: Setup 58		*/
		log("To verify that Check box is present for all these fields.");
	
		if (taSetupVerificationPage.verifyExtraTimeOptionCheckbox()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}

/* Testcase is :: Setup 59		*/

		log("To verify that By default none of the values are selected.");
		
		if (taSetupVerificationPage.verifyExtraTimeOptionCheckboxNotselected()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void sixthBlockProxyApply() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_60 Setup_61 Setup_62");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10: For Six block.."); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();

		log("To verify Proxy rights to HR or Admin to Apply on behalf of Employees with Radio button Yes No is displayed.");

		if (taSetupVerificationPage.verifyWeAllowYesNo()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
/* Testcase is :: Setup 61		*/
		log("Step 10: Select 'Yes' button.");

		taSetupVerificationPage = taSetupIndexPage.proxyApplyYes();
		/*if (taSetupVerificationPage.verifyWeAllowYesNo()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}*/

/* Testcase is :: Setup 62		*/

		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
		
		log("Step 11: Select 'No' radio button.");
		
		taSetupVerificationPage = taSetupIndexPage.proxyApplyNo();
		
		log("To verify that Proxy rights are not displayed in Zing Login on selecting the radio button 'No'.");

		/*if (taSetupVerificationPage.verifyWeAllowYesNo()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}*/
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	/*--- Method by tarpan: 27-nov ______-----*/		
	@Test
	public void ruleWorkingHours() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_66 Setup_83");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Working Hours' "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 66 _-_-_-_-_*/
		log("Step 11: Working Hours first text field: "+TestData.full_time); 
		log("Step 12: Working Hours second text field: "+TestData.half_time); 
		
		taSetupVerificationPage = taSetupIndexPage.checkWorkingHours(TestData.full_time,TestData.half_time);
		taSetupVerificationPage = taSetupIndexPage.clickSavebtn();

		log("To verify that box text box in Working Hours is allow only numeric values with max length till 3 characters.");

		if (taSetupVerificationPage.verifyworkinghoursFieldLength()) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	
	@Test
	public void ruleLateComing() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_70");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Late Comming' "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 70 _-_-_-_-_*/
		log("Step 11: Late coming first text field: "+TestData.mins); 
		log("Step 12: Late coming second text field: "+TestData.times); 
		taSetupVerificationPage = taSetupIndexPage.checklateWorking(TestData.mins,TestData.times);

		log("To verify that The System should allow 3 times late till 30 mind from the In Time set in the system, then the status is 'Present'.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	
	@Test
	public void ruleEarlyGoing() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_72 Setup_73");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Earlt Going'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 72 _-_-_-_-_*/
		log("Step 11: Early Going first text field: "+TestData.mins); 
		log("Step 12: Early Going second text field: "+TestData.times); 
		
		taSetupVerificationPage = taSetupIndexPage.checkEarlyGoing(TestData.mins,TestData.times);

		log("To verify that The System should allow 3 times late till 30 mind from the In Time set in the system, then the status is 'Present'.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
/* Testcase is :: Setup 73 _-_-_-_-_*/		
		
		taSetupVerificationPage = taSetupIndexPage.checkEarlyGoing(TestData.mins,TestData.times);

		log("To verify that The System should allow 3 times late till 30 mind from the In Time set in the system, then the status is 'Present'.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}*/
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void ruleFlexiTiming() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_74 Setup_75");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Flexi Timing'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 74 and Setup 75 _-_-_-_-_*/
		log("Step 11: Flexi Timing first field mins: "+TestData.mins); 
		log("Step 12: Flexi Timing second field total mins: "+TestData.totol_times);
		log("Step 13: Flexi Timing third field times: "+TestData.times);
		
		taSetupVerificationPage = taSetupIndexPage.checkFlexiTime(TestData.mins,TestData.totol_times,TestData.times);

		log("To verify that the system should allow 2 times flexi time and the status should be Present.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	

	/*--- Method by tarpan: 30-nov ______-----*/		
	@Test
	public void ruleExtraTiming() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_76");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Extra Timing'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 76 _-_-_-_-_*/
		log("Step 11: Extra Timing first field: "+TestData.extra_time_1); 
		log("Step 12: Extra Timing second field: "+TestData.extra_time_2);
		log("Step 13: Extra Timing third field: "+TestData.extra_time_3);
		log("Step 13: Extra Timing fourth field: "+TestData.extra_time_4);
		log("Step 13: Extra Timing fifth field: "+TestData.extra_time_5);
		log("Step 13: Extra Timing sixth field: "+TestData.extra_time_6);
		log("Step 13: Extra Timing seventh field: "+TestData.extra_time_7);
		log("Step 13: Extra Timing eighth field: "+TestData.extra_time_8);
		
		taSetupVerificationPage = taSetupIndexPage.checkExtraTime(TestData.extra_time_1,TestData.extra_time_2,TestData.extra_time_3,TestData.extra_time_4 ,TestData.extra_time_5, TestData.extra_time_6 ,TestData.extra_time_7, TestData.extra_time_8);

		log("To verify that The Extra Timing Rules should be configured in the system after setting the time in the setup.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	
			
	@Test
	public void ruleSingleSwipe() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_77 Setup_78 ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Single Swipe'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 77 _-_-_-_-_*/
		
		taSetupVerificationPage = taSetupIndexPage.checkSingleSwipePresent();

		log("To verfiy that If the radio button selected is Present for single swipe then the status should be Present.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}  */
		
/* Testcase is :: Setup 78 _-_-_-_-_*/	

		taSetupVerificationPage = taSetupIndexPage.checkSingleSwipeAbsent();

		log("To verfiy that If the radio button selected is Absent for single swipe then the status should be Absent.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		} 
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	
	@Test
	public void ruleNoSwipe() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_79 Setup_80 ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'No Swipe'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 79 _-_-_-_-_*/
		
		taSetupVerificationPage = taSetupIndexPage.checkNoSwipePresent();

		log("To verify that If the radio button selected is Present for No swipe then the status should be Present.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		}  */
		
/* Testcase is :: Setup 80 _-_-_-_-_*/		
		
		taSetupVerificationPage = taSetupIndexPage.checkNoSwipeAbsent();

		log("To verify that If the radio button selected is Absent for No swipe then the status should be Absent.");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		} 
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	
	@Test
	public void ruleCompoffWeekDay() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_81 ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Comp off for extra time worked on weekdays'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 81 _-_-_-_-_*/
		
		taSetupVerificationPage = taSetupIndexPage.checkcompOffWeekday(TestData.mins);

		log("To verify that The 'Comp off for extra time worked on weekdays' should be configured in the system after setting the time in the setup");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		} 
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
	
	@Test
	public void ruleCompoffHoliDay() {
		int numOfFailure = 0;
		log("Testcase Id :Setup_82 ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code);
		log("Step 3: Enter Employee Code: " + TestData.employe_code);
		log("Step 4: Enter Password: " + TestData.password);

		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Setting Icon");
		log("Step 7: Click on Time and attendence option from Circle");
		log("Step 8: Select 'SET MY ATTENDANCE' option.");
		log("Step 9: Check 'Common' group.");
		log("Step 10:  Check Rule Type 'Comp off for working on weekly off / holidays'. "); 
	
		taSetupVerificationPage = taSetupIndexPage.setMyAttendancefromCircle();
	
/* Testcase is :: Setup 82 _-_-_-_-_*/
		
		taSetupVerificationPage = taSetupIndexPage.checkcompOffHoliday(TestData.mins);

		log("To verify that The 'Comp off for extra time worked on weekdays' should be configured in the system after setting the time in the setup");

		/*if (taSetupVerificationPage) {
			Common.logStatus("pass");
		} 
		else {
			Common.logStatus("fail");
			numOfFailure++;
		} 
		
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}*/
	}
}