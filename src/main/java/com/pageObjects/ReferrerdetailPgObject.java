package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.titanium.BasicPageObject;

public class ReferrerdetailPgObject extends BasicPageObject{
	
	
	public ReferrerdetailPgObject(WebDriver driver ){
		super(driver);
	}
	
	 Select country=new Select(driver.findElement(By.id("ddlCountry")));
	 WebElement countrydrop=driver.findElement(By.id("ddlCountry"));
	WebElement clickherelink=driver.findElement(By.xpath(".//*[@id='lbClickShop']"));
	
	 public String checkShopNowbtn(){
		 WebElement shopnowbtn= driver.findElement(By.xpath(".//*[@id='cmdOK']"));
		  if(shopnowbtn.isEnabled()){
		   return "true";
		  }else
		   return "false";
		 }
	 public void clickLink(){
		 clickherelink.click();
	 }

	 public String getErrorMsg(){
		 WebElement error=driver.findElement(By.xpath(".//*[@id='lblError']"));
		 return error.getText();
	 }
	 public void clickCheckReferrer(){
		  WebElement checkreferrerbn=driver.findElement(By.id("cmdValidate"));
		  checkreferrerbn.click();
	 }
	 
	
	 public void setCountry(String value) throws InterruptedException{
		 country.selectByValue(value);
		 
		}
	 public String getDefaultCountry(){
		 WebElement defaultcountry=country.getFirstSelectedOption();
		 return defaultcountry.getText();
	 }

	 public String [] getCountry(){
		 System.out.println(countrydrop.getText());
		 String []arr=countrydrop.getText().split("\n");
		 System.out.println("xxxxxxxxx"+arr.length);
		 return arr;
	 }
}
