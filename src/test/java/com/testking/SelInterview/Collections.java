package com.testking.SelInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

public class Collections {

	public static void main(String[] args) {
	
	List<String> name = new ArrayList<String>();

	name.add("vijay");
	name.add("varsha");
	name.add("vidya");
	name.add("shanta");
	name.add("jayshree");
	name.add("atharva");
	
	Iterator<String> itrator1 = name.iterator();
	while(itrator1.hasNext()){
		String name2=itrator1.next();
		System.out.println(name2);
	}

		int i = 1; 
		int y = 6;
//		while (y--)
//		{i++;}
//		System.out.println("value of X is "+i+"and value of Y is"+ y);
		
		
		String str = "100.25";
		Float fval=Float.parseFloat(str);
		
		String [] intar = new String [5];
		intar[0]="vijay";
		intar[1]="vaibhav";
		intar[2]="rajesh";
		intar[3]="vishal";
		intar[4]="ravi";
		System.out.println(intar);
		
		HttpClient client = HttpClientBuilder.create().build();
	
	}
	
	

}
