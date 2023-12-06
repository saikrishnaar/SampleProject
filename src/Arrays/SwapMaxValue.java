package Arrays;

import java.util.Arrays;

public class SwapMaxValue {

	public static void main(String[] args) {
		int [] a= {24,543,6,56,2,4};
		
		for(int i=0;i<a.length-1;i++) {
			int ele=a[i];
			if(ele>a[i+1]) {
				
				a[i]=a[i+1];
				a[i+1]=ele;
				
	        }
		}
		System.out.println(Arrays.toString(a));
	}
}
