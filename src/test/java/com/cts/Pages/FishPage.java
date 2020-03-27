package com.cts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FishPage {
public static By AngelFishLoc=By.linkText("FI-SW-01");
public static By TigerSharkLoc=By.linkText("FI-SW-02");
public static By KoiLoc=By.linkText("FI-FW-01");

public static void ClickOnAngelFish(WebDriver driver) {
	driver.findElement(AngelFishLoc).click();
}
public static void ClickOnTigerShark(WebDriver driver) {
	driver.findElement(TigerSharkLoc).click();
}
public static void ClickOnKoi(WebDriver driver) {
	driver.findElement(KoiLoc).click();
}
}
