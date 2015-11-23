package com.zinghr.tna.verification;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;

public class OASVerificationPage extends AbstractPage {

	public OASVerificationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ".//span[contains(text(),'Attendance Marking')]")
	WebElement Attendance_marking_lbl;
	
	@FindBy(xpath = ".//span[contains(text(),'Current Open Cycle')]")
	WebElement Current_open_cycle_lbl;
	
	@FindBy(xpath = ".//a[contains(text(),'Previous Month')]")
	WebElement previous_month_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Next Month')]")
	WebElement next_month_btn;
	
	@FindBy(xpath = ".//span[contains(text(),'New Joinee Or Resign')]")
	WebElement New_joinee_lbl;
	
	@FindBy(xpath = ".//span[contains(text(),'Leave Applied')]")
	WebElement leave_applied_lbl;
	
	@FindBy(xpath = ".//a[contains(text(),'Raw Data')]")
	WebElement Raw_data_btn;
	
	@FindBy(xpath = ".//a[contains(text(),'Processed Data')]")
	WebElement Processed_data_btn;
	
	@FindBy(xpath = ".//div[@class='DivPadding weekcolumn1']")
	WebElement Week_coloumn;
	
	@FindBy(xpath = ".//div[@class='divimage']//input[@checked='checked']")
	WebElement select_all_checkbox;
	
	@FindBy(xpath = ".//div[@class='gridrow'][1]/div[2]/div[contains(@style,'#ca6666')]")
	WebElement total_number_lbl;
	
	public boolean oaslandingpageverification() {
		if (Attendance_marking_lbl.isDisplayed() && Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean attendance_marking_verification() {
		if (Attendance_marking_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Current_open_cycle_verification() {
		if (Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean previous_next_month_verification() {
		if (previous_month_btn.isDisplayed() && next_month_btn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Status_Indicator_verification() {
		if (New_joinee_lbl.isDisplayed() && leave_applied_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Raw_Data_Processed_Data_verification() {
		if (Raw_data_btn.isDisplayed() && Current_open_cycle_lbl.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Status_indicator_varification() {
		if (Attendance_marking_lbl.isDisplayed() && Processed_data_btn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Week_column_verification() {
		if (Week_coloumn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean To_verify_select_all_functionality_verification() {
		if (select_all_checkbox.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean no_result_found_alert_for_find_textbox_verification() {
		
		WebElement No_Record_found=driver.findElement(By.xpath(".//div[contains(text(),'No records found')]"));
		if (No_Record_found.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean total_absent_verification() {
		
		List<WebElement> absent_img=driver.findElements(By.xpath(".//div[@class='gridrow'][1]/div[2]//img[@class='bgAbsent']"));
		int absent_img_size=absent_img.size();
		int total_number_lbl_text=Integer.parseInt(total_number_lbl.getText());
		if(absent_img_size == total_number_lbl_text){
			return true;
		} else {
			return false;
		}
	}
public boolean Save_as_Draft_Apply_Rules_Send_Approval_tabs_verification() {
		
		WebElement Save_as_draft_btn=driver.findElement(By.xpath(".//button[@id='btndraftID']"));
		WebElement Apply_Rules_btn=driver.findElement(By.xpath(".//button[contains(text(),'Apply Rules')]"));
		WebElement Send_Approval_btn=driver.findElement(By.xpath(".//button[contains(text(),'Send for Approval')]"));
		if (Save_as_draft_btn.isDisplayed() && Apply_Rules_btn.isDisplayed() && Send_Approval_btn.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
