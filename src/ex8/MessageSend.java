package ex8;

public abstract class MessageSend {
	//[ 김찬영  2023-06-26 오후 02:15:52  다형성 사용하는 방법]
	// 상위클래스 하위클래스 있을때 다음과 같이 사용가능하다.
	String rev;
	String sen;
	String content;
	//디폴트 생성자. 기본으로 만들어준다. 안만들면 오류 날수도 있어서 그냥 만들어줌.
	public MessageSend() {}
	
	public MessageSend(String rev, String sen, String content) {
		this.rev = rev;
		this.sen = sen;
		this.content= content;
	}
	// 상속 받는 클래스에서 구현하기 위한 메소드
	public abstract void sendMsg();
	
}
