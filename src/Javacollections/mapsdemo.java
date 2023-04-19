package Javacollections;


import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapsdemo {

	public static void main(String[] args) {
		
		//HashMap : Doesn't maintain order in which element added
		
		Map<Integer,String> hMap = new HashMap<Integer,String>();
		
		hMap.put(0,"Asha");
		hMap.put(5,"Shubham");
		hMap.put(2,"Nikunj");
		hMap.put(1,"Sunil");
		hMap.put(3,"Pranay");
		System.out.println(hMap);
		//Iteration 1
		System.out.println("Iteration over HashMap :");
		
		for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key is "+ key + " and value is "+ value);
		}
		
		//LinkedHashMap :  Maintain order in which element added
		
				Map<Integer,String> lhashMap = new LinkedHashMap<Integer,String>();
				
				lhashMap.put(0,"Asha");
				lhashMap.put(5,"Shubham");
				lhashMap.put(2,"Nikunj");
				lhashMap.put(1,"Sunil");
				lhashMap.put(3,"Pranay");
				System.out.println(lhashMap);
				
				//Iteration 2
				System.out.println("Iteration over LinkedHashMap :");
				
				for (Integer key : lhashMap.keySet()) {
				
					String value = lhashMap.get(key);
				
					System.out.println("Key is "+ key + " and value is "+ value);
				}
				
				//Similarly for TreeMap : Element Added in sorting order
				
				Map<Integer,Integer> tMap = new TreeMap<Integer,Integer>();
				tMap.put(0,5);
				tMap.put(5,15);
				tMap.put(2,0);
				tMap.put(1,3);
				tMap.put(3,-1);
				System.out.println(tMap);
				
				//Iteration 3
				System.out.println("Iteration over TreeMap :");
				
				for (Integer key : tMap.keySet()) {
				
					int value = tMap.get(key);
				
					System.out.println("Key is "+ key + " and value is "+ value);
				}
	}

}
