package com.Test.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotActions {
public static void main(String args[]) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	Actions ac=new Actions(driver);
	Robot rb=new Robot();
	
	//drag ans
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement desc=driver.findElement(By.id("droppable"));
	ac.dragAndDrop(src, desc).build().perform();
	driver.navigate().to("https://www.amazon.in/");
	WebElement prime=driver.findElement(By.id("nav-link-amazonprime"));
	ac.moveToElement(prime).perform();
WebElement Fashion=driver.findElement(By.linkText("Fashion"));
	ac.contextClick(Fashion).perform();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	
	
}
}


