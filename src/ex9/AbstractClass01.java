package ex9;
//[ 김찬영  2023-06-27 오후 03:22:17 ]

public class AbstractClass01 {
	public static void main(String[] args) {
	// Shape의 다형성. 
	  Shape s1 = new Circle("빨간색", 2.2);
	  Shape s2 = new Rectangle("노랑색", 2, 4);
	  
	  System.out.println(s1.toString());
	  System.out.println(s2.toString());
	  
	  //*보충
	  //상위 클래스 변수에 저장하는경우 
	  // 하위 클래스 로 생성했더라도 상위클래스에 없는 
	  // 메소드는 하위 클래스 레퍼런스 변수로 호출할수 없다.
	  // s1.ci이렇게 못쓴다.
	  Circle c = (Circle) s1; //캐스팅
	  c.ci();
	}
	
}
