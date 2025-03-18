package Day1programs;
import java.util.*;

public class Controlstatements {
	Scanner s1 = new Scanner(System.in);
	   //if, if else
	  /*int a=10;
	   int b=20;
	   if(a<b) {
		   System.out.println("A lessthan B");
	   }
	   else
	   {
		   System.out.println("A lessthan B");
	   }*/
	   
	   //nested if
	   /*int a=10;
	   int b=20;
	   if(a<b) {
	      if(a%b==0)
	      {
		   System.out.println("a+"Even number");
	   }
}*/
	   
	   //ladder if
	  /* int a=300;
	   int b=300;
	   int c=600;
	   if(a>b && a>c) {
		   System.out.println("A is greater");
	   }
	   else if(b>a && b>c) {
		   System.out.println("B is greater");
	   }
	   else if(c>a && c>b) {
		   System.out.println("c is greater");   
	   }
	   else 
	   {
		   System.out.println("All are equal");
	   }*/
	   
	   //switch
	   int a=s1.nextInt();
	   int b=s1.nextInt();
	   char choice;
	   System.out.println("+,-");
	   choice = s1.next().charAt(o);
	   switch(result) {
	   case '+':
		   int c=a+b;
		   System.out.println("ADD"+c);
	   break;
	   case '-':
		   int d=a-b;
		   System.out.println("SUB"+d);
	   break;
	   default:
		   System.out.println("Invalid choice");
	   break;
	   }
	   
}
}

}
