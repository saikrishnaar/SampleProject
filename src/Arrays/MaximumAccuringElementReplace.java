package Arrays;

import java.util.Arrays;

public class MaximumAccuringElementReplace {

	public static void main(String[] args) {
		int[]a= {1,3,5,3,4,1,3};
		int c1=0;
		int e1=a[0];
		for(int i=0;i<a.length;i++)
		{
			int ele=a[i];
			if(max(ele,a)>c1)
			{
				c1=max(ele,a);
				e1=ele;
			}
		}
		int[]res=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int ele2=a[i];
			if(ele2==e1)
			{
				res[i]=0;
			}
			else
			{
				res[i]=ele2;
			}
		}
		System.out.println(Arrays.toString(res));
	}

	private static int max(int ele, int[] a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				c++;
			}
		}
		return c;
	}
}
