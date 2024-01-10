package steam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		
		//배열스트림
		String[] arr = new String[] {"desk","table","orange"};
		Stream<String> stream = Arrays.stream(arr);
		
		//스트림은 일회용이다.
		stream.forEach(System.out::println);
		Arrays.stream(arr).forEach(System.out::println);
		
		stream = Arrays.stream(arr, 1, 3);
		stream.forEach(System.out::println);
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("a"); list.add("b"); list.add("c");list.add("d");
//		
//		list.stream().filter("b"::equals).forEach(System.out::println);
	
//		for( String val : list) { //해당객체에 리스트 내용이 다들어간다
//			if(val.equals("b"))
//				System.out.println("값 있음" + val);
//		}
//		
//		Iterator<String> it = list.iterator();
//		while( it.hasNext()) {
//			String val = it.next();
//			if( val.equals("b") ) {
//				System.out.println("값 있음" + val);
//			}
//		}
//		

	}

}

// stream - 데이터의 흐름, 컬렉션 프레임워크에 여러개의 메서드를 조합하여
//			원하는 결과를 얻을 수 있지만 stream을 이용하면 코드의 양을 줄이고 간단하게 표현할 수 있다.
//			배열과 컬렉션을 함수형 이라는 형태로 처리가 가능하다.
//			stream은 병렬 처리가 가능하다. 둘 이상의 작업을 동시에 진행 가능(쓰레드 이용)
// stream사용 : (배열 또는 컬렉션).맵핑.필터링.결과만들기 -> 결과물