package javaMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class map_study1 {

	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<>();

		hash.put("김민수", "오늘도웹툰");
		hash.put("박종권", "보고있나?");
		hash.put("서종우", "짝궁뭐해요?");
		hash.put("남기현", "언제까지잘꺼야??");
		hash.put("김민수", "쉬었다올께요");
		// 데이터 입력
		
		System.out.println( hash );
		
		System.out.println( hash.get("김민수") );
		// 출력은 get으로
		Set<String> keys = hash.keySet();
		// HashMap의 key값을 set으로 모을 수 있음 ※Set 인터페이스로 받았기 때문에 어디까지 확인만 가능하다 데이터를 추가할려면 HashSet에 따로 받아서 넣어줘야 한다
		System.out.println( keys ); 
		
		Collection<String> val = hash.values();
		///val.add("아하"); //keys와 동일
		System.out.println( val );
		
		hash.remove("서종우"); //데이터 삭제 - 키와 value 삭제
		System.out.println( hash );

		hash.replace("김민수", "그는 어떻게 조장이 되었는가?"); // 데이터 수정
		System.out.println( hash );
		
		System.out.println( hash.containsKey("노재홍") ); // key 존재여부
		System.out.println( hash.containsValue("그는 조장인가?") ); // value 존재여부
		
		hash.forEach( //forEach 가상반복문
			(key, value) ->{
				System.out.println( key+ " " + value);
			}
		);
		
	}	

}
// Map	- HashMap : 단일검색, 해시테이블을 이라는 배열에 접근 하기 때문에 검색시간이 일정
//		- TreeMap : 범위 검색, 이진트리 구조를 사용하기 떄문에 기본 정렬을 유지, 검색 시간은 데이터 양에 비례
//		- key: value, key는 중복을 허용하지 않는다. , value 는 중복가능
//		- HashMap에서 key는 null을 허용하지만 TreeMap은 허용하지 않는다.