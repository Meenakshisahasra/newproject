package com.Test.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
	

	public static void main(String args[])throws IOException {
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement Amazon=driver.findElement(By.linkText("Fulfilment by Amazon"));
	js.executeScript("arguments[0].scrollIntoView();", Amazon);
			
	
	}
}
