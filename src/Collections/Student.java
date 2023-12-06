package Collections;
import java.util.*;
class Student1
{
	private String name;
	private int age;
	public Student1(String name,int age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
	
	public  class Student
	{
		public static void main(String[] args) 
		{
			 ArrayList<Student1> s =new ArrayList<>();
			 Student1 s1=new Student1("Arpi",23);
			 Student1 s2=new Student1("Sai",27);
			 Student1 s3=new Student1("Akash",22);
			 
			s.add(s1);
			s.add(s2);
			s.add(s3);
			for (int i = 0; i < s.size(); i++) 
			{
				System.out.println(s.get(i).getName());
			}
		}
	}
		