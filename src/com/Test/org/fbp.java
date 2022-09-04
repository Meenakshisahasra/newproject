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
import org.openqa.selenium.support.ui.Select;

public class fbp {
	private static String reg_passwd__;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	WebElement account =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	account.click();
	Thread.sleep(1000);
WebElement fname=driver.findElement(By.name("firstname"));
fname.sendKeys("SAHA");
	WebElement lname=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	lname.sendKeys("R");
	WebElement email=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	email.sendKeys("saha@gmail.com");
	WebElement email1=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

	email1.sendKeys("saha@gmail.com");
	WebElement pass=driver.findElement(By.id("password_step_input"));
	pass.sendKeys("abc@123");
	WebElement day=driver.findElement(By.id("day"));
	Select s= new Select(day);
	s.selectByValue("7");
	WebElement month=driver.findElement(By.id("month"));
	Select s1= new Select(month);
	s1.selectByValue("12");
	WebElement year=driver.findElement(By.id("year"));
	Select s2= new Select(year);
	s2.selectByValue("1993");
	WebElement gender=driver.findElement(By.xpath(("//input[@type='radio'][1]")));
	gender.click();
	WebElement login=driver.findElement(By.xpath("//button[@name='websubmit']"));
	login.click();
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);	
	File Dest=new File("F:\\Class\\Seleniumm\\Screenshot\\fbsignup.png");
	FileUtils.copyFile(source, Dest);
	
	
	
}
}
