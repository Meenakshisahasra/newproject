package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoweb {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		WebElement Email=driver.findElement(By.id("Email"));
		Email.sendKeys("meenakshirrr@gmail.com");
		WebElement Password=driver.findElement(By.id("Password"));
		Password.sendKeys("ac@!23");
		WebElement Login =driver.findElement(By.("Submit"));
		Login.click();
			
	}

}
