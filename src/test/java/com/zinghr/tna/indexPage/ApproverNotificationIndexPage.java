package com.zinghr.tna.indexPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.ApproverNotificationVerification;

public class ApproverNotificationIndexPage extends AbstractPage{

	public ApproverNotificationIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//span[@id='NotificationNumbers']/../..")
	WebElement Approve_notification;

	@FindBy(xpath = "//button[contains(text(),'Reject')]/..")
	WebElement Reject_button;
	
	@FindBy(xpath = "//button[contains(text(),'Approve')]/..")
	WebElement Approve_button;
	
	@FindBy(xpath = ".//a[@id='btnAppReject']")
	WebElement Reject_Remark_button;

	@FindBy(xpath = ".//a[@id='btnAppReject']")
	WebElement Cancel_Remark_button;

	
	public ApproverNotificationVerification ClickNotificationicon()
	{
		Common.clickOn(driver, Approve_notification);
		return new ApproverNotificationVerification(driver);
	}
	
	public ApproverNotificationVerification ClickApproveButton()
	{
		Common.clickOn(driver, Approve_button);
		return new ApproverNotificationVerification(driver);
	}
	
	public ApproverNotificationVerification ClickRejectButton()
	{
		Common.clickOn(driver, Reject_button);
		return new ApproverNotificationVerification(driver);
	}
	
	public ApproverNotificationVerification ClickRejectRemarkButton()
	{
		Common.clickOn(driver, Reject_Remark_button);
		return new ApproverNotificationVerification(driver);
	}
	
	public ApproverNotificationVerification ClickCancelRemarkButton()
	{
		Common.clickOn(driver, Cancel_Remark_button);
		return new ApproverNotificationVerification(driver);
	}
	

}
