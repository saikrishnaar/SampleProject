package Package;
import java.util.Scanner;
public class create1 {
	      static String c;
	      static String c55;
		static boolean bm1=false;
		static boolean bm2=false;
		static boolean bm4=false;
		static boolean bm5=false;
		static boolean bm6=false;
		static boolean bm7=false;
		static boolean bm11=true;
		static boolean bm22=true;
		static boolean bm44=false;
		static boolean bm55=false;
		static boolean bm66=false;
		static boolean bm77=false;
	public static void main(String[] args) {
		
	       m3();
	       
	}
	public static void ag()
	{ 
		if(bm1==false)
		{
			System.out.println("press 1 to enter the name");
		}
		if(bm2==false)
		{
			System.out.println("Press 2 TO ENTER THE MOBILE NO");
		}
		if(bm4==false)
		{
			System.out.println("Press 3 TO ENTER THE Gmail");
		}
		if(bm5==false)
		{
			System.out.println("Press 4 TO ENTER THE Password");
		}
		if(bm6==false)
		{
			System.out.println("Press 5 TO ENTER THE Gender");
		}
		if(bm7==false)
		{
			System.out.println("Press 6 TO ENTER THE Age");
		}
		else
		{
		}
		System.out.println("Press 7 to Submit");
	}
	public static void q()
	{  
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		if(q==2)
		{
			m2();
		}
		else if(q==3)
		{
			m4();
		}
		else if(q==4)
		{
			m5();
		}
		else if(q==5)
		{
			m6();
		}
		else if(q==6)
		{
			m7();	
		}
		else if(q==1)
		{
			m1();
		}
		else if(q==7)
		{
			m8();
		}
		else {
			System.out.println("invalid option");
			System.out.println(" Plzz Enter valid option");
			m3();
		}
	}
	public static void m3() {
		System.out.println("Name");
		System.out.println("Mobile No");
		System.out.println("G-mainId");
		System.out.println("Password");
		System.out.println("Gender");
		System.out.println("age");
		System.out.println("Press 1 TO ENTER THE NAME");
		System.out.println("Press 2 TO ENTER THE MOBILE NO ");
		System.out.println("Press 3 TO ENTER THE G-MAILID");
		System.out.println("Press 4 TO ENTER THE PASSWORD");
		System.out.println("Press 5 TO ENTER THE GENDER");
		System.out.println("Press 6 TO ENTER THE AGE");
		System.out.println("Press 7 TO Submit");
		q();
	
	}
	//STARTED
	public static void m1()
	{   
			int d=1;
			while(d!=0)
			{
			Scanner b=new Scanner(System.in);
			System.out.println("Enter Correct Name");
		    c=b.next();
		int a=c.length();
		if(c.isEmpty())
		{
			bm11=false;
		}
		  boolean b33=true;
			int f=c.length();
			for(int a1=0;a1<f;a1++)
			{
				char ch4=c.charAt(a1);
				if(ch4>=49&&ch4<=57)
				{
					b33=false;
				}
			}
			if(f>3&&b33==true)
			{
				
				bm1=true;
				ag();
				break;
			}
			else
			{
				System.out.println("Name must consist more then 3 cahracters & does no contain any numbers");
				//System.out.println("Plzz Re-Enter the name");
			}
			}
			q();
			
	}
		//if end;
		public static void m2(){
			int d=1;
			while(d!=0)
			{
			Scanner b=new Scanner(System.in);
			System.out.println("Enter Correct MObile No");
		String c22=b.next();
			int f=c22.length();
			if(c22.isEmpty())
			{
				bm22=false;
			}
			boolean b44=false;
			for(int a3=0;a3<f;a3++)
			{
				char ch45=c22.charAt(a3);
				if(ch45>='1'&&ch45<='9')
				{
					b44=true;
				}
				else {
					b44=false;
				}
			}
			if(f==10&&b44==true)
			{
				bm2=true;
				ag();
				break;
			}
			else
			{
				System.out.println("Mobie number must consist 10 characters &does not consist any alphabets");
				//System.out.println("Plzz Re-Enter the Mobile No");
			}	
		}
			q();

			
	}
		//mobile  end
		public static void m4()
		{
				int d=1;
				while(d!=0)
				{
				Scanner b=new Scanner(System.in);
				System.out.println("Enter the G-Mail Id");
			String c44=b.next();
			String t="@gmail.com";
			t.equalsIgnoreCase(c44);
			if(c44.contains(t))
			{  bm4=true;
				ag();
					break;
				}
				else
				{
					System.out.println("mail must consis @gmail.com");
					System.out.println("Plzz Re-Enter the Gmail");
				}
				}
				q();

		}
		//gmail end
		public static void m5()
		{
				int d=1;
				while(d!=0)
				{
				Scanner b=new Scanner(System.in);
				System.out.println("Enter the Password");
			c55=b.next();
			int l=c55.length();
			String c9="@";
			String c8="#";
			String c7="$";
			String c6="&";
			String c5="*";
			  if(c55.contains(c9)||c55.contains(c8)||c55.contains(c7)||c55.contains(c6)||c55.contains(c5))
				{  bm5=true;
					ag();				
					break;
				}
				else
				{
					System.out.println("Password must  Consist Atleast 1 Symbol");
					//System.out.println("Plzz Re-Enter the Password");
				}
				}
				q();


		}
	//Password end
		public static void m6()
		{
				int d=1;
				while(d!=0)
				{
				Scanner b=new Scanner(System.in);
				System.out.println("Enter the Gender");
			String c66=b.next();
			String j="male";
			String K="female";
			String z="other";
			if(c66.contains(j)||c66.contains(z)||c66.contains(z))
				{
				bm6=true;
				ag();
				break;
				}
				else
				{
					System.out.println("Enter any one: male : female : other");
					//System.out.println("Plzz Re-Enter the Gender");
				}
				}
				q();

				
		}
		// Gender ended
		public static void m7()
		{
				int d=1;
				while(d!=0)
				{
				Scanner b=new Scanner(System.in);
				System.out.println("Enter the age");
			String c77=b.next();
			int l1=c77.length();
			int i=Integer.valueOf(c77);
			if(c77.isEmpty())
			{
				bm77=true;
			}
		     int a11=18;
		     int a12=60;
				if(i>=a11&&i<=a12)
				{   bm7=true;
					ag();
					break;
				}
				else
				{
					System.out.println("Enter age in b/w 18 to 60");
					//System.out.println("Plzz Re-Enter the age");
				}
				}
				Scanner sc=new Scanner(System.in);
				q();

				
		}
		public static void m8()
		{    
		  int a=7;
		  while(a==7)
		  {
				if(bm1==false)
				{
					System.out.println("NAME is Mandatory ,Press 1 TO ENTER THE NAME");
			
				}
				if(bm2==false)
				{
					System.out.println("MobileNo  is Mandatory ,Press 2 TO ENTER THE MOBILE NO");
				
				}
				if(bm4==false)
					{
						System.out.println("GmailId is Mandatory,Press 3 TO ENTER THE Gmail");
						
					}
				if(bm5==false)
					{
						System.out.println("Password is Mandatory,Press 4 TO ENTER THE Password");
					
					}
				if(bm6==false)
					{
						System.out.println("Gender is MandatoryPress 5 TO ENTER THE Gender");
						
					}
				if(bm7==false) {
					 System.out.println("Age is Mandatory,Press 6 TO ENTER THE Age");
				 }
				else {
					System.out.println("submitted successfully");
					Object klogin;
				    klogin.met1();
				}
				q();
		       }   
		}
	}
