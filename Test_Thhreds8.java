class Accnt
{ 
	double accbal = 5000;
	double amt;
	synchronized public void widrw(double amt)
	{
		System.out.println("accbal is : "+accbal);
		System.out.println("widraw amt is :"+amt);
		if(accbal<amt) 
		{
			System.out.println("sorry insufficent bal");
			System.out.println("wait for deposit");
			try 
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				
			}
		}
		accbal = accbal-amt;
		System.out.println(amt+ ":widrawn successfully" );
		System.out.println("avialable balance is "+accbal);
	}
	synchronized public void deposit(double amt)
	{
		System.out.println("depositing amount is :"+amt);
		accbal= accbal+amt;
		System.out.println("avialable blc is :"+accbal);
		notify();
	}
}

class deposiit extends Thread
{
	Accnt a1;
	double amt;
	deposiit(Accnt a1,double amt)
	{
		this.a1 = a1;
		this.amt = amt;
	}
	
	@Override
	public void run()
	{
		a1.deposit(amt);
	}
	
}

class widrw extends Thread
{
	Accnt a1;
	double amt;
	widrw(Accnt a1,double amt)
	{
		this.a1 = a1;
		this.amt = amt;
	}
	
	@Override
	public void run()
	{
		a1.widrw(amt);
	}
}
public class Test_Thhreds8
{
	public static void main(String[] args)
	{
		Accnt a1 = new Accnt();
		
		widrw w1 = new widrw(a1, 8000);
		w1.start();
		
		deposiit d1 = new deposiit(a1, 8000);
		d1.start();
	}
}
