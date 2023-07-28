package ex11;

import java.util.Scanner;

public class Exception03 {
	public static void main(String[] args) {
		//[ 김찬영  2023-06-29 오전 11:42:56 ]
		int[] arr = {10,20,30};
		
		try{
		  for(int i = 0; i <=3; i++) { // arr[i] 4번돌릴때 오류난다.
			  System.out.println("arr["+i+"] : "+ arr[i]);
		  }
		}
		catch(Exception ex) { // 무슨 오류일지모르니 상위 오류 나오게 했다.
			System.out.println("예외 처리입니다....");
			System.out.println(ex.getMessage());
		}
		finally{
			System.out.println("예외 발생 여부와 상관없이 실행됩니다.");
		}
		
	}
}
