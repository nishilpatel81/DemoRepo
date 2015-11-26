package com.zinghr.tna.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class ApproverNotificationVerification extends AbstractPage{

	public ApproverNotificationVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//span[@id='NotificationNumbers']")
	WebElement Notification_size;
	
	@FindBy(xpath = "//button[contains(text(),'Reject')]/..")
	WebElement Reject_button;
	
	@FindBy(xpath = "//button[contains(text(),'Approve')]/..")
	WebElement Approve_button;
	
	@FindBy(xpath = ".//span[contains(text(),'Remarks for Rejection')]")
	WebElement Reject_remark;
	
	@FindBy(xpath = "//div[contains(text(),'Please enter remarks for rejection.')]")
	WebElement Reject_the_remark_without_fill_remarks;
	
	@FindBy(xpath = ".//a[@id='btnAppReject']")
	WebElement Reject_Remark_button;

	public boolean ApproveNotificationsize_verification() {
		int noti_size =Integer.parseInt(Notification_size.getText());
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+noti_size);
		if (noti_size>=1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean ApproveAndRejectButtonDisplay_verification() {
		
		if (Reject_button.isDisplayed() && Approve_button.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean AfterClickRejctRemarkPopupDisplay_verification() {
		
		if (Reject_remark.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ClcikRejectButtonOfRejectRemarkWithoutFillRemarks_verification() {
		
		if (Reject_the_remark_without_fill_remarks.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ClickOnCancelButtonOfRejectRemarkWindow_verification() {
		
		WebElement EmployeeConnect = driver.findElement(By.xpath(".//span[contains(text(),'Employee Connect')]"));
		WebElement timeandattendance = driver
				.findElement(By.xpath(".//div[@id='myTNA']//span[contains(text(),'My Time And Attendance')]"));

		if (timeandattendance.isDisplayed() && EmployeeConnect.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
