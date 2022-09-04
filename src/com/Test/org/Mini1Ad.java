package com.Test.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini1Ad {
	private static final WebElement Submit = null;
	private static WebElement WebElement;

	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("sahasraa");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Saha@321!");
	WebElement login=driver.findElement(By.id("login"));
	login.click();
	WebElement dropdown=driver.findElement(By.id("location"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("New York");
	WebElement dropdown1=driver.findElement(By.name("hotels"));
	Select s1=new Select(dropdown1);
	s1.selectByVisibleText("Hotel Sunshine");
	WebElement dropdown3=driver.findElement(By.name("room_type"));
	Select s2=new Select(dropdown3);
	s2.selectByVisibleText("Super Deluxe");
	WebElement dropdown4=driver.findElement(By.name("room_nos"));
	Select s3=new Select(dropdown4);
	s3.selectByVisibleText("2 - Two");
	WebElement dropdown5=driver.findElement(By.id("adult_room"));
	Select s4=new Select(dropdown5);
	s4.selectByVisibleText("3 - Three");
	WebElement dropdown6=driver.findElement(By.id("child_room"));
	Select s5=new Select(dropdown6);
	s5.selectByVisibleText("0 - None");
	WebElement submit=driver.findElement(By.id("Submit"));
	submit.click();
	WebElement radio=driver.findElement(By.id("radiobutton_0"));
	radio.click();
	WebElement e=driver.findElement(By.xpath("//input[@type='submit']"));
	e.click();
	WebElement firstname=driver.findElement(By.id("first_name"));
	firstname.sendKeys("Saha");
	WebElement last_name=driver.findElement(By.id("last_name"));
	last_name.sendKeys("V");
	WebElement address=driver.findElement(By.id("address"));
	address.sendKeys("33 a east dabir st");
	WebElement cc_num =driver.findElement(By.id("cc_num"));
	cc_num.sendKeys("1234567887654321");
	WebElement dropdown7=driver.findElement(By.id("cc_type"));
	Select s6=new Select(dropdown7);
	s6.selectByVisibleText("VISA");
	WebElement dropdown8=driver.findElement(By.id("cc_exp_month"));
	Select s7=new Select(dropdown8);
	s7.selectByVisibleText("January");
	WebElement dropdown9=driver.findElement(By.id("cc_exp_year"));
	Select s8=new Select(dropdown9);
	s8.selectByVisibleText("2021");
	WebElement cvv=driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("123");
	WebElement booknow=driver.findElement(By.id("book_now"));
	booknow.click();
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);	
	File Dest=new File("F:\\Class\\Seleniumm\\Screenshot\\minipro.png");
	FileUtils.copyFile(source, Dest);

	}

}

