package ex12;

import java.io.File;
import java.io.IOException;
///[ 김찬영  2023-07-3 오후 04:35:08 ]

public class Example01 {
  public static void main(String[] args) {
	File fileObj = new File("src\\ex12\\example01.txt"); // 생성할 위치 끌어오면 \가 두개씩 들어온다..
	
	try {
		boolean success = fileObj.createNewFile();
		if(success) {
			System.out.println("파일 생성 성공");
		}else {
			System.out.println("파일 생성 실패");
		}
	} catch(IOException e) {
		System.out.println(e.getMessage());
	}
}
}
