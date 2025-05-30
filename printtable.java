package demo;

interface printtable1
{
	void print();
}
class Message implements printtable1
{
	public void print()
	{
		System.out.println("hello interfcae");
	}
}
public class printtable {
	public static void main(String[] args)
	{
		Message msg=new Message();
		msg.print();
	}
}
