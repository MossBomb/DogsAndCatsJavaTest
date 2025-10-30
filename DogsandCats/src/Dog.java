
public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Bark!");
	}
	
	@Override
	public String toString() {
		return "Dog with name: " + super.getName();
	}
	
	
	public Dog(String n) {
		super(n);
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	
	
}
