package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class ProductsPgObject extends BasicPageObject {
	
	WebElement Header_img = driver.findElement(By.xpath(".//*[@id='imgHeader']"));

	public ProductsPgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public String getProdHeaderImg(){
		  String src = ((JavascriptExecutor)driver).executeScript("return arguments[0].attributes['src'].value;", Header_img).toString();
		  return src;
		 }
}
