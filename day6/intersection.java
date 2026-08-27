package day6;

public class intersection {

	public static void main(String[] args) {
		int[] array1 = {60, 70, 80};
        int[] array2 = {70,40, 50, 60};
        
        int[] intersection = new int[array1.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
           
                if (array1[i] == array2[j]) {
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
