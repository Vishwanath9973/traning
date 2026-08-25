package day5;

public class duplicate {

	public static void main(String[] args) {
		String word = "programming";
        int[] count = new int[256]; 
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)]++;
        }

        int totalDuplicates = 0;
        
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println("'" + (char)i + "' appears " + count[i] + " times");
                totalDuplicates++;
            }
        }
        
        System.out.println("Total duplicate characters: " + totalDuplicates);
    }
}
 
	