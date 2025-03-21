package OOps;
import java.util.*;
class Details{
	public String name="Sowmeha";
	private int age=19;
	protected String grade="A";
	String school= "Metro";
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);
		System.out.println("School:"+school);
		}
}

public class Access_modifiers {
public static void main(String[] args) {
	Details s1=new Details();
	s1.display();
	
	System.out.println("name:"+s1.name);
	System.out.println("age:"+s1.age);
}
}
