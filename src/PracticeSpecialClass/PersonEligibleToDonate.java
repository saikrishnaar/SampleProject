package PracticeSpecialClass;

public class PersonEligibleToDonate {
	public static void eligibleforblood(int age,double weight)
	{
		if((age>=18&&age<=65)&&(weight>=50))
		{
			System.out.println("Eligible For Blood Donate");
		}
		else
		{
			System.out.println("Not Eligible For Blood Donate");
		}
	}
	 
	public static void ramwantsbuyshirt(int price, String color , char size)
	{
		if((price==1000) && color.equals("green")&&(size=='m'))
		{
			System.out.println("Ok You Can Buy");
		}
		else
		{
			System.out.println("You Can't Buy");
		}
	}
	
	public static void Saiarpithwanttobuymobail(int price,String brand,String color,int ram,int rom)
	{
		if((price==20000 && brand.equals("MI")&& color.equals("Black")&& ram==4&&rom==32))
		{
			System.out.println("Ok You Can Buy");
		}
		else
		{
			System.out.println("You Can't Buy");
		}
	}
	
	public static void numbers4(int a,int b, int c,int d)
	{
		if(a==b&&b==c&&c==d)
		{
			System.out.println("They Are Equal");
		}
		else
		{
			System.out.println("They Are Not Equal");
		}
	}
	
	public static void ASCII()
	{
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch+0);
		}
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+0);
		}
	}
	
	public static void sumofnaturals(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	public static void sumofdivisors(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("sumof"+sum);
	}
	public static void Febonoccinumber()
	{
		int a= 0;
		int b=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
	}
	
	public static void perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}
	public static void main(String[] args) {
		eligibleforblood(26 , 56);
		ramwantsbuyshirt(1000,"green",'m');
		Saiarpithwanttobuymobail(20000,"MI","Black",4,32);
		numbers4(1,1,10,6);
		ASCII();
		sumofnaturals(3);
		sumofdivisors(6);
		Febonoccinumber();
		perfect(6);
		
	}

}
