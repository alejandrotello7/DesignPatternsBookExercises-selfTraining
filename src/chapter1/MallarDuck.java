package chapter1;

public class MallarDuck extends Duck{
	
	public MallarDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
