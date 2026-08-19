package day2;

class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}

public class overriding extends Parents {
	void marry()
	   {
		   System.out.println("campus selected girl/boy");
	   }
	

	public static void main(String[] args) {
		overriding test = new overriding();// object
		test.marry();
		test.property();
		// TODO Auto-generated method stub

	}

}
