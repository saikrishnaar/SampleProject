package com.oops;

public class employee
{
	String name;
	int age;
	public employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void move()
	{
		System.out.println("empl is moving");
	}
	public void eat()
	{
		System.out.println("empl is eating");
	}
	class developers extends employee
	{
		double sal;
		public developers(String name,int age,double sal)
		{
		super(name,age);
		this.sal=sal;
	}
	   class Mainclass
	{
		public void main (String[]args)
		{
			developers d1=new developers("saiar",23,35000);
			//explicit
			employee e1=(employee)d1;
			//calling the members
			e1.move();
			e1.eat();
			System.out.println(e1.name+" "+e1.age);
		}
	}
}
}

