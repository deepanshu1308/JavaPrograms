package com.static_demo;

public class StaticDataMemberAndMemberFunction {

	static int x=10;
	static void disp() {
		System.out.println(x);
	}
	StaticDataMemberAndMemberFunction(){
		System.out.println(x);
		disp();
	}
	void show() {
		System.out.println(x);
		disp();
	}
	
	public static void main(String[] args) {
		
		System.out.println(new StaticDataMemberAndMemberFunction().x);
		StaticDataMemberAndMemberFunction n=new StaticDataMemberAndMemberFunction();
		n.disp();
		System.out.println(n.x);
		System.out.println(StaticDataMemberAndMemberFunction.x);//via class name
		StaticDataMemberAndMemberFunction.disp();//via class name
		
		System.out.println(x);
		disp();
		n.show();
	}	
}
