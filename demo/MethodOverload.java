package com.ebrain.demo;
import java.util.*;
class Student{
	public String concat(String a,String b) {
		String cat=a+b;
		return cat;
	}
	
	
		public String concat(String a, String b,String c) {
			String cat=a+b+c;
			return cat;
		
	}
		public int concat(int a,int b) {
			int cat=a+b;
			return cat;
			
		}
}

public class MethodOverload {

		public static void main(String[] args) {
			Student s =new Student();
			String cat1 = s.concat("kir","uba");
			String cat2=s.concat("kir","uba","B");
			int cat3=s.concat(5,6);
			System.out.println(cat1);
			System.out.println(cat2);
			System.out.println(cat3);
			
			
		}
		
}
