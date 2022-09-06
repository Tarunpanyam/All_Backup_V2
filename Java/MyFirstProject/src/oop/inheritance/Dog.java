package oop.inheritance;

public class Dog extends Animal {

	public Dog() {
		Animal obj = new Animal();
		obj.animalMakeSounds();
	}
	public void barks() {
		System.out.println("The dog says : bow bow");
	}
}
