import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
		 MemberVO m=new MemberVO();
		 
		 m.setName("홍길동");
		 m.setAge(202);
		 m.setTel("010-1111-1111");
		 m.setAddr("서울");
		 
		 System.out.print(m.getName()+"\t");
		 System.out.print(m.getAge()+"\t");
		 System.out.print(m.getTel()+"\t");
		 System.out.print(m.getAddr()+"\t");
		 
		 /*
		 m.name="홍길동";
		 m.age=50;
		 m.tel="010-1111-1111";
		 m.addr="서울";
		 */
		 
		 
		 
		 
		
	}
}
