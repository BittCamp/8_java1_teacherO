package ex12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

///[ 김찬영  2023-07-3 오후 04:35:08 ]
public class Example02 {
	public static void main(String[] args) {
		String str = "Hello! Java Programming";
		File f;
		FileOutputStream fos = null;  // 반드시 클로즈 해줘야 함
		try {
			f = new File("src\\ex12\\example02.txt");
			if(!f.exists()) {// 없으면 참이 됨.
				f.createNewFile();
			}
			fos =new FileOutputStream(f);
			// str은 문자열이고 , 그것을 바이트 형태로 가져오기
			byte[] b= str.getBytes();
			fos.write(b);
			System.out.println("파일쓰기 성공");
		}catch (Exception e) {
		  System.out.println(e.getMessage());
		}finally {
			try {
				fos.close();
			} catch(IOException e){}
		}
	}
}
