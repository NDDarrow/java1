package ����;

public class supercar extends car{
	String engine;
	
	supercar(String en){
		this.engine = en;
	}
	@Override
	public String toString() {
		return "��ⷮ: " + displacement + "cc ���߷�: " + weight + "kg ���� : " + engine + "\n���� : " + 
				color + " �귣�� : " + brand;
	}
}
