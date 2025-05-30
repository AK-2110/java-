package demo;
abstract class Machine
{
	abstract void ATM();
}
class Bank extends Machine
{
	void ATM()
	{
		System.out.println("ATM using java with pro");
	}
}
public class abstractex {
	public static void main(String[] args)
	{
		Bank bs=new Bank();
		bs.ATM();
	}

}
