package ex13;

import java.util.HashSet;

public class Collection04 { //[ 김찬영  2023-07-5 오후 04:37:58 ]
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str +"\n");
		
		System.out.println("HashSet 요소 :");
		for(String elements:str)
			System.out.print(elements+" ");
		
		
		String[] array = new String[str.size()];
		str.toArray(array);
		
		System.out.println("\n");
		System.out.println("Array 요소 : ");
		for(int i =0; i < array.length; i++)
			System.out.print(array[i]+ " ");
		
		}
}
