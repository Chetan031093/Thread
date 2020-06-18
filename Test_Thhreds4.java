
class Thhreds4 implements Runnable
{
	@Override 
	public void run()
	{
		System.out.println("run method started");
	}
	
}

public class Test_Thhreds4
{
	public static void main(String[] args)
	{
		Thhreds4 th4 = new Thhreds4();
		
		Thread t4 = new Thread(th4);
		
		System.out.println("normal object address : "+th4);
		System.out.println("-----------------------------------");
		
		System.out.println("Thread object Address : "+t4);
		
		t4.start();
		
		System.out.println("state of thread object is : "+t4.getState());
	}
}
