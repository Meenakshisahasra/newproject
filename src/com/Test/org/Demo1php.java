package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1php {
	public static void main(String args[]) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.org/login");
WebElement inputEmail=driver.findElement(By.id("inputEmail"));
inputEmail.sendKeys("bc@ex.com");
WebElement inputPassword=driver.findElement(By.id("inputPassword"));
inputPassword.sendKeys("testing");
	}

}
