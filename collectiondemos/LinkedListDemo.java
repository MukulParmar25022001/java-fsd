package collectiondemos;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cities = new LinkedList<>();
		cities.add("london");
		cities.add("paris");
		cities.add(2,"delhi");
		cities.add("mumbai");
		System.out.println(cities.size());
		Iterator itr = cities.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		

	}

}
