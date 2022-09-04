package com.Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	WebElement m1=driver.findElement(By.xpath("(//select)[6]"));
Select s= new Select(m1);
boolean multiple=s.isMultiple();
System.out.println("Is Multiple"+multiple);
s.selectByIndex(1);
Thread.sleep(3000);
s.deselectByIndex(1);
s.selectByValue("3");
s.deselectByValue("3");

s.selectByVisibleText("Loadrunner");

}
}