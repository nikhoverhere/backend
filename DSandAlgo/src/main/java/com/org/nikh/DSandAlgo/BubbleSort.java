package com.org.nikh.DSandAlgo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {
	
	private static final Scanner scanner = new Scanner(System.in);
	
    static int sockMerchant(int n, int[] ar) {

        for(int i=0; i<ar.length-1; i++) {

            for(int j=0; j<ar.length-1-i; j++) {


                    if(ar[j]> ar[j+1]){

                        int temp = ar[j];
                        ar[j] = ar[j+1];
                        ar[j+1] = temp;

                    }
                }
        }
        int count = 0;
        for(int i=0; i<ar.length-1; ) {
        	
        	System.out.println(ar[i]);
        	
        	if(ar[i] == ar[i+1]) {
        		count+=1;
        		i =i+2;
        	} else {
        		i =i+1;
        	}
        		
        }
        
        System.out.println(count);
        
        
        
        
		return 0;
    }

    

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		int ar[] = new int[9];

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			
			int temp = sc.nextInt();
			ar[i] = temp;
		}
		
//		for(int i=0; i<n; i++) {
//			
//			System.out.println(ar[i]);
//		}
		
		sockMerchant(n, ar);

	}

}
