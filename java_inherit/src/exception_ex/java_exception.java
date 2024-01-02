package exception_ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class java_exception {
	
	static Scanner scan = new Scanner(System.in);
	
	static String myAge(String birth) throws StringIndexOutOfBoundsException{
		//Date today = new Date(); ��¥�� �ٷ�� Ŭ����, getXxx()�޼��� ��¥�ð��������� ����
		
		Calendar today = Calendar.getInstance();
		
//		System.out.println( "�⵵ : " + today.get( Calendar.YEAR ) );
//		System.out.println( "�� : " + today.get( Calendar.MONTH ) );
//		System.out.println( "�� : " + today.get( Calendar.DATE ) );
//		
//		System.out.println( "���� ���� : " + today.get( Calendar.WEEK_OF_YEAR));
//		
		
//		System.out.println( "����(1-�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
//		
//		today.set(2020, 1, 1);
//		System.out.println( "�̴��� ������ �� : " + today.getActualMaximum(Calendar.DATE));
		
		
		int year = today.get(Calendar.YEAR);
		String age = null;
		
		// throw - ����(����)�� �߻���Ű�� ���
		//	throw�� ������ �ִ� �޼���� �ݵ�� throws�� �־�� �Ѵ�.
		//	throw�� ���� �ش� �޼��尡 � ������ �Ȱ� �ִ��� ���� ������ �� �ְ�, ����ó���� �����Ѵ�.
		//	����ó���� ���� ������ �����ϰ� ���ش�.
		
		// throws - ���ܸ� �Ѱ��ִ� ���

			if(birth.length() !=8 ) {
				throw new StringIndexOutOfBoundsException("method:myAge - ��������� 8�ڸ� �Է�");
			}
			if( birth.matches("[+-]?\\d*(\\.\\d+)?") ){
				throw new NumberFormatException("method:myAge - ���ڸ� �Է��ϼ���");
			}
			int myYear = Integer.parseInt(birth.substring( 0 , 4 ));
			age = (year - myYear) + "��";
			return age;
		
			
//		}finally { //try �������� ������ �߻��ϰų� �߻����� �ʾƵ� ������ ����Ǵ� ����
//			return "0��";
//		}
		
		
		//System.out.println( 1 + today.getMonth()); //�Լ��̸��� -ǥ�� = ����� �������� ����(���� ���� �޼ҵ�)
		
		
	}
	
	public static void main(String[] args) {
		// 자동 자원 반환 예외 처리 - 파일열기와 같은 외부 파일(데이터)를 사용하게되는경우
		//						 사용한 메모리와 cpu 등등을 close를 통해 반환해야 한다.
		//						 자동자원반환 예외처리는 코드의 복잡성을 줄여준 예외처리이다.
		//						 (사용한 리소스를 반납시키지 않고 부담을 가중시켜서 공격하는 것이 디도스 공격)
		// try ( 파일열기 ){
		// }catch( 예외클래스 ){
		// }
		
		//BufferedReader bf = null;
		
		try (BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt")))
		{
			while( true ) {
				String line = bf.readLine();
				if( line == null ) break;
				System.out.println(line);
			}
		}catch( Exception e) {
			System.out.println("파일 로드 및 반환 실패");
		}
		//위와 같은 형태로 코드를 구성하면 자동으로 파일을 읽고쓸수 있음
		
		
//		String birth = null;
//		
//		System.out.println("������� : ");
//		birth = scan.nextLine();
//		try {
//		String age = myAge(birth);
//		System.out.println( age );
//		}catch(Exception e) {
//			System.out.println( e.getMessage() );
//			e.printStackTrace();
//		}
//		String name = "����ȫ";
//		int score = 0;
//		int[] num = {};
//		
//		try {
//			score = scan.nextInt();
//			
//			System.out.println( "�̸� : " + name.concat("��") );
//			System.out.println( score/ num.length);
//		}catch(java.lang.NullPointerException e) {
//			System.out.println("�̸��� �Է��ϼ���");
//		}catch(java.lang.ArithmeticException e) {
//			System.out.println("������ �Է��ϼ���");
//		}catch(Exception e ) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("���� ����?");
	
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
