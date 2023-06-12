package com.ebrain.demo;

import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		int i, j, temp = 0;
		Scanner Ascen = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Ascen.nextInt();
		int arr[] = new int[num];
		System.out.println("Sort number");
		for (i = 0; i < num; i++) {
			arr[i] = Ascen.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			for (j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Asending order");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		for (i = 0; i < arr.length; i++) {

			for (j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending order");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
