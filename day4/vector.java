package day4;

public class vector {

	public static void main(String[] args) {
		Vector vector = new Vector();
		/* creates a vector object with capacity  5 and when over-filled will increment by 5*/
	//	Vector vector = new Vector(5);	
		/* creates a vector object with capacity  5 and when over-filled will increment by 3*/
	//	Vector vector = new Vector(5,3);
		/*adding 10 elements*/
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");
		vector.add("A");

		/*adding 11th element*/
		vector.add("A");
		
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
		
		vector.trimToSize();
		
		System.out.println("After trimming......");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
		// TODO Auto-generated method stub

	}

}
