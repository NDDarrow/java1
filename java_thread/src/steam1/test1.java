package steam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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
		
		//컬렉션 스트림
		List<String> list = Arrays.asList(arr);
		Stream<String> stream2 = list.stream();
		
		System.out.println( stream2.count());
		
		//스트림 빌더
		Stream<String> stream3 = Stream.<String>builder().add("a").add("b").add("c").build();
		
		Stream<Integer> stream4 = Stream.iterate(1 , n-> n+1).limit(10);
		
		//stream3.forEach(System.out::println);
		//stream4.forEach(System.out::println);
		
		//기본 데이터 타입형 스트림
		IntStream intStream = IntStream.range(1, 11);
		LongStream longStream = LongStream.range(1, 101);
		DoubleStream floatStream = new Random().doubles(5);
		
		IntStream charStream = "banana".chars();
		
		List<String> names = new ArrayList<>();
		names.add("이성계");names.add("정약용");names.add("정도전");
		names.add("엘리자베스2세");names.add("간디");names.add("히틀러");
		names.add("조지워싱턴");names.add("조바이든");names.add("프란츠카프카");
		
		// filter - 참과 거짓에 따라 동작 if문의 조건식과 비슷한 식을 구사하면 된다.
		
		Stream<String> 정 = names.stream().filter( name -> name.contains("정") );
		// names List의 첫번째 값부터 마지막 값까지 차례대로 name이라는 매개변수에 전달하여 처리한다.
		
		정.forEach(System.out::println);
		
		Stream<String> 조 = names.stream().filter( name -> name.contains("조") );
		조.forEach(System.out::println);
		
		names.stream().filter( name -> name.length() == 2 ).forEach(System.out::println);
		
		// map - 값들을 특정값으로 변환 해주는 작업(반복문 내제)
		Stream<String> 이름 = names.stream().map( name -> name.substring(1) );
		이름.forEach(System.out::println);
		
		
		
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