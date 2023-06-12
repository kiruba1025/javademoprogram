package com.ebrain.demo;

import java.util.Scanner;

public class BreakValue {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = number.nextInt();
		int i = 0;
		while (i < num) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

//	for(int i=0;i<=num;i++)
//{
//	
//	if(i==4)
//{
//		continue;
//}
//	System.out.println(i);
//	
//	}

}
