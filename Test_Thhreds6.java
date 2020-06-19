
// java programme on multithreading.


class Thhreds6 extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("exception handled");
			}
		}
	}
}

public class Test_Thhreds6 
{
	public static void main(String[] args)
	{
		Thhreds6 th6 = new Thhreds6();
		Thhreds6 th66 = new Thhreds6();
		Thhreds6 th666 = new Thhreds6();
		
		th6.start();
		th66.start();
		th666.start();
	}
}
