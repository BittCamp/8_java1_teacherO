package sec03.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
//[ 김찬영  2023-07-11 오후 04:11:26 ]
public class Operator1Demo {

	// 함수형 인터페이스는 주로 어떤 때 사용할까?
	// 매개변수를 가지는 메서드와 생성자메서드를 만드는게 훨씬 쉽지 않나?
	// => 함수형인터페이스는 콜백(한 코드조각을 다른 코드조각에 전달하여 실행되도록 하는 기법)에 유용하기 때문.
	
	
	public static void main(String[] args) {
		IntUnaryOperator add2 = x->x+2;
		System.out.println(add2.applyAsInt(3));
		
		UnaryOperator<Integer> add2again = x->x+2;
		System.out.println(add2again.apply(3));
		
		IntUnaryOperator mul2 = x->x*2;
		IntUnaryOperator add2mul2 = add2.andThen(mul2);
		System.out.printf("(3+2)*2 = ");
		System.out.println(add2mul2.applyAsInt(3));
		
		IntBinaryOperator add = (x,y)->x+y;
		System.out.println(add.applyAsInt(1, 2));
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.replaceAll(e->e+10);
		System.out.println(list);

	}

}
