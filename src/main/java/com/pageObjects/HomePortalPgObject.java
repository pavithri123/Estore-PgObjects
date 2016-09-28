package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class HomePortalPgObject extends BasicPageObject{
	
	WebElement IR_Loginbtn   = driver.findElement(By.xpath(".//*[@id='ctl00_SharedHeaderStyleTopMenuBarNew_hlLogin']"));

	public HomePortalPgObject(WebDriver driver) {
		super(driver);
		
	}
	
public void clickPortalLogin(){
	IR_Loginbtn.click();
}
}
