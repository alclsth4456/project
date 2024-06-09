package Shopping;

import java.util.Scanner;

import ShoppingLogin.UserLogin;
public class ShoppingUser {


	public static void user() {
		Scanner sc = new Scanner(System.in);
		ShoppingData data = new ShoppingData();
	UserLogin login = new UserLogin();
			System.out.println("=============================");
			System.out.println("========재고 관리 프로그램=======");
			System.out.println("=============================");
					System.out.println("아이디 입력");
				String id = sc.nextLine();
				System.out.println("비밀번호 입력");
				String pw = sc.nextLine();
				
				boolean stop= false;
				while(!stop) {	
				
						if(UserLogin.login()) {
						//		&&UserLogin.id.equals("sojin0413")&&UserLogin.pw.equals("1234")) {
							System.out.println("1.물품등록 2.물품삭제 3.물품조회 4.물품검색 5.종료");
						int menu = sc.nextInt();
						if(menu <0 ||menu >5) {
						System.out.println("잘못선택하였습니다.");
						}else if(menu==5) {
							System.out.println("종료합니다.");
							break;
						}
						
						switch(menu) {
						case 1: data.productInsert(); break;
						case 2: data.productDelete(); break;
						case 3: data.productView(); break;
						case 4: data.productSearch(); break;
						case 5: break;
						}				
		
						}			
						}				
					}
			}
			

