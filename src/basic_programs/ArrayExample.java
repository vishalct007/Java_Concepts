package basic_programs;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add("vishal");
		al.add(15.5);
		al.add(true);
		
		System.out.println(al);
		
		//add an element
		al.add(22);
		
		//add an element at particular index
		al.add(2, 69);
		System.out.println(al);
		
		//get the count of objects
		al.size();
		
		//retrive specifi element
		al.get(3);
		
		//edit 
		al.set(1, "kumar");
		
		//retrive data from arraylist
		for(int i=0 ; i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
