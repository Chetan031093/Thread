
//java programme on join method utilization.

class Printerr extends Thread
{
	@Override
	public void run()
	{
		for(int i = 1; i<=5;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class Test_Thhreds7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Printerr pp = new  Printerr();
		Printerr pp1 = new  Printerr();
		Printerr pp2 = new  Printerr();
		
		pp.start();
		pp.join();
		
		pp1.start();
		pp1.join();
		
		pp2.start();
		
		
	}
}
