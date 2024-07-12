package typeCasting;

public class SBI extends RBI{
	
	
	public void homeLoanInterestRate() {
		 System.out.println("interest rate in sbi is 9%");
	}
	
	
	
	public void greet(){
		System.out.println(" greetins from sbi bank");
	    }
	
	
	
	 public static void main(String[] args) {
		    RBI obj=new SBI();
		     obj.homeLoanInterestRate();
		  
		       obj.printGuidelines();

		  //obj.greet();  (we cannot access but here we can acess overridden methods)
		  
		     
		        SBI obj1=(SBI)obj;
		           obj1.greet();
		           
	}

}
