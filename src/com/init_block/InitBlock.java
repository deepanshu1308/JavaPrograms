package com.init_block;

class Employ{
	String name;
	int age;
	Address adr;
	Salary sal;

{
	 adr=new Address();
}
{
	 sal=new Salary();
}
void show() {
	System.out.println("Name="+name);
	System.out.println("Age="+age);
	System.out.println("Address="+adr.city+" "+adr.country+" "+adr.state);
	System.out.println("Salary="+sal.da+" "+sal.hra+" "+sal.ta);
	
}
Employ(String n,int a){
	name=n;
	age=a;
}
}
public class InitBlock {

	
	public static void main(String[] args) {
		Employ e= new Employ("deepanshu",23);
		e.show();
		
	}

}
