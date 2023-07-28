package sec03.stream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
//[ 김찬영  2023-07-12 오후 01:47:55 ]

public class OptionalDemo {
	public static OptionalDouble divide(double x, double y) {
		return y ==0 ? OptionalDouble.empty() : OptionalDouble.of(x/y); 
	}
	
	public static void main(String[] args) {
		OptionalInt i = OptionalInt.of(100);
		OptionalDouble d = OptionalDouble.of(3.14);
		Optional<String> s = Optional.of("apple");
		System.out.println("1: "+i.getAsInt());
		System.out.println("2: "+d.getAsDouble());
		System.out.println("3: "+s.get());
		System.out.println("4: "+i);
		System.out.println("5: "+d);
		System.out.println("6: "+s);
		System.out.println("7: "+divide(1.0,2.0));
		System.out.println("8: "+divide(1.0,0.0));
	}
	
}
