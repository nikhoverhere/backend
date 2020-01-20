package com.org.nikh.DSandAlgo;

public class JumpingOnClouds {

	public static void main(String[] args) {

		int c[] = { 0, 0, 0, 1, 0, 0 };

		int counter = 0;
		for (int i = 0; i < c.length - 1;) {

			if (i + 1 == c.length - 1) {
				i++;
				
			} else if (c[i + 2] == 0) {

				i += 2;
				System.out.println("i value: " + i);

			} else {
				i++;

			}
			counter++;
		}

		System.out.println(counter);

	}

}
