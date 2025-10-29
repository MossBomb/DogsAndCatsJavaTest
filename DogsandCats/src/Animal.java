
public class Animal {
	
	String name = "";
	
	public Animal(String n) {
		name = n;
	}

	@Override
	public String toString() {
		return "Animal with name: " + name;
	}
	
	public void speak() {
		System.out.println("Animal noise");
	}
	
	
	
}
