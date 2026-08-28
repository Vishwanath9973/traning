package day8;

public class circularqueue {
	static int[] queue = new int[5];
	static int front = -1;
	static int rear = -1;
	static int size = 5;


	static void enqueue(int value) {
		
		if ((rear + 1) % size == front) {
			System.out.println("Queue is full");
			return;
		}
		
		
		if (front == -1) {
			front = 0;
			rear = 0;
		} else {
			
			rear = (rear + 1) % size;
		}
		
		queue[rear] = value;
		System.out.println(value + " added");
	}

	
	static void dequeue() {
		
		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println(queue[front] + " removed");
		
		
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
					front = (front + 1) % size;
		}
	}

	
	static void display() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("Queue available elements:");
		int i = front;
		while (i != rear) {
			System.out.print(queue[i] + " ");
			i = (i + 1) % size;
		}
		
		System.out.print(queue[rear]);
		System.out.println();
	}

	public static void main(String[] args) {
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		display();
		
		dequeue();
		display();
		
		enqueue(60); 
		display();
	}
}


	
