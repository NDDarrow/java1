package inherit_test;

public class tv extends house {
	int ch = 7; //채널
	int vol = 15; //소리
	
	public tv(){ //생성자 메서드
		System.out.println("tv 클래스의 생성자입니다.");
		
	}
	public tv(String brand){
		
		super(brand);
	}
	
	void channel_up() {
		this.ch++;
	}
	void channel_down() {
		this.ch--;
	}
	@Override
	public void power() {
		onoff = !onoff;
		System.out.println("TV 전원 : " + onoff);
	}
	@Override
	public String toString() {
		return super.brand + " , 전원 : " + super.onoff + " 현재채널 : " + ch + " 볼륨 : " + vol;
	}
}
