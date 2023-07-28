package ex12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example04 {
	//[ 김찬영  2023-07-3 오후 06:42:20 ]
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			File file = new File("src\\ex12\\example03.txt");
			if(!file.exists())
				file.createNewFile();
			//file 을 입력용으로 생성해라. (오픈해라) 
			fis = new FileInputStream(file);
			int i = 0;
			while((i =fis.read()) != -1) { // 끝이면 -1. null일때 까지 읽어라. null 이 -1
				System.out.print((char) i );// 문자로 바꿔서 출력
			}
			System.out.println("\n파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis!=null)
				try {
					fis.close();
				}catch(IOException e) {}
		}
	}
}
