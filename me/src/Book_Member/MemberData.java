package Book_Member;

import java.util.HashMap;
import java.util.Map;

public class MemberData {

	public static Map<String, MemberDto> mlist = new HashMap<>();
	public MemberData() {
		
	}
	public static void setMemberData() {
		mlist.put("홍길동", new MemberDto("홍길동","010-1111-1111","1111",40000));
		mlist.put("홍두깨", new MemberDto("홍두깨","010-3333-2222","2222",35000));
	}
}
