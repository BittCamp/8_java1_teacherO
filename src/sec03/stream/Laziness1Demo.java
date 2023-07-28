package sec03.stream;

import java.util.stream.IntStream;

//[ 김찬영  2023-07-12 오전 10:46:53 ]
public class Laziness1Demo {
	public static void main(String[] args) {
		// 느긋한 연산으로 연결 했으므로 아직 연산이 안되고 있음.
		// 조급한 연산이 끼어 들어야 느긋한 연산이 실행됨. foreach 가 조급한 연산임.
		// 스트림은 속도가빠르고 메모리를 사용하지 않음.
		IntStream is = IntStream.rangeClosed(1,5);
		is.filter(x -> {
			System.out.println("filter :" + x);
			return x%2 ==0; //짝수
		}).map (x-> {
			System.out.println("map : "+x);
			return x * x; //제곱
		}).forEach(x->System.out.println("forEach: "+ x));
	}

}
