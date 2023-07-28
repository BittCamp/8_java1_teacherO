package ex9;

public class Circle extends Shape {
	//[ 김찬영  2023-06-27 오후 02:26:44 ]
	double radius;
	
	public Circle(String color, double radius) {
		super(color); // 생성자 자동으로 생성
		System.out.println("Circle 클래스 생성자 호출");
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return radius*radius *3.14;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원 색상은 " + super.getColor()+ "그리고 면적은 : "+ area();
	}
	//*보충
	public void ci() {
		System.out.println();
	}
}
