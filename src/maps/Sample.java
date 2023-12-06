package maps;
import java.util.*;
public class Sample {

	public static void main(String[] args) {
		HashMap<Integer , String> hm=new HashMap<>();
		
		hm.put(100, "Iam Waiting For You");
		hm.put(30, "Saiarpi");
		hm.put(10, "Love U");
		hm.put(20, "Mis U");
		hm.put(null , null);
		hm.put(50, null);
		
		System.out.println(hm);
		
		System.out.println("----------------------------------------------------------------------------------");
		HashMap<Integer , String> hm2=new HashMap<>();
		
		hm2.put(100, "Iam Waiting For You");
		hm2.put(30, "Saiarpi");
		hm2.put(10, "Love U");
		hm2.put(20, "Mis U");
		hm2.put(50, null);
		
		System.out.println(hm2);
		
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsValue("Hello"));
		
		hm.remove(10);
		System.out.println(hm);
		
		hm.remove(null , null);
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		
		System.out.println(hm.get(100));
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.equals(hm2));
		System.out.println(hm.hashCode());
		
	}

}
