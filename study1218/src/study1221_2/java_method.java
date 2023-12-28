package study1221_2;

import java.util.Scanner;

public class java_method {

	static void list_print( music[] mylist ) {
		for( music obj : mylist) {
			System.out.println( obj );
		};
	}
	
	static void song_search(String keyword, music[] mylist) { // 가수 또는 노래제목으로 검색
		
		
		boolean std = false;
		for( music obj : mylist) {
			if(obj.singer.equals( keyword ) || obj.title.equals( keyword )) {
				System.out.println( obj );
				std = true;
			}
		}
		if( !std )
			System.out.println("없어용");
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		music[] mylist = new music[] {
			new music("백일","킹누",439), new music("베텔기우스","유우리",356),
			new music("pretender","오피셜히게단디즘",535), new music("첫눈","exo",329),
			new music("perfect night","르세라핌",239), new music("drama","에스파",335),
			new music("to X","태연",250), new music("헤어지자 말해요","박재정",403),
			new music("the last of the real ones","fall out guys",350),new music("star walkin","lil nas X",333)
		};
		list_print(mylist);
		
		System.out.print("가수 또는 노래제목 : ");
		String keyword = scan.nextLine();
		song_search( keyword, mylist);
	}

}


