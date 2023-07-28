package ex10.com.section03;

import java.util.Calendar;
public class Package09 {
	//[ 김찬영  2023-06-28 오후 04:00:55 ]
	public static void main(String[] args) {
		
		Calendar obj1 = Calendar.getInstance();
		Calendar obj2 = Calendar.getInstance();
		
		obj2.add(Calendar.YEAR, 10);
		// 인스턴스만 같은거지 인스턴스를 사용하고있는 애들은 다르다.
		
		System.out.println("obj1: "+ obj1.getTime());
		System.out.println("obj2: "+ obj2.getTime());
		
		int comp = obj1.compareTo(obj2);
		
		System.out.println("obj1.compareTo(obj2): " + comp);
		
	}
}
