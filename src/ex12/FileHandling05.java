package ex12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//[ 김찬영  2023-07-4 오후 04:39:11 ]
public class FileHandling05 {
	public static void main(String[] args) {
		File file = new File("src\\ex12\\member.txt");
		FileReader fis = null;
		
		try {
			if(!file.exists())
			file.createNewFile();
		 fis = new FileReader(file);
		 int i = 0;
		 while((i = fis.read()) != -1) {
			 System.out.print((char) i);
		 }
		 System.out.println("\n파일 읽기 성공");
		}catch (Exception e) {
			 System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {}
		}
	}
}
