package nembers;

public class LCM 
{
	public static int lower(int a,int b)
	{
		int c=0;
		for(int i=1;i<=a;i++)
		{
			if(i%a==0&&i%b==0)
			{
				c=i;
			}
		}
		return c;
	}
	public static void main(String[]args)
	{
		System.out.println(lower(20,30));
	}
}
