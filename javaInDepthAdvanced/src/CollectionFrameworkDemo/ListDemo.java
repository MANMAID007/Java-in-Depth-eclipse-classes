package CollectionFrameworkDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	private static List<Integer> arrayListDemo() {
		// Collection<Integer> list1 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(4);
		list1.add(1);
		list1.add(1);
		list1.add(3);
		list1.add(45);
		list1.add(null);
		System.out.println("list1: " + list1);
		list1.remove(4);
		System.out.println("list1: " + list1);
		list1.add(2, 400);
		System.out.println("list1: " + list1);
		list1.set(3, 6);
		System.out.println("list1: " + list1);

		// Bulk operation
		Collection<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(45);
		list1.removeAll(list2);
		System.out.println("list1: " + list1);
		list2.add(1);
		list1.retainAll(list2);
		System.out.println("list1: " + list1);
		list1.addAll(list2);
		System.out.println("list1: " + list1);
		System.out.println("list1.set(2, 2): " + list1.set(2, 2));
		System.out.println("list1: " + list1);

		// Search
		System.out.println("list1.contains(1): " + list1.contains(1));
		System.out.println("list1.indexOf(1): " + list1.indexOf(1));
		System.out.println("list1.lastIndexOf(1): " + list1.lastIndexOf(1));
		System.out.println("list1: " + list1);

		// Range-view: subList (new list is backed by original)
		List<Integer> list3 = list1.subList(2, 3);
		list3.set(0, 6);
		System.out.println("list1: " + list1);
		list3.add(0, 7);
		System.out.println("list1: " + list1);
		list1.set(2, 8);
		System.out.println("list3: " + list3);
		// list1.add(0, 8);
		// System.out.println("list3: " + list3);
		System.out.println("list1: " + list1);
		
		for (int element : list1) {
			System.out.println("element: " + element);
			
			// Generates ConcurrentModificationException
			/*if (element == 8) {
				list1.remove(Integer.valueOf(element)); // valueOf is used due to its caching
			}*/ // gives error
		}
		
		return list1;
	}

	public static void main(String[] arg) {
		//List<Integer> list1 = arrayListDemo();
		//iteratorDemo(list1);
		listIteratorDemo();
	}

	private static void iteratorDemo(List<Integer> list1) {
		System.out.println("\nInside iteratorDemo...");
		
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element: " + element);
			
			if (element == 8) {
				iterator.remove();
			}
		}
		System.out.println("list1: " + list1);
	}
	
	static void listIteratorDemo() {
		  System.out.println("\n\nInside listIteratorDemo ...");
	      List<String> list = new ArrayList<>();
	      list.add("a");
	      list.add("b");
	      list.add("c");
		  	  
	      System.out.println("\nDisplaying current elements ... ");
	      for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
	          System.out.println("iterator.nextIndex: " + iterator.nextIndex() + ", iterator.next: " + iterator.next());	  
	      }
	      
	      System.out.println("\nDemonstrating add, remove, and set operations ... ");
	      for (ListIterator iterator = list.listIterator(); iterator.hasNext();) {
	          System.out.println("iterator.nextIndex: " + iterator.nextIndex() + ", iterator.next: " + iterator.next());
			  if (iterator.nextIndex() == 1) {
				  System.out.println("*** Adding test at index 1");
				  iterator.add("test");
				  System.out.println("iterator.nextIndex: " + iterator.nextIndex() + ", iterator.next: " + iterator.next());
				  
				  System.out.println("Removing test that was added at index 1");
				  iterator.previous(); // "b"
				  iterator.previous(); // "test"				  
				  iterator.remove();   // remove "test"
				  
				  // Uncommenting below line gives an IllegalStateException as 
				  // set should be preceded by next/previous/set
				  //iterator.set("test");
				  System.out.println("iterator.nextIndex: " + iterator.nextIndex() + ", iterator.next: " + iterator.next());
				  System.out.println("Setting element at index 1 as test");
				  iterator.set("test");
				  System.out.println("Setting element at index 1 as test1 to show that two set operations can be invoked sequentially");
				  iterator.set("test1");
			 }  	  
	      }	 
	      
	      System.out.println("\nDisplaying current elements ... ");
	      for (ListIterator iterator = list.listIterator(); iterator.hasNext();) {
	          System.out.println("iterator.nextIndex: " + iterator.nextIndex() + ", iterator.next: " + iterator.next());	  
	      }
	  }

}

