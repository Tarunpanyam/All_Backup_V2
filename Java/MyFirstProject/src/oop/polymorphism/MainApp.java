package oop.polymorphism;

public class MainApp {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalMakeSounds();
		
		Dog dog = new Dog();     //line 8 and 9 are doing same job 
		//Animal dog1 = new Dog();
		
		dog.animalMakeSounds(); // properties from animal

		
		Cat cat =  new Cat();
		cat.animalMakeSounds();
		
	}

}
