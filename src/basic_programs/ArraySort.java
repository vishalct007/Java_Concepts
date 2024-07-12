package basic_programs;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		
		
		int a[]= {10 , 6 , 7, 4,20 , 27 , 32, 31};
		
		for(int i=0 ; i<a.length ; i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]>a[j]) {
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
			}
		}

	}
		System.out.println(Arrays.toString(a));
		
	}
}


