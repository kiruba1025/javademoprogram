package com.ebrain.demo;
import java.util.Scanner;
public class ReverseType
{
	public static void main(String[] args) {
		Scanner reverse = new Scanner(System.in);
		char rev;
		String a, revers = "";
		System.out.println("Enter the word");
		a = reverse.nextLine();
		int length = a.length();
		System.out.println("Enter the reveres word");
		for (int i = 0; i < a.length(); i++) {
			rev = a.charAt(i);
			revers = rev + revers;
		}
		System.out.println(revers);
	}}
