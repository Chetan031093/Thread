/*
 * programme to show lifecycle between two Thread object.
 */

class Thhreds5 extends Thread
{
	@Override
	public void run()
	{
		String s = Thread.currentThread().getName();
		System.out.println(s+": Running");
	}
}
public class Test_Thhreds5 
{
	public static void main(String[] args) 
	{
		Thhreds5 th5 = new Thhreds5();
		
		Thhreds5 t5 = new Thhreds5();
		
		System.out.println(th5.getName()+" : "+th5.getState());
		

		System.out.println(t5.getName()+" : "+t5.getState());
		
		th5.start();
        System.out.println(th5.getName()+" : "+th5.getState());
		

		System.out.println(t5.getName()+" : "+t5.getState()); 
		
		t5.start();
        System.out.println(th5.getName()+" : "+th5.getState());
		

		System.out.println(t5.getName()+" : "+t5.getState()); 
	}
}
