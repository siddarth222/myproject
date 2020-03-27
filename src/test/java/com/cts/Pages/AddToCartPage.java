package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage
{
	public static By addToCartLoc = By.xpath("(//a[text()='Add to Cart'])[1]");
	
	public static By removeLoc = By.linkText("Remove");
	public static By updateCartLoc = By.name("updateCartQuantities");
	
	public static void clickOnAddToCart(WebDriver driver)
	{
		driver.findElement(addToCartLoc).click();
	}
	public static void clickOnRemove(WebDriver driver)
	{
		driver.findElement(removeLoc).click();
	}
	public static void clickOnUpdateCart(WebDriver driver)
	{
		driver.findElement(updateCartLoc).click();
	}
	
}
