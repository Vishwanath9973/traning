package day3;

class resource{
	synchronized void m1(resource r) {
		System.out.println(Thread.currentThread().getName()+" entered m1");
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(Thread.currentThread().getName()
				+ "is waiting for m2");
		r.m2();
	}
	synchronized void m2() {
		System.out.println(Thread.currentThread().getName()
				+"entered m2");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
	}
}

public class deadlock {

	public static void main(String[] args) {
		resource r1=new resource();
		resource r2=new resource();
		
		Thread t1=new Thread(()->{
			r1.m1(r2);
		}, "Thread 1");
		Thread t2=new Thread(()->{
			r2.m1(r1);
		}, "Thread 2");
		t1.start();
		t2.start();
		

	}

}
