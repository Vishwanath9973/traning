package day7;

public class floor {

	public static void main(String[] args) {
		int[] sizes = {6, 8, 10, 12, 14};
        int target = 9;
        int start = 0;
        int end = sizes.length - 1;
        int floor = -1;
        int ceil = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sizes[mid] == target) {
                floor = sizes[mid];
                ceil = sizes[mid];
                break;
            } 
            else if (sizes[mid] < target) {
                floor = sizes[mid];    
                start = mid + 1;       

            }
            else {
            	
                ceil = sizes[mid];     
                end = mid - 1;         
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}