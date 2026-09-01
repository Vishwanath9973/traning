package day10;
import java.util.Collections;
import java.util.PriorityQueue;

public class heap5 {

	public static void main(String[] args) {
		 int[] arr = {10, 5, 20, 8, 15, 3, 25};

	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        PriorityQueue<Integer> maxHeap =
	                new PriorityQueue<>(Collections.reverseOrder());

	        for (int num : arr) {
	            minHeap.add(num);
	            maxHeap.add(num);
	        }

	        int min = minHeap.peek();

	        int max = maxHeap.peek();

	        for (int i = 0; i < arr.length / 2; i++) {
	            minHeap.poll();
	        }

	        int median = minHeap.peek();

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	        System.out.println("Median: " + median);
	}

}
