package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com");
	
	
	WebElement account =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	account.click();
WebElement fn=driver.findElement(By.xpath("//input[@data-type='text'][1]"));
fn.sendKeys("SAHA");
	WebElement lname=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	lname.sendKeys("R");
		
	}

}
