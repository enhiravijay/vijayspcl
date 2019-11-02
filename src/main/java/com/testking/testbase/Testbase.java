package com.testking.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testbase {
public WebDriver driver;
public Properties Or;
public File f1;
public FileInputStream file;

public static ExtentReports extent;
public static ExtentTest test;
public ITestResult result;

static {
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	extent = new ExtentReports(System.getProperty("user.dir")+"//src//main//java//com//testking//report//test"+formater.format(calendar.getTime()) + ".html", false);
}

public void getresult(ITestResult result) throws IOException{
	if (result.getStatus()==ITestResult.SUCCESS){
		test.log(LogStatus.PASS, result.getName()+"test is pass");
	}else if (result.getStatus()==ITestResult.SKIP){
		test.log(LogStatus.SKIP, result.getName()+"test is skiped and skip reason is :-"+result.getThrowable());
}else if (result.getStatus()==ITestResult.FAILURE){
	test.log(LogStatus.FAIL, result.getName()+"test is failed and fail reason is :-"+result.getThrowable());
	String screen = screenshot("");
	test.log(LogStatus.FAIL, test.addScreenCapture(screen));
}else if (result.getStatus()==ITestResult.STARTED){
	test.log(LogStatus.INFO	, result.getName()+"test is started");
}
}

@AfterMethod()

public void aftermethod(ITestResult result) throws IOException{
	getresult(result);
}

@BeforeMethod()

public void beforemethod(Method result){
	test=extent.startTest(result.getName());
	test.log(LogStatus.INFO, result.getName()+"test started");
}


@AfterClass(alwaysRun=true)

public void endtest(){
	driver.quit();
	extent.endTest(test);
	extent.flush();
}

public String screenshot(String image) throws IOException{
	
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
	
	return actualimagelocation;
	

}

public void loadproperties() throws IOException{
	
	Or = new Properties();
	f1 = new File(System.getProperty("user.dir")+"//src//main//java//com//testking//config//Config.properties");
	file = new FileInputStream(f1);
	Or.load(file);
	System.out.println(Or.getProperty("username"));
	
	Or = new Properties();
	f1 = new File(System.getProperty("user.dir")+"//src//main//java//com//testking//config//OR.properties");
	file = new FileInputStream(f1);
	Or.load(file);
	System.out.println(Or.getProperty("test1"));
	
	}

public WebElement waitforelement(WebDriver driver,long time,WebElement element){
WebDriverWait wait = new WebDriverWait(driver, time);
return wait.until(ExpectedConditions.elementToBeClickable(element));
}



}
