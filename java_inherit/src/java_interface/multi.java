package java_interface;
//���� 319pg
public class multi {

	public static void main(String[] args) {
		
		UsbCable k = new keyboard();
		k.plugNplay();
		k.keyValue();
		
		Bluetooth k1 = new keyboard();
		k1.SetBluetooth();
		k1.keyValue();
		
		keyboard k2 = new keyboard();
		k2.DirectWifi();
	}

}

interface Passing{
	public void keyValue(); //Ű���� �� �޾ƿ���
	
}

interface UsbCable extends Passing {
	public void plugNplay();
}
interface Bluetooth extends Passing {
	public void SetBluetooth();
}
interface Wifi extends Passing {
	public void DirectWifi();
}

class keyboard implements UsbCable, Bluetooth, Wifi{
	@Override
	public void keyValue() {
		System.out.println("Ű���� �� ����");
	}
	
	
	@Override
	public void plugNplay(){
		System.out.println("������ �ٷ� ��� ����");
	}
	@Override
	public void SetBluetooth(){
		System.out.println("�����Ͽ� ����ϸ� ��� ����");
	}
	@Override
	public void DirectWifi() {
		System.out.println("Ȱ��ȭ �ؼ� ���� �� ���");
	}
}

// �ڹ��� ���߻��
// �ڹٿ��� Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
// �ڹٿ��� ���߻���� �������̽����� ����Ѵ�.
// ���߻���� ���� �پ��� �������� ������ �� �ִ�.

//	Ű���带 ����
//	��ǻ�Ϳ� ���� ��� - USB��Ʈ, �������, ���ù�, wifi