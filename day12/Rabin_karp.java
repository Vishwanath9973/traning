package day12;

public class Rabin_karp {

	public static void main(String[] args) {
        String text = "ABCCDDAEFG";
        String pattern = "CDD";

        int n = text.length();
        int m = pattern.length();

        int pHash = 0;
        int tHash = 0;

       
        for (int i = 0; i < m; i++) {
            pHash += pattern.charAt(i);
            tHash += text.charAt(i);
        }

       
        for (int i = 0; i <= n - m; i++) {

            if (pHash == tHash) {

                int j;

                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            
            if (i < n - m) {
                tHash = tHash - text.charAt(i)
                              + text.charAt(i + m);
            }
        }
    }



}
		




