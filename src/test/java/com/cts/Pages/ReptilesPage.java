package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReptilesPage {
public static By rattleSnakeLoc=By.linkText("RP-SN-01");
public static By IguanaLoc=By.linkText("RP-LI-02");
public static void ClickOnRattle(WebDriver driver) {
	driver.findElement(rattleSnakeLoc).click();
}
public static void ClickOnIguana(WebDriver driver) {
	driver.findElement(IguanaLoc).click();
}
}
