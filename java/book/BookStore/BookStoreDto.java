package BookStore;

public class BookStoreDto {

	private String bookName;
	private String bookWriter;
	private String bookpublish;
	private int bookNo;
	private int bookprice;
	private static int lastbookno = 0;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookpublish() {
		return bookpublish;
	}
	public void setBookpublish(String bookpublish) {
		this.bookpublish = bookpublish;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public BookStoreDto(int bookNo,String bookName, String bookWriter, String bookpublish,  int bookprice) {
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookpublish = bookpublish;
		this.bookNo = bookNo;
		this.bookprice = bookprice;
	}
	public static int getLastbookno() {
		return lastbookno;
	}
	public static void setLastbookno(int lastbookno) {
		BookStoreDto.lastbookno = lastbookno;
	}
	public BookStoreDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookStoreDto [bookName=" + bookName + ", bookWriter=" + bookWriter + ", bookpublish=" + bookpublish
				+ ", bookNo=" + bookNo + ", bookprice=" + bookprice + "]";
	}
	public static int getLastBookNo() {
		return lastbookno;
	}
	
	
	
}
