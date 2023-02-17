package com.static_demo;

class A {
	int x=10;
	static int y=20;
	
	void show() {
		System.out.println("Show");
		System.out.println(y);
		disp();
	}
	A(){
		
		System.out.println(x);//calling directly non static data member
	    
		System.out.println(y);//calling directly static data member
		show();
		disp();
	    
	}
	static void disp() {
		
		System.out.println("disp");
	    System.out.println(y);
	}
	void hi() {
	
		show();//calling directly non static member funtion or method
		System.out.println(y);
		disp();//calling directly static member funtion or method
	}
	
}
public class ExamopleOfStaticAndNonstatic {

	public static void main(String[] args) {
		//non static data member call
		System.out.println(new A().x);
		A a=new A();
		System.out.println(a.x);
		//non static member function or method call
		
		new A().show();
		A r=new A();
		r.show();
		r.hi();
		
		//static data member call
		
		System.out.println(new A().y);
		A a1=new A();
		System.out.println(a1.y);
		
		//static member funtion call or method call
		
		new A().disp();
		A a2=new A();
		a2.disp();
		a2.hi();
		
	}
}
