package inherit_test;

public class tv extends house {
	int ch = 7; //ä��
	int vol = 15; //�Ҹ�
	
	public tv(){ //������ �޼���
		System.out.println("tv Ŭ������ �������Դϴ�.");
		
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
		System.out.println("TV ���� : " + onoff);
	}
	@Override
	public String toString() {
		return super.brand + " , ���� : " + super.onoff + " ����ä�� : " + ch + " ���� : " + vol;
	}
}
