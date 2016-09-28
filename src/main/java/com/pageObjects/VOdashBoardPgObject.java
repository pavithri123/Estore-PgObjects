package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class VOdashBoardPgObject extends BasicPageObject{

	public VOdashBoardPgObject(WebDriver driver) {
		super(driver);
	}
		// TODO Auto-generated constructor stub
		 WebElement shopNow_btn = driver.findElement(By.xpath(".//*[@id='TabMenu1_lbnShopNow']"));
		 WebElement signOut_btn = driver.findElement(By.xpath(".//*[@id='header1_lbnSignOut']"));
	
	
	public void clickShopNow(){
		 shopNow_btn.click();
	 }
	public void clickSignOut(){
		signOut_btn.click();
	}
	
	public void closepopup(){
		WebElement popup_btn = driver.findElement(By.xpath(".//*[@id='objHTML']/body/div[1]/div/div/a"));
		popup_btn.click();
	}
	
}
