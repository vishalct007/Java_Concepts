package Practice;

public class Car extends Bike {

	
	public void test() {
		System.out.println("testig car");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.test();
		
		
		Bike b=new Bike();
		b.test();
	}
}
