package ex13;

import java.util.HashMap;
import java.util.Iterator;
///[ 김찬영  2023-07-5 오후 06:06:32 ]
public class Example06 {
	public static void main(String[] args) {
		// HashMap은 <번호,값> 으로 저장
		// {1=값 , 2=값} 형태로 저장. 출력.
		HashMap<Integer,String> cats = new HashMap<Integer, String>();
		cats.put(1, "페르시안");
		cats.put(2, "샴");
		System.out.println( "1 " + cats);
		cats.put(3, "러시안블루");
		System.out.println( "2 " + cats);
		cats.put(3, "래그돌");
		System.out.println( "3 " + cats);
		cats.remove(1);
		System.out.println( "4 " + cats);
		System.out.println( "5 " + cats.size());
		System.out.println( "6 " + cats.get(2));
		System.out.print("(Key,Value)=");
		Iterator<Integer> keys = cats.keySet().iterator();
		while(keys.hasNext()) {
			int key = keys.next();
			System.out.print(" ("+key+"," + cats.get(key) + ") ");
		}
		
	}
}
