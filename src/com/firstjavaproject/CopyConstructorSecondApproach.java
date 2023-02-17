package com.firstjavaproject;

class Studentss{
	String name;
	int age;
	void show(){
		System.out.println(name);
		System.out.println(age);
	}
	
	Studentss(String n,int a) {
		name=n;
		age=a;
	}
	Studentss(Studentss s3){
		name=s3.name;
		age=s3.age;
	}
}

public class CopyConstructorSecondApproach {
	public static void main(String[] args) {
		Studentss s=new Studentss("deepanshu",23);
		s.show();
		
		Studentss s1=new Studentss(s); //s naam ka reference hai yee iss vle
		//constructor mai pass karake upar s3 mai recieve kr lia gaya 
	    s1.show();
        
	}


}
