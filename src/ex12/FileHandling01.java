package ex12;

import java.io.File;
///[ 김찬영  2023-07-3 오후 04:35:08 ]
public class FileHandling01 {
	public static void main(String[] args) {
		// 파일로 인식해서 생성 , 디렉토리도 가능
		File finfo = new File("src\\ex12\\Example01.java");
		
		if(finfo.exists()) {
			System.out.println("파일의 이름 : " + finfo.getName());
			System.out.println("파일의 경로 : " + finfo.getAbsolutePath());
			System.out.println("파일이 쓰기 가능한가?? : " + finfo.canWrite());
			System.out.println("파일이 읽기 가능한가?? : " + finfo.canRead());
			System.out.println("파일의 크기 : " + finfo.length());
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
	}
}
