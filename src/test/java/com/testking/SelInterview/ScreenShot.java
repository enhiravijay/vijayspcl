package com.testking.SelInterview;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
public WebDriver driver;
	
public void screenshot(String image) throws IOException{
	
	if(image.equalsIgnoreCase("")){
		image="_blank";
	}

	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String imagelocation = System.getProperty("user.dir")+"//src//main//java//Screenshot//";
	
	Calendar calendar = Calendar.getInstance();
	
	SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	
	String actualimagelocation= imagelocation+image+"_"+formater.format(calendar.getTime())+".png";
	
	File destfile = new File(actualimagelocation);

	FileUtils.copyFile(Src, destfile);
	

}

}
