package demo;
class Boat implements Runnable
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("BMW car moving"+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Bus implements Runnable
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("Ninja Bike moving"+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}


public class runnable1 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Boat());
		t1.start();
		Thread t2=new Thread(new Bus());
		t2.start();


	}

}
