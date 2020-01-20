package com.org.nikh.DSandAlgo;

public class RotateArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int n = 4;
		int d =5;
		int var;
		
		int value, temp;
		
		for(int i=0; i<4; i++) {
			int j;
			temp = arr[0];
			for(j=0; j<arr.length-1; j++) {
				
				
				arr[j] = arr[j+1];
				
				
			}
			arr[j] = temp;

		}
		
		for(int i =0; i<arr.length-1; i++) {
			
			System.out.println(arr[i]);
		}

	}

}
