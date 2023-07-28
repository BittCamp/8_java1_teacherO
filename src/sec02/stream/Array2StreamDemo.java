package sec02.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//[ 김찬영  2023-07-12 오전 10:34:19 ]
public class Array2StreamDemo {
	public static void main(String[] args) {
		int[] ia = {2,3,5,7,11,13};
		//정수형 배열을 스트림으로 받기 Arrays.stream(ia);
		IntStream is = Arrays.stream(ia);
		 is.filter(i -> i%2==1).sorted() //sorted() 저장하라.  .forEach(x-> System.out.print(x+" ")); 각자 출력하라.
		 			.forEach(x-> System.out.print(x+" "));
		String[] strings = { "The","pen","is","mighter","than",
				"the","sword"};
		//문자열 객체는 Stream.of(strings); 으로 받음
		Stream<String> ss =
				Stream.of(strings);
		//double 배열에 있는 내용을 스트림으로 받기
		double[] da = {1.2,3.14,5.8,0.2};
		DoubleStream ds = 
				DoubleStream.of(da);
	}
}
