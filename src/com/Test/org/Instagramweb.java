package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramweb {
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
name.sendKeys("as@gmail.com");
WebElement pass=driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
pass.sendKeys("abz@123");
WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
login.click();
//driver.get("https://instagram.com");
//WebElement name=driver.findElement(By.xpath("//input[text()='username'];
//name.sendKeys("inst@gmail.com");/
		
	
	}

}
