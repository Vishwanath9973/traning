package day6;

public class intersection2 {

	public static void main(String[] args) {
		String[] array1 = {"aunty", "brother", "sister"};
	     String[] array2 = {"sister", "dad", "aunty", "uncle"};        
	     String[] intersection = new String[array1.length];
	     int count = 0; 
	     for (int i = 0; i < array1.length; i++) {
	         for (int j = 0; j < array2.length; j++) {	             
	             if (array1[i].equals(array2[j])) {
	                 intersection[count] = array1[i];
	                 count++;
	                 break; 
	                }
	            }
	        }

	        System.out.println("Intersection array: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(intersection[i] + " ");
	        }
		

	}

}
