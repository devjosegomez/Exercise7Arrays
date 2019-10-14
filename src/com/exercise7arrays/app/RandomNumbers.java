package com.exercise7arrays.app;

import java.util.Random;

public class RandomNumbers {
	final int ELEMENTS_ARRAY = 10;
	
	//2nd way with Math class
	double generatedNumber = 0;
	int generatedNumberInt = 0;
	
	for(int i=0; i<ELEMENTS_ARRAY; i++) {
		generatedNumber = (int)(Math.random()*50+50);
		System.out.println(generatedNumber);
	}
	
}
