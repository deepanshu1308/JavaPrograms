package com.static_demo;

public class NonStaticDataMember {
	int x=10;
	NonStaticDataMember(){//directly inside the constructor
		System.out.println(x);
			
		}
	
    void show() {//directly inside the non static method
    	System.out.println(x);
    }
    
	public static void main(String[] args) {
	   System.out.println(new NonStaticDataMember().x);//calling by object
	   
	   NonStaticDataMember n=new NonStaticDataMember();//by making ref var
	   System.out.println( n.x);
	   
	  
	   
	
    
}
}
