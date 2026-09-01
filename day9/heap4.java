package day10;
import java.util.PriorityQueue;

public class heap4 {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);

        int size = minHeap.size();

        for (int i = 0; i < (size - 1) / 2; i++) {
            minHeap.poll();
        }

        int first = minHeap.poll();

        double median = (size % 2 == 0)
                ? (first + minHeap.peek()) / 2.0
                : first;

        System.out.println("Median: " + median);
    }
}
