package Book_Login;

import BookStore.BookMain;

public class login {
	public static String id;
	public static String pw;
	
	public login() {
		
	}
	public static boolean  login() {
		BookMain main = new BookMain();
		if(id==null||pw==null) {
			System.out.println("아이디와 비밀번호를 확인해주세요");
		}else {
			if(id.equals("user")&& pw.equals("1234")) {
				return true;
			}else if(id.equals("master")&&pw.equals("1234")){
				return true;
			}
		}
		return false;
	
	}
	
	
	
}
