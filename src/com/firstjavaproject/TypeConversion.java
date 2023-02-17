package com.firstjavaproject;

public class TypeConversion {

	static void show(byte b) {
		System.out.println("byte="+b);
	}

	static void show(short b) {
		System.out.println("short="+b);
	}

	static void show(int b) {
		System.out.println("int="+b);
	}

	static void show(long b) {
		System.out.println("long="+b);
	}

	static void show(float b) {
		System.out.println("float="+b);
	}

	static void show(double b) {
		System.out.println("double="+b);
	}

	
	public static void main(String[]args) {
		show(23);
		show(23.4);
		show(15.4f);
		show(12l);
		show((byte)(23));//type casting
	    
		int x=19;//converting integer value to byte
		byte b = (byte)(x);
		System.out.println(b);
		show(b);
		
	}
}
