import java.util.ArrayList;
import java.util.List;

public class AnimalRunner {
	
	public static void main(String[] args) {
		Cat c = new Cat("Cat");
		Dog d = new Dog("Dog");
		Cat elsa = new Cat("Elsa");
		Dog link = new Dog("Link");
		
//		System.out.println(c.toString());
//		c.speak();
		
		Dog[] dogs = new Dog[2];
		dogs[0] = d;
		dogs[1] = link;
		
		Cat[] cats = new Cat[2];
		cats[0] = c;
		cats[1] = elsa;
		
		Animal[] dogsAndCats = new Animal[4];
		dogsAndCats[0] = d;
		dogsAndCats[1] = c;
		dogsAndCats[2] = link;
		dogsAndCats[3] = elsa;
		
//		dogsAndCats[0].speak();
		
		
		List<Dog> dogCollection = new ArrayList<>();
		List<Cat> catCollection = new ArrayList<>();
		List<Animal> dogsAndCatsCollection = new ArrayList<>();
		
		dogCollection.add(link);
		dogCollection.add(d);
		
		catCollection.add(elsa);
		catCollection.add(c);
		
		dogsAndCatsCollection.add(elsa);
		dogsAndCatsCollection.add(link);
//		dogsAndCatsCollection.get(0).speak();
		
		System.out.println();
		
		System.out.println("Dogs and Cats list ------");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(dogsAndCats[i].toString());
			dogsAndCats[i].speak();
		}
		
		System.out.println();
		
		System.out.println("Dogs and Cats collection ------");
		
		for (int i = 0; i < 2; i++) {
			System.out.println(dogsAndCatsCollection.get(i).toString());
			dogsAndCatsCollection.get(i).speak();
		}
		
	}
}
