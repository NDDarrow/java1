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
		
		//2. 문자열 비교 - equals();
		if( word.equals("i like") )
			System.out.println("같다");
		else
			System.out.println("같지않다");
		
		//문자열을 byte로 변환 getBytes(); - 파일 불러오기
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ));
		
		//4. 문자열에서 특정 문자열의 리치를 리턴 - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf( "ch", 15 );
		System.out.println( cha );
		
		//5. 문자열의 길이 - length()
		int len = word.length();
		System.out.println( len );
		
		//6. 문자열 변경(치환) - replace()
		String apple = word.replace("banana", "apple");
		System.out.println(apple);
		
		// 자바스크립트에서 정규표현식을 이용하여 문자열 변경
		// 자바에서도 정규표현식을 사용한다
		// [^0-9]
		// 특수문제자거 [^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]
		
		String temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]","");
		System.out.println(temp);
		
		//7. 문자열 추출 - substring
		
		temp = word.substring(5);
		System.out.println( temp );
		
		temp = word.substring(7,15);
		System.out.println( temp );
		
		temp = "shwo5158@naver.com";
		//아이디와 포털사이트 주소 알아내기
		String id = temp.substring(0, temp.indexOf("@"));
		System.out.println( id );
		
		String web = temp.substring(temp.indexOf("@")+1);
		System.out.println( web );
		
		// 위 주소에서 도시명과 도로명을 출력
		
		temp = "대전광역시 중구 중앙로 121번길 20";
		String city = temp.substring(0, temp.indexOf(" "));
		System.out.println( city );
		String load = temp.substring(temp.indexOf(" ", city.length()+1)+1);
		System.out.println( load );
		
		//8. 문자열 분리 - split()
		String[] str = word.split(" ");
		System.out.println( Arrays.toString(str));
		temp = "010-5480-5158";
		String password = temp.split("-")[2];
		
		temp = "12 가 4570";
		String[] car = temp.split( " " );
		if( car[2].equals( "4570" )) {
			System.out.println("주차비 정산");
		}else if( car[0].equals( "12" )) {
			System.out.println("주차비 정산");	
		}
		
		//9. 대문자, 소문자 변환 - toLowerCase(), toUpperCase()
		temp = word.toUpperCase();
		System.out.println(temp);
		
		temp = temp.toLowerCase();
		System.out.println(temp);
		
		//10. 문자열과 문자열을 결합 - concat()
		word = "내가 좋아하는 노래 : ";
		temp = "트로트가 싫어요";
		String song = word.concat(temp);
		System.out.println(song);
		
		//11. String 참조변수가 빈값인지 확인( 문자열이 있냐 없냐) - isEmpty() -결과 boolean
		if( word.isEmpty())
			System.out.println("빈값");
		else
			System.out.println("들어있는값");
		
		//12. 문자열에 특정 문자 또는 문자열 포함 여부 - contains() -결과 boolean
		if( word.contains("노래"))
			System.out.println("들어있는값");
		else
			System.out.println("빈값");
		
		//13. 특정문자로 시작, 끝나는지 검사 - startsWith(), endWith() - 결과 boolean
		
		System.out.println(word.startsWith("내가"));
	}

}
