package ex10.com.section03;

import java.util.Date;
//[ 김찬영  2023-06-28 오후 04:15:56 ]
public class Example09 {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);
		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		System.out.println(date2);
		
	}
}
