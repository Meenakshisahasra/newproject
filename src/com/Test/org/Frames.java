package com.Test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void mian(String args[]) {
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		WebDriver driver3=new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("http://demo.automationtesting.in/Frames.html");
		driver3.switchTo().frame("singleframe");
		
	}
	

}
