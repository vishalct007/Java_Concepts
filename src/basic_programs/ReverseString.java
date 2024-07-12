package basic_programs;

public class ReverseString {

	public static void main(String[] args) {
		//String s="vishaal";
//		
//		
//		for(int i=s.length()-1 ; i>=0 ; i--) {
//			System.out.print(s.charAt(i));
//			
//		}
				
//	     2nd method
	//	String rev= " ";
//		for(int i=s.length()-1; i>=0 ; i--) {
//			rev=rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
//		

		String st= "bangalore is famous for traffic";
		   String[] s = st.split(" ");
		String rev=" ";
		
		for(int i=s.length-1 ; i>=0 ; i--) {
			rev=rev+ " " + s[i];
		}
		System.out.println(rev);
		
	}

}
