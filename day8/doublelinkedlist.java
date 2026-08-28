package day8;

public class doublelinkedlist {
	static class Node {
		int data;
		Node previous;
		Node next;
		Node(int data) {
			this.data = data;
		}
		
	}

	public static void main(String[] args) {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		first.next = second;
		second.next = third;
		second.previous = first;
		third.previous = second;
		Node current = first;
		System.out.println("Forward:");
		while (current != null) {
			System.out.println(current.data +" ");
			current = current.next;
		}
		current = third;
		System.out.println("\nBackward:");
		while(current != null) {
			System.out.println(current.data +" ");
			current = current.previous;
		}
		

	}

}
