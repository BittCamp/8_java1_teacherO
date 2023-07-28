package ex13;

import java.util.Vector;
//[ 김찬영  2023-07-5 오후 04:37:58 ]
public class Example03 {
	public static void main(String[] args) {
		
		Vector<String> cats = new Vector<String>(); 
		// 백터랑 어레이 리스트랑 비슷한거라고 생각하면 된다.
		cats.add("페르시안");
		cats.add(null);
		System.out.println(cats);
		cats.add(1,"샴");
		System.out.println(cats);
		cats.set(2, "러시안블루");
		System.out.println(cats);
		cats.remove( "페르시안");
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
	}
}
