//java programme on Thread Synchroized operation. 



class Printer 
{
	synchronized void print()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("exception handled");
			}
		}
	}
}

class Printer_Mchine extends Thread
{
	Printer p1 ; 
	
	Printer_Mchine(Printer p1)
	{
		this.p1 = p1;
	}
	
	@Override
	public void run()
	{
		p1.print();
	}
}

public class Test_Printer
{
	public static void main(String[] args) throws InterruptedException
	{
		Printer p1 = new Printer();
	
		Printer_Mchine user1 = new Printer_Mchine(p1);
		Printer_Mchine user2 = new Printer_Mchine(p1);
		Printer_Mchine user3 = new Printer_Mchine(p1);
		
		user1.start();
		//user1.join(); // alternative for sysnchronized keyword
		
		user2.start();
		//user2.join(); // alternative for sysnchronized keyword
		
		user3.start();
	}
}
