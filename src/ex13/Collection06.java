package ex13;

import java.util.HashMap;
import java.util.Map.Entry;
//[ 김찬영  2023-07-5 오후 04:37:58 ]
public class Collection06 {
	public static void main(String[] args) {
		HashMap<Integer,String> str = new HashMap<Integer,String>();
		
		str.put(1, "A");
		str.put(2, "B");
		str.put(3, "C");
		
		System.out.println(str);
		
		System.out.println("Keys : ");
		for(Integer key : str.keySet()) {
			System.out.println(key);
			System.out.println(", ");
		}
		
		System.out.println();
		System.out.println("Values : ");
		for(String value : str.values()) {
			System.out.println(value);
			System.out.println(",");
		}
		
		System.out.println();
		System.out.println("keys=Values : ");
		for(Entry<Integer, String> entry: str.entrySet()) {
			System.out.println(entry);
			System.out.println(",");
		}
		
		
		}
}
