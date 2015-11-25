package com.zinghr.tna.verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class MyTransectionVerification extends AbstractPage{

	public MyTransectionVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'View')]")
	WebElement view_btn;
	
	@FindBy(xpath = ".//span[contains(text(),'Regularization Approval')]")
	WebElement Regularization_approval;
	
	@FindBy(xpath = ".//span[contains(text(),'Apply OutDoor')]")
	WebElement Apply_outdoor;
	
	@FindBy(xpath = ".//span[contains(text(),'Remarks for Cancel')]")
	WebElement Remark_for_Cancel;
	
	public boolean check_time_and_attendance_page_verification() {
		if (view_btn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean check_Reguleriztion_lbl_after_click_view_button_ontime_and_attendance_page_verification() {
		if (Regularization_approval.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean check_Reguleriztion_cancel_button_verification() {
		if (Remark_for_Cancel.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean check_Reguleriztion_view_button_verification() {
		if (Apply_outdoor.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
}    
