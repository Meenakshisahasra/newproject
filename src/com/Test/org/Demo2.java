package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
public static void main(String args[]) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement username=driver.findElement((By.id("username")));
	username.sendKeys("xy@gmail.com");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("as12");
	WebElement login=driver.findElement(By.id("login"));
	login.click();
}
}
