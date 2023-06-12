package com.ebrain.demo;

public class Static {
	static class Student{
		   int rollno;//instance variable
		   String name;
		   static String college="gh";//static variable
		   //constructor
		   Student(int r,String n){
		   rollno = r;
		   name = n;
		   }
		   //method to display the values
		   void display (){System.out.println(rollno+" "+name+" "+college);}
		}
		//Test class to show the values of static variable
		public static class TestStaticVariable1{
		 public static void main(String args[]){
		 Student s1 = new Student(111,"Karan");
		 Student s2 = new Student(222,"Aryan");
		 s1.display();
		 s2.display();
		 }
		}

}
