package com.Test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String args[]) {
		System.setProperty("Webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().refresh();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https:/youtube.com");
		driver.navigate().refresh();
		driver.close();
		
	}

}
