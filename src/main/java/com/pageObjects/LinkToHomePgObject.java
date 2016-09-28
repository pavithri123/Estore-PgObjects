package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.titanium.BasicPageObject;

public class LinkToHomePgObject extends BasicPageObject {
	
	WebElement link2HmPage_link = driver.findElement(By.xpath(".//*[@id='lnkHome2']"));

	public LinkToHomePgObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void clickHomeLink(){
	link2HmPage_link.click();
}
}
