package animal;

public class Dog extends Animal implements AnimalFeatures
{
	@Override
	public void sound()
	{
		System.out.println("Dog barking");
	}
	@Override
	public void eat()
	{
		System.out.println("Dog eat healthy food");
	}
	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping on the mat");
	}
		public static void main(String[] args)
		{
			Dog d1 = new Dog();
			
			d1.displayAnimal();
			d1.sound();
			d1.eat();
			d1.sleep();
		}
	
}
