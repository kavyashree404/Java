package OOps;
class Animal1{    //parent class
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Dog1 extends Animal{   //sub / child class
 void bark() {	
	System.out.println("Dogs bark");
}
}
class Puppy extends Dog1{
	void weep() {
		System.out.println("Puppy weeps");
	}
}
public class Multilevel_inheritance {
public static void main(String[] args) {
	Puppy p=new Puppy();
	p.sound();
	p.bark();
	p.weep();
}
}
