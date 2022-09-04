package com.Test.org;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("meenakshirrr@gmail.com"); 
	driver.navigate().refresh();
		WebElement password=driver.findElement(By.id("password"));
		email.sendKeys("abc@123");
		driver.quit(); 
	
	}

}
