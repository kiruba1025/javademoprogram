package com.ebrain.demo;
import java.util.ArrayList;
import java.util.Scanner;
public class AddoddevenNum {
public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
	System.out.println("Enter Length");
	int num=number.nextInt();
	int oddcount=0;
	int evencount=0;
	System.out.println("Enter the number");
	for(int i=0;i<num;i++) {
		int n=number.nextInt();
		if(n%2==0) {
			oddcount +=n;
		}
		if(n%2!=0) {
			evencount+=n;
		}
		
	}
	System.out.println("oddnumber:"+oddcount);
	System.out.println("evennumber:"+evencount);
}

public static void second(String[] agrs) {
	Scanner number=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=number.nextInt();
	int odd=0;
	int even=0;
	int i=0;
	
		if(num%2==0) {
			System.out.println("even: "+num);
		}
		if(num %2!=0){
			System.out.println("odd: "+num);
		}		
	
}
	
}

