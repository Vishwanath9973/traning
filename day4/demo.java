package day4;

public class demo {

	public static void main(String[] args) {
		int n=100000;
		int[] students=new int[n];
		
		for(int i=0; i<n; i++) {
			students[i]=i+1;
			
		}
		int target=1000;
		boolean found=false;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (students[j]==target){
					found = true;
                    System.out.println("Found at index " + j);
                    break;
				}
			}
			 if (found) {
	                break;
	            }
		}
		 if (!found) {
	            System.out.println("Not found");
		 }

	}

}
