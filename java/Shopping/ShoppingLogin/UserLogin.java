package ShoppingLogin;

public class UserLogin {
		public static String id;
		public static String pw;
		
		
	public static boolean login() {
		
		if(id==null|| pw==null) {
			System.out.println("아이디와 비밀번호를 입력바랍니다.");
			return false;
			
		}else {
			if(id.equals("sojin0413")&&pw.equals("1234")) {
				return true;
			}else {
				
				return false;
			}
		}
	}
}
