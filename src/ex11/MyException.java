package ex11;
//[ 김찬영  2023-06-29 오후 12:48:05 ]
class MyException extends Exception{
	private static final long serialVersionUID = 1667450503685164294L;
	// 해당 클래스에 고유번호를 지정해 주고 나중에 해당 해당 클래스의 객체를 참조하기 위해 지정한것.
	// 버전다르면 나타나는 노란색 창 해결.
	String str1;
	
	MyException(String str2) { // 생성자 만들어주고 super에다가 생성자만들어주고, 이해할수있는 이름 만들어주고.
		super(str2); 
		str1 = str2;
	}
	
	public String toString() {
		return ("MyException 발생: "+ str1);
	}
	

}

