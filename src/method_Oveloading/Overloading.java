package method_Oveloading;

public class Overloading {
	
	
	
	
		
	public static void add() {
		System.out.println(" add method with no arguments");
	}
	
	public static void add(int a) {
		System.out.println("add method with one arguments" + a);
	}
	
	public static void add(int a, int b) {
		System.out.println(" add method with two arguments " + (a+b));
	}

    public static void main(String[] args) {
		
		add();
		add(10);
		add(20,30);
		
	}

}
