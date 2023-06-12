package com.ebrain.demo;
import java.util.*;
public class MapHash {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		int n = sc.nextInt();
		HashMap<String, String> list = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			System.out.println("First Name:");
			String a1 = sc.next();
			System.out.println("District Name:");
			String b = sc.next();
			System.out.println("State Name:");
			String c = sc.next();
			System.out.println("Country Name:");
			String d = sc.next();

			list.put(a1, b);
			list.put(a1, c);
			list.put(c, d);

			// list.remove(c);
			System.out.println("This get map: " + list.get(b));
			System.out.println("This list " + list);

			for (String lis : list.keySet()) {
				System.out.println("keykkkkkkkkkk:" + lis);
			}
			for (String lis1 : list.values()) {
				System.out.println("Valuevvvvvvvvvvv:" + lis1);
			}
			for (Map.Entry l : list.entrySet()) {
				System.out.println("Key and value++++++++");
				System.out.println("key:" + l.getKey() + " value:" + l.getValue());
			}
			list.putIfAbsent(b, c);
			System.out.println("putIfAbsent()*******");
			for (Map.Entry l : list.entrySet()) {
				System.out.println("key: " + l.getKey() + " value: " + l.getValue());
			}
			HashMap<String, String> list1 = new HashMap<String, String>();
			list1.put(c, b);
			list1.putAll(list);
			System.out.println("putall..........");
			for (Map.Entry l : list.entrySet()) {
				System.out.println("key: " + l.getKey() + " value: " + l.getValue());
			}
		}
	}
}
