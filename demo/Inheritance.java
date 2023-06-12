package com.ebrain.demo;
import java.util.Scanner;
 class Bank{
	String a=" ";
	String b=" ";
	String c=" ";
	String save() {System.out.println("Enter the uses");
	Scanner bank=new Scanner (System.in);
	 return a =bank.nextLine();
	}
	
}
	class Sbi extends Bank{
		String debit() {System.out.println("Enter the SBI uses");
	Scanner term=new Scanner (System.in);
		 return b= term.nextLine();
		}
	}
		class Iob extends Bank{
			String save() {System.out.println("Enter the IOB uses");
			Scanner term1=new Scanner(System.in);
			 return c=term1.nextLine();
		}
		}
		
public class Inheritance extends Bank {
	
	public static void main (String[] args) {
	
		Bank in= new Sbi();
		in.save();
		in.save();
		
		System.out.println(in.save());
		//System.out.println(in.debit());
		//System.out.println(in.credit());
		}
		}

		
		
		

		
    //
	//void display1() {System.out.println(b);}
	//void display2() {System.out.println(c);}
			
//	//Iob B=new Iob();
//	//Sbi B1=new Sbi();
//			S.save();
//			B.save();
//			B1.save();
//		System.out.println(" ");
//			//S.display();
//			//S.display1();
//			//S.display2();
			
	