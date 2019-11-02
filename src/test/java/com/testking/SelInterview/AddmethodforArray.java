package com.testking.SelInterview;



public class AddmethodforArray {
	private Object[] obarr = new Object[3];
	
	private int elementcount = 0;
	
		
	public void add(Object obj){
		try {
			if(elementcount==obarr.length){
				//System.out.println(elementcount);
					increasecapacity();
					//System.out.println("new element count is"+elementcount);
			}
				obarr[elementcount]=obj;
				elementcount++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void increasecapacity(){
		try {
			//System.out.println("I m in increase capacity");
			int newcapacity= obarr.length*2;
			//System.out.println(newcapacity);
			Object[]nextarr=new Object[newcapacity];
			//System.out.println("new objectarray created");
			for (int i = 0;i<obarr.length;i++){
			//	System.out.println("I'm in new forloop");
			nextarr[i]=obarr[i];
							
}
			obarr=nextarr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public int capacity(){
		return obarr.length;
	}
	
	public  int size(){
		return elementcount;
	}

	
	public Object getobj(int index){
		if(index<0||index>=size()){
			throw new IndexOutOfBoundsException(""+index);
		}
		
		return obarr[index];
	}
	
	public void remove(int index){
		
		
		while(index<size()){
			obarr[index]=obarr[index+1];
			index++;
		}
	}
		
	public void insert (int index,Object obj){
	if(index<0||index>size()){
		throw new IndexOutOfBoundsException();
	}
	if(size()==capacity()){
		increasecapacity();
	}
	for (int i = size()-1;i>index;i--){
	obarr[index+1]=obarr[i];
	}
	obarr[index]=obj;
	elementcount++;
	}
		
		
		
		
		
		
	}
			
			
		

		
		

	


