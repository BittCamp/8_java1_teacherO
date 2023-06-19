package ex6;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Java Programming ";
		String s1 ="Java";
		String s2 =" Programming";
		String s3 =s1.concat(s2); // concat(컨케이트) s1 과 s2를 합쳐라 라는 뜻.
		String s4 = s.trim(); // 양쪽의 빈칸을 짤라라
		
		System.out.println("s3"+s3);
		System.out.println("s4"+s4);
		System.out.println("s3.equals(s4)  " + s3.equals(s4));

	}

}

