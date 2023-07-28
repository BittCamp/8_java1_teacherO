package sec01.lamda;
//[ 김찬영  2023-07-7 오후 03:24:09 ]	
interface NewObject<T>{
	T getObject(T o);
}
interface NewArray<T>{
	T[] getArray(int size);
}

public class ConstructorRefDemo {
	public static void main(String[] args) {
		NewObject<String> s; //NewObject 클래스를 String으로만 쓰도록
		NewArray<Integer> i; //NewArray 클래스를 Integer로만 쓰도록
//		  s = x -> new String(x);
		s = String::new; // 축약형으로 구현
		String str = s.getObject("사과");
//		  i = x -> new String(x);
		i = Integer[]::new;// 축약형으로 구현
		Integer[] array = i.getArray(2);  // 2개 를 만들겠다고 선언하는 거임.
		array[0] = 10;
		array[1] = 20;
		
		System.out.println("str==> " + str);
		System.out.println("i==> " + i);
	}

}
