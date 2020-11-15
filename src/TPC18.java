import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;
public class TPC18 {
	public static void main(String[] args) {
		String str=new String("APPLE");
		System.out.println(str.toLowerCase());
		
		MyUtil my=new MyUtil();
		int sum=my.hap();
		System.out.println(sum);
		
		Gson g = new Gson();
		BookVO vo=new BookVO("자바", 13000, "영진", 800);
		String json=g.toJson(vo);
		System.out.println(json);
		
	}
}
