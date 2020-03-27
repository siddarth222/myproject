package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BirdsPage 
{
	public static By returnToMainMenuLoc = By.linkText("Return to Main Menu");
	public static By selectBirdLoc=By.linkText("AV-CB-01");
	public  static By selectBirdLoc2=By.linkText("AV-SB-02");
	
	public static void clickOnReturnToMainMenu(WebDriver driver)
	{
		driver.findElement(returnToMainMenuLoc).click();
	}
	public static void clickOnSelectedBird(WebDriver driver) {
		driver.findElement(selectBirdLoc).click();
	}
	public static void clickOnSelectedBird2(WebDriver driver)
	{
		driver.findElement(selectBirdLoc2).click();
	}
	public static void printBirdsTable(WebDriver driver) 
	{
		for (int j = 1; j <= 2; j++)
			System.out.print(driver.findElement(By.xpath("//table/tbody/tr[1]/th[" + j + "]")).getText() + "\t");
		System.out.println("");
		for (int i = 2; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(
						driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "\t");
			}
			System.out.println("");
		}
	}
}
