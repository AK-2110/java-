package demo;

public class array {
	public void profile()
	{
		int [] num= {10,20,30,40};
		int [] num1= {20,30,40,50};
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num1.length;j++)
			{
				
			System.out.println(num[i]+num1[j]);
		}
		}
	}
	public static void main(String[] args)
	{
		array ob=new array();
		ob.profile();
	}
	
}
