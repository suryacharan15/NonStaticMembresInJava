package com.surya.corejava;

public class Test {

	public static void main(String[] args) {
		 Student s1 = new Student();
		 Student  s2 = new Student();
		 Student s3 = new Student();
		 
	 Student.institute    = "LPU";
	 Student.a1           = new Address(); 
	 Student.a1.stnum  = 1;
     Student.a1.city   = "PUNJAB";
		 
		 s1.sno   = 101;
		 s1.sname = "Surya";
		 s1.a2    = new Address(); 
		   s1.a2.stnum =2;
		   s1.a2.city = "Andhra";
		   
		   s2.a2 = new Address();
		     s3.a2 = s2.a2;
		     s2.a2.stnum = 3;
		     s2.a2.city = "CYB";
		
		 System.out.println("\ns1 Object Details");
           s1.display();
           
         System.out.println("\ns2 object Details");
         s2.display();
         
         System.out.println("\ns3 object Details");
         s3.display();
         
	}

}
