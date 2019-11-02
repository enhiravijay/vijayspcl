package com.testking.SelInterview;



public class Stringpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v = "vijay";
		String v1 = "Varsha";
		String v2 = "Vidya";
		String v3 = "shanta";
		
	
		char ch1 []={'v','i','j','a','y','1'};
		String s1 = new String(ch1);
		
		System.out.println("======");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println(s1);
		
		String conc = v.concat(" chetgiri");
		System.out.println(conc);
		
		String e = "element";
		String l = "element";
		String m= new String("element");
		
		
		System.out.println(e==l);
		System.out.println(e.equals(l));
		System.out.println(e==m);
		System.out.println(e.equals(m));
		
		String vj = "vijay Chetgiri12";
		String[] split = vj.split(" ");
		
		for(String spli:split){
			System.out.println(split[0]);
			System.out.println(split[1]);
		}
		
		String zz = "zziippzzkkzr";
		String vr=zz.replace('z', 'v');
		System.out.println(vr);
		
		String z1 = "zziippzzkkzr";
		String v12=zz.replaceFirst("zz", "ba");
		System.out.println(v12);
		
		String job = "newinning";
		String nwe=job.substring(2);
		System.out.println(nwe);
		
		String word1 = "This is a demo";
		String word2="";
		word2=word1.substring(10);
		System.out.println(word2);
		word2=word1.substring(6, 14);
		
		System.out.println(word2);
		
	}

}
