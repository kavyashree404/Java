package OOps;
import java.util.*;

public class Method {
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
	//System.out.println(add(10,45));
	
	//using scanner
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter two values: ");
int a=s1.nextInt();
int b=s1.nextInt();
System.out.println("Total:"+add(a,b));
}
}
