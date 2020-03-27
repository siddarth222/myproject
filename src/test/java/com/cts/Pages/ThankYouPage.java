package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage 
{
	public static By thankYouMsgLoc = By.xpath("//li[text()='Thank you, your order has been submitted.']");
	
	public static String gettingThankYouMsg(WebDriver driver)
	{
		String actualMsg = driver.findElement(thankYouMsgLoc).getText();
		return actualMsg;
	}
}
