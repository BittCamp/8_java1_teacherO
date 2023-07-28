package sec03.lamda;
//[ 김찬영  2023-07-11 오후 04:11:26 ]
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		//Consumer<T> c = t->{T타입 t객체를 사용한 후 void를 반환하는 실행문;};
		Consumer<String> c1 = x-> System.out.println(x.toLowerCase());
		c1.accept("Java Function Interface Lambda");
		
		// 함수형 인터페이스 구현(accept 구현)
		BiConsumer<String, String> c2 = (x,y) -> System.out.println(x+":"+y);
		c2.accept("Java", "Lambda");
		
		// 함수형 인터페이스를 여러 줄로 구현
		ObjIntConsumer<String> c3 = (s,x)->{
			int a = Integer.parseInt(s)+x;
			System.out.println("문자열과 숫자의 합"+a);
		};
		c3.accept("100", 50);
		//IntConsumer의 accept()메서드를 구현
		
		
		// 함수형인터페이스는 추상메서드를 하나만가지고있다고했는데
		// 여기서 어떤게 추상메서드인가?
		// 람다식은 메서드인건 알겠어.
		// 그럼 람다식이 추상메서드인가?
		// 람다식이 추상메서드라면, 이건 아직 구현이 안된거니까 내가생각한 인터페이스가 맞네.
		// 그럼ㅇㅋ
		/* c4.andThen(x->System.out.printf("%d+10=%d\n",x,x+10)
		 *  c.andThen(a)
		 *  1. c의 accept 먼저 실행하고
		 *  2. a의 accept 를 실행해라!
		 *  accept는 다시 추상메서드이므로
		 *  x->System.out.printf("%d+10 = %d\n",x,x+10)로 재정의 한 것임.
		 * */
		IntConsumer c4 = x->System.out.printf("%d * %d = %d", x, x, x*x);
		IntConsumer c5 =
		c4.andThen(x->	System.out.printf("\n%d+10 = %d", x,x+10));
		
	
		c5.accept(6);
	}
}
