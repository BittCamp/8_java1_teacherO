package test;

import ex7.Annimal;
//[ 김찬영  2023-06-22 오전 11:17:40 ]
// 접근제한자
public class Use {
	public static void main(String[] args) {
		Annimal a  = new Annimal();
		//a.name ="이쁜동물"; //패키지가 다르기에 상속관계여야 하는데 상속관계가 아니라 안됨
		System.out.println(a.getName()); // 사용을 위해선 get으로 받아와서 쓸수있음.
		//a.h = "헬로"; //다른패키지라 안됨 h는 디폴트다. 동일한 패키지내 
		//System.out.println(a.h); //다른패키지라 안됨.
		System.out.println(a.getH());	
		 
	}
}
