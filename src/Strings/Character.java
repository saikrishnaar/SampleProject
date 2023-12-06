package Strings;

public class Character 
{
	public static void characterpresent(String S)
	{
		String s="saiarpith";
		String res="";
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			boolean  present=false;
			for(int j=0;j<res.length()-1;j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1)
				{
					present=true;
				}
			}
			if(present!=true)
			{
				res=res+ch;
			}
		}
		System.out.println(res);
		
	}

}
