package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	
@Test
	public void testLogin() {
		
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("vkumar30");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		driver.quit();
		
	}
   }
