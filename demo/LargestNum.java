package com.ebrain.demo;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		int i;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = number.nextInt();

		int arr[] = new int[num];
		System.out.println("enter the your number");
		for (i = 0; i < num; i++) {
			arr[i] = i;
			System.out.println(i);
		}
		int p = arr[0];
		int n = arr[0];
		int m = arr[0];
		for (i = 1; i < num; i++) {
			if (n < arr[i]) {
				n = arr[i];
			}
			for (int j = 1; j < num; j++) {
				if (arr[j] < arr[i]) {
					m = arr[j];
				}
				for (int k = 1; k < num; k++) {
					if (m > arr[k]) {
						p = arr[k];
					}
				}
			}
		}
		System.out.println("laregest number:" + n);
		System.out.println("second laregest number:" + m);
		System.out.println("third laregest number:" + p);
	}
	}





/*
 * 
		System.out.println(largest);
			
 * System.out.println("largest num:" + Math.max(num,i));
		System.out.println("smallest num:"+Math.min(num,i));
 * int  n,i;
Scanner value =new Scanner(System.in);
System.out.println("list of elements");
int data = value.nextInt();
  
System.out.println("list of number");

for(i=0;i<data;i++)
{
	n=value.nextInt();
}
System.out.println("largest num:" + Math.max(n,i));
System.out.println("smallest num:"+Math.min(data,1));

}}*/

	


