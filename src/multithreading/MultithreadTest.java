package multithreading;

public class MultithreadTest{

	public static void main(String[] args) {
		
		A obj1 = new A();
		obj1.start();
		
		B obj2 = new B();
		obj2.start();
	}

}


class A extends Thread
{
	public void display()
	{
		for (int i = 1; i <=10; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public void run()
	{
		display();
	}
	
}


class B extends Thread
{
	public void display()
	{
		for (int i = 1; i <=10; i++) {
			System.out.println("Hello world");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public void run()
	{
		display();
	}
}
