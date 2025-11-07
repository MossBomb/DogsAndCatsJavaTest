
public class LinkedListAnimal {
	
	private static class Node {
		
		public Animal data;
		
		public Node next;
		
		
		public Node(Animal a, Node n) {
			data = a;
			next = n;
		}
		
		public Node(Animal a) {
			this(a, null);		
		}
		
		public Node() {
			this(null, null);
		}
	}
	
	private int size;
	
	private Node head;
	
	private Node tail;
	
	public LinkedListAnimal() {
		
		head = new Node();
		tail = head;
		size = 0;

	}
	
	public int size() {
		return size;
	}
	
	public void addLast(Animal element) {
		tail = new Node(element);
		size++;
	}
}
