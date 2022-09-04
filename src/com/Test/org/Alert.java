package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//Simple Alert
	WebElement	normalAlert=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	normalAlert.click();
	driver.switchTo().alert().accept();
	
	//ConfirmAlert
	WebElement ConfirmAlert=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	ConfirmAlert.click();
	Thread.sleep(4000);
	driver.switchTo().alert().dismiss();
	
	//PromptAlert
		WebElement PromptAlert=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		PromptAlert.click();
		Thread.sleep(4000);
		org.openqa.selenium.Alert alert= driver.switchTo().alert();
		alert.sendKeys("Meenakshi");
		alert.accept();
	
	}

}
