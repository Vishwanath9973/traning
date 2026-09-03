package day12;

import java.util.Arrays;

public class ZEROlast {

	public static void main(String[] args) {
		int[]arr= {0,1,0,3,12};
		int[]result= new int [arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i] != 0) {
			result[j++]=arr[i];
		}
		}
			System.out.println(Arrays.toString(result));
		}
			
		}

