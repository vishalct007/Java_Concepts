package Practice;

public class Overloading {
	
	public static void add(int a) {
		System.out.println(a);
		System.out.println("method with single arg");
	}
	
	public static void add(int a , int b) {
		System.out.println(a+b);
		System.out.println("method with single arg");
	}
	
	public static void add(int a , int b , int c) {
		System.out.println(a);
		System.out.println("method with single arg");
	}
	
	
	public static void main(String[] args) {
		add(20);
		add(30 , 30);
		add(30,40 , 50);
	}

}
