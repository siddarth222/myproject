package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatsPage
{
	public static By persianLoc = By.linkText("FL-DLH-02");
	public static By ManxLoc=By.linkText("FL-DSH-01");
	
	public static void clickOnPersian(WebDriver driver)
	{
		driver.findElement(persianLoc).click();
	}
	public static void clickOnManx(WebDriver driver) {
		driver.findElement(ManxLoc).click();
	}
}
