package ex10.com.section03;

import java.util.Date;

public class Package08 {
	//[ 김찬영  2023-06-28 오후 04:00:55 ]
	
	public static void main(String[] args) {
		
		Date this_date = new Date(2023,06,28);
		Date given_date = new Date(2020,12,24);
		
		boolean status1 = this_date.after(given_date);
		boolean status2 = this_date.before(given_date);
		
		System.out.println("2020 , 12, 24일은 2023 ,6,28 이후일 이다: " + status1);
		System.out.println("2020 , 12, 24일은 2023 ,6,28 이전일 이다: " + status2);
		
		
	}
}
