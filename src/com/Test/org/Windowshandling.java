package com.Test.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {
public static void main(String args[]) throws AWTException{
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://amazon.in/");
	Actions ac= new Actions(driver);
	Robot rb=new Robot(); 
	WebElement Mobiles=driver.findElement(By.linkText("Mobiles"));
	ac.contextClick(Mobiles).perform();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Set<String> windowHandles=driver.getWindowHandles();
	System.out.println(windowHandles);
	for(String id:windowHandles) {
		String title=driver.switchTo().window(id).getTitle();
	System.out.println(title);	
	}
	String myTitle="Help - Amazon Customer service";
	for(String id: windowHandles) {
		if(driver.switchTo().window(id).getTitle().equals(myTitle));
		break;
	
	}
	
	
}
}
