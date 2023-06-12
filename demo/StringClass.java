package com.ebrain.demo;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args)
	{
		Scanner re = new Scanner(System.in);
		System.out.println("Given String");
		String str=re.nextLine();
		String str1= str.toLowerCase();{
		System.out.println("After upper to lower:"+str1);
		String str2=str.toUpperCase();
		System.out.println("After lower to upper:"+str2);
		String str3=str.replaceAll("is", "in");
		System.out.println("After to is replace:"+str3);
		}
		}

}
