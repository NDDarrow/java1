package study1221;

import java.util.Scanner;

public class main_method {

	static Scanner scan = new Scanner(System.in);
	// static - Ŭ����(static) �޼��忡���� ���� static ������, static �޼��常 ��� ����
	//			static �޼��忡�� �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��� �Ұ�	
	public static void search( student[] std, String name) {//�̸����� �˻��Ͽ� ���� ��ȸ
		boolean isStd = false;
		
		for( int i = 0; i < std.length; i++) {
			if( std[i].name.equals(name) ) {
				System.out.println( std[i] );
				isStd = true;
			}
		}
		if(!isStd)
			System.out.println("�����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		student[] std = new student[6]; //��������
			std[0] = new student("�̼���",64,56,80);
			std[1] = new student("������",80,54,12);
			std[2] = new student("�Ƹ�����Ÿ",15,30,78);
			std[3] = new student("�޽�",8,48,67);
			std[4] = new student("ȣ����",1,3,7);
			std[5] = new student("ĳ����",56,100,100);
			
			
			System.out.println("��ȸ�� �л� �̸� �Է� : ");
			String name = scan.nextLine();
			
			search( std , name );
			
//		student s = new student();
		
//		student std = new student( "�̼���", 90, 66, 12); // studentŬ���� ��ü�� �����ؼ� �������� std�� ����
////		std.name = "�̼���";
////		std.kor = 90;
////		std.mat = 66;
////		std.eng = 12;
//		std.total = (std.kor + std.mat + std.eng)/3;
//		std.avg = std.total/3;
//		System.out.println( std );
		
		
		
	}

}
