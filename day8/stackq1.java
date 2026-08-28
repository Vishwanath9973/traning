package day8;



	import java.util.LinkedList;
	import java.util.Queue;

	public class stackq1 {

	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 40, 50};
	        int windowSize = 3;

	        Queue<Integer> q = new LinkedList<>();

	        int sum = 0;
	        int maxSum = 0;
	        for (int i = 0; i < arr.length; i++) {

	           
	            q.add(arr[i]);
	            sum = sum + arr[i];

	           
	            if (q.size() == windowSize) {

	                System.out.println("Window: " + q);
	                System.out.println("Sum: " + sum);

	          
	                if (sum > maxSum) {
	                    maxSum = sum;
	                }

	             
	                int removed = q.remove();
	                sum = sum - removed;
	            }
	        }

	        System.out.println("Maximum Sum = " + maxSum);
	        
	        
	    }
	}