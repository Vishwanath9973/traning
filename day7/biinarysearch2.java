package day7;

public class biinarysearch2 {

    public static int binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("checking: " + arr[mid]);

            int comparison = arr[mid].compareTo(target);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;       
            } else {
                right = mid - 1;      
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        String[] names = {"Alice","Bob","Charlie","David","Emma","Frank","Grace","Henry","Ivy","Jack"};

        String target = "Grace";
        int result = binarySearch(names, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}