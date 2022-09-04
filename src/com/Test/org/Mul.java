package com.Test.org;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mul {
	private static final WebElement Alloptions = null;

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	WebElement dropdown=driver.findElement(By.xpath("(//select)[6]"));
	Select s=new Select(dropdown);
	s.selectByIndex(1);
	Thread.sleep(4000);
	s.deselectByVisibleText("Selenium");
java.util.List<WebElement> options=	s.getOptions();
System.out.println(options);

for (WebElement Alloptions : options) {
	System.out.println(Alloptions.getText());
}
	java.util.List<WebElement> selectedOption=s.getAllSelectedOptions();
	for(WebElement select:selectedOption) {
		System.out.println(select.getText());
	
	
}
	}
}

