package multiple_inheritence;

import java.security.DomainCombiner;

public class Result implements bike,Car{

	
	public void test() {
		bike.super.test();
		Car.super.test();
	}
	
	public static void main(String[] args) {
		Result obj=new Result();
		    obj.test();
	}
	
	
	
	
	
}
