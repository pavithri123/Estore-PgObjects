package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class LoginPgObject extends BasicPageObject{
	


public LoginPgObject(WebDriver driver){
	super(driver);
}
WebElement IR_ID_txt = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtTCO']"));
WebElement pwd_txt = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
WebElement login_btn = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']"));
WebElement shopNow_btn = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkRedirectToEStore']"));

public void enterIRID(String text){
	IR_ID_txt.clear();
	IR_ID_txt.sendKeys(text);
}
public void enterPWD(String text){
	pwd_txt.clear();
	pwd_txt.sendKeys(text);
}
public void clickLogin(){
	login_btn.click();
}
public void clickShop() {
	shopNow_btn.click();
}
}
