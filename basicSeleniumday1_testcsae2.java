package com.selenium.tesleafcares;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicSeleniumday1_testcsae2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9840089845");
	//	driver.findElement(By.className("smallSubmit")).click();
		//String ErrorMessage=driver.findElement(By.className("errorMessage")).getText();
		//System.out.println("Error Message is "+ErrorMessage);
		WebElement dropDown1 = driver.findElement(By.name("industryEnumId"));
		Select select= new Select (dropDown1);
		select.selectByIndex(3);
		WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select select1= new Select (dropDown2);
		select1.selectByVisibleText("Partnership");
		WebElement dropDown3 = driver.findElement(By.name("dataSourceId"));
		Select select2= new Select (dropDown3);
		select2.selectByValue("LEAD_COLDCALL");
		driver.findElement(By.name("initialTeamPartyId")).sendKeys("Demo Sales Team No. 1");
		
	List<WebElement> options=select.getOptions();
	for(WebElement option:options) {
		System.out.println(option.getText());
	}
	

		//driver.close(); 
}
}
