package ex13;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection01 { //[ 김찬영  2023-07-5 오후 04:37:58 ]
	public static void main(String[] args) {
		// ArrayList객체를 만들고 이름은 num 인데 그안에 들어가는 데이터는  Integer임
		ArrayList<Integer> num = new ArrayList<Integer>();
		//10에서 시작해서 1까지 1씩 감소하여 num에 추가 함
		for( int i = 10; i>=1; i--) 
			num.add(i);
		//num 모두 출력
		System.out.println(num);
		System.out.print("정렬 전: ");
		// 하나씩 출력하기num.get(i) 각 방에 있는 값 전환
		for(int i = 0; i< num.size(); i++)
			System.out.print(num.get(i)+" ");
		//Comparator.naturalOrder() 는 자연스러운 순서로 비교하여 전환
		num.sort(Comparator.naturalOrder()); // .sort 정렬
		System.out.println();
		
		System.out.print("정렬 후 : ");
		for(int i =0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		}
	}

