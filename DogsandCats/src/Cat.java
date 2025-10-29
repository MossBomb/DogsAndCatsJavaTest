
public class Cat extends Animal{

	@Override
	public void speak() {
		System.out.println("Meow!");
	}
	
	@Override
	public String toString() {
		return "Cat with name: " + name;
	}
	
	
	public Cat(String n) {
		super(n);
	}
	
	
}
