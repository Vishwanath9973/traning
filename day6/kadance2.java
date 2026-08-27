package day6;

public class kadance2 {

	public static void main(String[] args) {
		int[] profit = {103,342,-876,444,996,- 983,261};
		int currentProfit = 0;
		int bestProfit = 0;
		for (int i = 0; i< profit.length; i ++) {
			currentProfit = currentProfit + profit[i];
			if(currentProfit < 0) {
				currentProfit = 0;
			}
			if (currentProfit > bestProfit) {
				bestProfit = currentProfit;
			}
		}
		System.out.println("Maximum Profit = " + bestProfit);


	}

}
