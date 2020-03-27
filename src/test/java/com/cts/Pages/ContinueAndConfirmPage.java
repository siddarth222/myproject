package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinueAndConfirmPage 
{
	public static By continueLoc = By.name("newOrder");
	public static By confirmLoc = By.linkText("Confirm");
	
	public static void clickOnContinue(WebDriver driver)
	{
		driver.findElement(continueLoc).click();
	}
	public static void clickOnConfirm(WebDriver driver)
	{
		driver.findElement(confirmLoc).click();
	}
}
