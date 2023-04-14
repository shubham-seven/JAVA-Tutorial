package Javacollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Setsdemo {

	public static void main(String[] args) {
	
		//HashSet
		Set<String> hSet = new HashSet<String>();
		hSet.add("Apple");
		hSet.add("Banana");
		hSet.add("code");
		System.out.println(hSet);
		
		//LinkedHashSet
				Set<String> lhSet = new LinkedHashSet<String>();
				lhSet.add("Apple");
				lhSet.add("Banana");
				lhSet.add("code");
				System.out.println(lhSet);
				for (String item : lhSet) {
					System.out.println(item);
				}
				
				//TreeSet
				Set<Integer> tSet = new TreeSet<Integer>();
				tSet.add(1);
				tSet.add(12);
				tSet.add(8);
				System.out.println(tSet);
	}

}
