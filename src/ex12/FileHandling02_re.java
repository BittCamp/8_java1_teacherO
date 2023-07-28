package ex12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//[ 김찬영  2023-07-3 오후 04:52:41 ]
public class FileHandling02_re {
	public static void main(String[] args) {
		// "" 안에 있는 것은 파일이야... 이링크에 파일이렇게 만들어
		File file  = new File("src\\ex12\\gugudan.txt");
		//출력용 파일(바이트스트림)을 선언
		FileOutputStream fos = null;
		try {
			// 파일 객체가 없으면 생성
			if(!file.exists())
				file.createNewFile();
			// 그 file 이라는 객체를 출력용으로 열어라.
				fos = new FileOutputStream(file);
			for(int x =2; x<=9; x++) {
				for(int y=1; y<=9; y++) {
					String str = x+ "X" + y + "=" + (x*y)+ "\n";
					// 문자열을 바이트로 변경해서 배열에 저장
					byte[] b = str.getBytes();
					// 바이트 배열을 파일에 출력
					fos.write(b);
				}
			}
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e) {}
			}
		}
	}
}
