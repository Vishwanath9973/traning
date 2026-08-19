package day2;

public class ex6 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}


	public static void main(String[] args) {
		ex6 d=new ex6();
		d.m1(4, 5);
		d.m2();
		// TODO Auto-generated method stub

	}

}
