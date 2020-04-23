package com.mnp.poly3;

public class TestPoly2 {
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		long    sum1 = cal.add(5,6);
		System.out.println(sum1);
		
		float sum3 = cal.add(12f,  10.0f);
		System.out.println(sum3);
		
		
		cal.add(12,  10.0f);
		
		cal.add(12f,  189);
		/*
		int sum2 = cal.add(1,2,3);
		System.out.println(sum2);
		
		*/
		
		/*long sum4 = cal.add(12l, 10l);
		System.out.println(sum4);*/
	}
}
