package customer;

public class member {
	private String id;
	private String email;
	private String pw;
	private String tel;
	private String nick;
	private int Mnum;
	
	public member() {} //기본생성자 메서드
	public member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public member(String id, String pw, String email, String nick,int Mnum, String tel) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
		this.nick = nick;
		this.Mnum = Mnum;
	}
	@Override
	public boolean equals(Object o) {
		member tmp = (member)o;
		if( this.id.equals(tmp.id) ) {// 입력한 아이디와 일치한가?
			return this.pw.equals(tmp.pw); //입력한 비밀번호와 일치한가?
		}
		return false; //아이디가 일치하지 않으면 false 반환
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getMnum() {
		return Mnum;
	}
	public void setMnum(int mnum) {
		Mnum = mnum;
	}
	
	
	
	
	
}
