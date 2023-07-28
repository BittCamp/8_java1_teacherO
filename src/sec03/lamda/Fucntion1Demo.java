package sec03.lamda;
//[ 김찬영  2023-07-11 오후 04:11:26 ]
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class Fucntion1Demo {

	public static void main(String[] args) {
		Function<Integer, Integer> add2 = x->x+2;
		Function<Integer, Integer> mul2 = x->x*2;
		System.out.println("1:::"+add2.apply(3));
		System.out.println("2:::"+mul2.apply(3));
		System.out.println("3:::"+add2.andThen(mul2).apply(3));
		System.out.println("4:::"+add2.compose(mul2).apply(3));
		
		IntToDoubleFunction half = x->x /2.0;
		System.out.println(half.applyAsDouble(5));
		
		ToDoubleBiFunction<String, Integer> circleArea = (s,i)
				->Double.parseDouble(s)*i*i;
		double area = circleArea.applyAsDouble("3.14", 5);
		System.out.println(area);
	}

}
