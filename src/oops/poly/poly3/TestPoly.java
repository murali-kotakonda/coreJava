package com.mnp.poly3;

public class TestPoly {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(12.5f,  10.0f));
		System.out.println(cal.add(12l,  10l));
		//int , int
		System.out.println(cal.add(5,6));
		System.out.println(cal.add(5,6f));
		System.out.println(cal.add(5f,6));
		System.out.println(cal.add(5l,6f));
		//System.out.println(cal.add(1,2,3));
		
		
		
		
		/*long sum2 = cal.add(12l,  13l);
		System.out.println(sum2);*/
		/*
		float    sum1 = cal.add(5,6);
		System.out.println(sum1);
		
		
		
		cal.add(12,  10.0f);
		
		cal.add(12f,  189);
		*//*
		int sum2 = cal.add(1,2,3);
		System.out.println(sum2);
		
		*/
		
		/*long sum4 = cal.add(12l, 10l);
		System.out.println(sum4);*/
	}
}
