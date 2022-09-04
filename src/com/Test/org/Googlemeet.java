package com.Test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemeet {
	public static void main(String args[]) {
		
	
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://meet.google.com/kzq-damc-ivn");
	}
}

