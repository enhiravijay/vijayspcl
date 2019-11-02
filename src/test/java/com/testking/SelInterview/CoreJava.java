package com.testking.SelInterview;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long one = (long) 10;// Type mismatch : cannot convert from int to Long

		Long three = (long) 3;// works fine
		
		Long four = Long.valueOf(50);
		//How to 
		String csv = "samsung,Google,Apple,motorolla";
		String[] Strarr = csv.split("," + "\\s*");
		List<String> fixedlength = Arrays.asList(Strarr);
		ArrayList<String> listofstring = new ArrayList<String>(fixedlength);
		System.out.println("List of comma seperated string	:"+listofstring);
		System.out.println("List of comma seperated string	:"+listofstring.size());
		
		String words = "people,city,job,satisfaction";
		String[] seperatewords = words.split(",");
		System.out.println(seperatewords);
		List<String> listofarray = Arrays.asList(seperatewords);
		System.out.println("given is the words from string"+listofarray);
		System.out.println("given is the length of array"+listofarray.size());
		
		
	}

}
