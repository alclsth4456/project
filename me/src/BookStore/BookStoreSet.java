package BookStore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Book_Member.MemberData;
import Book_Member.MemberDto;

public class BookStoreSet {
	private static int lastbookno = 0;
	Book_Member.MemberDto mdto= new  MemberDto();
	BookStoreDto dto = new BookStoreDto();
	 Map<String, BookStoreDto> blist = 
				new HashMap<>();
	 Map<String, MemberDto> mlist = new HashMap<>();
Scanner sc = new Scanner(System.in);


	void bookinsert() {
		
//	Set<String> keylist = BookData.blist.keySet();
//	Iterator<String>it = keylist.iterator();

	System.out.println("추가할 도서명");
	String bookName = sc.nextLine();
		if(BookData.blist.containsKey(bookName)) {
				System.out.println("해당 도서는 이미 보유중입니다.");
		}else {
		int bookno= ++lastbookno;
		System.out.println("도서 저자명");
		String bookwriter = sc.nextLine();
		System.out.println("도서 출판사");
		String bookpublish = sc.nextLine();
		System.out.println("도서 금액");
		int bookprice = sc.nextInt();
		sc.nextLine();
		
		dto.setBookWriter(bookwriter);
		dto.setBookpublish(bookpublish);
		dto.setBookprice(bookprice);
		BookStoreDto dto = blist.put(bookName, new BookStoreDto(bookno,bookName,bookwriter
				,bookpublish,bookprice));
		System.out.println("회원 정보가 저장되었습니다.");
		}
			
		}
	
	
	void bookmodify() {
		System.out.println("수정할 도서명");
		String bookname = sc.nextLine();
		BookStoreDto dto = BookData.blist.get(bookname);
		if(dto==null) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
			System.out.println("넘버");
			int bookno = sc.nextInt();
			sc.nextLine();
			System.out.println("저자");
			String bookwriter = sc.nextLine();
			System.out.println("출판사");
			String bookpublish = sc.nextLine();
			System.out.println("가격");
			int bookprice = sc.nextInt();
			sc.nextLine();
			dto.setBookWriter(bookwriter);
			dto.setBookpublish(bookpublish);
			dto.setBookprice(bookprice);
			dto.setBookNo(bookno);
			
			blist.put(bookname, new BookStoreDto(bookno,bookname,bookwriter,
					bookpublish,bookprice));
			System.out.println("해당 도서가 수정 완료되었습니다.");
		}
	}
	void bookdelete() {
		System.out.println("삭제할 도서명");
		String bookname = sc.nextLine();
		BookStoreDto dto = BookData.blist.get(bookname);
		if(dto==null) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
			blist.remove(dto);
			System.out.println("해당 도서가 삭제되었습니다.");
			
		}
	}
	void memberinsert() {
		System.out.println("추가하실 회원명");
		String membername = sc.nextLine();
		System.out.println("회원 핸드폰번호");
		String memberphone = sc.nextLine();
		System.out.println("회원 아이디");
		String memberid = sc.nextLine();
		System.out.println("회원 충전금액");
		int membercharge = sc.nextInt();
		mdto.setMemberPhone(memberphone);
		mdto.setMemberName(membername);
		mdto.setMemberId(memberid);
		mdto.setCharge(membercharge);
		mlist.put(membername, new MemberDto(membername,memberphone,memberid,membercharge));
		
	}
	void membermodify() {
		System.out.println("수정할 회원명");
		String membername = sc.nextLine();
		MemberDto mdto = MemberData.mlist.get(membername);
		System.out.println("회원 핸드폰번호");
		String memberphone = sc.nextLine();
		System.out.println("회원 아이디");
		String memberid= sc.nextLine();
		mdto.setMemberPhone(memberphone);
		mdto.setMemberId(memberid);
		
		System.out.println("회원정보가 수정되었습니다.");
		
	}
	void memberdelete() {
		System.out.println("삭제할 회원명");
		String membername= sc.nextLine();
		MemberDto dto = MemberData.mlist.get(membername);
		if(dto==null) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			MemberData.mlist.remove(dto);
			
		}
	}
	void memberview() {
		Set<String>mlist = MemberData.mlist.keySet();
		Iterator<String>it = mlist.iterator();
		if(it.hasNext()) {
			MemberDto dto = MemberData.mlist.get(it.next());
			System.out.printf("%s\t%s\t%s\t%d", dto.getMemberName(),dto.getMemberPhone(),
					dto.getMemberId(),dto.getCharge());
		}
	}
	
	
}
