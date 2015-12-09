package com.zinghr.tna.verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.tna.indexPage.DashboardTimeNAttendanceCaIndexPage;
import com.zinghr.tna.indexPage.MyTransectionIndexpage;

public class MyTransectionVerification extends AbstractPage {

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
		if (Regularization_approval.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean check_Reguleriztion_cancel_button_verification() {
		if (Remark_for_Cancel.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean check_Reguleriztion_view_button_verification() {
		if (Apply_outdoor.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyTimeAndDateOnMyTransactionHistoryPage() {

		WebElement date = driver.findElement(By.xpath("//label[contains(.,'"
				+ DashboardTimeNAttendanceCaIndexPage.dateOfRegularazation
				+ "')]"));

		System.out.println("Date : " + date);

		WebElement time = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]//div[4][contains(.,'"
						+ DashboardTimeNAttendanceCaIndexPage.workedHours
						+ "')]"));
		System.out.println("time : " + time);
		return date.isDisplayed() && time.isDisplayed();
	}

	@FindBy(xpath = "//a[@id='thisyear']")
	WebElement thisyear_button;

	@FindBy(xpath = "//a[@id='lastyear']")
	WebElement lastyear_button;

	@FindBy(xpath = "//a[@id='YearRange']")
	WebElement custom_button;

	public boolean verifyThisYearLastYearCustomTabisDisplayed() {

		return thisyear_button.isDisplayed() && lastyear_button.isDisplayed()
				&& custom_button.isDisplayed();
	}

}
