package com.ebrain.demo;
import java.util.Scanner;
public class Customers {
	public static void main(String[] args) {
		int i, j;
		Integer count = 0;
		int state = 0;
		int total = 0;
		Scanner customers = new Scanner(System.in);
		System.out.println("Enter customer");
		int cus = customers.nextInt();
		System.out.println("Enter of district customers");
		int List = customers.nextInt();
		System.out.println("List of customers");
		for (j = 0; j < List; j++) {
			String d = customers.nextLine();
		}

		System.out.println("coustomer of country: state: district");
		for (i = 0; i <= cus; i++) {
			String c = customers.nextLine();
			if (i < cus) {
				count++;
			} else if (i > cus - 1) {
				state++;
			}
			total = count + state + j;
		}
		System.out.println("customer of country:" + count);
		System.out.println("customer of state:" + state);
		System.out.println("district customer:" + j);
		System.out.println("total customer:" + total);
	}
}
		
	

	
	
	
	
	

