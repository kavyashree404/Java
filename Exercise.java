package OOps;
import java.util.*;

class Recipe{
	//variable
	String item="Pasta";
	String variety;
	int price= 100;
	
	//methods
	void display() {
		System.out.println("Enter your dish:"+item);
		System.out.println("Varities:"+variety);
		System.out.println("Price:"+price);

	}
	
}


public class Exercise {
	public static void main(String[] args) {
		
		//object creation
		Recipe s1=new Recipe();
		s1.variety="Garlic pasta,White sauce pasta";
		s1.display();
		//instance method
		
	}
	
	

}
