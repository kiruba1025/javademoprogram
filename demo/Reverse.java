package com.ebrain.demo;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		String word, rev = " ";
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the bigword");
		word = value.nextLine();
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
			System.out.println(rev);
		}
		value.close();
	}
}
	
	  
			
		

