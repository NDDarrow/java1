package inherit_test;

public class aircon extends house {

	int temp = 22; //�µ�
	int speed = 1; //ǳ��
	
	aircon(){}
	aircon(String brand){
		super(brand);
	}
	@Override
	public void power() {
		onoff = !onoff;
		System.out.println("������ ���� : " + onoff);
	}
	@Override
	public String toString() {
		return super.brand + " , ���� : " + super.onoff + " �µ� : " + temp + "�� ǳ�� : " + speed;
	}
	
}
