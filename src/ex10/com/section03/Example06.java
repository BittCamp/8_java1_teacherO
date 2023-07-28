package ex10.com.section03;

public class Example06 {
	//[ 김찬영  2023-06-28 오후 02:59:25 ]
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Programming");
		System.out.println("sb");
		sb.insert(6, "Java");
		System.out.println(sb);
		sb.replace(1, 4, "Good"); // 1부터 4 이전까지 바꿔라 Good 으로
		System.out.println(sb);
		sb.delete(1, 5); // 1부터 5 이전까지 삭제해라
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
