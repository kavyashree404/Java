package OOps;

class Animal{    //parent class
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{   //sub / child class
 void bark() {	
	System.out.println("Dogs bark");
}
}

public class Single_inheritance {
public static void main(String[] args) {
	Dog d=new Dog();
	d.sound();
	d.bark();
}
}
