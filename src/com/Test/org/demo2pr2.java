package com.Test.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo2pr2 {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
	WebElement email=driver.findElement(By.id("Email"));
	email.sendKeys("sahasrav2621@gmail.com");
	WebElement pass=driver.findElement(By.id("Password"));
	pass.sendKeys("Saha@321!");
	WebElement submit=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
submit.click();
//driver.switchTo().alert().accept();
//	driver.navigate().to("http://demowebshop.tricentis.com/");
	WebElement computer=driver.findElement(By.linkText("Simple Computer"));
	computer.click();
	WebElement processor=driver.findElement(By.xpath("//label[@for='product_attribute_75_5_31_96']"));
	processor.click();
	WebElement ADDCART=driver.findElement(By.xpath("//input[@id='add-to-cart-button-75']"));
	ADDCART.click();
	Thread.sleep(5000);
	WebElement shopcart=driver.findElement(By.linkText("Shopping cart"));
	shopcart.click();
	WebElement checkbox= driver.findElement(By.xpath("//input[@name='removefromcart']"));
	checkbox.click();
	WebElement dropdown=driver.findElement(By.id("CountryId"));
	Select s=new Select(dropdown);
	s.selectByVisibleText("India");
	WebElement terms=driver.findElement(By.id("termsofservice"));
	terms.click();
	WebElement checkout=driver.findElement(By.id("checkout"));
	checkout.click();
//	WebElement dropdownn=driver.findElement(By.name("BillingNewAddress.CountryId"));
//	Select s3=new Select(dropdownn);
//	s3.selectByVisibleText("India");
//	WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
//	city.sendKeys("Kumbakonam");
//	WebElement Addrs=driver.findElement(By.id("BillingNewAddress_Address1"));
//	Addrs.sendKeys("33 A East dabir st");
//	WebElement Postalcode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
//	Postalcode.sendKeys("612001");
//	WebElement phone=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
//	phone.sendKeys("9597532032");
//	Thread.sleep(3000);
//	WebElement BS=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
//	BS.click();
//	WebElement shipsa=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
//	shipsa.click();
//	
//Thread.sleep(5000);
//	WebElement ctn=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
//	ctn.click();
//
//	WebElement continuee=driver.findElement(By.xpath("//input[@onclick='Shipping.togglePickUpInStore(this)']"));
//	continuee.click();
//	WebElement ctct=driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
//	ctct.click();
//	
	
	Thread.sleep(5000);
	WebElement continuee=driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
continuee.click();
Thread.sleep(5000);
WebElement continuee1=driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"));
continuee1.click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@type='button'])[7]")).click();
TakesScreenshot screenshot=(TakesScreenshot)driver;
File source=screenshot.getScreenshotAs(OutputType.FILE);	
File Dest=new File("F:\\Class\\Seleniumm\\Screenshot\\shopping.png");
FileUtils.copyFile(source, Dest);


//	driver.findElement(By.linkText("Shopping cart"));
//	Actions ac=new Actions(driver);
////	ac.moveToElement(Shopping).perform();
	}

}
