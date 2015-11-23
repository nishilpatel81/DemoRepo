package com.zinghr.tna.index;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zinghr.init.Common;
import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class OASIndex extends SeleniumInit {
	
	
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
	
	public void OASlandingpage()
	{
		int numOfFailure = 0;

		loginwithvalidcredential();
		log("Step 5: Click OAS menu");
	
		oasVerificationPage=oasIndexPage.oaslandingpage();
		log("Verify that Home page is open or not");
		if(oasVerificationPage.oaslandingpageverification())
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
	public void To_verify_the_contents_of_the_page()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		
		log("To verify that OAS page contains Attendance Marking label");
		if(oasVerificationPage.attendance_marking_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains current open cycle label");
		if(oasVerificationPage.Current_open_cycle_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Current Month & Previous Month tabs");
		if(oasVerificationPage.previous_next_month_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Status Indicator label");
		if(oasVerificationPage.previous_next_month_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		log("To verify that OAS page contains Raw Data & Processed Data tabs");
		if(oasVerificationPage.previous_next_month_verification())
		{
			Common.logStatus("pass");
		}
		else
		{
			Common.logStatus("fail");
			numOfFailure++;
		}
		
		
		log("To verify that OAS page contains Week coloumn with dates.");
		if(oasVerificationPage.previous_next_month_verification())
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
	public void To_verify_select_all_functionality()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		oasVerificationPage=oasIndexPage.To_verify_select_all_functionality();
		log("To verify select all records");
		if(oasVerificationPage.To_verify_select_all_functionality_verification())
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
	public void no_result_found_alert_for_find_textbox()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		oasVerificationPage=oasIndexPage.no_result_found_alert_for_find_textbox();
		log("To verify No records found message is displayed but the search text box is not display.");
		if(oasVerificationPage.no_result_found_alert_for_find_textbox_verification())
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
	public void total_absent_present_numberlist()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		oasVerificationPage=oasIndexPage.total_absent();
		log("To verify Total Absent, Present & Leave count is getting display");
		if(oasVerificationPage.total_absent_verification())
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
	public void Save_as_Draft_Apply_Rules_Send_Approval_tabs()
	{
		int numOfFailure = 0;
		
		OASlandingpage();
		oasVerificationPage=oasIndexPage.Save_as_Draft_Apply_Rules_Send_Approval_tabs();
		log("To verify Save as Draft, Apply Rules & Send for Approval tabs are getting display");
		if(oasVerificationPage.Save_as_Draft_Apply_Rules_Send_Approval_tabs_verification())
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
