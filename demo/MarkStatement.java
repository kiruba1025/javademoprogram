package com.ebrain.demo;
import java.util.Scanner;
public class MarkStatement {
	public static void main(String[] args) {
		Scanner Exam = new Scanner(System.in);
		System.out.println("I-semester");
		System.out.println("name:");
		String name = Exam.nextLine();
		System.out.println("Total mark");
		int mark = Exam.nextInt();

		if (mark >= 100) {
			System.out.println("Grade A");
		} else if (mark >= 90) {
			System.out.println("Grade B");
		} else if (mark >= 85) {
			System.out.println("Grade c");
		}
		else {
			System.out.println("fail");
		}
	}
	}

