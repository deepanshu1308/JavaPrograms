package com.thisKeyword;

class B{
	static void m1(A t) {
		t.disp();
	}
}
class A{
	//void show(A a)
	void show(){
		System.out.println("show...");
		//B.m1(a);
		B.m1(this);
	}
	void disp() {
		System.out.println("disp...");
	}
}
public class ThisUse2 {

	public static void main(String[] args) {

		A a=new A();
		//a.show(a);
		a.show();
		
	}

}
