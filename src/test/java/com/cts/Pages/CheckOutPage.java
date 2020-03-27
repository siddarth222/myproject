package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	public static By checkOutLoc = By.linkText("Proceed to Checkout");
	
	public static void clickOnProceedtoCheckout(WebDriver driver)
	{
		driver.findElement(checkOutLoc).click();
	}
}
