package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.titanium.BasicPageObject;

public class BetaHomePgObject extends BasicPageObject{

	public BetaHomePgObject(WebDriver driver){
		super(driver);
	}
	
	WebElement BShopNow_btn = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/ul/li[1]/a"));
	
	
	public void clickShop(){
		BShopNow_btn.click();
	}
	public void selectSignOut(){
		WebElement signOut_dp = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/ul/li[4]/a"));
		Select signOut = new Select(signOut_dp);
		signOut.selectByVisibleText("Sign Out");
	}
}
