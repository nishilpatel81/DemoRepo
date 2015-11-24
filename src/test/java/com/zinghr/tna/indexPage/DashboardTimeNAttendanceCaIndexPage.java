package com.zinghr.tna.indexPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.DashboardTimeNAttendanceCaVerification;
import com.zinghr.tna.verification.SettingsTimeAttendanceSetupVerification;

public class DashboardTimeNAttendanceCaIndexPage extends AbstractPage {

	public DashboardTimeNAttendanceCaIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(@class,'fc-button-next')]")
	WebElement nextMonthArrow_button;

	@FindBy(xpath = "//span[contains(@class,'fc-button-prev')]")
	WebElement previousMonthArrow_button;

	public DashboardTimeNAttendanceCaVerification clickOnForwardArrow() {
		Common.pause(1);
		Common.clickOn(driver, nextMonthArrow_button);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification clickOnbackwordArrow() {
		Common.pause(1);
		Common.clickOn(driver, previousMonthArrow_button);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	@FindBy(xpath = "//a[contains(.,'Holiday List')]")
	WebElement holidayList_button;

	public DashboardTimeNAttendanceCaVerification clickOnHolyDayListTab()

	{

		Common.pause(1);
		Common.clickOn(driver, holidayList_button);

		return new DashboardTimeNAttendanceCaVerification(driver);

	}

	@FindBy(xpath = "//a[contains(.,'Regularize')]")
	WebElement regularize_button;

	public DashboardTimeNAttendanceCaVerification clickRegularizeButton() {
		Common.pause(1);
		Common.clickOn(driver, regularize_button);
		Common.pause(2);

		Common.waitForElement(driver,
				By.xpath("//div[contains(@id,'RegularizationPopup')]"));

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	@FindBy(xpath = "//button[@id='BtnApplyReg'][contains(.,'Apply Now')]")
	WebElement applyNow_button;

	public DashboardTimeNAttendanceCaVerification clickApplyNowButton() {
		Common.pause(3);
		Common.clickOn(driver, applyNow_button);
		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'DataVal')]//select[contains(@class,'typereg')]")
	List<WebElement> selectAction_dropdown;

	public static int counter = 0;

	public static int timeCounter = 0;

	public DashboardTimeNAttendanceCaVerification selectValueOfSelectionActionDropdown(
			String value) {

		for (WebElement e : selectAction_dropdown) {

			List<WebElement> getAllOption = e.findElements(By.xpath("option"));

			System.out.println("Select Element " + e + " option elemt size "
					+ getAllOption.size());

			Common.highlightElement(driver, e);

			for (WebElement optionElement : getAllOption) {

				System.out.println("optionElement.getText() : "
						+ optionElement.getText());

				if (optionElement.getText().equals(value)) {

					Common.selectFromComboByVisibleElement(e, value);

					counter++;
				}

				if (counter > 0) {
					break;
				}

			}

			timeCounter++;

			if (counter > 0) {
				break;
			}

		}

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInInTime(String value) {

		System.out.println("Time counter " + timeCounter);

		WebElement intime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')][" + timeCounter
						+ "]//input[@id='defaultEntryIn']"));

		Common.type(intime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification enterInOutTime(String value) {

		WebElement outtime = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')][" + timeCounter
						+ "]//input[@id='defaultEntryOut']"));

		Common.type(outtime, value);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

	public DashboardTimeNAttendanceCaVerification clickOnTotalworkingHourLable() {

		WebElement workingHours = driver.findElement(By
				.xpath("//div[contains(@class,'DataVal')]["
						+ DashboardTimeNAttendanceCaIndexPage.timeCounter
						+ "]//div[4]"));

		Common.clickOn(driver, workingHours);

		return new DashboardTimeNAttendanceCaVerification(driver);
	}

}
