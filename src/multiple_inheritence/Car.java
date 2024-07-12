package multiple_inheritence;

public interface Car {
	
	default void test() {
		System.out.println("testing car");
	}

}
