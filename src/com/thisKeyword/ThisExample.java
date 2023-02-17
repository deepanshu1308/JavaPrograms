package com.thisKeyword;

public class ThisExample {

	String name;
	int age;
	
	ThisExample(String name,int age){
		//here the name of local variable and instance variable is same
		//(data Shawdowing)so 
		//the value cannot be passed to the instance variable here compiler will
		//allocate the name value and age value to its own local varible so it
		//cannot go to instance variable and it gives its original or default null
		//and 0 value
//		name=name;
//		age=age;
		
		//so we use this keyword it is used to identify the instance variable in 
		//case of data shawdowing
		this.name=name;
		this.age=age;
		
	}
	void show() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String []a) {
		
		ThisExample t=new ThisExample("deepanshu",23);
		t.show();
	}
}
