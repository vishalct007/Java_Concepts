package encapsulation;

public class Result {
	public static void main(String[] args) {
		
		Bookstore b=new Bookstore(101 ,"manuals" , 550 ,"vishal" );
		
		b.setPrice(600);
		
		System.out.println("Book id is" +b.bid);
		System.out.println("Book name is" + b.getbname());
		System.out.println("Book price is" + b.getPrice());
		System.out.println("Book author is " + b.author);
	}

}
