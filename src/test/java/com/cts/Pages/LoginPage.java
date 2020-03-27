package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	public static By userIdLoc = By.name("username");
	public static By passwordLoc = By.name("password");
	public static By loginLoc = By.name("signon");
	public static By registerNowLoc = By.linkText("Register Now!");
	public static By signinLoc=By.linkText("Sign In");
	public static void ClickonSignIn(WebDriver driver) {
		driver.findElement(signinLoc).click();
	}
	
	public static void successfulLogin(WebDriver driver, String userId, String password)
	{
		driver.findElement(userIdLoc).sendKeys(userId);
		driver.findElement(passwordLoc).clear();
		driver.findElement(passwordLoc).sendKeys(password);
		driver.findElement(loginLoc).click();
	}
	public static void clickOnRegisterNow(WebDriver driver)
	{
		driver.findElement(registerNowLoc).click();
	}
}
