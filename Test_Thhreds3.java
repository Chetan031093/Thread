/*
 * Programme to show Properties of Thread Object.
 */

class Thhreds3 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("run method starts");
		System.out.println(Thread.currentThread()); 
		
	}
}

public class Test_Thhreds3 
{
	public static void main(String[] args)
	{
		Thhreds3 th3 = new Thhreds3();
		th3.start();
		
		System.out.println("id : "+th3.getId());
		
		System.out.println("Name : "+th3.getName());
		th3.setName("Chetan");
		
		
		System.out.println("priority : "+th3.getPriority());
		th3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("priority : "+th3.getPriority());
		
		
		System.out.println("state : "+th3.getState());
		
		System.out.println("is Demon : "+th3.isDaemon());
		th3.setDaemon(true);
		System.out.println("is Demon : "+th3.isDaemon());
		
		System.out.println("is alive : "+th3.isAlive());
		
		System.out.println();
	}
}
