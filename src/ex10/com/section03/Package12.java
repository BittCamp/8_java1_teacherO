package ex10.com.section03;

import java.text.SimpleDateFormat;
import java.util.Date;
//[ 김찬영  2023-06-29 오전 09:50:28 ]
public class Package12 {
	public static void main(String[] args) {
		Date date =new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		String fulldate = dateF.format(date);
		System.out.println("현재 날짜 : " + fulldate );
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		String day = dateFormat.format(date);
		System.out.println("일 : " + day );
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM");
		String month = dateFormat2.format(date);
		System.out.println("월 : " + month );
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("YYYY");
		String year = dateF.format(date);
		System.out.println("년 : " + year );
		
		
		
		
		
		
		
}
	}