package poly;

import inherit_test.house;
import inherit_test.tv;

public class java_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		house t = new tv("�Ｚ");
		t.power();
		
		
		System.out.println( t.sn );
		
		house fan1 = new fan("����");
		System.out.println( ((fan)fan1).sn );
		System.out.println(fan1.makedate);
		System.out.println( ((fan)fan1).makedate );
	}

}

//
// Ŭ������ ������ �޼��忡���� �Ϲ������� pubilc�� ����Ѵ�.
// �ν��Ͻ� ������ private �����ڷ� �����ϴ°� ����.
// ��� �����϶� �θ�Ŭ������ �����ڴ� protected
// �θ�Ŭ������ �߻�޼���� public����

// �����ڸ� �ٿ��� �ۼ��ؾ��� ��������� ������ �� �ְ�,
// ��������� ����� �Ǽ� ���� �� ���ʿ��� �ڵ� ������ ���� �� �ִ�.

// �����ε� - (���� �̸��� �޼������� �Ű������� �ٸ���)���� - ������ Ŭ��������
// �������̵� - (���� �̸��� �Ű������� �޼������� ������ �ٸ�)������ - ��Ӱ��迡��


