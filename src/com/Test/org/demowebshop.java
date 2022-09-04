package com.Test.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
public static void main(String args[]) throws IOException {
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/register");
	WebElement checkbox=driver.findElement(By.xpath("//label[contains(@for,'female')]"));
	checkbox.click();
	WebElement firstname=driver.findElement(By.id("FirstName"));
	firstname.sendKeys("Meenakshi");
	WebElement Lastname=driver.findElement(By.id("LastName"));
	Lastname.sendKeys("R");
	WebElement Email=driver.findElement(By.id("Email"));
	Email.sendKeys("meenakshirrr@gmail.com");
	WebElement Password=driver.findElement(By.id("Password"));
	Password.sendKeys("abc@!23");
	WebElement ConfirmPassword=driver.findElement(By.id("ConfirmPassword"));
	ConfirmPassword.sendKeys("abc@!23");
	WebElement register=driver.findElement(By.id("register-button"));
	register.click();
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);	
	File Dest=new File("F:\\Class\\Seleniumm\\Screenshot\\register.png");
	FileUtils.copyFile(source, Dest);
	
	
}
}
