package day2programs;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		try (Scanner s1 = new Scanner(System.in)) {

			System.out.println("Enter a name");
			String name=s1.nextLine();
			System.out.println(name);

	}

}
}