package abstraction;

public class Dog extends Animal {
	
	public void animalSound() {
		System.out.println("Dog sounds Bow Bow");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		   d.animalSound();

	}

}
