package com.ebrain.demo;
import java.util.Scanner;
public class LeapYear {

	public static void main (String[] args) {
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the Year");
		int y =Sc.nextInt();
		
		if(y%4==0) {
			System.out.println("y is leap year");
		}
		else {
			System.out.println("Y that is not leap year");
		}
	}
}