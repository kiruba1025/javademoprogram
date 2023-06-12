package com.ebrain.demo;
import java.util.*;
public class Hset {
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student");
	int a =sc.nextInt();
	HashSet<String>set=new HashSet<String>();
	for(int i=0;i<a;i++) {
		System.out.println("Enter the Student Name");
		System.out.println("First Name");
		String a1=sc.next();
		System.out.println("second Name");
		String b=sc.next();
		System.out.println("third Name");
		String c=sc.next();
		System.out.println("Fourth Name");
		String d=sc.next();
		System.out.println("Fifth Name");
		String e=sc.next();
		set.add(a1);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		for(String sett: set)
		System.out.println("This sett:"+sett);
		System.out.println("This Contains:" +set.contains(a1));
		Iterator<String> it= set. iterator();
		while(it.hasNext())
		System.out.println(" Iterator :"+it.next());
		//it.remove();
		
	}
}
}
