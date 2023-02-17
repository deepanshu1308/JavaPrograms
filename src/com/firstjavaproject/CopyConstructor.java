package com.firstjavaproject;
class Students{
	String name;
	int age;
	void show(){
		System.out.println(name);
		System.out.println(age);
	}
	
	Students(String n,int a) {
		name=n;
		age=a;
	}
	Students(){
		
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		Students s=new Students("deepanshu",23);
		s.show();
		
		Students s1=new Students(); 
		 
		s1.age=s.age;//copy constructor
        s1.name=s.name;//copy constructor
        
        s1.show();
        
	}

}
