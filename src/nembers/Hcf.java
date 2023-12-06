package nembers;

public class Hcf 
{
	public static int high(int a,int b)
	{
		int c=0;
		for(int i=1;i<=a;i++)
		{
		if(a%i==0&&b%i==0)
		{
			c=i;
			
		}
		
		}
		return c;
	}
	public static void main(String[]args)
	{
		System.out.println( high(50,60));
	}
}
