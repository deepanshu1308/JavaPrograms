package com.firstjavaproject;

class Car{
	String car_name,model,color;
	float price;
	
	void showInfo() {
		System.out.println(car_name);
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		
	}
	//one parametrized and one non parametrized constructor are together here
	//so it is also called as constructor overloading... 
	Car(){
		car_name="maruti";
		model="777";
		color="red";
		price=8.4f;
		
	}
	Car(String cn,String m,String c,float p){
		car_name=cn;
		model=m;
		color=c;
		price=p;
	}
}
public class ConstructorOverloadingEx {
	public static void main(String[]args) {
		
		Car c1=new Car();
		c1.showInfo();
	
		Car c2=new Car();
		c2.showInfo();
	    
		Car c3=new Car("rangeRover","xuv","black",46.7f);
		c3.showInfo();
		Car c4=new Car("harrier","xuvs","green",56.7f);
		c4.showInfo();
	}
}
