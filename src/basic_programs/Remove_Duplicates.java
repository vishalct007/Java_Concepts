package basic_programs;

import java.util.LinkedHashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String st= " my name is is vishal";
		     String[] s = st.split(" ");
		
		LinkedHashSet<String> set= new LinkedHashSet<>();
		for(int i=0 ; i<s.length; i++) {
			set.add(s[i]);
		}
		
		
		
		for(String ss:set) {
			int count=0;	
		for(int i=0 ; i<s.length ; i++) {
			if(ss.equals(s[i])) {
				count++;
			}
		}
		
		
		if(count>1){
			System.out.println( ss + "  repeating"  + count + " times ");
		}
		}
		

	}

}
