package demo;

public class fib {
	static void fib(int n) {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }

	public static void main(String[] args) {
		fib a=new fib();
		System.out.println(a.fib(3));
		
		

	}
		// TODO Auto-generated method stub

	}

}
