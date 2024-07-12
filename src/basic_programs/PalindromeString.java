package basic_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		   String str = sc.nextLine();
                   String org_str=str;
                   String rev=" ";
                   
                   
                for(int i=str.length()-1 ; i>=0 ; i--) {
                	rev=rev+str.charAt(i);
                }
                
                if(org_str.equals(rev)) {
                	System.out.println(" string is palindrome");
                }
                else {
                	System.out.println("String is not palindrome");
                }
	}

}
