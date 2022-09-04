package com.Test.org;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablelanuch {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "F:\\Class\\Seleniumm\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
 java.util.List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
 for(WebElement multiple:allData) {
	 System.out.println(multiple.getText());

 }
 System.out.println("Row data");
java.util.List<WebElement> RowData= driver.findElements(By.xpath("//table/tbody/tr[6]/td"));
for (WebElement row:RowData) {
	System.out.println(row.getText());
}

System.out.println("Column Data");
java.util.List<WebElement> ColumnData= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
for(WebElement column:ColumnData)
{
	System.out.println(column.getText());
}

System.out.println("selected Data");
WebElement singleelement= driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));

String s= singleelement.getText();
System.out.println("Selected Element "+s);
 
	
}

}
