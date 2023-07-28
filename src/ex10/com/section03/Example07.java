package ex10.com.section03;

public class Example07 {
	//[ 김찬영  2023-06-28 오후 03:44:19 ]
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Programming");
		System.out.println(sb);
		sb.insert(6, "Java ");
		System.out.println(sb);
		sb.replace(1, 4, "Good");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
