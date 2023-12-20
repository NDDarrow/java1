package study1219;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//과제
	String song = "크리스마스에는 많은 것을 원하지 않아요 # 내가 원하는건 딱 하나에요 # "
					+"트리 아래의 선물 같은것도 신경쓰지 않아요 # 당신을 원해요 #"
					+"당신이 생각하는 것보다 더 # 내 소원을 이뤄줘요 #"
					+"내가 크리스마스에 원하는건 당신이에요";
 /*	1. #을 기준으로 한줄씩 출력( #은 제거) replace
  * 2. 당신 이라는 단어대신 "그대" 라고 바꾸어서 출력하세요 replace
  * 3. 크리스마스를 영어로 변경하여 출력하세요(대문자로) replace
  * 4.세번째 # 뒤의 가사가 무언인지 출력하세요. spilt
  */
	String base = song.replace("#", "\n");
	String basic = base.replace("\n ", "\n");
	System.out.println( basic );
	
	
	
	String basic_그대 = basic.replace("당신", "그대");
	System.out.println();
	System.out.println( basic_그대 );
	
	
	String basic_크리스마스 = basic.replace("크리스마스", "christmas");
	System.out.println();
	System.out.println( basic_크리스마스.toUpperCase() );
	System.out.println();
	
	System.out.println(song.split("#")[3]);
	
	
	
	}

}
