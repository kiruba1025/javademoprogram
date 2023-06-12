package com.ebrain.demo;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		int n;
		Scanner value = new Scanner(System.in);
		System.out.println("list of elements");
		n = value.nextInt();
		int arr[] = new int[n];
		System.out.println("list of number");
		for (int i = 0; i < n; i++) {
			arr[i] = value.nextInt();
		}

		System.out.println("list of even number");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + "");
			}
		}
		System.out.println("");
		System.out.println("list of odd number");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i] + "");
			}
		}
		System.out.println("");

	}
}
