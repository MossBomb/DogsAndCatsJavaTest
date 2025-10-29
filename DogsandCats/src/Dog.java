
public class Dog extends Animal{

	@Override
	public void speak() {
		System.out.println("Bark!");
	}
	
	@Override
	public String toString() {
		return "Dog with name: " + name;
	}
	
	
	public Dog(String n) {
		super(n);
	}
	
}
