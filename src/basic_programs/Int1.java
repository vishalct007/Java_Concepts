package basic_programs;

import java.util.LinkedHashSet;

public class Int1 {

	public static void main(String[] args) {
//		String st= " big bang big bang bang";
//		       String[] s = st.split(" ");
//		       
//		       LinkedHashSet<String>set=new LinkedHashSet<>();
//		       for(int i=0 ; i<s.length ;i++) {
//		    	   set.add(s[i]);
//		       }
//		       
//		       for(String ss:set) {
//		    	   int count=0;
//		    	   for(int i=0 ; i<s.length; i++) {
//		    		   if(ss.equals(s[i])) {
//		    			   count++;
//		    		   }
//		    	   }
//		    	   if(count>1) {
//		    		   System.out.println( ss + "  is repeating" + count + "times");
//		    	   }
//		       }
  
		
//		  String s="vishaaal";
//		  String rev= " ";
//		  
//		  for(int i=s.length()-1 ; i>=0 ; i--) {
//			  rev=rev + s.charAt(i);
//		  }
//		  System.out.print(rev);
		
		
		String st= "bangalore is famous for traffic";
		    String[] s = st.split(" ");
		    String rev= " ";
		    
		    
		    for(int i=s.length-1 ; i>=0 ; i--) {
		    	rev=rev + " " + s[i];
		    }
		    
		    System.out.print(rev);
}

}
