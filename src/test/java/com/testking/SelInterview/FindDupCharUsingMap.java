package com.testking.SelInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupCharUsingMap {

	 String element =  "bhanupratapsingh";
	public void findduplicatechar(String value){
		Map<Character, Integer> mapele=new HashMap<Character, Integer>();
		char[] charar = element.toCharArray();
		System.out.println(charar);
		int c = 0;
		for(Character charvalue:charar){
			System.out.println("1==>"+charvalue);
			if(mapele.containsKey(charvalue)){
				System.out.println("2==>"+charvalue);
				mapele.put(charvalue, mapele.get(charvalue)+1);
				System.out.println(charvalue+"=="+"3==>"+mapele.get(charvalue)+1);
				}
			
				else {
					mapele.put(charvalue, 1);
					System.out.println("4==>"+charvalue);
				}
			}
		Set<Character> keyvalue = mapele.keySet();
		for(Character elevalue:keyvalue){
			if(mapele.get(elevalue)>1){
				System.out.println(elevalue+"======="+mapele.get(elevalue));
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDupCharUsingMap cha = new FindDupCharUsingMap();
		cha.findduplicatechar(cha.element);
	}

}
