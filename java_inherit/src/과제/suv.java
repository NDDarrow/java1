package ����;

public class suv extends car{
	String WD;
	
	suv(int WD){
		this.WD = WD + "WD";
	}
	
	@Override
	public String toString() {
		return "��ⷮ: " + displacement + "cc ���߷�: " + weight + "kg ���� : " + WD +"\n���� : " + 
				color + " �귣�� : " + brand;
	}
	
}
