package demo;
 interface message1{
	 void say();
 }

public class LambdaExample {
public static void main(String[] args)
{
	message1 hellomessage=() -> System.out.println("this is Lambda interface");
	hellomessage.say();
}
}
