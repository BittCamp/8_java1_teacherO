package ex13;

import java.util.ArrayList;
//[ 김찬영  2023-07-4 오후 06:00:58 ]

public class Example01 {
	public static void main(String[] args) {
		// ArrayList 라는 컬렉션 ( 자료구조 ) 생성하는데 그안에 들어가는 자료는 String 형이다.
		ArrayList<String> cats = new ArrayList<String>();
		//참고 ArrayList 라는 컬렉션 ( 자료구조 ) 를 생성하는데 그안에 들어가는 자료는 정수형 (Integer)
	//	ArrayList<Integer> t = new ArrayList<Integer>();]
		// 어레이리스트는 박스에 동그란 구슬을 집어넣는거라고 보면 됨.
		//데이터 추가 add
		cats.add("페르시안");
		cats.add("null");
		System.out.println(cats);
		
		cats.add(1,"샴"); // 배열 사이에 넣는거.
		System.out.println(cats);
		
		cats.add(2,"러시안블루"); // 배열 사이에 넣는거.
		System.out.println(cats);
		
		cats.remove("페르시안"); // 배열 사이에 넣는거.
		cats.remove("러시안블루"); // 배열 사이에 넣는거.
		System.out.println(cats);
		
		cats.remove(1); // 인덱스로도 삭제할수 있음.
		System.out.println(cats);
		// ArrayList의 크기
		System.out.println(cats.size());
		// 해당 인덱스의 값 리턴
		System.out.println(cats.get(0));
		// 해당 리스트에 샴 있어요? true. 없으면? false
		System.out.println(cats.contains("샴"));
		// 샴이 들어있는 index는??
		System.out.println(cats.indexOf("샴"));
		
	}
}

