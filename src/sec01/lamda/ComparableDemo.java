package sec01.lamda;

import java.util.Arrays;
//[ 김찬영  2023-07-7 오후 12:48:33 ]
public class ComparableDemo {
	public static void main(String[] args) {
		Rectangle[] rectangles = {new Rectangle(3, 5),
				new Rectangle(2,10) , new Rectangle(5,5) };
		// Arrays sort는 Comparable을 통해서 비교한다.
		// Rectangle에는 Comparable을 구현하고 compartTo메소드를
		// 구현해야 한다.
		Arrays.sort(rectangles); //  A B C 를 비교해서 작은것부터 나열.
		
		for(Rectangle r : rectangles)
			System.out.println(r);
	}
}
