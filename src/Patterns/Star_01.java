package Patterns;

public class Star_01 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++)
			if(j==3||i==3&&j!=4||i==4&&j==4||i+j==3)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
