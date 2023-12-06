package Package;
import java.util.Scanner;
public class option1 {

	public static void TOFB()
	{ 
		Scanner S=new Scanner(System.in);
		System.out.println("choice your health");
		System.out.println("1.kabhoom StrongBeer   -RS:160/each");
		System.out.println("2.kabhoom premiumBeer  -RS:140/each");
		System.out.println("3.kabhoom ultraBeer    -RS:120/each");
		System.out.println("4.kabhoom gasslessBeer -RS:180/each");
		int a=S.nextInt();
		System.out.println("welcome, near to thrill");
		System.out.println("select no.of bottles");
		int b=S.nextInt();
		switch(a)
		{
		case 1:
		int c=b*160;
		System.out.println("Total bill"+ ":"+c);
		 break;
		case 2:
			c=b*140;
			System.out.println("Total bill"+ ":"+c);
			break;
		case 3:
			c=b*120;
			System.out.println("Total bill"+ ":"+c);
			break;
		case 4:
			c=b*180;
			System.out.println("Total bill"+ ":"+c);
			break;
		default:		
				
		}
		System.out.println("addrss");
		String ad=S.next();
		System.out.println("select payment mode");
		System.out.println("1.COD ");
		System.out.println("2.UPI");
		System.out.println("3.CARD");
		int d=S.nextInt();
		m2();
		

	}
	public static void m2()
	{ System.out.println("press 5 for more thrill order");
	System.out.println("press 6 to confirm");
		Scanner S=new Scanner(System.in);
	int s=S.nextInt();
	if(s==5)
	{
		TOFB();
	}
	else if(s==6){
		System.out.println("Order Confirmed 👍");
		System.out.println("thank you 😊 visit again");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      TOFB();
		     
	}

}