package BookStore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookStoreSet {
	BookStoreDto dto = new BookStoreDto();
	 Map<String, BookStoreDto> blist = 
				new HashMap<>();
Scanner sc = new Scanner(System.in);
	void bookinsert() {
	Set<String> keylist = BookData.blist.keySet();
	Iterator<String>it = keylist.iterator();
		System.out.println("추가할 도서명");
		String bookName = sc.nextLine();
		boolean isBook = false;
		while(it.hasNext()) {
			 String key = it.next();
		if(key.equals(bookName)) {
			isBook = true;
			break;}}
		if(isBook) {
			
				System.out.println("해당 도서는 이미 보유중입니다.");
			}else {
//		BookStoreDto dto = BookStoreData.blist.get(bookName);
//		dto.setBookName(bookName);
		System.out.println("넘버");
		int bookno = sc.nextInt();
		System.out.println("도서 저자명");
		String bookwriter = sc.nextLine();
		System.out.println("도서 출판사");
		String bookpublish = sc.nextLine();
		System.out.println("도서 금액");
		int bookprice = sc.nextInt();
		dto.setBookName(bookName);
		dto.setBookWriter(bookwriter);
		dto.setBookpublish(bookpublish);
		dto.setBookprice(bookprice);
		BookStoreDto dto = blist.put(bookName, new BookStoreDto(bookno,bookName,bookwriter
				,bookpublish,bookprice));
			}
			
		}
	
	void bookmodify() {
		
	}
	void bookdelete() {
		
	}
	void memberinsert() {
		
	}
	void membermodify() {
		
	}
	void memberdelete() {
		
	}
	
	
	
}
