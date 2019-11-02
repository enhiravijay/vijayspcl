package com.testking.SelInterview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class testttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interview();
	
	}
			
		private static void interview() {
				
				String str = "My Country is India and I Love My Country";
				
				String [] strarray = str.split(" ");
				System.out.println(strarray.length);
				
				HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
				
				for(int i = 0;i<strarray.length;i++){
					
				String word = strarray[i].toUpperCase();
				System.out.println(word);
				if(wordcount.containsKey(word)){	
					wordcount.put(word, wordcount.get(word)+1);
					System.out.println(wordcount);
					Set<Entry<String, Integer>> entry = wordcount.entrySet();
					System.out.println(entry);
				}
					else{
						wordcount.put(word,1);
					}
				
				
				//System.out.println(strarray);
				
			}
				
				for(Entry<String, Integer> entry : wordcount.entrySet()){
					
					String key = entry.getKey();
					Integer Value = entry.getValue();
					
					System.out.println(key+ " count of words in str is "+ Value);
				}
				
				
				
				
			}
		}


