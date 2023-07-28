package ex7;

public class Use {
	//[ 김찬영  2023-06-22 오전 11:12:32 ]
	// /java1/src/test/Use.java 와 연관
	// 접근제한자
	public static void main(String[] args) {
		Annimal a  = new Annimal();
		a.name ="이쁜동물"; // 상속관계가 아니지만 같은 패키지 내에 있어서 가능.
		System.out.println(a.getName());
		a.h = "헬로"; // 패키지가 같아서 가능.
		System.out.println(a.h);
		System.out.println(a.getH());	
	}

}
