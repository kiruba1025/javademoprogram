package com.ebrain.demo;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number");
		int data = number.nextInt();
		int j = 1;
		for (int i = 1; i <= data; i++) {
			j = j * i;
			System.out.println(j);
		}
	}
		}
		

