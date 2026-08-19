package demo;

public class staticv {
	int a=66;
 static int cc=99;
    void m1() {
    	int a=10;
    	System.out.println("aghga"+a);
    }
    public staticv() {
    	int b =10;
    	System.out.println("sdf" + b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		staticv test = new staticv();// object
		test.m1();
		System.out.println("tyhank you"+test.a);
		System.out.println(cc);
		System.out.println(staticv.cc);

		// TODO Auto-generated method stub

	}

}
