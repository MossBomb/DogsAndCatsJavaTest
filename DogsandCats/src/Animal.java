
public class Animal implements Comparable<Animal>{
	
	private String name = "";
	
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
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Animal o) {
		return this.name.compareTo(o.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (o instanceof Animal) {
			Animal temp = (Animal)o;
			return this.name.equals(temp.getName());
		} else {
			return false;
		}
	}
	
	
	
}
