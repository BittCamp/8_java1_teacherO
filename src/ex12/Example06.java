package ex12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//[ 김찬영  2023-07-4 오후 04:55:46 ]
public class Example06 {
	public static void main(String[] args) {
		FileReader fis = null;
		BufferedReader br = null;
		try {
			File file = new File("src\\ex12\\example03.txt");
			if(!file.exists())
				file.createNewFile();
			fis = new FileReader(file); // fis ===> 파일 파일리더 다가지고 있음.
										//기존 객체를 싸서 다른객체로 만듦. 이걸 데코레이션패턴이라고함. 파일이란걸 파일리더로.
			br = new BufferedReader(fis); // fis ===> 버퍼드리더 파일리더  파일 기능 다 가지고 있다. 
										  // 새로운 기능을 포장해서 쓰는거임.
			String str;
			while((str = br.readLine())!=null){
				System.out.println(str);
			}
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}finally {   // 이렇게도 쓸수있더라.
			if(fis!=null)try {fis.close();} catch (IOException e) {}
			if(br!=null) try {br.close();} catch (IOException e) {}
		}
	}
}
