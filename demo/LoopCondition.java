package com.ebrain.demo;
import java.util.Scanner;
public class LoopCondition 
{
	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);
		int i = 0;
		String s;
		System.out.println("enter the name:");
		do {
			s = value.nextLine();
			i++;
		} while (!s.equals("stop"));
		{
			System.out.println(s);
		}
	}}


	



