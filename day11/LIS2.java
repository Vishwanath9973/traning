package day11;

public class LIS2 {
	public static void main(String[] args) {

        String str = "abcbd";
        int n = str.length();

        int[] dp = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (str.charAt(j) < str.charAt(i)) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println("LIS Length = " + max);
    }
}