package com.org.nikh.DSandAlgo;

public class MinJumpsRequired {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,7,1,2,6,7,6,10};
//		https://www.youtube.com/watch?v=vBdo7wtwlXs
		int jump =1;
		int ladder = a[0];
		int stairs = a[0];
		
		
		for(int i=1; i<a.length; i++) {
			
			if(i == a.length-1) {
				
				System.out.println(jump);
			}
			
			if(i+a[i]>ladder) {
				ladder = i+a[i];
				
			}
			stairs --;
			
			if(stairs ==0) {
				
				jump++;
				stairs = ladder-i;
			}
			
		}
		System.out.println(jump);
	}

}
