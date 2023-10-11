
public class Books {
	private String bookID;
	private String bookTitle;
	private int bookQuanity;
	private double bookPrice;
	private String bookType;
	public String AddBook ()
	{
	//return "The book information cannot be added";
		Book book = new Books();
        book.setBookID("1abcd");
        book.setBookTitle("First Book");
        book.setBookQuantity(10);
        book.setBookPrice(5.1);
        book.setBookType("Kids");

        String result = book.AddBook();
	//return "The book information can be added";
	}
	
}
