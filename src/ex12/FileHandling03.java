package ex12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//[ 김찬영  2023-07-3 오후 04:52:41 ]
public class FileHandling03 {
	public static void main(String[] args) {
		File file = new File("src\\ex12\\member.txt");
		FileWriter fw = null;
		
		try {
			if(!file.exists())
			file.createNewFile();
			//문자방식의 출력용 파일로 생성
			fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			boolean quit = false;
			while(!quit) {
				//파일에 출력
				System.out.print("아이디 : ");
				String userID = input.next();
				fw.write("아이디 : "+ userID + " ");
				//파일에 출력				
				System.out.println("이름 : ");
				String userName = input.next();
				fw.write("이름 : " +userName + "\n");
				//파일에 출력				
				System.out.println("계속 진행? Y|N");
				input = new Scanner(System.in);
				String str = input.nextLine();
				if(str.toUpperCase().equals("N"))
					quit = true;
			}
				fw.close();
				System.out.println("파일 쓰기 성공");
			
		} catch (Exception e) {
				e.getMessage();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {}
			}
		}
		
	}
}
