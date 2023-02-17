package com.firstjavaproject;

class Test{
	String s1;
	Test(String s){
		s1=s;
	}

public String toString() {
     return s1;	
}
}
public class Constructor_Ex {

	public static void main(String[]args) {
		
		Test t=new Test("hello");
		System.out.println(t);
		
		int i=t.hashCode();
		System.out.println(i);
		String hexString=Integer.toHexString(i);
		System.out.println(hexString);
		System.out.println(t.getClass().getName()+'@'+hexString);
		
	}
}
