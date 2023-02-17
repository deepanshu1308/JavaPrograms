package com.firstjavaproject;

class A{
	static B show() {
		B b=new B();
		System.out.println(b);
		return b;
	}
}
class B{
	B(){
		System.out.println("B consss");
	}
}
public class ExampleOfMethod {

	
	public static void main(String[]args) {
        
		B b=A.show();
		System.out.println(b);
		A a= new A();
		System.out.println(a.show());
		
	}	
}
