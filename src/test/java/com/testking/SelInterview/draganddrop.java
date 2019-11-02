package com.testking.SelInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class draganddrop {
	WebDriver driver;
	
	@Test
	
	public void dragdrop (){
	
		try {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("123");
			driver.get("www.google.com");
			//driver.manage().window().maximize();
			System.out.println("222");
			//driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
