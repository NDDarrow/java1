package study1219;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
	String song = "ũ������������ ���� ���� ������ �ʾƿ� # ���� ���ϴ°� �� �ϳ����� # "
					+"Ʈ�� �Ʒ��� ���� �����͵� �Ű澲�� �ʾƿ� # ����� ���ؿ� #"
					+"����� �����ϴ� �ͺ��� �� # �� �ҿ��� �̷���� #"
					+"���� ũ���������� ���ϴ°� ����̿���";
 /*	1. #�� �������� ���پ� ���( #�� ����) replace
  * 2. ��� �̶�� �ܾ��� "�״�" ��� �ٲپ ����ϼ��� replace
  * 3. ũ���������� ����� �����Ͽ� ����ϼ���(�빮�ڷ�) replace
  * 4.����° # ���� ���簡 �������� ����ϼ���. spilt
  */
	String base = song.replace("#", "\n");
	String basic = base.replace("\n ", "\n");
	System.out.println( basic );
	
	
	
	String basic_�״� = basic.replace("���", "�״�");
	System.out.println();
	System.out.println( basic_�״� );
	
	
	String basic_ũ�������� = basic.replace("ũ��������", "christmas");
	System.out.println();
	System.out.println( basic_ũ��������.toUpperCase() );
	System.out.println();
	
	System.out.println(song.split("#")[3]);
	
	
	
	}

}
