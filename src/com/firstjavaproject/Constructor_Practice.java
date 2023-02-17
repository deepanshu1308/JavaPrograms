package com.firstjavaproject;

class Student{
	String name;
	int age;
	void show(){
		System.out.println(name);
		System.out.println(age);
	}
	
	Student(String n,int a) {
		name=n;
		age=a;
	}
}
public class Constructor_Practice {
	public static void main(String[]args) {
	
		Student s=new Student("deepanshu",23);
		s.show();
		
		//Student s1=new Student();//it will show error bcz there is no default 
		//constructor above 
		//s1.show();
		
		
		
	}
}
