package com.zinghr.tna.indexPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.OASVerificationPage;

public class OASIndexPage extends AbstractPage {

	public OASIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//div[@id='menu']/ul//span[contains(text(),'OAS')]")
	WebElement oas_menu;
	
	@FindBy(xpath = ".//input[@id='checkallid']")
	WebElement check_all_box;
	
	@FindBy(xpath = ".//input[@id='txtsearch']")
	WebElement search_text_box;
	
	@FindBy(xpath = ".//i[@class='fa fa-search']/..")
	WebElement search_btn;
	
	
	public OASVerificationPage oaslandingpage()
	{
		Common.clickOn(driver, oas_menu);
		return new OASVerificationPage(driver);
	}
	public OASVerificationPage To_verify_select_all_functionality()
	{
		Common.clickOn(driver, check_all_box);
		return new OASVerificationPage(driver);
	}
	public OASVerificationPage no_result_found_alert_for_find_textbox()
	{
		Common.type(search_text_box, "$&&$");
		Common.clickOn(driver, search_btn);
		return new OASVerificationPage(driver);
	}
	public OASVerificationPage total_absent()
	{
		return new OASVerificationPage(driver);
	}
	public OASVerificationPage Save_as_Draft_Apply_Rules_Send_Approval_tabs()
	{
		return new OASVerificationPage(driver);
	}
}
