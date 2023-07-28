package ex8;

public class SmsSend extends MessageSend {
	public SmsSend() {};
	public SmsSend(String rev,String sen,String content) {
		super(rev,sen,content);
	}
	// 재정의 Override [ 김찬영  2023-06-26 오후 02:23:08 ]
	public void sendMsg() {
		System.out.println("받는   전화번호: " +this.rev);
		System.out.println("보내는  전화번호: " +this.sen);
		System.out.println("문자   내용: " +this.content);
	}

}
