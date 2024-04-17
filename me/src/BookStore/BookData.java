package BookStore;

import java.util.HashMap;
import java.util.Map;

public class BookData {

	public static Map<String, BookStoreDto> blist = 
		new HashMap<>();
	
	public static void setblist() {
blist.put("자바의 정석", new BookStoreDto(1,"자바의 정석","남궁성","한빛",35000));
blist.put("오라클", new BookStoreDto(2,"오라클 정석","홍길동","나무",35000));
//blist.put("코딩테스트", new BookStoreDto(3,"코딩테스트 정석","김작가","세상미디어",35000));
//blist.put("IT산업", new BookStoreDto(4,"IT산업 정석","강두식","한빛",35000));
//blist.put("스프링 부트", new BookStoreDto(5,"스프링 부트","김자바","신미디어",35000));
	}
	
	
}
