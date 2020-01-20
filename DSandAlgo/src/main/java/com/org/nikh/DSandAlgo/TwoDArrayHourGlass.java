package com.org.nikh.DSandAlgo;

public class TwoDArrayHourGlass {

	public static void main(String[] args) {
		
		int a[][] = {{1, 1, 1, 0, 0, 0},
					{0, 1, 0, 0, 0, 0},
					{1, 1, 1, 0, 0, 0},
					{0, 0, 2, 4, 4, 0},
					{0, 0, 0, 2, 0, 0},
					{0, 0, 1, 2, 4, 0}};
		int sum =0;
		int min = Integer.MIN_VALUE;
		for(int row=0; row<4; row++) {
			for(int col=0; col<4; col++) {
				sum = a[row][col] + a[row][col+1] + a[row][col+2] +
						a[row+1][col+1]+
						a[row+2][col] + a[row+2][col+1] + a[row+2][col+2];
				if(sum>min) {
					min = sum;
				}
			}
		}
		
		System.out.println(min);

	}

}
