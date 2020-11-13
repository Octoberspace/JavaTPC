package kr.tpc;

public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO() {
		title="자바";
		price=14000;
		company="이지스";
		page=780;
	}
	public BookVO(String title,int price, String company, int page ) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page=page;
	}
}
