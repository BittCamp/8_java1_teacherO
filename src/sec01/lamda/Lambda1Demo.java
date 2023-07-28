package sec01.lamda;

import java.util.Arrays;
//[ 김찬영  2023-07-7 오후 12:48:33 ]
		
public class Lambda1Demo {
	public static void main(String[] args) {
		String[] strings = {"로마에 가면 로마법을 따르라.","시간은 금이다","펜은 칼보다 강하다."};
		//sort함수를 통해서 두개의 인수를 비교
		//Arrays.sort(객체형 배열, 비교해서 결과를 내기위한 함수)
		// 문장의 길이가 짧은게 앞에 있다. 그걸로 오름차순배열.
		/*이 함수는
		  (first,second) -> first.length() - second.length()
		  ==
		  int compareA(first,second)) {
		  	return first.length() - second.length()
		  }
		 * */
		Arrays.sort(strings, (first,second) -> first.length() - second.length());
		
		for(String s : strings)
			System.out.println(s);
		
	}
}
