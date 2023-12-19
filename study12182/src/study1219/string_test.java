package study1219;

public class string_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String song ="나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
		//1. 원본은 유지하고 모든 마나나를 오렌지로 변경하여 출력
		//2. 과일 알러지 있는 원숭이, 어떤 과일에 알러지 있는지 출력
		//	(알러지 문자열 앞의 과일 이름만 추출)
		//3. song 문자열 앞에 "상상만해도 웃음이 나요
		String orange = song.replace("바나나", "오렌지");
		System.out.println( orange );
		
		String 알러지 = song.substring(song.indexOf("나는 ")+3, song.indexOf(" 알러지"));
		System.out.println(알러지);
		
		String front ="상상만 해도 웃음이 나요 ";
		System.out.println(front.concat(song));
	}

}
