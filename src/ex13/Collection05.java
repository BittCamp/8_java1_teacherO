package ex13;

import java.util.TreeSet;
//[ 김찬영  2023-07-5 오후 04:37:58 ]
public class Collection05 {
	public static void main(String[] args) {
		TreeSet<String> str = new TreeSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("TreeSet요소: ");
		for(String elements : str)
			System.out.print(elements + " ");
		}
}
