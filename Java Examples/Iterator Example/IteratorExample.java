package IteratorExample;

import java.util.*;

public class IteratorExample {

	public static void main(String args[]) {
		// Create an array list
		ArrayList al = new ArrayList();
		
		// add elements to the array list
		al.add("T");
		al.add("H");
		al.add("U");
		al.add("R");
		al.add("S");
		al.add("D");
		al.add("A");
		al.add("Y");
		
		System.out.print("Original contents of al: ");
		
		//create an iterator
		ListIterator litr = al.listIterator();
		
		//iterating through the list
		while(litr.hasNext()) {
			Object element = litr.next();
			System.out.print(element+ " ");
			
			//modify the list elements
			litr.set(element + "+");
		}
		
		System.out.print("Modified contents of al: ");
		
		//create another iterator
		Iterator itr = al.listIterator();
		
		//iterate through the list
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
	}
}