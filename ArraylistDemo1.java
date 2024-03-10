package list;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo1 {
	public static void main(String[] args) {
		
//		List l1 = new ArrayList();
//		
//		l1.add("Parsad");
//		l1.add(12);
//		l1.add("Pune");
//		l1.add(99);
//		
//		System.out.println(l1);
//		System.out.println(l1.size());

		
		List<String> l1 = new ArrayList<String>();
		
		l1.add("Prasad");
		l1.add("Nimish");
		l1.add("Shrushti");
		l1.add("sid");
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.get(2));
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Pramod");
		l2.add("Abhishek");
		l2.add("Shraddha");
		l2.add("Ayush");
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		l1.add(2, "Amol");
		System.out.println(l1);
		
		
		
		System.out.println(l1.add("Aboli"));
		System.out.println(l1);
		
		System.out.println(l1.contains("Lakhan"));
		System.out.println(l1.containsAll(l2));
		
		
		
		
		
		List<String> l3 = new ArrayList<String>();
		l3.add("Pramod");
		l3.add("Abhishek");
		l3.add("Raj");
		l3.add("Ayush");
		System.out.println(l3);
		
		System.out.println(l3.equals(l2));
		System.out.println(l3.equals(l1));
		
		System.out.println(l1.isEmpty());
		l3.clear();
		System.out.println(l3.isEmpty());
		
		l1.add("Nimish");
		System.out.println(l1);
		System.out.println(l1.lastIndexOf("Nimish"));
		
		l1.remove(10);
		System.out.println(l1);
		
		System.out.println(l1.indexOf("Abhishek"));
		
		
		l1.retainAll(l2);
		System.out.println(l1);
		
		
	
		
		
		
		
	}

}
