package demo;
class Calcuator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int c,int d)
	{
		return c-d;
	}
	int mul(int e,int f)
	{
		return e*f;
	}
}
public class overloading {

	public static void main(String[] args) {
		Calcuator sc=new Calcuator();
		System.out.println(sc.add(10,20));
		System.out.println(sc.sub(20,10));
		System.out.println(sc.mul(30, 10));
		System.out.println(sc.add(10,34)+sc.sub(30, 23)+sc.mul(45,2));
	}

}
