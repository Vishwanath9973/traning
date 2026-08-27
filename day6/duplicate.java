

package day6;

public class duplicate {

	public static void main(String[] args) {
		int[] array1 = {10,20,30};
		int[] array2 = {40,30,50,60};
		int[] merged = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++ ) {
			merged[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			merged[array1.length + i] = array2[i];
		}
		
		
		int[] unique = new int[merged.length];
		int uniqueCount = 0;
		
		for (int i = 0; i < merged.length; i++) {
			boolean isDuplicate = false;
			
			for (int j = 0; j < uniqueCount; j++) {
				if (merged[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				unique[uniqueCount] = merged[i];
				uniqueCount++;
			}
		}
		
		System.out.println("Merged Array (without duplicates):");
		for(int i = 0; i < uniqueCount; i++) {
			System.out.println(unique[i]+" ");
		}
	}
}