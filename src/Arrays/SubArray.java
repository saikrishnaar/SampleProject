package Arrays;

import java.util.Iterator;

public class SubArray {

	public static void main(String[] args) {
		char[]a= {'s','a','i','a','r','p','i'};
		char maxsum=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{
				for (int k = i; k <=j; k++) 
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
