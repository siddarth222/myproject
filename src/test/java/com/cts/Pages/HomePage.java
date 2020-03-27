package com.cts.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static By signInLoc = By.xpath("//a[text()='Sign In']");
	public static By LogoutLoc=By.linkText("Sign Out");
	public static By searchtextBoxLoc = By.name("keyword");
	public static By searchLoc = By.name("searchProducts");
	public static By BirdsLoc = By.xpath("//body//area[1]");
	public static By fishLoc = By.xpath("//body//area[2]");
	public static By DogsLoc = By.xpath("//body//area[3]");
	public static By ReptilesLoc = By.xpath("//body//area[4]");
	public static By catsLoc = By.xpath("//body//area[5]");
	public static By questionMark=By.xpath("//a[contains(text(),'?')]");
	public static By cartIcon=By.xpath("//img[@name='img_cart']");
	public static By searchButton=By.xpath("//input[@name='searchProducts']");

	
	public static void clickOnSignIn(WebDriver driver) {
		
		driver.findElement(signInLoc).click();
	}
		
		
	public static void clickOnSignout(WebDriver driver) {
		driver.findElement(LogoutLoc).click();
	}

	public static void Searching(WebDriver driver, String search) {
		driver.findElement(searchtextBoxLoc).sendKeys(search);
		driver.findElement(searchLoc).click();
	}

	public static void clickOnCats(WebDriver driver) {
		driver.findElement(catsLoc).click();
	}

	public static void clickOnBirds(WebDriver driver) {
		driver.findElement(BirdsLoc).click();
	}

	public static void clickOnFish(WebDriver driver) {
		driver.findElement(fishLoc).click();
	}
	public static void clickOnDogs(WebDriver driver) {
		driver.findElement(DogsLoc).click();
	}
	public static void clickOnReptiles(WebDriver driver) {
		driver.findElement(ReptilesLoc).click();
	}
	public static void clickOnQuestionMark(WebDriver driver) {
		driver.findElement(questionMark).click();
	}
	public static void clickOnCartIcon(WebDriver driver) {
		driver.findElement(cartIcon).click();
	}
	public static void clickOnSearchButton(WebDriver driver) {
		driver.findElement(searchButton).click();
	}
}
