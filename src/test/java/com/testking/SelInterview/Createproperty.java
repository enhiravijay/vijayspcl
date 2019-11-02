package com.testking.SelInterview;





import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class Createproperty {

	public Properties Or;
	public File f1;
	public FileInputStream file;

@Test
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


}
	


	



