package study1226;

import java.util.Arrays;
import java.util.Scanner;
import test.test;

public class java_access {

//������ - Ŭ����, ����, �޼���
// ���������� - public, private, protected, default (�ݵ�� �ϱ�, �ſ��߿�)
// 	static, final, abstract, native ���
	
// static - 'Ŭ������' �Ǵ� '��������'
//		  - static�� ���� ������ �޼���� �ν��Ͻ�(��ü)�� �������� �ʰ� ��밡��
//		  - static ������ �ν��Ͻ� �޼��忡�� ��� ���� �ϴ�.
//		  - static �޼��忡���� �ν��Ͻ����� ���Ұ�
//		  - static �޼��忡���¿��� static ������, static �޼��常 ��� ����
//		  - static class ���� Ŭ������ ���� �Ͽ� ����Ѵ�.
	
// final  - '��������' �Ǵ� '����� �� ����'
//		  - final�� ������ �ٿ��ָ� ����� �ǹ̰� �ȴ�.(�ʱⰪ ���Ŀ� �� ���� �ȵ�)
//		  - final�� ���� �迭�� �迭������ �� ������ ������, �ٸ� �迭�� ��ü�� �Ұ���
//		  - final�� �޼��忡 �ٿ��ָ� �ش� �޼���� �������̵� �Ұ�
//        - final�� class�� �ٿ��ָ� ��� �� �� ����.(�߻�ȭ�� �ȵȴ�.)
	
// ���� ������
// public - ������ , ���Ѿ��� ��밡��
//		  - class�� public�� ���� ��� ��𿡼��� �ش� Ŭ������ ����� �� �ִ�.
//		  - �ν��Ͻ�����, Ŭ��������, �ν���Ʈ�޼���, Ŭ�����޼��� �� public�� ���� ������
//			��ü�� �����Ͽ��� ����ϴµ� ������ �ִ�.
	
// dafault - ���� ��Ű�������� ��밡��
// protected - ���� ��Ű�������� ��밡��
// 			 - �ٸ� ��Ű���� ��Ӱ����� ��밡��
// private - ��Ű���� ���Ƶ� �޶� ��� �Ұ�
//		   - ��� Ŭ������ ��� �� �� ����
//		   - ���� �ش� Ŭ���� ���ο����� ��밡��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	book.cnt = 1; //Ŭ���� �����̱� ������ ��ü �������� ��밡��
		book bk =  new book();
		bk.title = "c���"; // �ν��Ͻ������� ��ü ������ ��밡��
		book.cnt = 2;
		bk.cnt = 3; //Ŭ������ ��� ����
		//book.init();
		
		final int num = 10;
		//num = 20;
		final int[] arr = new int[] {10,20,30};
		arr[0] = 100;
		//arr = new int[] {20,30,40};
		//final �� arr�迭�� �ּҿ� �ٿ��� ������ ������ ����� ���� �����ϴ� ���� ����
		//������ arr�迭 �ּ� ��ü�� �����ϴ� ���� �Ұ�����
		System.out.println( Arrays.toString(arr) );
		
		book bk1 = new book();
		test sex = new test();
		sex.maker = "����";
	}

}
