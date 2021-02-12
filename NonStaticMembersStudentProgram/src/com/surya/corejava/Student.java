package com.surya.corejava;

public class Student {
   static String institute;
   static Address  a1;
   
   int sno;
   String sname;
   Address a2;
   
   void m1(int sno)
   {
	int  p = 10;   
   }
   void m2(String sname)
    {
      String s  = "LPU";    	
    }
   void m3(Address a3)
   {
	  Address a4 = new Address();  
   }
   
   void display()
   {
		 System.out.println(" \tinstitute :"+institute);
		 System.out.print(" \ta1        :"+a1 );
		  if(a1 != null)
		  {
			  System.out.println("("+a1.stnum+","+a1.city+")");
		  }
		  else
		  {
			  System.out.println(" ");
		  }
		 System.out.println(" \tsno       :"+sno);
		 System.out.println(" \tsname     :"+sname);
		 System.out.print("\ta2        :"+a2 +""+ (a2 != null ? "(" + a2.stnum+","+ a2.city+ ")": ""));
         
   }
   
}
