package OOps;
import java.util.*;
//default constructor - class name and method name are same
//instance method
 /*class Car{
  * String name;
	String color;
	Car(){
		color="wine";
	}
	void display() {
			System.out.println("The car name is "+name);
		System.out.println("The car color is "+color);
	}
}
public class Constructor {
public static void main(String[] args) {
	Car c1 =new Car(); //default constructor is called
	c1.name="Breeza";
	c1.display();
}
}*/


//parameterized constructor

class Car{
	String name;
	int number;
	
	Car(String name,int number){
		this.name=name;
		this.number=number;
	}
	
	void display() {
		System.out.println("Car name: "+name);
		System.out.println("Car number: "+number);
	}
}


public class Constructor {
public static void main(String[] args) {
	
Car c1=new Car("Brezza",9414); 
c1.display();
}
}