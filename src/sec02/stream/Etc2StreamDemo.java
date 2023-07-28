package sec02.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//[ 김찬영  2023-07-12 오후 01:47:28 ]

public class Etc2StreamDemo {
	public static void main(String[] args) {
		IntStream is1 = IntStream.iterate(1, x -> x + 2 );
		
		IntStream is2 = new Random().ints(0,10);
		
		Stream<Double> ds = Stream.generate(Math::random);
		
		IntStream is3 = IntStream.range(1, 5);
	}
}
