package com.ebrain.demo;
import java.util.Scanner;
abstract class Banks{
	Scanner sc=new Scanner(System.in);
	public abstract void bankUseage();
	{System.out.println("Enter");}
	public String iob() {
	String a =sc.nextLine();
	return a;
}
}
class Icici extends Banks{
	public void bankUseage()
	{String b =sc.nextLine();
	System.out.println("sbi");
}
}
public class Abstract  {
public static void main (String [] args) {
	Icici Ic =new Icici();
	Ic.bankUseage();
	Ic.iob();
	System.out.println(Ic.iob());
}
}
