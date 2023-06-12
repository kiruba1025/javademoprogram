package com.ebrain.demo;

class Ride{
	void show() {
		System.out.println("bike ride");
	}
}
	class Race extends Ride{
	void show() {
		System.out.println("car ride");
	}
	}
	class Cycle extends Ride{
		void show() {
			System.out.println("Cycle slow race");
		}
	}


public class MethodOverride {
	public static void main (String[] args) {
		Ride r=new Ride();
		r.show();
		Ride r1=new Race();
		r1.show();
		Ride r2=new Cycle();
		r2.show();
	}

	
}
