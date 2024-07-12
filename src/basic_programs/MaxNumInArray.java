package basic_programs;

public class MaxNumInArray {

	public static void main(String[] args) {
		int a[]= {20 , 15 , 18 , 30};
		
		
		int max=a[0];
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]>max) {
				max=a[i];
			}		
		}
		System.out.println(max);

	}

}
