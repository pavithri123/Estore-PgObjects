package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class BetaLoginPgObject extends BasicPageObject {

	public BetaLoginPgObject(WebDriver driver){
		super(driver);
	}
	
	WebElement lang_dp = driver.findElement(By.xpath(".//*[@id='Language']"));
	WebElement Ir_Id_txt = driver.findElement(By.xpath(".//*[@id='UserName']"));
	WebElement PWD_txt = driver.findElement(By.xpath(".//*[@id='Password']"));
	WebElement login_btn = driver.findElement(By.xpath(".//*[@id='LoginForm']/div[4]/button"));
	WebElement enroll_btn = driver.findElement(By.xpath(".//*[@id='LoginForm']/div[5]/div/div[1]/a"));
	WebElement RCshop_btn = driver.findElement(By.xpath(".//*[@id='LoginForm']/div[5]/div/div[2]/a"));

	
	public void enterBIrId(String text){
		Ir_Id_txt.clear();
		Ir_Id_txt.sendKeys(text);
	}
	public void enterBPwd(String text) {
		PWD_txt.clear();
		PWD_txt.sendKeys(text);
	}
	public void clickBlogin() {
		login_btn.click();
	}
	public String chkInvalidCred(){
		WebElement error1_msg = driver.findElement(By.xpath(".//*[@id='LoginForm']/div[2]/span[1]"));
		WebElement error2_msg = driver.findElement(By.xpath(".//*[@id='LoginForm']/div[3]/span"));
		if (error1_msg.isDisplayed()|error2_msg.isDisplayed()) {
			return "True";
		} else {
			return  "false";
		}
	}
}
