package ����;

public class truck extends car{
	int wheel;
	
	truck(int size){
		this.wheel = size;
	}
	
	@Override
	public String toString() {
		return "��ⷮ: " + displacement + "cc ���߷�: " + weight + "kg ���� ������ : " + wheel + "��ġ\n���� : " + 
				color + " �귣�� : " + brand;
	}
}
