package exception_ex;

import java.util.Scanner;

public class java_exception {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = "����ȫ";
		int score = 0;
		int[] num = {};
		
		try {
			score = scan.nextInt();
			
			System.out.println( "�̸� : " + name.concat("��") );
			System.out.println( score/ num.length);
		}catch(java.lang.NullPointerException e) {
			System.out.println("�̸��� �Է��ϼ���");
		}catch(java.lang.ArithmeticException e) {
			System.out.println("������ �Է��ϼ���");
		}
	
//		try {
//			String name;
//			name = scan.nextLine();
//			
//			System.out.println( name.charAt(0));
//			
//			System.out.println( name );
//		}catch( Exception e) { //Exception ��� ����ó���߿� ���� ���
//			System.out.println("�̸��� �Է��ϼ���");
//		}
		
//		//try - catch ��
//		try { //������ �߻��� �� ���� �ڵ带 ����
//			int num = 10;
//			
//			System.out.println( num/0 );
//			
//			
//			
//		}catch ( java.lang.ArithmeticException e) {
//			System.out.println( e.getMessage() );
//			e.printStackTrace();
//			System.out.println("0���� ������ �� �� �����ϴ�.");
//		}
//		System.out.println( "���α׷� ����");
//		//����ó�� - ���������� ���α׷��� ����Ǿ� ������ �ϴ� ȸ���ؼ� ���α׷��� '����'�� �ǰ� �ϴ°�
	}
}
