package maps;
import java.util.*;
public class HashSetExmple {

	public static void main(String[] args) {
		Map<Integer,String> m1=new LinkedHashMap<>();
		m1.put(100, "Saiarpi");
		m1.put(101, "Chubby Gaa");
		m1.put(102, "Laddu Gaa");
		
		m1.remove(101);
		m1.remove(101,"Chubby Gaa");
		
		System.out.println(m1);
		
		m1.replace(102, "Arpisai");
		
		 System.out.println(m1);
		 
		 Map<Integer,String> m2=new LinkedHashMap<>();
		 m2.put(null, null);
		 m2.putAll(m1);
		 
		 System.out.println(m2);
		
	}

}
