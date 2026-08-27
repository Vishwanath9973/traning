package day6;

public class assending {

	public static void main(String[] args) {

		    int[] numbers = {3, 1, 2, 4};

		    
		    for (int i = 0; i < numbers.length - 1; i++) {

		        for (int j = i + 1; j < numbers.length; j++) {

		            if (numbers[i] > numbers[j]) {

		                int temp = numbers[i];
		                numbers[i] = numbers[j];
		                numbers[j] = temp;
		            }
		        }
		    }

		    System.out.println("Ascending order:");

		    for (int i = 0; i < numbers.length; i++) {
		        System.out.print(numbers[i] + " ");
		    }
		}

	}


