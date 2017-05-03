package methodOverride;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hello");
		ll.add("Welcome");
		ll.add("Happy");
		System.out.println("here is linkedlist" +ll);
		
		//Iterator
		for (String s : ll)
		{
			System.out.println("Iterator "+s);
		}
		
		//Iterator using Iterator
		Iterator iLL = ll.listIterator(1);
		while(iLL.hasNext())
		{
			System.out.println("Iterator from 1st : "+iLL.next());;
		}
		
		//Reverse Iterator
		Iterator DescILL = ll.descendingIterator();
		while(DescILL.hasNext())
		{
			System.out.println("Reverse Iterator : "+DescILL.next());
		}
		//add element at a specific position, first, last, offerFirst=infront of LL, offerLAst = at the end
		ll.add(1, "Good");
		ll.addFirst("FIRST");
		ll.addLast("LAST");
		ll.offerFirst("im offer");
		ll.offerLast("Im offer last");
		System.out.println(ll);
		
		//add list to a list
		LinkedList<String> ll2= new LinkedList<String>();
		ll2.add("fromlist2");
		ll2.add("fromlist2");
		ll2.add("fromlist2");
		System.out.println(ll.addAll(ll2));
		
		//get first and last element
		System.out.println("get First "+ll.getFirst());
		System.out.println("get Last "+ll.getLast());
		
		//print index and value
		for(int i=0; i<ll.size();i++)
		{
			System.out.println("Index "+i+ "Value" +ll.get(i));
		}
		
		//Remove from specific index
		ll.remove(2);
		ll.removeLast();
		ll.removeFirst();
		ll2.clear();
		ll2.removeAll(ll2);
		
		//Swap elements
		System.out.println(ll);
		Collections.swap(ll, 2, 4);
		System.out.println("After Swap"+ll);
		//shuffle
		Collections.shuffle(ll);
		System.out.println("After Shuffle"+ll);
		
		//remove and return first element - pop
		//return first element peek
		System.out.println("Remove and return first element "+ll.poll());
		System.out.println("return first "+ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		//element Exist
		if(ll.contains("LAST"))
		{
			System.out.println("Im Last");
			System.out.println("Im Git it is"    njnjk
		}
		else System.out.println("im not found");
		
		//Convert to Array list 
		List<String> al = new ArrayList<String>(ll);
		for (String a: al)
		{
			System.out.println("ArrayList "+al);
		}
		
		//compare two linked list
		 LinkedList<String> c3 = new LinkedList<String>();
		 for (String e : ll){
		 c3.add(al.contains(e)? "yes" : "no");
		 }System.out.println(c3);
		 
		 //check if empty
		 System.out.println("check if empty"+c3.isEmpty());
		 
		 //replace
		 c3.set(1, "im new");
		 System.out.println(c3);
		 
	}

}
