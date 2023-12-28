package 과제;

public class supercar extends car{
	String engine;
	
	supercar(String en){
		this.engine = en;
	}
	@Override
	public String toString() {
		return "배기량: " + displacement + "cc 차중량: " + weight + "kg 엔진 : " + engine + "\n색상 : " + 
				color + " 브랜드 : " + brand;
	}
}
