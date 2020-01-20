package com.org.nikh.DSandAlgo;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy";
	      char s[]=str.toCharArray();
	      int c[]=new int[126];
	      for(int i=0;i<s.length;i++){
	          if(s[i]!=' '){
	        	  System.out.println(s[i]);
	             int ax = c[s[i]-'a']++;
	             System.out.println(ax);
	              System.out.println(Arrays.toString(c));
	          }
	      }
		
//		String str="The quick brown fox jumps over the lazy";
//	      char s[]=str.toCharArray();
//	      int c[]=new int[26];
//	      for(int i=0;i<s.length;i++){
//	          if(s[i]!=' '){
//	              c[s[i]-'a']++;
//	          }
//	      }
//	      String s2="";
//	      for(int i=0;i<26;i++){
//	          if(c[i]==0){
//	              s2=s2+(char)(i+'a');
//	          }
//	      }
//	      System.out.println(s2);

		
		
//		String a = "Hello World";
//		String b = "Hey";
//		int count = 0;
//		
//		HashMap<String, String> map = new HashMap<>();
//		StringBuilder builder = new StringBuilder();
//		
//		String[] array = b.split("");
////		a.contains(array[0]);
//		
//		for(int i=0; i<b.length(); i++) {
//			
//			a.contains(array[i]);
//			
//			count++;
//			if(count == b.length()) {
//				for(int x=0; x<b.length()-i; x++) {
//					
//					StringBuilder sb = builder.append(x);
//					sb.toString()
//					
//				}
				
//			}
			
			
//			builder.append(array[i]);
//		}
		
		
		
	}

}
