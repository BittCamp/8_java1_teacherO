package sec01.lamda;
//[ 김찬영  2023-07-7 오후 12:48:33 ]
public class Rectangle  implements Comparable <Rectangle>{ /// Rectangle이라는 객체를 사용할
																// Comparable 을 구현해라
	// Rectangle은 Comparble의 구현체
	private int width, height;								
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int findArea() {
		return width*height;
	}
	public String toString() {
		// String.format("사각형[폭=%d , 높이 =%d]", width, height)
		// format 형식을 주는 메소드 %d는 숫자형과 짝을 맞출때 사용
		// 사각형[폭=%d , 높이 =%d] 출력할때 사용하는 방법
		return String.format("사각형[폭=%d , 높이 =%d]", width, height);
	}
	public int compareTo(Rectangle o) { // 오버라이딩 : 객체형을 만드는 사람이 정의
		return findArea() - o.findArea();
	}
}
