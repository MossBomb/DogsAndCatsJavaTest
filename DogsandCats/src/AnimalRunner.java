import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class AnimalRunner {
	
	public static void main(String[] args) {
		Cat c = new Cat("Cat");
		Dog d = new Dog("Dog");
		Cat elsa = new Cat("Elsa");
		Dog link = new Dog("Link");
		Dog spot = new Dog("Spot");
		Dog s = new Dog("Spot");
		
//		System.out.println(c.toString());
//		c.speak();
		
		Dog[] dogs = new Dog[2];
		dogs[0] = d;
		dogs[1] = link;
		
		Cat[] cats = new Cat[2];
		cats[0] = c;
		cats[1] = elsa;
		
		Animal[] dogsAndCats = new Animal[8];
		dogsAndCats[0] = d;
		dogsAndCats[1] = c;
		dogsAndCats[2] = link;
		dogsAndCats[3] = elsa;
		dogsAndCats[4] = spot;
		dogsAndCats[5] = spot;
		dogsAndCats[6] = elsa;
		dogsAndCats[7] = spot;
		
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
		dogsAndCatsCollection.add(d);
		dogsAndCatsCollection.add(c);
		dogsAndCatsCollection.add(spot);
		dogsAndCatsCollection.add(s);

//		dogsAndCatsCollection.get(0).speak();
		
		System.out.println();
		
		System.out.println("Dogs and Cats Array ------");
		
		for (int i = 0; i < dogsAndCats.length; i++) {
			System.out.println(dogsAndCats[i].toString());
			dogsAndCats[i].speak();
		}
		
		System.out.println();
		
		System.out.println("Dogs and Cats collection ------");
		
		for (int i = 0; i < dogsAndCatsCollection.size(); i++) {
			System.out.println(dogsAndCatsCollection.get(i).toString());
			dogsAndCatsCollection.get(i).speak();
		}
		
		System.out.println();
		
		System.out.println("Dogs and Cats Array Sorted ------");
		
		Arrays.sort(dogsAndCats);
		
		for (int i = 0; i < dogsAndCats.length; i++) {
			System.out.println(dogsAndCats[i].toString());
			dogsAndCats[i].speak();
		}
		
		
		System.out.println();
		
		System.out.println("Dogs and Cats collection Sorted ------");
		
		
		Collections.sort(dogsAndCatsCollection);
		
		for (int i = 0; i < dogsAndCatsCollection.size(); i++) {
			System.out.println(dogsAndCatsCollection.get(i).toString());
			dogsAndCatsCollection.get(i).speak();
		}
		
		
		
		System.out.println();
		
		System.out.println("Dogs and Cats Array Distinct ------");
		
		Animal[] tempArr = new Animal[dogsAndCats.length];
		boolean add = true;
		int addIndex = 0;
		for (int i = 0; i < dogsAndCats.length; i++) {
			for (int j = 0; j < tempArr.length; j++) {
				if ((!(tempArr[j] == null)) && dogsAndCats[i].equals(tempArr[j])) {
					add = false;
					//System.out.println("Breaking because " + dogsAndCats[i].getName() + " is in list already");
				}
			}
			if (add) {
				tempArr[addIndex] = dogsAndCats[i];
				addIndex++;
				//System.out.println("Add Index " + addIndex + " of " + dogsAndCats[i].getName());
			}
			add = true;
		}
		
		for (int j = 0; j < tempArr.length; j++) {
			if (tempArr[j] == null) {
				addIndex = j;
				//System.out.println("Cutoff " + addIndex);
				break;
			}
		}
		
		dogsAndCats = Arrays.copyOf(tempArr, addIndex);
		
		for (int i = 0; i < dogsAndCats.length; i++) {
			System.out.println(dogsAndCats[i].toString());
			dogsAndCats[i].speak();
		}
		
		
		
		System.out.println();
		
		System.out.println("Dogs and Cats collection Distinct ------");
		
		List<Animal> temp = new ArrayList<>();
		for (int i = 0; i < dogsAndCatsCollection.size(); i++) {
			if (!(temp.contains(dogsAndCatsCollection.get(i)))) {
				temp.add(dogsAndCatsCollection.get(i));
			}
		}
		
		dogsAndCatsCollection = temp;
		for (int i = 0; i < dogsAndCatsCollection.size(); i++) {
			System.out.println(dogsAndCatsCollection.get(i).toString());
			dogsAndCatsCollection.get(i).speak();
			
			
		}
		
		
		
	
	}
}
