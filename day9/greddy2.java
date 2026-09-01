package day10;

public class greddy2 {

	public static void main(String[] args) {
        int[] start =  {9, 10, 11, 12, 1, 2};
        int[] finish = {10, 11, 12, 1, 2, 3};

        int lastFinish = finish[0];

        System.out.println("Selected Appointments:");
        System.out.println("Appointment 1");

        for (int i = 1; i < start.length; i++) {

            if (start[i] >= lastFinish) {

                System.out.println("Appointment " + (i + 1));

                lastFinish = finish[i];
            }
        }



	}

}
