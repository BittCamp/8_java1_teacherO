package ex8;

public class CalculateSquare {
	//[ 김찬영  2023-06-26 오후 03:25:38 ]
	public void square() {
		System.out.println("No Parrameter Method Called");
	}
	
	public int square(int width , int height) {
		int area = width*height;
		return area;
	}
	public double square(double width , double height) {
		double area = width*height;
		return area;
	}
	public double square(int width , double height) {
		double area = width*height;
		return area;
	}
}
