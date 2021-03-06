package com.zinghr.signup.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class SignupIndex extends SeleniumInit {

	@Test(priority = 1)
	public void HomePage() throws Exception {

		int numOfFailure = 0;

		log("Test Case Id : SU_02 ");
		log("Testcase Discription : Home page verification. ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");

		signupVerification = signupIndexpage.HomePage(TestData.company_code,
				TestData.employe_code, TestData.password);

		log("To verify that user is able to view Home page.");

		if (signupVerification.verifyHomePage()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void companynameFieldAlphanumeric() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_03 ");
		log("Testcase Discription : Field validation for 'Company name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Alphanumeric value in company Name: "
				+ s_company_name);

		signupVerification = signupIndexpage.alphanumCompanyName(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that user is able to enter Alphanumeric characters in 'Company Name' field");

		if (signupVerification.verifySignupSuccessfully()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 3)
	public void companynameFieldBlank() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_04 ");
		log("Testcase Discription : Field validation for 'Company name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Blank space in company Name: " + blank);

		signupVerification = signupIndexpage.blankCompanyCode(emailt, blank,
				s_display_name, contact_no);

		log("To verify that the company name field do not accept blank space.");

		if (signupVerification.verifyblankCompanycode()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 4)
	public void companynameFieldlessthan3() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_06 ");
		log("Testcase Discription : Field validation for 'Company name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter less than three characters in company Name: "
				+ TestData.lessthan3);

		signupVerification = signupIndexpage.lessthan3CompanyCode(emailt,
				TestData.lessthan3, s_display_name, contact_no);

		log("To verify that appropriate error message is displayed if user enters less than three characters in 'Company Name' field");

		if (signupVerification.verifylessthan3Companycode()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 5)
	public void companynameFieldEmpty() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_07 ");
		log("Testcase Discription : Field validation for 'Company name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Do not enter any data into 'Company Code'.");
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);

		signupVerification = signupIndexpage.emptyCompanyCode(emailt,
				s_display_name, contact_no);

		log("To verify that appropriate alert message 'Please Enter company name' is displayed when user sign ups with empty Company Name field");

		if (signupVerification.verifyemptyCompanycode()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 6)
	public void displaynameFieldAlphabet() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_08 ");
		log("Testcase Discription : Field validation for 'Display name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter 'Company Name':" + s_company_name);
		log("Step 3: Enter alphabet in 'Display  Admin Name': "
				+ s_display_name);
		/*
		 * log("Step 4: Enter Email id: "+TestData.rndmemail(3));
		 * log("Step 5: Select any country");
		 * log("Step 6: Enter Contact no: "+contact_no);
		 */

		signupVerification = signupIndexpage.alphabetDisplayname(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that user is able to enter alphabets in 'Display Name' field");

		if (signupVerification.verifySignupSuccessfully()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 7)
	public void displaynameFieldInvalid() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_09 ");
		log("Testcase Discription : Field validation for 'Display name' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter 'Company Name':" + s_company_name);
		log("Step 3: Enter invalid data in 'Display Admin Name': "
				+ TestData.invalid);
		/*
		 * log("Step 4: Enter Email id: "+TestData.rndmemail(3));
		 * log("Step 5: Select any country");
		 * log("Step 6: Enter Contact no: "+contact_no);
		 */

		signupVerification = signupIndexpage.invalidDisplayAdminName(emailt,
				s_company_name, TestData.invalid, contact_no);

		log("To verify that appropriate error message is displayed when user enters special characters and numeric value in 'display Name' field");

		if (signupVerification.verifyInvalidDisplayAdminName()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 8)
	public void displaynameFieldBlank() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_11 ");
		log("Testcase Discription : Field validation for 'Display Name' field");
		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Blank space in 'Display AdminName': " + blank);

		signupVerification = signupIndexpage.blankDisplayAdminName(emailt,
				s_company_name, blank, contact_no);

		log("To verify that the company name field do not accept blank space");

		if (signupVerification.verifyblankCompanycode()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 9)
	public void emailidFieldValid() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_12 ");
		log("Testcase Discription : Field validation for 'Email ID' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter valid 'Email Id': " + emailt);

		signupVerification = signupIndexpage.validEmailId(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that Email id field accepts valid email id format.");

		if (signupVerification.verifyValidEmailId()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 10)
	public void emailidFieldInvalid() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_13 ");
		log("Testcase Discription : Field validation for 'Email ID' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter invalid 'Email Id': " + invalid_email);

		signupVerification = signupIndexpage.invalidEmailId(invalid_email,
				s_company_name, s_display_name, contact_no);

		log("To verify that appropriate error message is displayed when user enter invalid email format in Email field.");

		if (signupVerification.verifyInvalidEmailId()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 11)
	public void emailidFieldBlank() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_14 ");
		log("Testcase Discription : Field validation for 'Email ID' field");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter blank data in 'Email Id': " + blank);

		signupVerification = signupIndexpage.blankEmailId(blank,
				s_company_name, s_display_name, contact_no);

		log("To verify that Email id field do not accept blank data");

		if (signupVerification.verifyblankEmailId()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 12)
	public void selectCountry() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_15 ");
		log("Testcase Discription : Select other country from country list.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);

		signupVerification = signupIndexpage.selectOtherCountries(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that user is able to select other country name");

		if (signupVerification.verifyCountrySelection()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 13)
	public void selectNoCountry() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_16 ");
		log("Testcase Discription : Select 'Select Country ' country list.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select 'Select Country' option from country name field");
		/* log("Step 6: Enter Contact no: "+contact_no); */

		signupVerification = signupIndexpage.selectNoCountry(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that appropriate error message is displayed when user selects 'Select Country' option from Country Name field");

		if (signupVerification.verifynoCountry()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 14)
	public void contactNumFieldValid() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_17 ");
		log("Testcase Discription : Enter numeric value into Contact Number' field.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);

		signupVerification = signupIndexpage.validContactNum(emailt,
				s_company_name, s_company_name, contact_no);

		log("To verify that user is able to enter numeric values in Contact Number field");

		if (signupVerification.verifyvalidcontactNum()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 15)
	public void contactNumFieldInvalid() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_18 ");
		log("Testcase Discription : Enter alphabets and special characters into Contact Number' field.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + inv_contact_no);

		signupVerification = signupIndexpage.invalidContactNum(emailt,
				s_company_name, s_display_name, inv_contact_no);

		log("To verify that error message is displayed when user enters alphabets and special characters in Contact Number field");

		if (signupVerification.verifyInvalidcontactNum()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 16)
	public void contactNumFieldMorethan10() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_20 ");
		log("Testcase Discription : Enter more than 10 digits into 'Contact Number' field.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + large_contact_no);

		signupVerification = signupIndexpage.invalidContactNum1(emailt,
				s_company_name, s_display_name, TestData.more10);

		log("To verify that Max length of 10 characters is provided to Contact Number field");

		if (signupVerification.verifyInvalidcontactNum1()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 17)
	public void contactNumFieldBlank() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_21 ");
		log("Testcase Discription : Enter blank data in contact number field.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + blank);

		signupVerification = signupIndexpage.blankContactNum(emailt,
				s_company_name, s_display_name, blank);

		log("To verify that Contact Number field do not accept blank data.");

		if (signupVerification.verifyBlankcontactNum()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 18)
	public void termsAndprivacy() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_22 ");
		log("Testcase Discription : Click on 'Terms of Use' and 'Privacy Policy' link.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2 : Click on 'Terms of Use' link.");

		signupVerification = signupIndexpage.termsOfUse();

		log("To verify that user is redirected to taregeted page after clicking on 'Terms of Use' hyperlink");
		String winHandleBefore = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyTermsOfUse()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Step 3 : Click on 'Privacy Policy' link.");

		driver.switchTo().window(winHandleBefore);

		signupVerification = signupIndexpage.privacyPolicy();

		log("To verify that user is redirected to taregeted page after clicking on 'Privacy Policy' hyperlink");
		String winHandleBefore1 = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyPrivacyPolicy()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 19)
	public void checkbox() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : SU_23 ");
		log("Testcase Discription : Checkbox Checked-unchecked ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Uncheck checkbox.");

		signupVerification = signupIndexpage.checkbox(emailt, s_company_name,
				s_display_name, contact_no);

		log("To verify that Alert message is displayed if user unchecked the Terms and condition checkbox");

		if (signupVerification.verifyCheckbox()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 20)
	public void activationPage() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_01 ");
		log("Testcase Discription : SignUp successfully and 'Activation Page' verification.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");

		signupVerification = signupIndexpage.SignUpsuccessfully(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify Activation page is open or not with Successfully SignUp.");

		if (signupVerification.verifySignupSuccessfully()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 21)
	public void emailverification() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_02 ");
		log("Testcase Discription : SignUp successfully and email verification.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + TestData.rndmString(4));
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");

		signupVerification = signupIndexpage.emailVerification(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify Activation page is open or not with Successfully SignUp.");

		if (signupVerification.verifymail()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 22)
	public void emailFormat() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_03 ");
		log("Testcase Discription : Email format verification.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + TestData.rndmString(4));
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");

		signupVerification = signupIndexpage.emailFormat(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that the Email is in Proper format.");

		if (signupVerification.verifymailFormat()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 23)
	public void emailContents() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_04 ");
		log("Testcase Discription : Email Contents verification.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + TestData.rndmString(4));
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");

		signupVerification = signupIndexpage.emailFormat(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that user is able to view 'Thank You message' and 'Click Here' button in Email");

		if (signupVerification.verifyEmailContents()) {
			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 24)
	public void emailClickHereBtn() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_05 ");
		log("Testcase Discription : Click here button in email.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + TestData.rndmString(4));
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open activation mail.");
		log("Step 9: Click on 'Click Here' button.");

		signupVerification = signupIndexpage.emailClickbutton(emailt,
				s_company_name, s_display_name, contact_no);

		log("To verify that user is redirected to Active Sign up page after clicking on 'Click Here' button.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyActivationPage()) {

			Common.logStatus("Pass");

		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 25)
	public void activateTwice() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_06 ");
		log("Testcase Discription : Activate account twice from same link in activation link.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd);

		signupVerification = signupIndexpage.activateTwice(emailt,
				s_company_name, s_display_name, a_pswd, contact_no,
				account_name, account_name1);

		log("To verify that user is not able to Activate account twice.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyactivateTwice()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 26)
	public void enterPaswd() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_08, A_SU_10 ");
		log("Testcase Discription : Click here button in email.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd1);

		String winHandleBefore = driver.getWindowHandle();
		signupVerification = signupIndexpage.enterData(emailt, s_company_name,
				s_display_name, a_pswd1, contact_no, account_name);

		log("To verify that user is able to enter alphanumeric characters in Password field.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyBetterPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Step 11: Enter Password:" + a_pswd);

		driver.switchTo().window(winHandleBefore);

		signupVerification = signupIndexpage.enterData1(s_display_name, a_pswd);

		log("To verify that user is able to enter alphanumeric characters in Password field.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyStrongPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 27)
	public void enterBlankPassword() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_12 ");
		log("Testcase Discription : Click here button in email.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Blank Password: " + blank);

		signupVerification = signupIndexpage
				.blankPassword(emailt, s_company_name, s_display_name, blank,
						contact_no, account_name);

		log("To verify that Password field do not accept blank data.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyBlankPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 28)
	public void pswdProgressStatus() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_13 ");
		log("Testcase Discription : Password progress status for 'Password' field.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter valid password.");

		signupVerification = signupIndexpage.pswdStatus1(emailt,
				s_company_name, s_display_name, a_pswd2, contact_no,
				account_name);

		log("To verify Password progress status as per user enter the password.");

		log("Step 11: Enter Password: " + a_pswd2);
		log("Password status <br>Weak</br>");
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyWeakPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		signupVerification = signupIndexpage.pswdStatus2(a_pswd3);

		log("Step 11: Enter Password: " + a_pswd3);
		log("Password status <br>Better</br>");
		if (signupVerification.verifyBetterPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		signupVerification = signupIndexpage.pswdStatus3(a_pswd4);

		log("Step 11: Enter Password: " + a_pswd4);
		log("Password status <br>Medium</br>");
		if (signupVerification.verifyMediumPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		signupVerification = signupIndexpage.pswdStatus4(a_pswd5);

		log("Step 11: Enter Password: " + a_pswd5);
		log("Password status <br>Strong</br>");
		if (signupVerification.verifyStrongPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 29)
	public void updateAccountName() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_14 A_SU_18");
		log("Testcase Discription : Update account name in 'Activation Page'.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Update Account_Name: " + account_name);

		signupVerification = signupIndexpage.updateAccountName(emailt,
				s_company_name, s_display_name, account_name, a_pswd,
				contact_no);

		log("To verify that user is able to edit/update Account/Company Name.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyUpdateAccountName()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 30)
	public void activateSuccessfullyMesg() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_15 ");
		log("Testcase Discription : Activate successfully verification. ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any one country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd);

		signupVerification = signupIndexpage.activateSuccessfullyMesg(emailt,
				s_company_name, s_display_name, account_name, a_pswd,
				contact_no);

		log("To verify that after clicking on Activate Account button user account is activated successfully");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyUpdateAccountName()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("Test Case Id : A_SU_16");
		log("To verify that successful message along with Company Code,Employee Code and Password is displayed after clicking on Activate Account button.");

		if (signupVerification.verifyUpdateAccountName()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	// By tarpan 2- Dec

	@Test(priority = 31)
	public void invalidActivationCode() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_17 ");
		log("Testcase Discription : Activate successfully verification. ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any one country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd);

		signupVerification = signupIndexpage.invalidActivationCode(emailt,
				s_company_name, s_display_name, account_name, a_pswd,
				contact_no);

		log("To verify that error message is displayed if user enters invalid activation code in Activation code field.");

		/*
		 * for (String winHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(winHandle); }
		 */
		if (signupVerification.verifyInvalidActivationCode()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 32)
	public void blankPswdActCode() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_19 ");
		log("Testcase Discription : Blank Password and Activation Code in 'Activation Page'.");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in activation mail.");
		log("Step 10: Update Account_Name: " + account_name);
		log("Step 11: Enter Blank password and Activation Code':" + blank);

		signupVerification = signupIndexpage.blankPaswdActfield(emailt,
				s_company_name, s_display_name, blank, blank, contact_no);

		log("To verify that appropriate alert message is displayed if user sign ups with empty Activation Code and Password field");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		if (signupVerification.verifyBlankPsswd()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 33)
	public void activateSuccessfully() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_21, L_01 ");
		log("Testcase Discription : 'Login Page' verification after Activate successfully. ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any one country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd);
		log("Step 11: Click on 'ACTIVATE ACCOUNT' button.");
		log("Step 12: Click on 'Ok' button.");

		signupVerification = signupIndexpage.activateSuccessfully(emailt,
				s_company_name, s_display_name, account_name, a_pswd,
				contact_no);

		log("To verify that After clicking on 'Ok' button of successful message user is redirected to login page.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyloginPage()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}

		log("To verify that user is redirected to <b> http://qa.zinghr.com/2015/pages/authentication/login.aspx</b> page after clicking on OK button from Successful dialog");

		if (signupVerification.verifyloginPage()) {
			Common.logStatus("Pass");
		} else {
			Common.logStatus("Fail");
			numOfFailure++;
		}
		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 34)
	public void previouslyActivateCode1() throws Exception {
		int numOfFailure = 0;

		log("Test Case Id : A_SU_23 ");
		log("Testcase Discription : 'Login Page' verification after Activate successfully. ");
		log("Step 1 : Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter company Name: " + s_company_name);
		log("Step 3: Display Employee Name: " + s_display_name);
		log("Step 4: Enter Email id: " + emailt);
		log("Step 5: Select any one country");
		log("Step 6: Enter Contact no: " + contact_no);
		log("Step 7: Click on 'Sign Up for 30 days trial' button.");
		log("Step 8: Open ZingHR activation mail.");
		log("Step 9: Click on 'Click Here' button in mail.");
		log("Step 10: Enter Password: " + a_pswd);
		log("Step 11: Click on 'ACTIVATE ACCOUNT' button.");
		log("Step 12: Again activate account with same 'Activation Code' and 'Company name'.");

		signupVerification = signupIndexpage.previouslyActivateCode(emailt,
				emailt_1, s_company_name, s_display_name, account_name, a_pswd,
				contact_no);

		log("To verify that appropriate error message is displayed if user enters already used activation code and Company Name.");

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		if (signupVerification.verifyTwiseActivateWithSameCode()) {
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