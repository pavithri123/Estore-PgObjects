package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.titanium.BasicPageObject;


public class HomePgObject extends BasicPageObject{
	
	
	public HomePgObject(WebDriver driver){
		super(driver);
	}

 WebElement IRLoginbtn   = driver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlLogin']"));
 WebElement Enrolbtn   = driver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlJoinUs']"));
 WebElement Shopbtn   = driver.findElement(By.xpath(".//*[@id='ctl00_ctl12_hlShop']"));
 WebElement countinueShopbtn = driver.findElement(By.xpath(".//*[@id='myModal2']/p[2]/a[1]"));

 
 
 public void clcik_countinueShopbtn(){
	  countinueShopbtn.click();
	   }
 public void clickIRLogin(){ 
  IRLoginbtn.click();
 }
 public void clickEnrolbtn(){
  Enrolbtn.click();
   }
 public void clickShopbtn(){
	 Shopbtn.click();
 }
 
}