package Patterns;

public class P_alphabet
{

	public static void main(String[] args)
	{
		for (int i=1;i<=6;i++) 
		{
			for(int j=1;j<=6;j++)
			{
			   if((j==1)||(i==1&&j==2)||(i==2&&j==4)||(i==3&&j==4)||
					   (i==4&&j==2)||((i==4||i==1)&&j==3))
			    {
			    	System.out.print("*");
			    }
			    else
			    {
			    	System.out.print(" ");
			    }
			}
			 System.out.println();
		}
	}
}