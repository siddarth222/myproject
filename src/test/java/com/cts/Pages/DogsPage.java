package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DogsPage
{
	public static By BulldogLoc=By.linkText("K9-BD-01");
	public static By poodleLoc=By.linkText("K9-PO-02");
	public static By  Dalmation=By.linkText("K9-DL-01");
	public static By  GoldenRetriever=By.linkText("K9-RT-01");
	public static By  Labrodar=By.linkText("K9-RT-02");
	
	public static void clickOnBullDog(WebDriver driver)
	{
		driver.findElement(BulldogLoc).click();
	}
	public static void clickOnPoodle(WebDriver driver)
	{
		driver.findElement(poodleLoc).click();
	}
	public static void clickOnDalmation(WebDriver driver)
	{
		driver.findElement(Dalmation).click();
	}
	public static void clickOnGoldenRet(WebDriver driver)
	{
		driver.findElement(GoldenRetriever).click();
	}
	public static void clickOnLabrodar(WebDriver driver)
	{
		driver.findElement(Labrodar).click();
	}



}

