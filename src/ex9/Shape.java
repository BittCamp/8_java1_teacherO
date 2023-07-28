package ex9;

public abstract class Shape {
	//[ 김찬영  2023-06-27 오후 02:26:44 ]
	
	String color;
	
	abstract double area();
	
	// 메소드 세개다.
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() {return color;	}
}
