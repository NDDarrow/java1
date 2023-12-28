package study1221;

public class student {
	String name; // 이름 - 인스턴스변수
	int kor; //국어성적 -인스턴스
	int mat; //수학정석 - 인스턴스
	int eng; //영어성적 - 인스턴스
	int total;//총점 - 인스턴스
	float avg;//평균 - 인스턴스
	
	//생성자 메서드는 클래스명으로 매서드 이름을 사용한다.
	// js는 같은 이름의 함수 사용이 불가능하다
	// java는 매개변수가 다르면 같인 이름의 메서드를 사용할 수 있다.
	// 같은 이름의 메소드에 타입, 매개변수의 갯수만 다르면 오버로딩이 된다.
	// 오버로딩 - 메서드의 이름은 같아야한다.
	//			매개변수는 같으면 안된다.( 타입이 다르거나, 매개변수가 갯수가 다르거나
	//			동일한 클래스에서만 오버로딩 할 수 있다.
	student(){}
	student(String name, int k, int m, int e){
		this.name = name;
		this.kor = k;
		this.mat = m;
		this.eng = e;
		this.calc();
	}
	
	@Override
	public String toString() {
		return name + " [" + kor + " , " + mat + " , " + eng + "] 총점 : " + total + " 평균 : " + String.format("%.1f", avg);
		
	}
	
	//메서드 구조 - 반환타입 메서드이름(매개변수){ }
	void calc() {
		this.total = kor+mat+eng;
		avg = total/3.0f;
	}
	
}
