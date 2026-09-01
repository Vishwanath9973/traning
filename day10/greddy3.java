package day10;

public  class greddy3 {

	public static void main(String[] args) {
		int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 19, 27, 25, 15};

        boolean[] slot = new boolean[3];

        int totalProfit = 0;

        int[] order = {0, 2, 3, 1, 4};

        System.out.println("Selected Jobs:");

        for (int i : order) {

            for (int j = deadline[i] - 1; j >= 0; j--) {

                if (!slot[j]) {

                    slot[j] = true;
                    totalProfit = totalProfit + profit[i];

                    System.out.println("Job " + (i + 1) + " selected");

                    break;
                }
            }
        }

        System.out.println("Total Profit = " + totalProfit);
    }

		
		
		
		

	}


