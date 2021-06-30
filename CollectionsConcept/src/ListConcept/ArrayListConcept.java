package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3]; // static array
		
		// dynamic array -> ArrayList
		//1. can contain duplicate values
		//2. maintains insertion order
		//3. Synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(60);
		System.out.println(ar.size());
		
		//to print all the values from arraylist: for loop
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //generic
		ar1.add(100);
		//ar1.add("C"); 
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>(); // E is used so that we can use all type of elements
		
		//Employee class object
		Employee e1 = new Employee("Suraj", 24, "QA");
		Employee e2 = new Employee("Abhishek", 24, "Dev");
		Employee e3 = new Employee("Deepak", 24, "Market");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();	
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}	
		
		//**************************************************//
		//addALL()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for (int i = 0; i<ar5.size(); i++) {
			
			System.out.println(ar5.get(i));
			
		}
		
		ar5.removeAll(ar6);
		
		for (int i = 0; i<ar5.size(); i++) {
			
			System.out.println(ar5.get(i));
			
		}
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		ar8.add("JavaScript");
		
		ar7.retainAll(ar8);// for common elements
		
		for (int i = 0; i<ar7.size(); i++) {
			
			System.out.println(ar7.get(i));
			
		}
	}

}
