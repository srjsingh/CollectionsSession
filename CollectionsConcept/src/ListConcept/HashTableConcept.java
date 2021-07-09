package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// it is similar to hashmap, but it is synchronised
		// stores the value on the basis of key-val
		// key--> Object--HashCode --> value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		// create a clone copy/shallow copy:
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable) h1.clone();
		
		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);
		
		h1.clear();
		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);
		
		//contains value:
		
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen"))
			System.out.println("Value is found");
		
		//print all the values from hashtable using -- Enumeration -- elements()
		Enumeration e = st.elements();
		System.out.println("print values from st using enumeration");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entryset() -- set of hashtable values:
		
		System.out.println("print values from st using entry set");
		
		Set s = st.entrySet();
		System.out.println(s);

		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");// it contains only unique values
		//no null key and null values
		//st1.put("D", null); //null pointer exception
		System.out.println("values from st1 : ");
		System.out.println(st1);
		
		//check both the hashtable are equal or not
		if(st.equals(st1))
			System.out.println("both are equal");
		
		//get the value from a key:
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable object:
		System.out.println("the hashcode value of st1 : " + st1.hashCode());
		
		//generics:
		Hashtable<String, String> st3 = new Hashtable<String, String>();
		
		
		
	}

}
