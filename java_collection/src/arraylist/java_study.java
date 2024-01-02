package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class java_study {

	public static void main(String[] args) {
		
		ArrayList<member> mbr = new ArrayList<>();
		mbr.add( new member("이순신" , "lee@naver.com", "남성", 1012345678) );
		mbr.add( new member("노재홍" , "shwo5158@naver.com", "남성(아닐수도있음)", 1054805158));
		mbr.add( new member("노른자" , "noh@naver.com", "남성?", 1098765432) );
		mbr.add( new member("노인정" , "roh@naver.com", "여성" , 1074185296) );
		mbr.add( new member("노약자" , "no@naver,com", "중성", 1096385274) );
		
		System.out.println( mbr );
		System.out.println( mbr.get(2));
		System.out.println( mbr.size());
		System.out.println( mbr.subList(1, 4));
		
		member tmp = new member("노약자" , "no@naver,com", "중성", 1096385274);
		System.out.println( mbr.indexOf( tmp ));
		System.out.println( mbr.contains( tmp ));
		
		
		//indexOf()
		
		//System.out.println( mbr );
		
		
//		ArrayList<Integer> arr = new ArrayList();
//		
//		arr.add(10);
//		arr.add(20);
//		arr.add(50); //배열의 마지막에 새로운 데이터 추가
//		arr.add(1,100); //배열의 지정한 인덱스 위치에 새로운 데이터 추가
////		arr.add("제네럴 리");
////		arr.add(3.14);
//		System.out.println(arr);
//		
//		for( int i = 0; i < arr.size(); i++) {
//			if( arr.get(i)> 20 );
//			System.out.println( arr.get(i) );
//		}
//		System.out.println("arraylist에 값 존재여뷰 contains " + arr.contains(20));
//		System.out.println("값이 몇번째 인덱스야 indexOf " + arr.indexOf(50));
//		System.out.println("arraylist에 갑이 몇개나 있냐 size " + arr.size());
//		arr.remove(2); //지정한 인덱스 위치의 값 삭제
//		System.out.println("arraylist 비어있냐 isEmpty " + arr.isEmpty());
//		System.out.println("범위내 값 출력 subList " + arr.subList(1, 3));
//		
//		arr.set(1, 200);
//		System.out.println("값 변경 set " + arr);
//		
//		// arr.toArray(); - ArrayList를 정적 배열로 변환
//		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("이순신"); name.add("강감찬"); name.add("김유신"); name.add("장영실");
//		String[] names = new String[name.size()];
//		name.toArray(names);
//		System.out.println( Arrays.toString(names));
//		
//		//정렬 (기본데이터만 가능 - 객체, 등등 은 안됨)
//		//Collections.sort(); //사전적 순서 정렬
//		//arr.sort(Comparator.naturalOrder());// 사전적 순서 정렬
//		//arr.sort(Comparator.reverseOrder());// 사전적 순서의 역방향 정렬
//		Collections.sort( arr );
//		System.out.println( arr );
//		
//		Collections.sort( name );
//		System.out.println( name );
		
		
		
		
		
		
	}

}

// ArrayList(동적 배열)
// 기존의 배열을 동적으로 사용하기 위한 클래스
// 기존 배열과 다른점은 여러 타입으로 지정해서 사용 할 수 있다.(제네릭)
// ArrayList에 기본 데이터타입은 Object라는 자바 최상의 클래스 타입이다.
// ArrayList처럼 Collection의 모든 클래스들은 타입을 지정해서 사용해야 한다.

// ArrayList<클래스> -> ArrayList(동적배열)에 저장할 데이터(객체) 타입을
// <>안에 작성 하여 사용 해야 한다.
// <>안에 클래스를 넣어주면 해당 타입으로 동작 되도록 하는 방법은 제네릭이다.
// 제네릭은 사용자가 지정한 타입에 맞추어 사용 할 수 있도록 자바에서 제시하는 방법
// 제네릭을 사용하면 여러 타입을 처리하기 위한 코드의 복잡성이 줄어 들고
// 타입의 안정화를 도모 할 수 있다.

// 교재 624pg
// 자바 컬렉션
// 다수의 데이터 또는 다수의 객체를 저장, 관리, 가공 하기 위한 자료구조 및 알고리즘을
// 개발자가 쉽게 사용할 수 있도록 만들어 놓은 인터페이스 및 클래스이다.

// Collection, Map (최상위 인터페이스)
// Collection의 하위 인터페이스 - List => ArrayList
//								   => Vector
//								   => LinkedList
//								   => Stack

//			  				- Set  => HashSet
//								   => TreeSet
// Collection 의 하위 인터페이스들은 모두 같은 메소드를 씀

// Map - Hashtable
//	   - HashMap
//	   - TreeMap

