package com.thisKeyword;

class Demo{
	int x=10;
	void disp(Demo d1) {//passing the object of type demo
		int x=20;
		System.out.println(x);//20
		System.out.println(d1.x);//10 this is internally how this keyword works
	}
}
public class thisKeywordInternalWorking {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.disp(d);
		
	}

}
