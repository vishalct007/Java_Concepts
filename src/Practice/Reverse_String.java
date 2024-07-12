package Practice;

public class Reverse_String {

	public static void main(String[] args) {
		/*String s="vishaaal";
	
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}

	}
	
	
	String rev="";
	for(int i=s.length()-1; i>=0 ; i--) {
		rev=rev+s.charAt(i);
	}
	
	System.out.println(rev);
	
	*/
	
		String st="Bangalore is famous for traffic";
		  String s[]=st.split(" ");
		  
		  String rev=" ";
		  
		  for(int i=s.length-1 ; i>=0 ; i--) {
			  rev= rev + " " +s[i];
		  }
		  
		  System.out.println(rev);
		
	}
	
}
