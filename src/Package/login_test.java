package Package;
import java.util.Scanner;
 class login_test
{
	public Scanner sc;
    String un,ps;
    int a;
	public login_test(Scanner sc)
	{
		this.sc=sc;
		a=sc.nextInt();
		if(a==1)
		{
		insert();
		}
		if(a==2)
		{
			create1.m3();
		}
	}
	public  void insert() {
		System.out.println("enter user name");
		un=sc.next();
		System.out.println("enter password");
		ps=sc.next();
		validation();
	}
	public void validation()
	{     create1 c2=new create1(); 
		if(un.equals(c2.c))
		{
 		   if(ps.equals(c2.c55))
			{
				System.out.println("sucessfully login");
				System.out.println("💕HEARTLY WELCOME💕");
			}
			else {
				System.out.println("wrong password");
                  insert();
			}
		}
		else {
			System.out.println("wrong details try again");
			System.out.println("if you don't have account plzz create account");
			System.out.println("press 2 to create account");
			a=sc.nextInt();
		}
	}
	public static void met()
	{
		System.out.println("press 1 to login");
		 
    Scanner sc=new Scanner(System.in);
    System.out.println("press 2 to create account");
    login_test a=new login_test(sc);
	}
}
 class login {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     login_test.met();
 
        
	}
}
