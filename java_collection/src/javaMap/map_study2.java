package javaMap;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class map_study2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<>();
		
		tree.put(2, "서울특별시");
		tree.put(41, "충청북도");
		tree.put(42, "대전광역시");
		tree.put(43, "충청남도");
		tree.put(32, "인천광역시");
		tree.put(51, "부산광역시");
		tree.put(53, "대구광역시");
		
		System.out.println( tree );
		
		//검색
		System.out.println( tree.ceilingEntry(50));
		// ceillingEntry - 지정한 키값 이상의 값 중 가장 작은 key와 value를 반환
		System.out.println( tree.ceilingKey(50));
		// ceillingKey - Entry와 다르게 key 값만 반환
		
		System.out.println( tree.floorEntry(30));
		System.out.println( tree.floorKey(30));
		// floorEntry - celling과 반대

		System.out.println( tree.higherEntry(42) );
		System.out.println( tree.higherKey(42) );
		System.out.println( tree.lowerEntry(42) );
		System.out.println( tree.lowerKey(42) );
		// higher, lower - ceilling, floor와 다르게 미만 초과를 사용 동일한 수는 반환하지 않음
		
		System.out.println( tree.firstEntry() );
		System.out.println( tree.firstKey() );
		System.out.println( tree.lastEntry() );
		System.out.println( tree.lastKey() );
		// first, last 문자그대로
		
		System.out.println( tree.pollLastEntry() );
		System.out.println( tree );
		// 가장 큰 키를 가진 엔트리를 반환하고 맵에서 삭제
		// pollFirstEntry() - 작은키에 실행
		
		System.out.println( tree. headMap(50) );
		// headMap,tailMap - 지정한 키값 이상, 이하의 값들을 반환한다
		// headMap(값, true or false) 두번째 변수로 true를 지정하면 이상, 이하 false를 지정하면 미만 초과가 된다
	
		System.out.println( tree.subMap(2, 51));
		//subMap(from, to) - from이상 to미만에 해당하는 엔트리들을 반환
		
		Properties prop = new Properties(); 
		//Map과 유사하지만 제네릭 타입이 존재하지 않음
		//초창기부터 존재하던 타입이기 때문에 Iterator를 사용할 수 없음
		//사용할 수 있는 데이터타입이 String에 한정됨
		prop.put("월요일", "너무싫어");
		prop.put("금요일", "너무좋아");
		prop.put("수요일", "왜요즘보강없음?");
		prop.put("화요일", "숨이턱");
		prop.setProperty("목요일", "슬슬보임"); //setProperty - Property 전용 삽입 도구 ※원칙은 put이 아닌 Property를 사용하는 것이 정석임
		
		System.out.println( prop.get("월요일"));
		System.out.println( prop.getProperty("금요일")); //get도 마찬가지로 getProperty라는 전용 도구가 존재함
		
		Enumeration em = prop.elements(); // Property의 Iterator
		while( em.hasMoreElements() ) { //hasMoreElements - Iterator의 hasNext
			System.out.println( em.nextElement() );
		}
		
		String filename = "C:\\Users\\DW\\git\\repository\\java1\\java_collection\\src\\javaMap\\router.properties";
		
		Properties router = new Properties();
		
		try (FileReader fs = new FileReader(filename))
		{
			router.load(fs);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println( router );
		System.out.println( router.getProperty("signup") );
		
	}

}
