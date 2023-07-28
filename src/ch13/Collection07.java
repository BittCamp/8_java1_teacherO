package ch13;

import java.util.TreeMap;

public class Collection07 {
	public static void main(String[] args) {//[ 김찬영  2023-07-7 오전 11:46:03 ]
		TreeMap<Integer,String> str = new TreeMap<Integer,String>();
		
		str.put(1, "A");
		str.put(2, "B");
		str.put(3, "C");
		
		System.out.println("KEYS=VALUE : " + str);
		
		System.out.print("Keys : ");
		for(Integer key : str.keySet()) {
			System.out.print(key);
			System.out.print(",");
		}
		
		
	}
}
