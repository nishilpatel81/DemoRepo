package com.zinghr.tna.verification;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class PendingRequestVerification extends AbstractPage {

	public PendingRequestVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(.,'Pending Requests')]")
	WebElement pendingRequest_haeder;

	public boolean verifyPendingRequestPageisdisplayed() {
		return pendingRequest_haeder.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@class,'AllNotification ')]/div/div[contains(.,'Edit')]")
	List<WebElement> editButton_list;

	@FindBy(xpath = "//div[contains(@class,'AllNotification')]")
	List<WebElement> totalRequest_list;

	@FindBy(xpath = "//div[contains(@class,'AllNotification ')]/div/div[contains(.,'Approve')]")
	List<WebElement> approveButton_list;

	@FindBy(xpath = "//div[contains(@class,'AllNotification ')]/div/div[contains(.,'Reject')]")
	List<WebElement> rejectButton_list;

	public boolean verifyEditApproveRejectButtonIsDisplayedForAllRequest() {

		return editButton_list.size() == totalRequest_list.size()
				&& approveButton_list.size() == totalRequest_list.size()
				&& rejectButton_list.size() == totalRequest_list.size();
	}

	@FindBy(xpath = "//span[contains(.,'Regularization Approval')]")
	WebElement regularazationApproval_header;

	public boolean verifyregularazationApprovalPopupIsDisplayed() {
		return regularazationApproval_header.isDisplayed();
	}

	public boolean verifySelectActionAndReasonIsDisabled() {

		return driver.findElement(
				By.xpath("//select[@id='ReasonSelect'][@disabled='']"))
				.isDisplayed()
				&& driver
						.findElement(
								By.xpath("//select[contains(@class,'typereg')][@disabled='']"))
						.isDisplayed();
	}

	@FindBy(xpath = "//div[contains(@class,'DataVal')]//div[4]")
	WebElement workedHours_header;

	public boolean verifyInTimeAndOutTimeTextBoxIsEditable() {

		System.out.println("workedHours_header.getText()"
				+ workedHours_header.getText());

		return workedHours_header.getText().equals("03:00 Hrs");
	}

}
