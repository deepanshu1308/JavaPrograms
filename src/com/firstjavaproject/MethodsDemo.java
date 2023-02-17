package com.firstjavaproject;

import java.util.Scanner;

public class MethodsDemo {
 
	static void add() {
		int x=19;
		int y=20;
		int z=x+y;
	   System.out.println(z);
	}
	static void add(int x,int y) {
	   int z=x+y;
	   System.out.println(z);
	}
	static int sum() {
		int x=23;
		int y=27;
		int z=x+y;
	   System.out.println(z);
	   return z;
	}
	static int sum(int x,int y) {
		   int z=x+y;
		   System.out.println(z);
		   return z;
		}
	static boolean student(String name,int id) {
		if(name=="deepanshu" && id==123)
			return true;
		else
			return false;
		
	}
	static double sub(double d,double d1) {
		return (d-d1);
	}
	
	public static void main(String[] args) {
      add();
      sum();
      add(12,13);
      sum(16,14);
      add(sum(15,12),sum(11,11));
      boolean p=student("deepanshu",123);
      System.out.println(p);
      
      Scanner s= new Scanner(System.in);
      System.out.println("Enter first no");
      double d=s.nextDouble();
      System.out.println("Enter second no");
      double d1=s.nextDouble();
      double g = sub(d,d1);
      System.out.println("sub is"+g);
      
      
      
	}

}
