package BookStore;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import Book_Login.login;
import Book_Member.MemberData;
import Book_Member.MemberSet;

public class BookMain {
	;
	public void bookView() {
		BookData.setblist();
		 Set<String> keylist = BookData.blist.keySet();
		 Iterator<String> it = keylist.iterator();
		 while(it.hasNext()) {
		BookStoreDto dto = BookData.blist.get(it.next());
		System.out.printf("%d\t%s\t%s\t%s\t%d",dto.getBookNo(),dto.getBookName() 
		,dto.getBookWriter(),dto.getBookpublish(),dto.getBookprice());
		System.out.println("");
		 }
	}
	
	public void BookMain() {
		
	}
	public  void start() {
		MemberData data = new MemberData();
		data.setMemberData();
		BookData.setblist();
		MemberSet m = new MemberSet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("========도서관 재고 관리========");

		System.out.println("===아이디 입력[user||master]===");
		login.id = sc.nextLine();
		System.out.println("패스워드 입력");
		login.pw = sc.nextLine();
		
		if(login.login()&& login.id.equals("user")&&login.pw.equals("1234")) {
			boolean out = false;
			while(true) {
	System.out.println("[1.도서조회 2.도서구매 3.계좌충전 4.계좌확인 5.회원정보 수정 6.회원정보 조회 7.종료]");
	int choice = sc.nextInt();
	if(choice==7) {
		System.out.println("종료합니다.");
		break;
	}
	switch(choice) {
		case 1:bookView(); continue;
		case 2:m.bookBuy(); continue;
		case 3:m.bookcharging();continue;
		case 4:m.bookcharge();continue;
		case 5:m.membermodify();continue;
		case 6:m.memberview();continue;
		case 7:break;
				
			}
	
				
		}
		}else if(login.login()&&login.id.equals("master")&&
				login.pw.equals("1234")) {
			int choice = 0;
	do { 
		System.out.println("[1.회원조회 2.도서추가 3.도서삭제 4.도서수정 5.회원수정 6.회원삭제 7.도서조회 8.종료]");	
		choice = sc.nextInt();
		BookStoreSet b = new BookStoreSet();
		
		switch(choice) {
		case 1:b.memberview(); continue;
		case 2:b.bookinsert(); continue;
		case 3:b.bookdelete();continue;
		case 4:b.bookmodify();continue;
		case 5:b.membermodify();continue;
		case 6:b.memberdelete();continue;
		case 7:bookView();continue;
		case 8: break;
		}
	}while(choice!=8);
		} 
		else {
			System.out.println("아이디와 비밀번호가 틀립니다.");
			
		}
		}
	
	
		
	public static void main(String[] args) {

	BookMain main = new BookMain();
	main.start();
		
		
		
		
	}

}
