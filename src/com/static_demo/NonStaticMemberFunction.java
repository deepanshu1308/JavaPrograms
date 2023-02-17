package com.static_demo;

public class NonStaticMemberFunction {

	NonStaticMemberFunction(){
		System.out.println("disp");
	}
	void disp() {//directly inside the method
		System.out.println("disp");
	}
	void show() {//directly via non static method
		disp();
	}
	public static void main(String[] args) {
		
	   new NonStaticMemberFunction().disp();
	   NonStaticMemberFunction n=new NonStaticMemberFunction();
	   n.disp();
	   n.show();
	}
}
