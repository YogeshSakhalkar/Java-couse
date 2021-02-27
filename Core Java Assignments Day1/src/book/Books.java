package book;

public class Books {
	String Book_title;
	double Book_price;
	
	
	public Books(String t,double p) {
		this.Book_title=t;
		this.Book_price=p;
	}
	public String getBook_title() {
		return Book_title;
	}
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	public double getBook_price() {
		return Book_price;
	}
	public void setBook_price(double book_price) {
		Book_price = book_price;
	}
	
}

 class createBooks extends Books
{
	public createBooks(String t,double p) {
		super(t,p);
	}
	
	
	public void showBooks() {
		System.out.println("Title:"+getBook_title());
		System.out.println("Price:"+getBook_price());
	
		}
}

