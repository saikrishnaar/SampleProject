package Collections;
import java.util.*;
public class Examle1 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		ListIterator<Integer> li=al.listIterator();
		while(li.hasNext()==true)
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious()==true)
		{
			System.out.println(li.previous());
		}
	}

}
