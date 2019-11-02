package com.testking.SelInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class MapandSetpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> list = new HashMap<Integer, String>();
		
		list.put(101, "vijay");
		list.put(102, "varsha");
		list.put(102, "vidya");
		list.put(104, "vaibhav");
		
		Set<Map.Entry<Integer,String>> getset = list.entrySet();
		System.out.println("getset value is "+getset);
		for(Map.Entry<Integer,String> entry:getset){
			System.out.println(entry.getKey()+"get value is"+entry.getValue());
		}
		
		
		Map<String, String> elements = new LinkedHashMap<String, String>();
		elements.put("Diwali", "Bonus");
		elements.put("Ganpati", "Holiday");
		elements.put("Holi", "color");
		elements.put("Christmas", "oldman");
		
		System.out.println(elements);
		
		
		Set<String> arrayli = new TreeSet<String>();
		
		arrayli.add("my school");
		arrayli.add("my Friend");
		arrayli.add("my school");
		arrayli.add("my girlfriend");
		
		for(String value:arrayli){
			
		System.out.println("value of array is "+value);
		}
		
		
		ArrayList<String> arli = new ArrayList<String>();
		arli.add("enhira");
		arli.add("datamatics");
		arli.add("hblglobal");
		arli.add("entech");
		arli.remove(0);
		System.out.println(arli);
		arli.set(0, "newplace");
		System.out.println(arli);
		
		
		
		
	}
	
	
	
	

}
