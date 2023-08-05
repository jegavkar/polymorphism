package oop;

public class polymarphism extends polymarphism1
{

   void display()
	{
		System.out.println("display meth called");
		
	}
   public static void main(String[] args) 
   {
	   polymarphism1 obj=new polymarphism1();
	   obj.display();
	
}
  /* {
	   polymarphism obj=new polymarphism();
	   obj.display();
   }*/
   
}
