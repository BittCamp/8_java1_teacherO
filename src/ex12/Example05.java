package ex12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//[ 김찬영  2023-07-4 오후 04:39:11 ]
public class Example05 {
	public static void main(String[] args) {
		FileReader fis = null;
		try {
			File file = new File("src\\ex12\\example03.txt");
			if(!file.exists())
				file.createNewFile();
			fis = new FileReader(file);
			int i = 0;
			while ((i = fis.read()) != -1) { // 파일이 끝나면 -1을 반환한다. ( null 이 -1임.) 
				System.out.print((char) i);
			}
			System.out.println("\n파일 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}finally {
		   try {
			   fis.close();
		} catch (IOException e) {}
		}
	}
}
