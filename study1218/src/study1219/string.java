package study1219;


import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class string {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String word = "i like banana chacha";
		char ch = word.charAt(2);
		System.out.print(ch);
		//ch = scan.next().charAt(0);
		System.out.println(ch);
		
		//2. ���ڿ� �� - equals();
		if( word.equals("i like") )
			System.out.println("����");
		else
			System.out.println("�����ʴ�");
		
		//���ڿ��� byte�� ��ȯ getBytes(); - ���� �ҷ�����
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ));
		
		//4. ���ڿ����� Ư�� ���ڿ��� ��ġ�� ���� - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf( "ch", 15 );
		System.out.println( cha );
		
		//5. ���ڿ��� ���� - length()
		int len = word.length();
		System.out.println( len );
		
		//6. ���ڿ� ����(ġȯ) - replace()
		String apple = word.replace("banana", "apple");
		System.out.println(apple);
		
		// �ڹٽ�ũ��Ʈ���� ����ǥ������ �̿��Ͽ� ���ڿ� ����
		// �ڹٿ����� ����ǥ������ ����Ѵ�
		// [^0-9]
		// Ư�������ڰ� [^��-����-�Ӱ�-�Ra-zA-Z0-9]
		
		String temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]","");
		System.out.println(temp);
		
		//7. ���ڿ� ���� - substring
		
		temp = word.substring(5);
		System.out.println( temp );
		
		temp = word.substring(7,15);
		System.out.println( temp );
		
		temp = "shwo5158@naver.com";
		//���̵�� ���л���Ʈ �ּ� �˾Ƴ���
		String id = temp.substring(0, temp.indexOf("@"));
		System.out.println( id );
		
		String web = temp.substring(temp.indexOf("@")+1);
		System.out.println( web );
		
		// �� �ּҿ��� ���ø�� ���θ��� ���
		
		temp = "���������� �߱� �߾ӷ� 121���� 20";
		String city = temp.substring(0, temp.indexOf(" "));
		System.out.println( city );
		String load = temp.substring(temp.indexOf(" ", city.length()+1)+1);
		System.out.println( load );
		
		//8. ���ڿ� �и� - split()
		String[] str = word.split(" ");
		System.out.println( Arrays.toString(str));
		temp = "010-5480-5158";
		String password = temp.split("-")[2];
		
		temp = "12 �� 4570";
		String[] car = temp.split( " " );
		if( car[2].equals( "4570" )) {
			System.out.println("������ ����");
		}else if( car[0].equals( "12" )) {
			System.out.println("������ ����");	
		}
		
		//9. �빮��, �ҹ��� ��ȯ - toLowerCase(), toUpperCase()
		temp = word.toUpperCase();
		System.out.println(temp);
		
		temp = temp.toLowerCase();
		System.out.println(temp);
		
		//10. ���ڿ��� ���ڿ��� ���� - concat()
		word = "���� �����ϴ� �뷡 : ";
		temp = "Ʈ��Ʈ�� �Ⱦ��";
		String song = word.concat(temp);
		System.out.println(song);
		
		//11. String ���������� ������ Ȯ��( ���ڿ��� �ֳ� ����) - isEmpty() -��� boolean
		if( word.isEmpty())
			System.out.println("��");
		else
			System.out.println("����ִ°�");
		
		//12. ���ڿ��� Ư�� ���� �Ǵ� ���ڿ� ���� ���� - contains() -��� boolean
		if( word.contains("�뷡"))
			System.out.println("����ִ°�");
		else
			System.out.println("��");
		
		//13. Ư�����ڷ� ����, �������� �˻� - startsWith(), endWith() - ��� boolean
		
		System.out.println(word.startsWith("����"));
	}

}
