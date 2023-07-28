package ex13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//[ 김찬영  2023-07-5 오후 04:37:58 ]
public class Example04 {
	public static void main(String[] args) {
		TreeSet<String> cats = new TreeSet<String>();
		cats.add("페르시안");
		cats.add("러시안블루");
		System.out.println(cats);
		
		cats.add("샴");
		System.out.println(cats);
		cats.add("코리안숏헤어");
		cats.add("터어키앙고라");
		cats.add("스핑크스");
		System.out.println(cats);
		System.out.println(cats.first());
		System.out.println(cats.last());
		System.out.println("=============");
		System.out.println(cats.size());
		System.out.println(cats.contains("샴"));
		System.out.println(cats.first());
		System.out.println(cats.last());
		
	}
}
