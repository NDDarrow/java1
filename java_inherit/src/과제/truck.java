package 과제;

public class truck extends car{
	int wheel;
	
	truck(int size){
		this.wheel = size;
	}
	
	@Override
	public String toString() {
		return "배기량: " + displacement + "cc 차중량: " + weight + "kg 바퀴 사이즈 : " + wheel + "인치\n색상 : " + 
				color + " 브랜드 : " + brand;
	}
}
