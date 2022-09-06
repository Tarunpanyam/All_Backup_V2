package oop.inheritance;

public class MainApp {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalMakeSounds();
		
		Dog dog = new Dog();
		//dog.animalMakeSounds(); // properties from animal
		dog.barks(); // self property of dogs
		
		Cat cat =  new Cat();
		cat.animalMakeSounds();
		cat.meos();
	}

}
