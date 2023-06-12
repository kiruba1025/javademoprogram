package com.ebrain.demo;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

		String temp=" ";
		String temp1=" ";
		// for reverse word
		String revers = " ";
		char rev;
		Scanner Bigword = new Scanner(System.in);
		System.out.println("Enter BigWord");
		String name = Bigword.nextLine();
		
		for (int i = 0; i < name.length(); i++) {
			 if(temp.indexOf(name.charAt(i)) == -1 ){
	             temp = temp + name.charAt(i);//unique characters
			}
			if(temp1.indexOf(name.charAt(i))!= -1){
				 temp1= temp1+name.charAt(i);//occurance number
			 }
			rev = name.charAt(i);
			revers = rev + revers;//revers word
		}
		System.out.println("unique characters: " + temp.length());	
		System.out.println("Occurance characters: " + temp1.length());
		System.out.println("reverse word: " + revers);
		String[] half=name.split("\\s");
		
		System.out.println("half word:"+ half);
	}
	}
	
/* int unique=0,unique1=0;
 * for(j=0;j<i; j++)
 * if(i==j)
 * int temp=1;
 * if(temp==0){
 * unique++;
 * 
 * for(String h:half) //half word
		{
 * 
 * 
 * */



