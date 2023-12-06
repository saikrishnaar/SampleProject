package Strings;

public class Distinct_SubStringOfK
{
	public static boolean isUnique(String str)
	{
	int i=0;
	int j=i+1;
	@SuppressWarnings("unused")
	boolean first=false;
	while(i<str.length())
	{
		if(j==str.length()-1)
		{
			j=++i;
		}
		else
		{
			char ch=str.charAt(i);
			char ch1=str.charAt(j+1);
			if(ch==ch1)
			{
				first=true;
			}
			j++;
		}
	}
	if(first=false)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void subString(String str)
	{
		int i=0;
		String res="";
		int j=i;
		int k=2;
		while(i<str.length())
		{
			if(j==str.length())
			{
				j=++i;
				res="";
			}
			else
			{
				char ch=str.charAt(j);
				res=res+ch;
				if(isUnique(res)&&k==res.length())
				{
					System.out.println(res);
				}
				j++;
			}
		}
	}
		public static void main(String[]args)
		{
			subString("abcc");
		}
	}
