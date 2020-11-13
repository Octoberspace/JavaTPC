package kr.tpc;

public class MemberVO {
	private String name;
	private int age;
	private String tel;
	private String addr;
	public MemberVO(){};
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name; 
	}
	public void setAge(int age) {
		if(age<1||age>200) System.out.println("지정할 수 없는 값입니다");
		else this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getTel() {
		return tel;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getAddr() {
		return addr;
	}
}
