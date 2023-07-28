package ex13;

import java.util.LinkedList;
//[ 김찬영  2023-07-4 오후 06:00:58 ]
public class Example02 {
	public static void main(String[] args) {
		LinkedList<String> cats = new LinkedList<String>();
		cats.add("러시안블루");
		cats.addFirst("페르시안");
		cats.addLast("래그돌");
		System.out.println(cats);
		cats.add(1,"샴");
		System.out.println(cats);
		cats.add(2,"코리안쇼트헤어");
		System.out.println(cats);
		cats.removeFirst();
		cats.removeLast();
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
	}
}
