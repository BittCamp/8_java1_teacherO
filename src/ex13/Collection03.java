package ex13;

import java.util.Collections;
import java.util.Vector;

public class Collection03 {
	//[ 김찬영  2023-07-5 오후 04:37:58 ]
	public static void main(String[] args) {
		Vector<Integer> num = new Vector<Integer>();
		
		for(int i =10; i>= 1 ; i--) {
			num.add(i);
		}
		
		System.out.println(num);
		
		System.out.println("정렬 전 :");
		for(int i=0; i<num.size();i++)
			System.out.print(num.get(i) + " ");
		
		Collections.sort(num);
		
		System.out.println();
		
		System.out.println("정렬 후 :");
		for(int i=0; i<num.size();i++)
			System.out.print(num.get(i) + " ");
		
		}
	}

