package com.zinghr.signup.indexPage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zinghr.init.AbstractPage;
import com.zinghr.init.Common;
import com.zinghr.init.TestData;
import com.zinghr.signup.verification.SignupVerificationPage;

public class SignupIndexPage extends AbstractPage {

	public SignupIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String url = "https://mailinator.com/";
	public static String signup_url = "http://automation.zinghr.com/2015/pages/Authentication/SignUp.aspx";
	
	
	@FindBy(xpath=".//*[@id='btnSignIn']")
	private WebElement signUp_30_day_btn;
	
	@FindBy(xpath=".//*[@id='txtCompanyName']")
	private WebElement compnyname_txt_fld;
	
	@FindBy(xpath=".//*[@id='txtAdminName']")
	private WebElement displayname_txt_fld;
	
	@FindBy(xpath=".//*[@id='txtEmailId']")
	private WebElement email_id_fld;
	
	@FindBy(xpath=".//*[@id='txtContact']")
	private WebElement contactno_fld;
	
	@FindBy(xpath=".//*[@id='btnSignIn']")
	private WebElement signin;
	
	@FindBy(xpath=".//div[@id='countries_msdd']")
	private WebElement country_List;
	
	@FindBy(xpath=".//*[@id='countries_title']")
	private WebElement allcountry_List;
	
	@FindBy(xpath=".//div[@id='countries_child']//li[1]")
	private WebElement no_country;
	
	@FindBy(xpath=".//*[@id='countries_msdd']//li[not(contains(.,'Select Country'))]")
	private List<WebElement> country_list ;
	
	@FindBy(xpath=".//form[@id='form1']//label/a[1]")
	private WebElement termsOfUse_link;
	
	@FindBy(xpath=".//form[@id='form1']//label/a[2]")
	private WebElement privacyPolicy_link;
	
	@FindBy(xpath=".//*[@id='form1']//label/input")
	private WebElement checkbox;
	
	@FindBy(xpath=".//*[@id='inboxfield']")
	private WebElement inbox;
	
	@FindBy(xpath=".//*[@class='btn btn-dark']")
	private WebElement go_btn;
	
	@FindBy(xpath=".//*[@id='mailcontainer']//.[contains(text(),'Your')]")
	private WebElement mail;
	
	@FindBy(xpath=".//*[@id='noemailmsg']")
	private WebElement emptymail;
	
	@FindBy(xpath=".//*[@id='signup']")
	private WebElement click_here_btn;
	
	@FindBy (xpath=".//input[@id='txtChooseYourPassword']")
	private WebElement a_pswd;
	
	@FindBy (xpath=".//input[@id='txtChooseYourSubDomain']")
	private WebElement a_account_name;
	
	@FindBy (xpath=".//*[@id='btnSignIn']")
	private WebElement activat_btn;
	
	@FindBy (xpath=".//button[@class='btn btn-primary']")
	private WebElement ok_btn;
	
	@FindBy (xpath=".//input[@id='txtActivationCode']")
	private WebElement activation_field;
	
	@FindBy (xpath=".//input[@id='txtSecureCompanyCode']")
	private WebElement cmp_login;
	@FindBy (xpath=".//input[@id='txtSecureEmployeeCode']")
	private WebElement emp_login;
	@FindBy (xpath=".//input[@id='txtSecurePassword']")
	private WebElement pswd_login;
	@FindBy (xpath=".//input[@id='btnSecureLogin']")
	private WebElement login_btn;
	@FindBy (xpath=".//*[@id='btnDemoData']/div[2]/a")
	private WebElement proceed_btn;
	
	@FindBy (xpath=".//input[@id='txtActivationCode']")
	private WebElement activation_code;
	
	String winHandleBefore= driver.getWindowHandle();
	

	
public SignupVerificationPage enterCompanyCode(String cmpCode_s) 
	{
		Common.clickOn(driver, compnyname_txt_fld);
		Common.type(compnyname_txt_fld, cmpCode_s);

		return new SignupVerificationPage(driver);
	}

public SignupVerificationPage enterDisplayName(String displayname_s) 
{
	Common.clickOn(driver, displayname_txt_fld);
	Common.type(displayname_txt_fld, displayname_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage enterEmailid(String email_s) 
{
	Common.clickOn(driver, email_id_fld);
	Common.type(email_id_fld, email_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage selectcountry() 
{
	Common.clickOn(driver, country_List); 
		
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage selectOthercountry() 
{
	Common.clickOn(driver, country_List);
	Random rnd = new Random();
	int i = rnd.nextInt(country_list.size());
	country_list.get(i).click();
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage NoCountry() 
{
	Common.clickOn(driver, country_List);
	Common.clickOn(driver, no_country);
		
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage entercontactno(String conct_s) 
{
	Common.clickOn(driver, contactno_fld);
	Common.type(contactno_fld, conct_s);

	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickTermsOfUse() 
{
	Common.clickOn(driver, termsOfUse_link);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickPrivacyPolicy() 
{
	Common.clickOn(driver, privacyPolicy_link);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage checkCheckbox() 
{
	Common.clickOn(driver, checkbox);
	
	return new SignupVerificationPage(driver);
}
	
public SignupVerificationPage clicksignup30days() 
{
	Common.clickOn(driver, signUp_30_day_btn);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage enterAccountName(String acName) 
{
	Common.clickOn(driver, a_account_name);
	Common.type(a_account_name, acName);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage enterPassword(String pswd) 
{
	Common.clickOn(driver, a_pswd);
	Common.type(a_pswd, pswd);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickActivateButton()
{
	
	Common.pause(2);
	Common.clickOn(driver, activat_btn);
	
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickGoButton(String email2)
{
	Common.pause(2);
	Common.goToUrl(driver, url);
	Common.pause(2);
	Common.clickOn(driver, inbox);
	Common.type(inbox, email2);
	Common.pause(2);
	Common.clickOn(driver, go_btn);
	Common.pause(4);
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickMail(String email2)
{

	if(mail.isDisplayed()){
		Common.clickOn(driver, mail);
	}
	else
	{
		log("====== No activation mail found. =======");
		clickGoButton(email2);
	}
	Common.pause(2);
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickHereButton() 
{
	Common.pause(2);
	driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@name='rendermail']")));
	Common.pause(2);
	Common.clickOn(driver, click_here_btn);
	driver.switchTo().defaultContent();
	Common.pause(3);
	
	for(String winHandle : driver.getWindowHandles())
	{
		driver.switchTo().window(winHandle);
	}
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clickOkbtn()
{

	Common.clickOn(driver, ok_btn);
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage getActinumber()
{

	String activation_no = activation_field.getAttribute("value");
	log("<b>"+activation_no+"</b>");
	return new SignupVerificationPage(driver);
}

public SignupVerificationPage clearActivationcode()
{
	Common.clickOn(driver, activation_code);
	activation_code.clear();
	Common.pause(1);
	Common.type(activation_code, "345671");
	
	return new SignupVerificationPage(driver);
}


public SignupVerificationPage HomePage(String cmp_code , String emp_code , String pswd)
{
	Common.clickOn(driver, cmp_login);
	Common.type(cmp_login, cmp_code);
	Common.clickOn(driver, emp_login);
	Common.type(cmp_login, emp_code);
	Common.clickOn(driver, pswd_login);
	Common.type(cmp_login, pswd);
	Common.clickOn(driver, login_btn);
	Common.pause(2);
	Common.clickOn(driver, proceed_btn);
				
	return new SignupVerificationPage(driver);
		
}
	
public SignupVerificationPage enterActivationcode(String a)
{
	activation_field.clear();
	Common.pause(1);
	Common.clickOn(driver, activation_field);
	Common.type(activation_field,a);
	return new SignupVerificationPage(driver);
}

	public SignupVerificationPage SignUpsuccessfully(String email, String cmp_name, String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(s_company_name);
		enterDisplayName(s_display_name);
		Common.pause(2);
		enterEmailid(emailt);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage alphanumCompanyName(String email, String cmp_name, String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage blankCompanyCode(String email, String cmp_name, String display_name,String no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage lessthan3CompanyCode(String email, String cmp_name, String display_name,String no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage emptyCompanyCode(String email,  String display_name,String no)
	{
		Common.pause(2);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage alphabetDisplayname(String email, String cmp_name, String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage invalidDisplayAdminName(String email, String cmp_name, String display_name,String no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage blankDisplayAdminName(String email, String cmp_name, String display_name,String no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage validEmailId(String email, String cmp_name,String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage invalidEmailId(String email, String cmp_name,String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage blankEmailId(String email, String cmp_name,String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage selectOtherCountries(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		
		selectOthercountry();
		entercontactno(no);
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage selectNoCountry(String email, String cmp_name,String display_name,String no) 
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		NoCountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage validContactNum(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage invalidContactNum(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage invalidContactNum1(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);
		
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage blankContactNum(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);	
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage termsOfUse()
	{

		Common.pause(2);
		clickTermsOfUse();
		
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage privacyPolicy()
	{

		Common.pause(2);
		clickPrivacyPolicy();
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage checkbox(String email, String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email);	
		selectOthercountry();
		entercontactno(no);
		checkCheckbox();
		clicksignup30days();
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage emailVerification(String email2,String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		/*Common.clickOn(driver, mail);
		Common.clickOn(driver, click_here_btn);*/
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage emailFormat(String email2,String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
	//	Common.clickOn(driver, click_here_btn);
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage emailClickbutton(String email2,String cmp_name,String display_name,String no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		
		return new SignupVerificationPage(driver);
	}
	
	
	public SignupVerificationPage activateTwice(String email2,String cmp_name ,String display_name, String pswd, String no, String ac_name, String ac_name1)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		
		selectOthercountry();
		entercontactno(no);
		
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(2);
		driver.switchTo().window(winHandleBefore);
	//	driver.switchTo().defaultContent();
		Common.pause(2);
		clickHereButton();
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.waitForElement(driver, By.xpath(".//a[@id='ErrorLogin']"));
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage enterData(String email2,String cmp_name ,String display_name, String pswd,String no ,String ac_name)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		
		selectOthercountry();
		entercontactno(no);
		
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd);
		
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage enterData1(String ac_name, String pswd)
	{

		Common.pause(2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd);
		
		return new SignupVerificationPage(driver);
	}

	public SignupVerificationPage blankPassword(String email2,String cmp_name, String display_name, String pswd,String no,String ac_name)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		Common.pause(2);
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd);
		clickActivateButton();
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage pswdStatus1(String email2, String cmp_name,String display_name,String pswd2,String no,String ac_name)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd2);
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage pswdStatus2(String pswd3)
	{
		Common.pause(2);
		enterPassword(pswd3);
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage pswdStatus3(String pswd4)
	{
		Common.pause(2);
		enterPassword(pswd4);
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage pswdStatus4(String pswd5)
	{
		Common.pause(2);
		enterPassword(pswd5);
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage updateAccountName(String email2, String cmp_name,String display_name, String ac_name, String pswd, String no)
	{

		Common.pause(1);
		enterCompanyCode(cmp_name);
		enterDisplayName(display_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(5);
		Common.waitForElement(driver, By.xpath("//span[contains(text(),'Dear')]"));
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage activateSuccessfullyMesg(String email2, String cmp_name,String ac_name,String ac_name1, String pswd, String no)
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		System.out.println("==========Wait For Activate Account==============");
		Common.waitForElement(driver, By.xpath("//span[contains(text(),'Dear')]"));
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage invalidActivationCode(String email2, String cmp_name,String ac_name,String ac_name1, String pswd, String no )
	{

		Common.pause(2);
		enterCompanyCode(TestData.rndmString(4));
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		Common.pause(2);
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		clearActivationcode();
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(2);
		System.out.println("==========Wait For Activate Account==============");
	
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage blankPaswdActfield(String email2, String cmp_name,String ac_name,String ac_name1, String pswd, String  no)
	{

		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(2);
		
		return new SignupVerificationPage(driver);
	}
	
	public SignupVerificationPage activateSuccessfully(String email2, String cmp_name,String ac_name,String ac_name1, String pswd, String  no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email2);
		selectOthercountry();
		entercontactno(no);
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(5);
		Common.waitForElement(driver, By.xpath("//span[contains(text(),'Dear')]"));
		clickOkbtn();
		Common.pause(2);
		
		return new SignupVerificationPage(driver);
	}
	
	
	public SignupVerificationPage previouslyActivateCode(String email2, String email3,String cmp_name,String ac_name,String ac_name1, String pswd, String  no)
	{
		Common.pause(2);
		enterCompanyCode(cmp_name);
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email2);
		
		selectOthercountry();
		entercontactno(no);
		
		clicksignup30days();
		clickGoButton(email2);
		clickMail(email2);
		clickHereButton();
		Common.pause(2);
		String activation_no = activation_field.getAttribute("value");		
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(2);
		driver.switchTo().window(winHandleBefore);
		Common.goToUrl(driver, signup_url);
		Common.pause(4);
		enterCompanyCode(cmp_name);
		enterDisplayName(ac_name);
		Common.pause(2);
		enterEmailid(email3);
		selectOthercountry();
		entercontactno(no);
		
		clicksignup30days();
		clickGoButton(email3);
		clickMail(email3);
		clickHereButton();
		Common.pause(2);
		enterActivationcode(activation_no);
		enterAccountName(ac_name1);
		enterPassword(pswd);
		clickActivateButton();
		Common.pause(2);
		return new SignupVerificationPage(driver);
	}
}

