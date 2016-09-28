package com.pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.titanium.BasicPageObject;



public class RegistrationPgObject extends BasicPageObject{

	
	public RegistrationPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebElement regRadioBtn_img = driver.findElement(By.xpath(".//*[@id='Topnav1_imgHeader']"));

	// arabic name
	//WebElement arabName_txt = driver.findElement(By.xpath(".//*[@id='tbFullName']"));
	
	//Legal name 
	 WebElement title_dp = driver.findElement(By.xpath(".//*[@id='ddlTitle']"));
	 WebElement lName_txt = driver.findElement(By.xpath(".//*[@id='txtLastName']"));
	 WebElement fName_txt = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
	 WebElement mName_txt = driver.findElement(By.xpath(".//*[@id='txtMiddleName']"));
	 
	 //contact address
	 WebElement address1_txt  = driver.findElement(By.xpath(".//*[@id='txtAddr1']"));
	 WebElement address2_txt  = driver.findElement(By.xpath(".//*[@id='txtAddr2']"));
	 WebElement town_txt  = driver.findElement(By.xpath(".//*[@id='txtCity']"));
	 WebElement state_txt = driver.findElement(By.xpath(".//*[@id='txtState']"));
	 WebElement postal_txt  = driver.findElement(By.xpath(".//*[@id='txtPostZip']"));
	 WebElement hPhone_txt  = driver.findElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
	 WebElement faxNo_txt = driver.findElement(By.xpath(".//*[@id='txtFaxTel']"));
	 WebElement offPhone_txt  = driver.findElement(By.xpath(".//*[@id='tbHomeCountryOfficeTel']"));
	 WebElement mobphone_txt  = driver.findElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']"));
	 WebElement email_txt  = driver.findElement(By.xpath(".//*[@id='txtEMail']"));
	 WebElement reEmail_txt  = driver.findElement(By.xpath(".//*[@id='txtEMail2']"));
	 
	 //personal details
	 WebElement id_dp  = driver.findElement(By.xpath(".//*[@id='ddlIDType']"));
	 WebElement idNo_txt  = driver.findElement(By.xpath(".//*[@id='txtValidID']"));
	 WebElement nationality_dp  = driver.findElement(By.xpath(".//*[@id='ddlNatCode']"));
	 
	 //shipping address
	 WebElement shipAdd_check  = driver.findElement(By.xpath(".//*[@id='chkSame']"));
	 WebElement conPerson_txt  = driver.findElement(By.xpath(".//*[@id='txtShipContactPerson']"));
	 WebElement shipAdd1_txt  = driver.findElement(By.xpath(".//*[@id='txtShipAddr1']"));
	 WebElement shipAdd2_txt  = driver.findElement(By.xpath(".//*[@id='txtShipAddr2']"));
	 WebElement shipCity_txt  = driver.findElement(By.xpath(".//*[@id='txtShipCity']"));
	 WebElement shipState_txt  = driver.findElement(By.xpath(".//*[@id='txtShipState']"));
	 WebElement shipPost_txt  = driver.findElement(By.xpath(".//*[@id='txtShipPostZip']"));
	 WebElement shipPhone_txt = driver.findElement(By.xpath(".//*[@id='txtShipTel']"));
	 WebElement shipMob_txt  = driver.findElement(By.xpath(".//*[@id='txtShipMobileTel']"));
	 WebElement shipMail_txt  = driver.findElement(By.xpath(".//*[@id='txtShipEMail']"));
	 
	 WebElement lang_dp  = driver.findElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']"));
	 WebElement pwd_txt  = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
	 WebElement rePwd_txt  = driver.findElement(By.xpath(".//*[@id='txtPassword2']"));
	 WebElement yes_btn  = driver.findElement(By.xpath(".//*[@id='rbtnRegistrationSubscriptionOption_0']"));
	 WebElement no_btn  = driver.findElement(By.xpath(".//*[@id='rbtnRegistrationSubscriptionOption_1']"));
	
	 WebElement comPol_click  = driver.findElement(By.xpath(".//*[@id='lblWORLDCheckBox01']/a/b"));
	 
	 WebElement cancel_btn  = driver.findElement(By.xpath(".//*[@id='cmdCancel']"));
	
	
	 public String printErrorMsg(){
			WebElement errMsg_txt = driver.findElement(By.id("valSummary"));
		return errMsg_txt.getText();
	 }
	 
	 public  void selectTitle(String value){
		  Select title = new Select(title_dp);
		  title.selectByValue(value);
	 }
	 public void enterLName(String value){
		 lName_txt.clear();
		 lName_txt.sendKeys(value);
	 }
	 public  void enterFName(String value){
		 fName_txt.clear();
		 fName_txt.sendKeys(value);
	 }
	 public  void enterMName(String value){
		 mName_txt.clear();
		mName_txt.sendKeys(value);
	 }
	 
	 public  void enterAdd1(String value){
		 address1_txt.clear();
			address1_txt.sendKeys(value);
		 }
	 public  void enterAdd2(String value){
		 address2_txt.clear();
			address2_txt.sendKeys(value);
		 }	 
	 public  void enterTown(String value){
		 town_txt.clear();
			town_txt.sendKeys(value);
		 }	 
	 public  void enterState(String value){
		 state_txt.clear();
			state_txt.sendKeys(value);
		 }
	 public  void enterPostal(String value){
		 postal_txt.clear();
			postal_txt.sendKeys(value);
		 }
	 public  void enterHPone(String value){
		 hPhone_txt.clear();
			hPhone_txt.sendKeys(value);
		 }
	 public  void enterFAX(String value){
		 faxNo_txt.clear();
			faxNo_txt.sendKeys(value);
		 }
	 public  void enteroffPhone(String value){
		 offPhone_txt.clear();
			offPhone_txt.sendKeys(value);
		 }
	 public  void entermobPhone(String value){
		 mobphone_txt.clear();
			mobphone_txt.sendKeys(value);
		 }
	 public  void enterEmail(String value){
		 email_txt.clear();
			email_txt.sendKeys(value);
		 }
	 public  void enterreEmail(String value){
		 reEmail_txt.clear();
			reEmail_txt.sendKeys(value);
		 }
	 
	 public  void selectID(String value){
		  Select ID = new Select(id_dp);
		  ID.selectByValue(value);
	 }
	 public  void enterID(String value){
		 idNo_txt.clear();
		 idNo_txt.sendKeys(value);
	 }
	 public  void selecNationality(String value){
		  Select nationality = new Select(nationality_dp);
		  nationality.selectByVisibleText(value);
	 }
	 
	 public void clickShipAdd(){
		 shipAdd_check.clear();
			shipAdd_check.click();
		}
	 public String checkShipCheck(){
		 if(shipAdd_check.isSelected()){
			 return "true";
		 }else{
			 return "false";
		}
	 }
	 public  void enterContPerson(String value){
		 conPerson_txt.clear();
			conPerson_txt.sendKeys(value);
		 }
	 public  void enterShipAdd1(String value){
		 shipAdd1_txt.clear();
			shipAdd1_txt.sendKeys(value);
		 }
	 public  void enterShipAdd2(String value){
		 shipAdd2_txt.clear();
			shipAdd2_txt.sendKeys(value);
		 }
	 public  void entershipCity(String value){
		 shipCity_txt.clear();
			shipCity_txt.sendKeys(value);
		 }
	 public  void entershipState(String value){
		 shipState_txt.clear();
			shipState_txt.sendKeys(value);
		 }
	 public  void entershipPost(String value){
		 shipPost_txt.clear();
			shipPost_txt.sendKeys(value);
		 }
	 public  void entershipPhone(String value){
		 shipPhone_txt.clear();
			shipPhone_txt.sendKeys(value);
		 }
	 public  void entershipMob(String value){
		 shipMob_txt.clear();
			shipMob_txt.sendKeys(value);
		 }
	 public  void entershipMail(String value){
		 shipMail_txt.clear();
			shipMail_txt.sendKeys(value);
		 }
	 
	 public  void selectLang(String value){
		  Select lang = new Select(lang_dp);
		  lang.selectByIndex(Integer.parseInt(value));
	 }
	 public  void enterPWD(String value){
		 pwd_txt.clear();
		 pwd_txt.sendKeys(value);
	 }
	 public  void enterRepwd(String value){
		 rePwd_txt.clear();
		 rePwd_txt.sendKeys(value);
	 }
	 public void clickNoBtn(){
			no_btn.click();
		}
	 public void clickCheck1(){
		 WebElement check1_check  = driver.findElement(By.id("chkQuestionaire1"));
			check1_check.click();
		}
	 public void clickCheck2(){
		 WebElement check2_check  = driver.findElement(By.id("chkQuestionaire2"));
			check2_check.click();
		}
	 public void clickCheck3(){
		 WebElement check3_check  = driver.findElement(By.id("cbWORLDCheckBox01"));
			check3_check.click();
		}
	 public void clickComPol(){
			comPol_click.click();
		}
	 public void clickConfirm(){
		 WebElement confirm_btn  = driver.findElement(By.xpath(".//*[@id='cmdOK']"));
			confirm_btn.click();
		}
	 public void clickCancel(){
			cancel_btn.click();
		}
	 public String getRegRadiobtn(){
		  String src = ((JavascriptExecutor)driver).executeScript("return arguments[0].attributes['src'].value;", regRadioBtn_img).toString();
		  return src;
		 }
	
}
