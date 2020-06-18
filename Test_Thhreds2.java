

/*
 * Second type to create Thread object.---------by implementing Runnable interface.
 */
class Thhreds2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println("hi");
	}
}




public class Test_Thhreds2 
{
	public static void main(String[] args)
	{
		Thhreds2 th1 = new Thhreds2();
		
		Thread t = new Thread(th1);
		t.start();
	}
}
