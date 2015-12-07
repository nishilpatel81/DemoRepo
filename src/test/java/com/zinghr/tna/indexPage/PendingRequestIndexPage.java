package com.zinghr.tna.indexPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.DashboardTimeNAttendanceCaVerification;
import com.zinghr.tna.verification.PendingRequestVerification;

public class PendingRequestIndexPage extends AbstractPage {

	public PendingRequestIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

	@FindBy(xpath = "//li[@id='header-notification']//i[contains(@class,'bell')]")
	WebElement bellIconOnTitle_button;

	public PendingRequestVerification clickOnBellIconOnTitleBar() {

		Common.clickOn(driver, bellIconOnTitle_button);
		return new PendingRequestVerification(driver);
	}

	@FindBy(xpath = "//a[contains(.,'See all notifications')]")
	WebElement seeAllNotification_button;

	public PendingRequestVerification clickOnSeeAllNotification() {

		Common.clickOn(driver, seeAllNotification_button);
		return new PendingRequestVerification(driver);

	}

	@FindBy(xpath = "//div[contains(@class,'AllNotification ')]/div/div[contains(.,'Edit')]")
	List<WebElement> editButton_list;

	public PendingRequestVerification clickOnEditButtonOfFirstRequest() {
		Common.clickOn(driver, editButton_list.get(0));
		return new PendingRequestVerification(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'DataVal')]//div[4]")
	WebElement workedHours_header;

	public PendingRequestVerification clickOnWorkedHoursLabel() {
		Common.clickOn(driver, workedHours_header);
		return new PendingRequestVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInInTime(String value) {

		WebElement intime = driver
				.findElement(By
						.xpath("//div[contains(@class,'DataVal')]//input[@id='defaultEntryIn']"));

		Common.type(intime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInOutTime(String value) {

		WebElement outtime = driver
				.findElement(By
						.xpath("//div[contains(@class,'DataVal')]//input[@id='defaultEntryOut']"));

		Common.type(outtime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

}
