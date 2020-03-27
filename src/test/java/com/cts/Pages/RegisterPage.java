package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	public static By userIdLoc = By.name("username");
	public static By newPasswordLoc = By.name("password");
	public static By repeatPasswordLoc = By.name("repeatedPassword");
	public static By firstNameLoc = By.name("account.firstName");
	public static By lastNameLoc = By.name("account.lastName");
	public static By emailLoc = By.name("account.email");
	public static By phoneLoc = By.name("account.phone");
	public static By addressOneLoc = By.name("account.address1");
	public static By addressTwoLoc = By.name("account.address2");
	public static By cityLoc = By.name("account.city");
	public static By stateLoc = By.name("account.state");
	public static By zipLoc = By.name("account.zip");
	public static By countryLoc = By.name("account.country");
	public static By languagePreferenceLoc = By.name("account.languagePreference");
	public static By favouriteCategoryIdLoc = By.name("account.favouriteCategoryId");
	public static By listOptionLoc = By.name("account.listOption");
	public static By bannerOptionLoc = By.name("account.bannerOption");
	public static By saveAccountInformationLoc = By.name("newAccount");
	
	public static void fillUserInformation(WebDriver driver, String userId, String newPassword, String RepeatPassword)
	{
		driver.findElement(userIdLoc).sendKeys(userId);
		driver.findElement(newPasswordLoc).sendKeys(newPassword);
		driver.findElement(repeatPasswordLoc).sendKeys(RepeatPassword);
	}
	
	public static void fillAccountInformation(WebDriver driver, String firstName, String lastName, String email, String phone, String addressOne, String addressTwo,
			String City, String state, String zip, String country)
	{
		driver.findElement(firstNameLoc).sendKeys(firstName);
		driver.findElement(lastNameLoc).sendKeys(lastName);
		driver.findElement(emailLoc).sendKeys(email);
		driver.findElement(phoneLoc).sendKeys(phone);
		driver.findElement(addressOneLoc).sendKeys(addressOne);
		driver.findElement(addressTwoLoc).sendKeys(addressTwo);
		driver.findElement(cityLoc).sendKeys(City);
		driver.findElement(stateLoc).sendKeys(state);
		driver.findElement(zipLoc).sendKeys(zip);
		driver.findElement(countryLoc).sendKeys(country);
	}
	
	public static void fillPersonalInformation(WebDriver driver)
	{
		Select language = new Select(driver.findElement(languagePreferenceLoc));
		language.selectByVisibleText("english");
		Select category = new Select(driver.findElement(favouriteCategoryIdLoc));
		category.selectByVisibleText("DOGS");
		driver.findElement(listOptionLoc).click();
		driver.findElement(bannerOptionLoc).click();
	}
	
	public static void clickOnSaveAccountInformation(WebDriver driver)
	{
		driver.findElement(saveAccountInformationLoc).click();
	}
}

