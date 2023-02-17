package com.static_demo;

public class StudentSelectedInInterview {

	String name;
	static String clgname,cmpname;
	int rollno,age;
	void show() {
		System.out.println(name);
		System.out.println(clgname);
		System.out.println(cmpname);
		System.out.println(rollno);
		System.out.println(age);
	}
	StudentSelectedInInterview(String n,String cl,String cm,int r,int a){
		name=n;
		clgname=cl;
		cmpname=cm;
		rollno=r;
		age=a;
	}
	public static void main(String[] args) {
      
		StudentSelectedInInterview s1=new StudentSelectedInInterview("deeepanshu",
				"iit","niit",1,23);
		StudentSelectedInInterview s2= new StudentSelectedInInterview("deeep",
				"iit","niit",2,24);
		StudentSelectedInInterview s3=new StudentSelectedInInterview("deeepans",
				"iit","niit",3,25);
		StudentSelectedInInterview s4=new StudentSelectedInInterview("deeepu",
				"iit","niit",4,27);
		StudentSelectedInInterview s5=new StudentSelectedInInterview("deep",
				"iit","niit",5,26);
		
		//herer the clgname and cmpname is same for all the objects so it is waste 
		//of memory bcz we are allocating the memory again and again for same 
		//thing so thats why we use the word static so that same memory is allocated....
		
		//now the memory allocated is not inside the object it is allocated in
		//class memory area...isme ak hi copy bnti hai sb vhi share karte hai
		
		//jab hm object bnate hai to memory instance variable or non static 
		//member ko milti hai...instance ke case mai jitne object hunge utni copy bnegi
		 
		
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		s5.show();
	}

}
