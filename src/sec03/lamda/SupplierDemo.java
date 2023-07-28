package sec03.lamda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
//[ 김찬영  2023-07-11 오후 04:11:26 ]
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s1 = ()-> "apple";
		System.out.println("s1의 실행"+s1.get());
		
		//x라는 정수형 배열을 선언하고 0으로 초기화
		int[] x = {0}; //1개짜리 배열
		IntSupplier s2 = () -> x[0]++;
		for(int i=0; i<3; i++)
			System.out.println(s2.getAsInt());

		//10까지 수 중 임의로 하나 출력
		DoubleSupplier s3 = () -> Math.random() * 10;
		System.out.println(s3.getAsDouble());
	
		SimpleDateFormat format = new SimpleDateFormat("MM월 dd일(E요일) a hh:mm:ss");
		Supplier<String> s4 = () -> format.format(new Date());
		System.out.println(s4.get());
		
	}
}
