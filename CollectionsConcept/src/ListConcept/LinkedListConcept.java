package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print
		System.out.println("Concept of LInkedList: " + ll);
		//addFirst
		ll.addFirst("Suraj");
		//addLast
		ll.addLast("Singh");
		System.out.println(ll);
		
		//get:
		System.out.println(ll.get(4));
		
		//set:
		ll.set(0, "Automation");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Concept of LinkedList: " + ll);
		
		ll.remove(2);
		System.out.println("Concept of LinkedList: " + ll);
		
		//how to print all the values of LinkedList:
		//for loop
		
		System.out.println("using for loop");
		for(int n=0; n<ll.size(); n++) {
			
			System.out.println(ll.get(n));
			
		}
		
		//advance loop
		
		System.out.println("using advance loop");
		for(String str : ll) {
			
			System.out.println(str);
			
		}
		
		//iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		//while loop
		int num=0;
		while(ll.size()>num) {
			
			System.out.println(ll.get(num));
			num++;
			
		}
	}

}
