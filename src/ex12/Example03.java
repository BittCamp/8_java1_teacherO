package ex12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//[ 김찬영  2023-07-3 오후 05:19:53 ]
public class Example03 {
	public static void main(String[] args) {
		FileWriter myWr = null;
		try {
			File f = new File("src\\ex12\\example03.txt");
			if(!f.exists())
				f.createNewFile();
			myWr = new FileWriter(f);
			myWr.write("Hello!!\n");
			myWr.write("Java Programming");
			System.out.println("파일쓰기 성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(myWr != null) {
				try {
					myWr.close();
				} catch (IOException e) {} 
			}
		}
	}
}
