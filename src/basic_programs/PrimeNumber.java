package basic_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 int n=sc.nextInt();
		 int temp=0 ;
		 
		 for(int i=2 ; i<n ; i++) {
			 if(n%i==0) {
				 temp =temp+1;
			 }
		 }
		 
		 if(temp==0) {
			 System.out.println(n + "is a prime number");
		 }
		 else {
			 System.out.println(n + "is not a prime number");
		 }

	}

}
