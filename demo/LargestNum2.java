package com.ebrain.demo;

public class LargestNum2 {
	public static void main(String[] args) {
		int a[] = { 89, 105, 108, 44, 109 };
		int n = a[0];
		int m = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > n) {
				m = n;
				n = a[i];
			}
		}
		System.out.println("Largest number:" + n);
		System.out.println("Second largest number:" + m);
	}}
	
	

