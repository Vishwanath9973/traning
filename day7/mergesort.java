package day7;

public class mergesort {
	static void mergeSort(int[] a,int left, int right) {
		if(left >= right)
			return;
		int mid = (left + right)/2;
		mergeSort(a, left,  mid);
		mergeSort(a, mid+1,right);
		int[] temp = new int[right - left + 1];
		int i = left,j=mid+1,k=0;
		while(i<=mid && j<=right)
			temp[k++]=a[i] <a[j] ? a[i++]:a[j++];
		while(i<=mid)
			temp[k++]=a[i++];
		while(j<=right)
			temp[k++]=a[j++];
		for(i=0;i<temp.length;i++)
			a[left+i]=temp[i];
		
						
	}

	public static void main(String[] args) {
		int[] marks = {80,45,60,30,90,20,70,50};
		mergeSort(marks,0,marks.length-1);
		for(int mark : marks)
			System.out.println(mark +" ");
			
	}

}
