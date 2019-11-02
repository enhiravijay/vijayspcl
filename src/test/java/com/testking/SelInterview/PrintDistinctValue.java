package com.testking.SelInterview;

public class PrintDistinctValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers={1,2,5,6,2,1,9,5};
		
		for(int i = 0;i<numbers.length;i++){
			boolean isdistinct=false;
			for (int j = 0;j<i;j++){
				if(numbers[i]==numbers[j]){
					isdistinct=true;
					break;
				}
			} if(!isdistinct){
						System.out.println("distinct value of numbers is "+numbers[i]+",");
				}
			}
			
			}
			
		}

	


