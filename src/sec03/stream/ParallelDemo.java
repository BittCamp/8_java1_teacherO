package sec03.stream;

import java.util.stream.IntStream;
//[ 김찬영  2023-07-12 오후 01:47:59 ]

public class ParallelDemo {
	
	public static void main(String[] args) {
		long start, end , total;
		
		IntStream sequantial = IntStream.rangeClosed(1, 100000000);
		start = System.currentTimeMillis();
		total = sequantial.sum();
		end = System.currentTimeMillis();
		System.out.println("순차 처리 : "+ (end - start));
		
		IntStream parallel = IntStream.rangeClosed(1, 100000000).parallel();
		start = System.currentTimeMillis();
		total = parallel.sum();
		end = System.currentTimeMillis();
		System.out.println("병결 처리 : " + (end - start));
	}
	
}
