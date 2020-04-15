package com.selenium.tesleafcares;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicseleniumday1 {

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
		driver.findElement(By.id("accountName")).sendKeys("Kashif");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9840089845");
		driver.findElement(By.className("smallSubmit")).click();
		String name=driver.findElement(By.xpath("(//td/span[text()='Account Name']/following::td/span)[1]")).getText();
		String AccountID= name.replaceAll("[^0-9]", "");
		System.out.println("Account ID is "+AccountID.trim());	
		
		String Acc[]=name.split("\\(");
		String Acc1[]=Acc[1].split("\\)");
		String AccID=Acc1[0].trim();
		
		System.out.println("Account ID is "+AccID);


	}

}
