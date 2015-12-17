package com.zinghr.tna.indexPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.tna.verification.TnaScenarioVerification;

public class TnaScenarioIndexPage extends AbstractPage {
public TnaScenarioIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath = ".//div[@id='one']//div[@class='tab-content']/div[1]/div/div/div[1]//input[@value='PI']")
WebElement punchin_checkbox;

@FindBy(xpath = ".//a[@class='btn btn-primary TNAGroupSave']")
WebElement save_btn;

		public TnaScenarioVerification clickpunchinckeckbox()
		{
			if(punchin_checkbox.isSelected())
			{
				
			}
			else
			{
				Common.clickOn(driver, punchin_checkbox);
			}
			return new TnaScenarioVerification(driver);
		}
		public TnaScenarioVerification savebutton()
		{
			Common.clickOn(driver, save_btn);
			
			return new TnaScenarioVerification(driver);
		}
}

