package arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class java_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<book> list =  load();
		for( int i = 0; i < list.size(); i++ ) {
			System.out.println( list.get(i));
		}
		// 도서 검색 - 완전일치, 부분일치
		// 책 제목으로 검색 - 완전일치
		// 검색 -> 비교(일치하는 값 찾기 - 같다, 같지않다	포함값 찾기 - 범위 검색
		// 일치 하는 값 -> indexOf , 포함 -> contains
		book temp = new book("난항상물음표", "노재홍", 2023);
		
		System.out.println( list.indexOf( "난항상물음표" ));
		
		// 정렬 - 두개의 데이터를 비교하여 크고 작다를 따져서 위치를 변경하는 방법
		// 기본데이터타입에 대한 자바 내장 클래스들은 비교, 정렬, 검색을 위한 메서드들을 가지고 있다.
		// 사용자(개발자)정의 클래스는 비교, 정렬, 검색을 위한 메서드들이 없기 때문에
		// indexOf, contains, sort와 같은 메서드 사용시 필요한 메서더들을 구현해야 한다.
		Collections.sort( (List<book>) list );
		Iterator<book> it = list.iterator();
		while(it.hasNext()) {
			book data = it.next();
			System.out.println( data );
		}
		
		//list.sort(Comparator.naturalOrder());
	}

	public static ArrayList<book> load() { //book.txt 파일 불러오기
		
		ArrayList<book> list = new ArrayList<book>(); 
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt"))){
			while(true) {
				String line = bf.readLine();
				if( line == null) break;
				String[] tmp = line.split(",");
				book data = new book( tmp[0],  tmp[1],  Integer.parseInt(tmp[2]) );
				list.add(data);
				
			}
			
		}catch(Exception e) {
			System.out.println("파일 로드 및 반환 실패");
			e.printStackTrace();
		}
		return list;
	}
	
}
