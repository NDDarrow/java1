package ����;

public class sedan extends car{
	boolean gear_type = true;
	String gear;
	
	@Override
	public String toString() {
		if( gear_type ) { this.gear = "����";}
		return "��ⷮ: " + displacement + "cc ���߷�: " + weight + "kg \n���� : " + 
				color + " �귣�� : " + brand + " ���� : " + this.gear;
	}
}

