package day6;
import java.util.Arrays;
public class duplicate2 {

	public static void main(String[] args) {
		String[] arr1 = {"aunty", "brother", "sister"};
	     String[] arr2 = {"brother", "grandpa", "aunty", "mother"};
	     String[] temp = new String[arr1.length + arr2.length];
	     int count = 0; 
	     for (int i = 0; i < arr1.length; i++) {
	          boolean isDuplicate = false;
	          for (int j = 0; j < count; j++) {
	              if (temp[j].equals(arr1[i])) {
	                  isDuplicate = true;
	                  break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[count] = arr1[i];
	                count++;
	            }
	        }       
	        for (int i = 0; i < arr2.length; i++) {
	            boolean isDuplicate = false;
	            
	            
	            for (int j = 0; j < count; j++) {
	                if (temp[j].equals(arr2[i])) {
	                    isDuplicate = true;
	                    break;
	                }
	            }            
	            if (!isDuplicate) {
	                temp[count] = arr2[i];
	                count++;
	            }
	        }	       
	        String[] union = new String[count];
	        for (int i = 0; i < count; i++) {
	            union[i] = temp[i];
	        }	        
	        System.out.println("Union Array: " + Arrays.toString(union));

	}

}
