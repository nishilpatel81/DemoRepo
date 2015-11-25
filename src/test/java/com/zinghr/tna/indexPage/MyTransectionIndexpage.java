package com.zinghr.tna.indexPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.MyTransectionVerification;

public class MyTransectionIndexpage extends AbstractPage{

	public MyTransectionIndexpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = ".//li[@id='header-user']//span[1]")
	WebElement Username_drop_down;
	
	@FindBy(xpath = ".//a[contains(text(),'Time and Attendance Notification')]")
	WebElement Time_and_Attendance_Notification_tab;
	
	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'View')]")
	WebElement view_btn;
	
	@FindBy(xpath = ".//li[@id='header-user']//a[contains(text(),'My Transaction History')]")
	WebElement My_trasection_history_menu;
	
	@FindBy(xpath = ".//a[@id='btnPending']")
	WebElement panding_btn;
	
	@FindBy(xpath = ".//div[@id='dataGrid']/div[1]//a[contains(text(),'Cancel')]")
	WebElement cancel_btn;
	
	@FindBy(xpath = ".//div[@id='btnTnaPanel']/a[contains(text(),'Regularize')]")
	WebElement Reguleriztion_btn;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ok_button;
	
	@FindBy(xpath = "//i[@id='popupclose']/..")
	WebElement pop_close_btn;
	
	public MyTransectionVerification check_time_and_attendance_page()
	{
		Common.clickOn(driver, Username_drop_down);
		Common.clickOn(driver, My_trasection_history_menu);
		Common.clickOn(driver, Time_and_Attendance_Notification_tab);
		return new MyTransectionVerification(driver);
		
	}
	
	public MyTransectionVerification check_Reguleriztion_lbl_after_click_view_button_ontime_and_attendance_page()
	{
		Common.clickOn(driver, Username_drop_down);
		Common.clickOn(driver, My_trasection_history_menu);
		Common.clickOn(driver, Time_and_Attendance_Notification_tab);
		Common.clickOn(driver, view_btn);
		return new MyTransectionVerification(driver);
	}
	
	public MyTransectionVerification check_Reguleriztion_cancel_button()
	{
		
		Common.pause(3);
		Common.clickOn(driver, ok_button);
		Common.clickOn(driver, pop_close_btn);
		Common.pause(2);
		Common.clickOn(driver, Username_drop_down);
		Common.clickOn(driver, My_trasection_history_menu);
		Common.clickOn(driver, panding_btn);
		Common.clickOn(driver, cancel_btn);
		return new MyTransectionVerification(driver);
	}
	
	public MyTransectionVerification check_Reguleriztion_view_button()
	{
		Common.pause(3);
		Common.clickOn(driver, ok_button)        ;
		Common.clickOn(driver, pop_close_btn);
		Common.pause(2); 
		Common.clickOn(driver, Username_drop_down);
		Common.clickOn(driver, My_trasection_history_menu);
		Common.clickOn(driver, panding_btn);
		Common.clickOn(driver, view_btn); 
		return new MyTransectionVerification(driver);
	}
}
