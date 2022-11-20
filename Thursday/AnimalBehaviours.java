package oopsconcept;

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
	void sleep()
	{
		System.out.println("Sleeping...");
	}
}

class Bird extends Animal
{	
	void fly()
	{
		super.eat();
		super.sleep();
		System.out.println("Flying...");
	}
}

public class AnimalBehaviours {
	public static void main(String[] args)
	{
		
		Animal anml = new Animal();
		System.out.println("Animal class behaviour:");
		anml.eat();
		anml.sleep();
		//anml.fly();
		
		Bird brd = new Bird();
		System.out.println("\nBird class behaviour:");
		brd.fly();
	}
}
