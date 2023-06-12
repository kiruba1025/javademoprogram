package com.ebrain.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigWord {
	

	public static void main(String[] args) {
	
		System.out.println("list of elements");
		int i;
		Scanner value = new Scanner(System.in);
		
		int data = value.nextInt();
		int oddCount=0;
		int evanCount=0;
		System.out.println("list of number");
		List<Integer>list=new ArrayList<Integer>();
		for ( i = 1; i <=data; i++) {
			list.add(i);
		}
		for ( i=0;i<list.size();i++) {
			Integer data1=list.get(i);
		System.out.println(data1);
		}
		List<Integer>oddnumber=new ArrayList<Integer>();
		List<Integer>evannumber=new ArrayList<Integer>();
		for(Integer in:list) {
			if ( in % 2 == 0) {
				evannumber.add(in);
				//System.out.println("evan number:"+in);
			
			} else {
				oddnumber.add(in);
				//System.out.println("odd number:"+in);
				
			}
		}
		System.out.println("evanCount:"+evannumber+","+"oddcount"+oddnumber+"");
		
		System.out.println("list of even number" );
		for (int i1=1;i1<=data;i1++)
		{
			if (i1%2==0)
			{
				oddCount++;
				System.out.println(oddCount);
			}
		}
		System.out.println("list of odd number" );
		for (int j=1;j<=data;j++)
		{
			if( j%2!=0)
			{
				evanCount++;
				System.out.println(evanCount);
			}
		}
		}
	}
//	value.close();
//	}
//	}
//
