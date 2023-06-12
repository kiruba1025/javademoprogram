package com.ebrain.demo;

public class MulDemo {
		public static void main (String[] args)
	{
		int x=5;
		int y=6;
		int z=(x*y); // this multiplication -arithmetic operator
		int c= x%y;  // this modulus
		x &=3; //this assignment operator
		float g=52.0f;
		float h=53.0f;// this comparison operator	
		System.out.println(z + "multiplication");
		System.out.println(x/y +"modulus");
		System.out.println(x);
		System.out.println(c);
		System.out.println(g>=h);
		System.out.println(x<30||y<20);
	}
}
