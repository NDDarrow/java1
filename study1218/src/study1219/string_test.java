package study1219;

public class string_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String song ="���� �ٳ��� �˷��� ������ �׷��� ���� �ٳ��� ������";
		//1. ������ �����ϰ� ��� �������� �������� �����Ͽ� ���
		//2. ���� �˷��� �ִ� ������, � ���Ͽ� �˷��� �ִ��� ���
		//	(�˷��� ���ڿ� ���� ���� �̸��� ����)
		//3. song ���ڿ� �տ� "����ص� ������ ����
		String orange = song.replace("�ٳ���", "������");
		System.out.println( orange );
		
		String �˷��� = song.substring(song.indexOf("���� ")+3, song.indexOf(" �˷���"));
		System.out.println(�˷���);
		
		String front ="��� �ص� ������ ���� ";
		System.out.println(front.concat(song));
	}

}
