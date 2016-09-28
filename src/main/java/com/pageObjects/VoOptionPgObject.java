package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.titanium.BasicPageObject;

public class VoOptionPgObject extends BasicPageObject{

	public VoOptionPgObject(WebDriver driver){
		super (driver);
	}
	
	WebElement currentVO_btn = driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/div[1]/div[1]/a[1]"));
	WebElement betaVO_btn = driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/div[1]/div[1]/a[2]"));
	
	
	public void clickCurrentVo(){
		currentVO_btn.click();
	}
	public void clickBetaVO(){
		betaVO_btn.click();
	}
}
