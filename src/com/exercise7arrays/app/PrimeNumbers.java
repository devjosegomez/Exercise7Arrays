package com.exercise7arrays.app;

import java.util.Random;

public class PrimeNumbers {

	public static void main(String[] args) {
		final int ELEMENTS_ARRAY = 10;
		byte primeNumbers = 0;
		boolean isPrime= true;
		
		//Array declaration
		byte[] vector1 = new byte[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i = 0; i<ELEMENTS_ARRAY; i++) {
			vector1[i] = (byte)(randomNumbers.nextInt(14)+1);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			isPrime=true;
			for(int j=2; j<vector1[i]; j++) {
				if(vector1[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeNumbers++;
			}
		}
		
		for(int i = 0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(vector1[i]);
		}
		
		System.out.println("Prime numbers quantity: " + primeNumbers);
	}
}
