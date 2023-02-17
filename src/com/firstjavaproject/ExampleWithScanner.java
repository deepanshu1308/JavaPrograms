package com.firstjavaproject;

import java.util.Scanner;

class MyOnline{
	String name,clgname,mobile;
	int age,id;
	
	void show() {
		System.out.println("Name="+name);
		System.out.println("ClgName="+clgname);
		System.out.println("Mobile="+mobile);
		System.out.println("Age="+age);
		System.out.println("Id="+id);
		
	}
	void setData(String n,String cl,String m,int a,int i) {
		
		name=n;
		clgname=cl;
		mobile=m;
		age=a;
		id=i;
		
	}
	void chat() {
		System.out.println("People are chatting");
	}
	void read() {
		System.out.println("People are reading");
	}
	
}
public class ExampleWithScanner {
	public static void main(String[]args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("first data");
		
		System.out.println("Name");
		String n=s.nextLine();
        
		System.out.println("ClgName");
		String cl=s.nextLine();
		System.out.println("Mobile");
		String m=s.nextLine();
		System.out.println("Age");
		int a=s.nextInt();
		System.out.println("Id");
		int i=s.nextInt();
        
		MyOnline m1=new MyOnline();
		m1.setData(n, cl, m, a, i);
		m1.show();
        
System.out.println("second data");
		
		System.out.println("Name");
		String n1=s.nextLine();
        
		System.out.println("ClgName");
		String cl1=s.nextLine();
		System.out.println("Mobile");
		String mm=s.nextLine();
		System.out.println("Age");
		int a1=s.nextInt();
		System.out.println("Id");
		int i1=s.nextInt();
        
		MyOnline m2=new MyOnline();
		m2.setData(n1, cl1, mm, a1, i1);
		m2.show();
        
	}
}
