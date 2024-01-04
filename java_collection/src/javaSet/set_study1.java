package javaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set_study1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		// Set은 데이터의 관리가 목적이기 때문에 데이터를 개별로 출력하거나 특정데이터를 찾아서 사용하는 것이 불가능하다.
		
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(19);
//		set.add(5);
//		set.add(8);
//		set.add(50);
//		
//		System.out.println( set );
		
		HashSet<String> 안경쓴사람 = new HashSet<String>();
		HashSet<String> 팥붕어빵 = new HashSet<String>();
		HashSet<String> 슈붕어빵 = new HashSet<String>();
		
		안경쓴사람.add("남기현"); 안경쓴사람.add("이가림"); 안경쓴사람.add("김민수");
		안경쓴사람.add("노재홍"); 안경쓴사람.add("송재영"); 안경쓴사람.add("김정환");
		안경쓴사람.add("강동욱"); 안경쓴사람.add("김의찬"); 안경쓴사람.add("서종우");
		
		팥붕어빵.add("노재홍"); 팥붕어빵.add("서영배"); 팥붕어빵.add("김의찬");
		팥붕어빵.add("강동욱"); 팥붕어빵.add("김정환"); 팥붕어빵.add("박종권");
		
		슈붕어빵.add("남기현"); 슈붕어빵.add("이가림"); 슈붕어빵.add("이다희");
		슈붕어빵.add("김민수"); 슈붕어빵.add("여영근"); 슈붕어빵.add("송재영");
		슈붕어빵.add("인호성"); 슈붕어빵.add("서종우");
	
		HashSet<String> 팥X안경 = new HashSet<String>(); // 슈 좋아하는 안경잡이
		Iterator<String> it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if( 슈붕어빵.contains(name) ) {
				팥X안경.add(name);
			}
		}
		System.out.println(팥X안경 );
		
		
		//차집합
		HashSet<String> 안경X팥 = new HashSet<String>(); // 판좋아하는 안경안쓴사람
		Iterator<String> that = 팥붕어빵.iterator();
		while(that.hasNext()) {
			String name1 = that.next();
			if( !안경쓴사람.contains(name1) ) {
				안경X팥.add(name1);
			}
		}
		System.out.println( 안경X팥 );
		
		//합집합
		HashSet<String> 안경과슈 = new HashSet<String>();
		it = 슈붕어빵.iterator();
		while(it.hasNext()) {
			안경과슈.add(it.next());
		}
		it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			안경과슈.add(it.next());
		}
		System.out.println(안경과슈);
		
		// HashSet 메서드를 통한 교집합 구하기
		팥X안경.clear();
		팥X안경.addAll(안경쓴사람);
		팥X안경.retainAll(슈붕어빵); // 교집합메서드
		System.out.println( 팥X안경);
		
		// 메서드를 통해 차집합 구하기
		
		안경X팥.clear();
		안경X팥.addAll(팥붕어빵);
		안경X팥.removeAll(안경쓴사람); //차집합 메서드
		System.out.println( 안경X팥 );
		
		// 메서드를 사용하여 합집합 구하기
		
		안경과슈.clear();
		안경과슈.addAll(안경쓴사람);
		안경과슈.addAll(슈붕어빵);
		System.out.println( 안경과슈 );
		
		// 부분집합
		System.out.println( 안경과슈.containsAll(안경쓴사람) );
		
		List<String> names = new ArrayList<String>(안경과슈); //HashSet-> ArrayList 변환
		System.out.println(names);
	}
// 교집합 - 공통집합
// 차집합 = 여집합
// 합집합 - 합친거
	
	
}

// Set - 입력한 데이터 순서 유지 안됨 ( 힙이라는 메모리 공간을 사용하기 때문에 메모리주소, 크기 등에 의해 순서가 변경이 된다.)
//	   - 중복을 허용하지 않는다.
//	   - 데이터들의 그룹화 목적으로 사용 ( 수학 집합 ) 
//	   - HashSet : 수학에서의 집합을 표현하기 위한 클래스
//	   - TreeSet : 검색, 정렬의 목적으로 사용되는 클래스