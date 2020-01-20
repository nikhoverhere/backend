package com.org.nikh.DSandAlgo;

public class RepeatedString {

	public static void main(String[] args) {
		
	    String s = "abcacas";
	    long n = 1000000;
		
	    int length = s.length();
	   
	    long repeats = n / length;
	    long reminder = n % length;

	    long count = 0;
	    for (int i = 0; i < length; i++) {
	        if (s.charAt(i) == 'a') {
	            count += repeats;
	            if (i < reminder) {
	                count++;
	            }
	        }
	    }
	    
	    System.out.println(count);
	}

}
