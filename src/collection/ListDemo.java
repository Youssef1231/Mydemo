package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {


	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		//iterator
//		Iterator it = li.iterator();
//		while (it.hasNext()) {
//			int i = (Integer)it.next();
//			System.out.println(i);
		//reinforced for loop
		for (Object obj : li) {
			System.out.println(obj);
		}
		}
	}
