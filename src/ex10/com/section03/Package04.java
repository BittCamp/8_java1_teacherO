package ex10.com.section03;

public class Package04 {
	//[ 김찬영  2023-06-28 오후 02:47:12 ]
	public static void main(String[] args) {
	  String str1 = "www.google.com";
	  
	  
	  String[] arrStr1;
	  
	  arrStr1 = str1.split("\\."); // \\ <== 특수문자는 역슬래시 두번 다음에 써줘야 된다 .을 기준으로 문자열로 나눠보기 '\.' 으로 인식시키고 싶으면.
	  
	  for(int i = 0; i< arrStr1.length; i++) {
		  System.out.println(arrStr1[i]);
	  }
	  // 확장형 for 문.
	  for(String s : arrStr1) {
		  System.out.println(s);
	  }
	}

}
