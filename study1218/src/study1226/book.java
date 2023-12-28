package study1226;

public class book {

	static int cnt = 0; //클래스 변수
	
	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		book.cnt = cnt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getBook_num() {
		return book_num;
	}
	private String title;  //인스턴스변수
	String writer; //인스턴스변수
	final int book_num; //인스턴트 상수 final이 붙은 변수,배열 등은 생성할때 무조건 값이 존재해야됨
	
	book(){ //생성자 메서드
		book_num = 10;
	}
	
	static void init() { //클래스 메서드
		System.out.println("책 등록 시작");
	}
	void create() { //인스턴스 메소드
		title = "c언어";
		System.out.println("책 등록");
	}
}
//인스턴스변수는 인스턴스(객체)를 생성해야지만 사용할 수 있는 변수이다.