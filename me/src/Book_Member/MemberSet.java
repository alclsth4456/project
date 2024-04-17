package Book_Member;

import java.util.Scanner;

import BookStore.BookData;
import BookStore.BookStoreDto;
import me.BookStoreData;

public class MemberSet {
	
Scanner sc = new Scanner(System.in);
	public void bookBuy() {
//		BookStoreData data = new BookStoreData();
		BookStoreDto dto = new BookStoreDto();
		System.out.println("회원명");
		String membername = sc.nextLine();
		MemberDto mdto = MemberData.mlist.get(membername);
		if(mdto==null) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
		System.out.println("구매하실 도서명");
		String bookname = sc.nextLine();
		BookStoreDto bdto = BookData.blist.get(bookname);
		if(bdto==null) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
		int money = mdto.getCharge();
		int total = dto.getBookprice()-mdto.getCharge();
			if(total< 0) {
				System.out.println("금액이 부족합니다.");
			}else {
				mdto.setCharge(total);
				System.out.println(dto.getBookName()+ "의 구매가 확정되었습니다.");
			}
		}
		}
	}
	public void bookcharge() {
		System.out.println("회원명");
		String membername = sc.nextLine();
		MemberDto dto = MemberData.mlist.get(membername);
		if(dto==null) {
			System.out.println("이 회원은 존재하지 않습니다.");
		}else {
			System.out.println("회원님의 잔액은" + dto.getCharge() +"원 입니다." );			
		}
	}
	public void bookcharging() {
		System.out.println("회원명");
		String membername = sc.nextLine();
		MemberDto dto = MemberData.mlist.get(membername);
		if(dto==null) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			System.out.println("충전하실 금액");
			int charge = sc.nextInt();
			int total = dto.getCharge() + charge;
			System.out.println("회원님의 잔액은" +total +"원 입니다.");
		}

	}
	public void membermodify() {
		System.out.println("회원명");
		String membername = sc.nextLine();
		MemberDto dto = MemberData.mlist.get(membername);
	if(dto==null) {
		System.out.println("회원이 존재하지 않습니다.");
	}else {
		System.out.println("핸드폰번호 수정");
		String memberphone = sc.nextLine();
		System.out.println("아이디 수정");
		String memberid = sc.nextLine();
		dto.setMemberId(memberid);
		dto.setMemberPhone(memberphone);
		System.out.println(membername +"님의 정보가 수정되었습니다.");
		
	}
	}
	
	
	
	
	
	
}
