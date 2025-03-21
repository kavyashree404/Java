package OOps;
class Animal{   
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{   
 void bark() {	
	System.out.println("Dogs bark");
}
}
class Cat extends Animal{
	void meow() {
		System.out.println("Cats meow");
	}
}
public class Hierarchical_inheritance {
public static void main(String[] args) {
	Dog d=new Dog();
	Cat c=new Cat();
	d.sound();
	d.bark();
	c.meow();
	
}
}
