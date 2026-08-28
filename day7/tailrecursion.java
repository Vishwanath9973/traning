package day7;

public class tailrecursion {
	static void count (int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		count(n-1);
	}

	public static void main(String[] args) {
		System.out.println("asrasdf");
		count(5);
		System.out.println("asrasdfs");

	}

}
