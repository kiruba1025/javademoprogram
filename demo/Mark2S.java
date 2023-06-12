package com.ebrain.demo;
import java.util.Scanner;
public class Mark2S {
	public static void main(String[] args) {
		Scanner Exam = new Scanner(System.in);
		System.out.println("I-semester");
		System.out.println("name:");
		String name = Exam.nextLine();
		System.out.println("Total mark");
		int mark = Exam.nextInt();

		switch (mark) {
		case 100:
			System.out.println("Grade A");
			break;
		case 95:
			System.out.println("Grade b");
			break;
		case 80:
			System.out.println("Grade c");
			break;
		default:
			System.out.println("fail");

		}
	}}
