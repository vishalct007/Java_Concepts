package encapsulation;
 /*wrapping data and methods in a single class by making it as private
  * to acces this data members we make use of getters and setters methods
  * 
  */
public class Bookstore {
	
	int bid;
	private String bname;
	private int price;
	String author;
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
		System.out.println("price updated successfully");
	}
	
	public String getbname() {
		return bname;
	}
	
	public Bookstore(int bid , String bname , int price , String author) {
		
		this.bid=bid;
		this.bname=bname;
		this.price=price;
		this.author=author;
	}
	
	
	


}
