package com.zinghr.employeemaster.index;

import org.testng.annotations.Test;

import com.zinghr.init.SeleniumInit;
import com.zinghr.init.TestData;

public class EmployeeMasterIndex extends SeleniumInit {
	
	@Test
	public void createNewEmployee() throws InterruptedException {
		int numOfFailure = 0;
		log("Testcase Id : ");
		log("Testcase Discription :  ");

		log("Step 1: Open url:<a>" + testUrl + "</a>");
		log("Step 2: Enter Company Code:" + TestData.company_code_emp);
		log("Step 3: Enter Employee Code: " + TestData.employe_code_emp);
		log("Step 4: Enter Password: " + TestData.password_emp);

		driver.get("http://qa.zinghr.com/2015/pages/authentication/login.aspx");
		loginVerificationPage = loginIndexpage.loginSuccessfully();

		log("Step 5: Click on Proceed Button");
		log("Step 6: Click on Employee Master menu");
		
		employeemasterIndexPage.clickEmployeeMaster();
	//	String winHandleBefore= driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}

		log("Step 7: Click on 'Add Single Employee'.");

		employeemasterIndexPage.clickAddSingleEmployee();
		
		log("Step 8: Add all the valid details into 'Employee Creation' form.");
		
		employeemasterIndexPage.createNewEmployee(TestData.rndJoining());
		
		
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
