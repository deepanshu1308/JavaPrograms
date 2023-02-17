package com.thisKeyword;

public class Thiss {

	Thiss(){
		System.out.println(this);
	}
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {

		Thiss t=new Thiss();
		System.out.println(t);
		t.show();
		
		Thiss t1=new Thiss();
		System.out.println(t1);
		t1.show();
		

	}

}
