package com.ebrain.demo;

import java.util.Scanner;

public class Pyramid {
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number");
		int data = number.nextInt();

		for (int i = 1; i <= data; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= data; i++) {
			for (int j = data; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}














