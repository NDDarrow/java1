package study1221_2;

import java.util.Scanner;

public class java_method {

	static void list_print( music[] mylist ) {
		for( music obj : mylist) {
			System.out.println( obj );
		};
	}
	
	static void song_search(String keyword, music[] mylist) { // ���� �Ǵ� �뷡�������� �˻�
		
		
		boolean std = false;
		for( music obj : mylist) {
			if(obj.singer.equals( keyword ) || obj.title.equals( keyword )) {
				System.out.println( obj );
				std = true;
			}
		}
		if( !std )
			System.out.println("�����");
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		music[] mylist = new music[] {
			new music("����","ŷ��",439), new music("���ڱ�콺","���츮",356),
			new music("pretender","���Ǽ����Դܵ���",535), new music("ù��","exo",329),
			new music("perfect night","��������",239), new music("drama","������",335),
			new music("to X","�¿�",250), new music("������� ���ؿ�","������",403),
			new music("the last of the real ones","fall out guys",350),new music("star walkin","lil nas X",333)
		};
		list_print(mylist);
		
		System.out.print("���� �Ǵ� �뷡���� : ");
		String keyword = scan.nextLine();
		song_search( keyword, mylist);
	}

}


