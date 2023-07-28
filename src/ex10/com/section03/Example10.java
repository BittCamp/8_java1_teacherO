package ex10.com.section03;

import java.util.Calendar;

public class Example10 {
	public static void main(String[] args) {
		// 특별하게 만들어져 있는 인스턴스를 가져오라.... 하나의 애플리케이션에 한번의 인스턴스만 사용하기 위해 사용
		// 한번에 하나만 사용 ==> single tone 패턴을 지향...
		Calendar calendar = Calendar.getInstance();
		System.out.println("현재 날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR)+ "년");
		System.out.print((calendar.get(Calendar.MONTH)+1)+ "월");
		System.out.print(calendar.get(Calendar.DATE)+ "일");
	}
}
