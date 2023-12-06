package Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size=scan.nextInt();
		int [] arr=new int[size];
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Enter the value of Array :");
				arr[i]=scan.nextInt();
			
			} 
		}
		catch(Exception e) {
	    	System.out.println("Entered more values");
	    }
		System.out.println(Arrays.toString(arr));
	}
}
