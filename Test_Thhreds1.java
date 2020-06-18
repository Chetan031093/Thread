
/*
 * first type to create Thread object.---------by extending Thread class.
 */


class  Thhreds1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread());
		System.out.println("hiiii");
	}
}



public class Test_Thhreds1 extends Thread
{
	public static void main(String[] args)
	{
		Thhreds1 th = new Thhreds1();
		th.start();
	}

}
