package day2;
class parent
{
   int a =10;
		   int b =20;
}

public class super1 extends parent {
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		super1 jj=new super1();
		jj.add(2,3);
		// TODO Auto-generated method stub

	}

}
