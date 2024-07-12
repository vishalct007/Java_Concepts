package multiple_inheritence;

public interface bike {
	
	default void test() {
		System.out.println("testing bike");
	}

}
